/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cosas_xD;

import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author alanvega
 */
public class Bomb {
   private static final int DIAMETER = 30;
    int x = 0; 
    int y = 500;
    int xa = 1; 
    int ya = 1; 
    private Game game;
    public Bomb (Game game){
    
        this.game = game;
    }
    void move(){
    
        if(x+xa<0)
            xa=1;
        if(x+xa>game.getWidth()-DIAMETER)
            xa=-1;
        if(y+ya<0)
            game.gameOver();
        if(y+ya>game.getHeight()-DIAMETER)
            game.gameOver();
        if(collision()){
        
            ya=-1;
            y = game.boom.getTopY()-DIAMETER;
        }
        if(collision2()){
        
            ya=1;
            y = game.boom.getTopY()-DIAMETER;
        }
        x = x + xa;
        y = y + ya;
    }
    
    private boolean collision(){
    
        return game.boom.getBounds().intersects(getBounds());
        
    }
    private boolean collision2(){
    
        return game.boom2.getBounds().intersects(getBounds());
        
    }
    
    public void paint (Graphics2D g){
    
        g.fillOval(x,y,DIAMETER,DIAMETER);
    }
    
    public Rectangle getBounds(){
    
        return new Rectangle(x,y,DIAMETER,DIAMETER);
    } 
}
