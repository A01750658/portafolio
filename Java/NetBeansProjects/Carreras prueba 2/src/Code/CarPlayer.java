/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaaitest.Car;
import javaaitest.Vec2;
import javax.imageio.ImageIO;

/**
 *
 * @author alanvega
 */
public class CarPlayer extends Car {
     private final double MAX_SPEED = 2;
    private double angularVelocity;
    private double angle = Math.toRadians(-90);
    private final Vec2 friction = new Vec2();
    
    private BufferedImage smokes[] = new BufferedImage[2];
    
    public CarPlayer(BufferedImage spriteSheet, double x, double y, Color color, int dragIndex) {
        super(spriteSheet, x, y, color, dragIndex);
        
        try {
            smokes[0] = ImageIO.read(getClass().getResourceAsStream("/images/smoke_0.png"));
            smokes[1] = ImageIO.read(getClass().getResourceAsStream("/images/smoke_1.png"));
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }        
    }

    @Override
    public void update() {
        double speed = velocity.getLength();
        double dav = speed > MAX_SPEED ? 0.003 : 0.003 * (speed / MAX_SPEED);
        
        if (drifting && Math.abs(angularVelocity) > 0.001) {
            //angularVelocity = angularVelocity > 0 ? 0.1 : - 0.1;
        }
        else if (Keyboard.keyDown[KeyEvent.VK_LEFT]) {
            angularVelocity -= dav;
        }
        else if (Keyboard.keyDown[KeyEvent.VK_RIGHT]) {
            angularVelocity += dav;
        }

        angle += angularVelocity;
        angularVelocity *= (0.95 + (drifting ? 0.05 : 0));

        double dx = 1 * Math.cos(angle + Math.toRadians(90));
        double dy = 1 * Math.sin(angle + Math.toRadians(90));
        friction.set(dx, dy);
        double frictionIntensity = friction.dot(velocity);
        
        drifting = Math.abs(frictionIntensity) > 1.3;
        
        double p = 0.04 - (speed / MAX_SPEED) * (0.04 - 0.01);
        
        friction.scale(frictionIntensity * p);
        
        if (drifting) {
            friction.scale(0.1);
        }
        
        velocity.sub(friction);
        
        dx = 1 * Math.cos(angle);
        dy = 1 * Math.sin(angle);
        direction.set(dx, dy);
        direction.scale(0.03);
        
        if (drifting) {
            direction.scale(0.01);
        }
        
        if (Keyboard.keyDown[KeyEvent.VK_UP]) {
            //moveForward(5);
            velocity.add(direction);
        }
        else if (Keyboard.keyDown[KeyEvent.VK_DOWN]) {
            //moveForward(-5);
            velocity.sub(direction);
        }
        
        if (velocity.getLength() > MAX_SPEED) {
            velocity.normalize();
            velocity.scale(MAX_SPEED);
        }
        
        position.add(velocity);
        velocity.scale(0.998 + (drifting ? 0.001 : 0));
    }

    @Override
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
        
        if (drifting) {
            BufferedImage smoke = smokes[(int) ((System.nanoTime() * 0.001) % 2)];
            g.drawImage(smoke, (int) (dx1 + 8 * scale), (int) (dy1 + 26 * scale), (int) (10 * scale), (int) (10 * scale), null);
            g.drawImage(smoke, (int) (dx1 + 24 * scale), (int) (dy1 + 26 * scale), (int) (10 * scale), (int) (10 * scale), null);
        }
        
        g.setTransform(at);        
    }
}
