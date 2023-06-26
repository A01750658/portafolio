/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaaitest.Car;
import javaaitest.Vec2;
import javaaitest.VelocityTable;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/**
 *
 * @author alanvega
 */
public class View extends JPanel{
    private BufferedImage map;
    private BufferedImage spriteSheetMario;
    private BufferedImage spriteSheetBowser;
    private BufferedImage spriteSheetDonkey;
    private BufferedImage spriteSheetKoopa;
    private BufferedImage spriteSheetLuigi;
    private BufferedImage spriteSheetPeach;
    private BufferedImage spriteSheetToad;
    private BufferedImage spriteSheetYoshi;
    
    private static double DEPTH;
    private static final double halfFov = Math.toRadians(30);
    private static double cameraDistance;
    private static final double playerHeight = 12;
    
    private static double cy = 0;
    private static double cvy = 0;
    
    private BufferedImage frustrum;
    
    private final Vec2 player = new Vec2();
    private final Vec2 direction = new Vec2();
    private final Vec2 friction = new Vec2();
    private double angularVelocity;
    private double angle;
    private final Vec2 velocity = new Vec2();
    
    private List<Car> cars = new ArrayList<Car>();
    
    private final double MAX_SPEED = 2.1;
    
    private Car followCar;
    
    public View() {
        DEPTH = 400 / Math.tan(halfFov);
        //DEPTH = 1000;
        
        try {
            map = ImageIO.read(getClass().getResourceAsStream("/res/map.png"));
            //spriteSheet = ImageIO.read(getClass().getResourceAsStream("/res/mario.png"));
            
            spriteSheetMario = ImageIO.read(getClass().getResourceAsStream("/images/mario.png"));
            spriteSheetBowser = ImageIO.read(getClass().getResourceAsStream("/images/bowser.png"));
            spriteSheetDonkey = ImageIO.read(getClass().getResourceAsStream("/images/donkey.png"));
            spriteSheetKoopa = ImageIO.read(getClass().getResourceAsStream("/images/koopa.png"));
            spriteSheetLuigi = ImageIO.read(getClass().getResourceAsStream("/images/luigi.png"));
            spriteSheetPeach = ImageIO.read(getClass().getResourceAsStream("/images/peach.png"));
            spriteSheetToad = ImageIO.read(getClass().getResourceAsStream("/images/toad.png"));
            spriteSheetYoshi = ImageIO.read(getClass().getResourceAsStream("/images/yoshi.png"));
            
            //map = ImageIO.read(getClass().getResourceAsStream("/res/bowser_circuit.png"));
            
            double width = 2 * Math.tan(halfFov) * DEPTH;
            cameraDistance = Math.sqrt(width * width + DEPTH * DEPTH);
            frustrum = new BufferedImage((int) width, (int) DEPTH, BufferedImage.TYPE_INT_ARGB);
            
            player.set(469.0 * 2, 278.0 * 2);
            angle = Math.toRadians(-90);
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }
        start();
        addKeyListener(new Keyboard());
        
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                update();
                repaint();
            }
        }, 100, 1000 / 50);
    }
    
    private void start() {
        cars.add(new Car(spriteSheetMario, 469 * 2, 238 * 2, Color.RED, 0));
        cars.add(new Car(spriteSheetBowser, 439 * 2, 298 * 2, Color.BLUE, 1));
        cars.add(new Car(spriteSheetDonkey, 469 * 2, 318 * 2, Color.GREEN, 2));
        cars.add(new Car(spriteSheetKoopa, 439 * 2, 338 * 2, Color.ORANGE, 3));
        cars.add(followCar = new CarPlayer(spriteSheetLuigi, 469 * 2, 358 * 2, Color.CYAN, 4));
        cars.add(new Car(spriteSheetPeach, 439 * 2, 378 * 2, Color.GRAY, 5));
        cars.add(new Car(spriteSheetToad, 469 * 2, 398 * 2, Color.PINK, 6));
        cars.add(new Car(spriteSheetYoshi, 439 * 2, 418 * 2, Color.YELLOW, 7));
    }

    private void updateCollision() {
        for (Car car1 : cars) {
            for (Car car2 : cars) {
                if (car1.equals(car2)) {
                    continue;
                }
                javaaitest.Vec2 normal = car1.checkCollision(car2);
                if (normal != null) {
                    normal.scale(2);
                    car1.getVelocity().sub(normal);
                    car2.getVelocity().add(normal);
                }
            }
        }
    }
    
    public void updateCars() {
        updateCollision();
        try {
            for (Car car : cars) {
                car.update();
            }
        }
        catch (Exception e) {}
        
        if ((int) (System.currentTimeMillis() * 0.001) % 10 == 0) {
            Collections.shuffle(VelocityTable.velocities);
        }
    }    
    
    public void update() {
        // updateMovement();
        updateChaseCar();
        updateCars();
    }
    
    private final Vec2 cdir = new Vec2(1, 0);
    private final Vec2 targdir = new Vec2();
    
    private void updateChaseCar() {
        player.set(followCar.getPosition().getX(), followCar.getPosition().getY());
        targdir.set(followCar.getVelocity().getX(), followCar.getVelocity().getY());
        
        double shortest_angle=((((cdir.getAngle() - targdir.getAngle()) % (2 * Math.PI)) + (3 * Math.PI)) % (2 * Math.PI)) - Math.PI;
        cdir.rotate(-shortest_angle * 0.1);
        
        //cdir.add(followCar.getDirection());
        //cdir.normalize();
        //cdir.scale(50);
        player.translate(-50 * cdir.getX(), -50 * cdir.getY());
        angle = cdir.getAngle();
        //angle += 0.01;
    }
    
    private void updateMovement() {
        
        if (Keyboard.keyDown[KeyEvent.VK_SPACE]) {
            cvy = 1;
        }
        cvy -= 0.05;
        cy += cvy;
        if (cy <= 0) {
            cy = 0;
            cvy = 0;
        }
        
        double speed = velocity.getLength();
        double dav = speed > MAX_SPEED ? 0.002 : 0.002 * (speed / MAX_SPEED);
        if (Keyboard.keyDown[KeyEvent.VK_LEFT]) {
            angularVelocity -= dav;
        }
        else if (Keyboard.keyDown[KeyEvent.VK_RIGHT]) {
            angularVelocity += dav;
        }

        angle += angularVelocity;
        angularVelocity *= 0.95;

        double dx = 1 * Math.cos(angle + Math.toRadians(90));
        double dy = 1 * Math.sin(angle + Math.toRadians(90));
        friction.set(dx, dy);
        double frictionIntensity = friction.dot(velocity);
        
        double p = 0.04 - (speed / MAX_SPEED) * (0.04 - 0.005);
        
        friction.scale(frictionIntensity * p);
        
        velocity.sub(friction);
        //System.out.println("friction intensity = " + frictionIntensity);
        
        dx = 1 * Math.cos(angle);
        dy = 1 * Math.sin(angle);
        direction.set(dx, dy);
        direction.scale(0.03);
        
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
        
        player.add(velocity);
        velocity.scale(0.998);
    }
    
    private final Polygon polygon = new Polygon();
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) frustrum.getGraphics();
        
        drawFrustrum(g2d, player.getX(), player.getY());
        drawPerspective((Graphics2D) g, playerHeight + cy, 0);
        
        //drawFrustrum(g2d, player.getX(), player.getY());
        //drawPerspective((Graphics2D) g, playerHeight + cy, 300);
        
        //g.drawImage(frustrum, 200, 200, null);
    }
    
    private void drawCars(Graphics2D g) {
        for (Car car : cars) {
            car.draw(g);
        }
    }

    private void recalculateCarsDrawOrdering() {
        for (Car car : cars) {
            car.recalculateCameraDistance(player.getX(), player.getY(), angle);
        }
        Collections.sort(cars);
    }

    private void drawBillboard(Graphics2D g, int offsetY) {
        double ph = playerHeight + cy;
        for (Car car : cars) {
            car.drawBillboard(player.getX(), player.getY(), angle, halfFov, ph, DEPTH, g, offsetY);
        }
    }

    private void drawFrustrum(Graphics2D g, double cx, double cy) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, frustrum.getWidth(), frustrum.getHeight());
        
        g.translate(frustrum.getWidth() / 2, frustrum.getHeight());
        g.rotate(-angle + Math.toRadians(-90));
        g.translate(-cx, -cy);
        
        double fx1 = cameraDistance * Math.cos(angle - halfFov);
        double fy1 = cameraDistance * Math.sin(angle - halfFov);
        double fx2 = cameraDistance * Math.cos(angle + halfFov);
        double fy2 = cameraDistance * Math.sin(angle + halfFov);
        
        polygon.reset();
        polygon.addPoint((int) player.getX(), (int) player.getY());
        polygon.addPoint((int) (player.getX() + fx1), (int) (player.getY() + fy1));
        polygon.addPoint((int) (player.getX() + fx2), (int) (player.getY() + fy2));

        //Shape originalClip = g.getClip();
        //g.setClip(polygon);
        g.drawImage(map, 0, 0, null);
        //g.setClip(originalClip);
        
        //g.setColor(Color.BLACK);
        //g.drawPolygon(polygon);
        //g.setColor(Color.RED);
        //g.fillOval((int) (player.getX() - 10), (int) (player.getY() - 10), 20, 20);
        
        drawCars(g);
    }
    
    private void drawPerspective(Graphics2D g, double ph, int offsetY) {
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);        
        // double height = 2 * Math.tan(halfFov) * DEPTH;
        //double ph = playerHeight + cy;
        for (int y = (int) ph; y < 250; y++) {
            double z = (ph * DEPTH) / y;
            double w = ((frustrum.getWidth() / 2) * z) / DEPTH;
            
            int dx1 = 0;
            int dy1 = (int) (y + offsetY);
            int dx2 = 800;
            int dy2 = dy1 + 1 + offsetY;
            int sx1 = (int) (frustrum.getWidth() / 2 - w);
            int sy1 = (int) (frustrum.getHeight() - z);
            int sx2 = (int) (sx1 + 2 * w);
            int sy2 = sy1 + 1;
            g.drawImage(frustrum, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
        }
        
        recalculateCarsDrawOrdering();
        drawBillboard(g, offsetY);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                View view = new View();
                JFrame frame = new JFrame();
                frame.setTitle("Super Final D");
                frame.getContentPane().add(view);
                frame.setSize(800, 600);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setVisible(true);
                view.requestFocus();
            }
        });
    }    
    
    private void moveForward(double f) {
        double tx = f * Math.cos(angle);
        double ty = f * Math.sin(angle);
        player.translate(tx, ty);
    }
}
