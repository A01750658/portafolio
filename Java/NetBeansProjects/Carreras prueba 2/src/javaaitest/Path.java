package javaaitest;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonardo
 */
public class Path {

    private List<Vec2> points = new ArrayList<Vec2>();
    private Vec2 currentPoint;
    private Vec2 nextPoint;
    
    public Path() {
        teste();
        currentPoint = points.get(0);
        nextPoint = points.get(1);
    }

    public Vec2 getCurrentPoint() {
        return currentPoint;
    }

    public Vec2 getNextPoint() {
        return nextPoint;
    }

    public void addPoint(double x, double y) {
        points.add(new Vec2(x * 2, y * 2));
    }
    
    public void nextCheckpoint() {
        int currentIndex = points.indexOf(currentPoint);
        currentIndex = (currentIndex + 1) % points.size();
        currentPoint = points.get(currentIndex);

        currentIndex = (currentIndex + 1) % points.size();
        nextPoint = points.get(currentIndex);
    }
    private void teste() {
        addPoint(469.0, 278.0);
        addPoint(467.0, 226.0);
        addPoint(448.0, 195.0);
        addPoint(128.0, 38.0);
        addPoint(93.0, 32.0);
        addPoint(68.0, 46.0);
        addPoint(46.0, 69.0);
        addPoint(39.0, 102.0);
        addPoint(39.0, 333.0);
        addPoint(45.0, 354.0);
        addPoint(63.0, 365.0);
        addPoint(90.0, 360.0);
        addPoint(238.0, 291.0);
        addPoint(261.0, 292.0);
        addPoint(283.0, 313.0);
        addPoint(340.0, 428.0);
        addPoint(365.0, 448.0);
        addPoint(401.0, 457.0);
        addPoint(443.0, 448.0);
        addPoint(465.0, 415.0);        
    }
    
    private void teste2() {
        addPoint(368.0, 81.0);
        addPoint(450.0, 78.0);
        addPoint(559.0, 90.0);
        addPoint(634.0, 133.0);
        addPoint(673.0, 196.0);
        addPoint(693.0, 268.0);
        addPoint(693.0, 344.0);
        addPoint(670.0, 414.0);
        addPoint(635.0, 460.0);
        addPoint(565.0, 498.0);
        addPoint(443.0, 514.0);
        addPoint(336.0, 510.0);
        addPoint(221.0, 459.0);
        addPoint(150.0, 395.0);
        addPoint(120.0, 294.0);
        addPoint(119.0, 191.0);
        addPoint(211.0, 99.0);
        addPoint(299.0, 79.0);
    }
    
    public void draw(Graphics2D g) {
        g.setColor(Color.BLUE);
        for (int i = 0; i < points.size(); i++) {
            Vec2 p1 = points.get(i);
            Vec2 p2 = points.get((i + 1) % points.size());
            int x1 = (int) p1.getX();
            int y1 = (int) p1.getY();
            int x2 = (int) p2.getX();
            int y2 = (int) p2.getY();
            g.drawLine(x1, y1, x2, y2);
        }

        g.setColor(Color.RED);
        for (int i = 0; i < points.size(); i++) {
            Vec2 p1 = points.get(i);
            g.fillOval((int) (p1.getX() - 3), (int) (p1.getY() - 3), 6, 6);
        }
    }
    
    private final Vec2 distance = new Vec2();
    
    public Vec2 getNextClosestPoint(Vec2 position) {
        double closestDistance = Double.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < points.size(); i++) {
            Vec2 point = points.get(i);
            distance.set(point);
            distance.sub(position);
            double cdist = distance.getLength();
            if (cdist < closestDistance) {
                closestDistance = cdist;
                index = i;
            }
        }
        
        //if (closestDistance > 100) {
        //    //Vec2 r = new Vec2(points.get(index));
        //    //r.translate(25 - 50 * Math.random(), 25 - 50 * Math.random());
        //    return points.get(index);
        //}
        
        index = (index + 1) % points.size();
        //Vec2 r = new Vec2(points.get(index));
        //r.translate(25 - 50 * Math.random(), 25 - 50 * Math.random());
        return points.get(index);
    }
    
}
