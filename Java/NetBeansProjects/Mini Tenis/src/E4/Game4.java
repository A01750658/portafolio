/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4;

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
public class Game4 extends JPanel {

    Ball ball = new Ball(this);
    Racket racquet = new Racket(this);

    public Game4() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                racquet.keyPressed(e);
            }
        });

        setFocusable(true);
    }

    private void move() {

        ball.move();
        racquet.move();
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Random r = new Random();
        Color rgb = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(rgb);
        ball.paint(g2d);
        racquet.paint(g2d);
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Game Over", JOptionPane.YES_NO_OPTION);
        System.exit(ABORT);
    }

    public static void main(String args[]) throws InterruptedException {

        JFrame frame = new JFrame("Pong 5.0");
        Game4 game4 = new Game4();
        frame.add(game4);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {

            game4.move();
            game4.repaint();
            Thread.sleep(3);
        }
    }
}
