/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cosas_xD;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author alanvega
 */
@SuppressWarnings("serial")
public class Game extends JPanel{
   
    Canon boom = new Canon(this);
    Canon2 boom2 = new Canon2(this);
    Bomb nuke = new Bomb(this);

    public Game() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                boom.keyReleased(e);
                boom2.keyReleased(e);
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                boom.keyPressed(e);
                boom2.keyPressed(e);
            }
            
        });

        setFocusable(true);
    }

    private void move() {

        
        boom.move();
        boom2.move();
        nuke.move();
       
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Random r = new Random();
        Color rgb = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(rgb);
        
        boom.paint(g2d);
        boom2.paint(g2d);
        nuke.paint(g2d);
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public static void main(String args[]) throws InterruptedException {

        JFrame frame = new JFrame("URSS");
        Game game = new Game();
        frame.add(game);
        frame.setSize(720, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {

            game.move();
            game.repaint();
            Thread.sleep(3);
        }
    }
} 

