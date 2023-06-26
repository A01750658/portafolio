/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alanvega
 */
public class Game3 extends JPanel{
    int x = 0;
    int y = 0;
    
    private void moveball(){
    x++;
    y++;
    }
    @Override
    public void paint(Graphics g){
    
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Random r = new Random();
        Color rgb = new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(rgb);
            g2d.fillOval(x,y,30,30);
            
            
    }
    
    public static void main (String args[]) throws InterruptedException{
    
        JFrame frame = new JFrame("Pong 4.0");
        Game3 game = new Game3();
        frame.add(game);
        frame.setSize(300,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true){
        
            game.moveball();
            game.repaint();
            Thread.sleep(10);
        }
        
    }
    
}
