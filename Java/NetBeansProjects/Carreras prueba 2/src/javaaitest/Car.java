/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaitest;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 *
 * @author alanvega
 */
public class Car implements Comparable<Car> {
    protected BufferedImage spriteSheet;
    
    protected Color color = Color.BLACK;
    protected Vec2 position = new Vec2();
    protected Vec2 velocity = new Vec2();
    protected Vec2 direction = new Vec2(1, 0);
    protected Vec2 targetDirection = new Vec2();
    protected double radius = 4;
    protected final Path path = new Path();
    
    protected int dragIndex;
    protected double drag;
    
    protected double cameraDistance;
    
    protected boolean drifting;
    
    public Car(BufferedImage spriteSheet, double x, double y, Color color, int dragIndex) {
        this.spriteSheet = spriteSheet;
        position.set(x, y);
        this.color = color;
        direction.set(1, 0);
        this.dragIndex = dragIndex;
    }

    public double getCameraDistance() {
        return cameraDistance;
    }

    public void recalculateCameraDistance(double cx, double cy, double cangle) {
        cameraPosition.set(cx, cy);
        
        cameraDirection.set(position);
        cameraDirection.sub(cameraPosition);
        
        double cameraAngle = -cangle - Math.toRadians(90);
        
        carToCamera.set(position);
        carToCamera.translate(-cx, -cy);
        carToCamera.rotate(cameraAngle);
        
        this.cameraDistance = carToCamera.getY();
    }

    public Vec2 getPosition() {
        return position;
    }

    public Vec2 getDirection() {
        return direction;
    }

    public Vec2 getVelocity() {
        return velocity;
    }

    public double getRadius() {
        return radius;
    }

    public double shortAngleDist(double a0, double a1) {
        double max = Math.PI * 2;
        double da = (a1 - a0) % max;
        return 2 * da % max - da;
    }

    public double angleLerp(double a0, double a1, double t) {
        return a0 + shortAngleDist(a0 ,a1) * t;
    }

    private Vec2 nextClosestPoint;
    private Vec2 randomPosition = new Vec2();
    
    public void update() {
//        direction.rotate(0.01);
//        
//        if (1==1) {
//            return;
//        }
        
        if (!path.getNextClosestPoint(position).equals(nextClosestPoint)) {
            randomPosition.set(30 - 60 * Math.random(), 30 - 60 * Math.random());
        }
        
        nextClosestPoint = path.getNextClosestPoint(position);
        
        targetDirection.set(nextClosestPoint);
        targetDirection.add(randomPosition);
        targetDirection.sub(position);
        targetDirection.normalize();
        
        double a = targetDirection.getAngle();
        double b = direction.getAngle();
        // https://stackoverflow.com/questions/2708476/rotation-interpolation (funcionou pelo menos)
        double shortest_angle=((((b - a) % (2 * Math.PI)) + (3 * Math.PI)) % (2 * Math.PI)) - Math.PI;
        direction.rotate(-shortest_angle * 0.04);
        
        velocity.add(direction);
        
        drag = VelocityTable.velocities.get(dragIndex);
        velocity.scale(drag);
        
        position.add(velocity);
        
        if (Mouse.pressed) {
            position.set(Mouse.x, Mouse.y);
        }
    }
    
    public void draw(Graphics2D g) {
        path.draw(g);
        
        g.setColor(color);
        g.fillOval((int) (position.getX() - radius), (int) (position.getY() - radius), (int) (2 * radius), (int) (2 * radius));
        
        g.setColor(Color.GREEN);
        int x1 = (int) position.getX();
        int y1 = (int) position.getY();
        int x2 = (int) (x1 + 50 * direction.getX());
        int y2 = (int) (y1 + 50 * direction.getY());
        g.drawLine(x1, y1, x2, y2);
        
//        g.setColor(Color.GREEN);
//        if (nextClosestPoint != null) {
//            x1 = (int) position.getX();
//            y1 = (int) position.getY();
//            x2 = (int) (nextClosestPoint.getX() + randomPosition.getX());
//            y2 = (int) (nextClosestPoint.getY() + randomPosition.getY());
//            g.drawLine(x1, y1, x2, y2);
//        }
    }
    
    private final Vec2 normal = new Vec2();
    
    public Vec2 checkCollision(Car other) {
        normal.set(other.position);
        normal.sub(position);
        double distance = normal.getLength();
        if (distance <= radius + other.radius) {
            normal.normalize();
            return normal;
        }
        else {
            return null;
        }
    }
    
    protected final Vec2 cameraPosition = new Vec2();
    protected final Vec2 cameraDirection = new Vec2();
    protected final Vec2 cameraLateralDirection = new Vec2();
    protected final Vec2 carToCamera = new Vec2();
    
    public void drawBillboard(double cx, double cy, double cangle, double halfFov, double cHeight, double depth, Graphics2D g, int offsetY) {
        cameraPosition.set(cx, cy);
        
        cameraDirection.set(position);
        cameraDirection.sub(cameraPosition);
        
        double cameraAngle = -cangle - Math.toRadians(90);
        
        double carAngle = direction.getAngle() - Math.toRadians(90);
        carToCamera.set(position);
        carToCamera.translate(-cx, -cy);
        carToCamera.rotate(cameraAngle);
        
        if (carToCamera.getY() >= 0) {
            return;
        }
        
        double sx = depth * (carToCamera.getX() / -carToCamera.getY());
        double sy_floor = depth * (cHeight / -carToCamera.getY());
        double sy_ceil = depth * ((32 - cHeight) / -carToCamera.getY());
        
        double cameraAngle2 = cameraDirection.getAngle() + Math.toRadians(90);
        int angleIndex = (int) ((carAngle - cameraAngle2) / Math.toRadians(360.0 / 24.0));
        
        //System.out.print("angleIndex: " + angleIndex);
        if (angleIndex <= -12) {
            angleIndex = 23 + angleIndex;
        }
        
        //System.out.println(" / apos ajuste angleIndex: " + angleIndex);
        
        boolean flip = angleIndex >= 0;
        if (!flip) {
            angleIndex = 12 + angleIndex;
        }
        else {
            angleIndex = 11 - angleIndex;
        }
        
        AffineTransform at = g.getTransform();
        
        g.translate(400 + sx, sy_floor);
        //at.scale(2, 2);
        double scale = (sy_ceil - sy_floor) / 32.0;
        
        int shakeY = drifting ? 4 * ((int) (System.nanoTime() * 0.00001) % 2) : 0;
        //System.out.println("shakey: " + shakeY);
        
        int dx1 = (int) (-16 * scale);
        int dy1 = (int) (-32 * scale + offsetY + shakeY);
        int dx2 = (int) (16 * scale);
        int dy2 = offsetY + shakeY;
        
        int sx1 = 32 * Math.abs(angleIndex);
        int sy1 = 32;
        int sx2 = sx1 + 32;
        int sy2 = 64;
        
        if (flip) {
            int psx = sx1;
            sx1 = sx2;
            sx2 = psx;
        }
        
        g.drawImage(spriteSheet, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
        
        g.setTransform(at);
    }

    @Override
    public int compareTo(Car o) {
        return (int) (10000 * (cameraDistance - o.cameraDistance));
    }
    
}
