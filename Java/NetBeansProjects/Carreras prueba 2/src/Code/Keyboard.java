/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author alanvega
 */
public class Keyboard extends KeyAdapter{
    public static boolean[] keyDown = new boolean[256];

    // --- KeyListener ---
    
    
    public void keyTyped(KeyEvent e) {
        
    }

    
    public void keyPressed(KeyEvent e) {
        keyDown[e.getKeyCode()] = true;
    }

    
    public void keyReleased(KeyEvent e) {
        keyDown[e.getKeyCode()] = false;
    }
    
}

