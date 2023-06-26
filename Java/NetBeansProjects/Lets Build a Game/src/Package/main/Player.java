/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author alanvega
 */
public class Player extends Game_Object {
    
    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);
        
    }
    public void tick() {
        x+=velX;
        y+=velY;
    }
    public void render(Graphics g) {
        if(id==ID.Player){
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
        }
        
        else if(id == ID.Player2){
        g.setColor(Color.blue);
        g.fillRect(x, y, 32, 32);
        }
                
    }
    
}
