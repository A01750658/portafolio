/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E4;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author alanvega
 */
public class Racket {
    private static final int Y = 330;
    private static final int WEED = 60;
    private static final int HIGH = 10;
    int x = 0;
    int xa = 0;
    
    private Game4 game4;
    
    public Racket(Game4 game){
        this.game4 = game;
    }
    
    public void move(){
        if(x + xa > 0 && x + xa < game4.getWidth() - 60)
            x = x + xa;
    }
    
    public void paint (Graphics2D g){
        g.fillRect(x,Y, WEED, HIGH);
    }
    
    public void keyReleased(KeyEvent e){
        xa = 0;
    }
    
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -4;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 4;
    }
    
    public Rectangle getBounds(){
    
        return new Rectangle (x,Y,WEED,HIGH);
    }
    
    public int getTopY(){
    
        return Y-HIGH;
    }
    
}
