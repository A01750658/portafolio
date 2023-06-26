/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cosas_xD;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


/**
 *
 * @author alanvega
 */
public class Canon2 {
    
    private static final int Y = 50;
    private static final int WEED = 60;
    private static final int SHOTDIAMETER = 30;
    private static final int HIGH = 10;
    int x = 0;
    int xa = 0;
    int x_shot = 0; 
    int y_shot = 0;
    int xa_shot = 1; 
    int ya_shot = 1; 
    
    private Game game;
    
    public Canon2 (Game game){
        this.game = game;
    }
    
    public void move(){
        if(x + xa > 0 && x + xa < game.getWidth() - 60)
            x = x + xa;
    }
    
    public void paint (Graphics2D g){
        g.fillRect(x,Y, WEED, HIGH);
    }
    
    public void keyReleased(KeyEvent e){
        xa = 0;
    }
    
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_1)
            xa = -4;
        if (e.getKeyCode() == KeyEvent.VK_2)
            xa = 4;
    }
    
    
    
    public Rectangle getBounds(){
    
        return new Rectangle (x,Y,WEED,HIGH);
    }
    
    public int getTopY(){
    
        return Y+HIGH;
    }
    
    void moveshot(){
    int x = 0; 
    int y = 0;
    int xa = 1; 
    int ya = 1; 
           
        if(y+ya<0)
            ya=-1;
        if(y+ya>game.getHeight()-SHOTDIAMETER)
            game.gameOver();
        if(collision()){
        
            ya=0;
            y = game.boom.getTopY()-SHOTDIAMETER;
        }
        x = x + xa;
        y = y + ya;
    }
    
    private boolean collision(){
    
        return game.nuke.getBounds().intersects(getBounds());
    }
    
    }

