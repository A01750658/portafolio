/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E2;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alanvega
 */
@SuppressWarnings("serial")
public class Game2 extends JPanel{
    @Override
    public void paint(Graphics g){
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(Color.RED);
    g2d.fillOval(0,0,30,30);
    g2d.drawOval(0,50,30,30);
    g2d.fillRect(50,0,30,30);
    g2d.drawRect(50,50,30,30);
    
    
    g2d.draw(new Ellipse2D.Double(0,100,30,30));
    }
    
    public static void main(String args[]){
    JFrame frame = new JFrame("Pong 3.0");
    frame.add(new Game2());
    frame.setSize(300,300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
