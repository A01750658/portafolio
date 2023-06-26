/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;
import javax.swing.JFrame;
/**
 *
 * @author alanvega
 */
public class Game {
    public static void main(String args[]){
        JFrame ventana = new JFrame("Pong 2.0");
        ventana.setSize(300,300);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
