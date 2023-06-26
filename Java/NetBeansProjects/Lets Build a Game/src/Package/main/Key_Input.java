/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/**
 *
 * @author alanvega
 */
public class Key_Input extends KeyAdapter {
    
    private Handler handler;
    
    public Key_Input(Handler handler){
        this.handler = handler;
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        
    }
}
