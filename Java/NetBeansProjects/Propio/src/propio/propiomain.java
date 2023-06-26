/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propio;

import javax.swing.JOptionPane;

/**
 *
 * @author ikerf
 */
public class propiomain {
    public static void main(String[] args){
        Propio operar = new Propio();
        
        
        operar.operando = Integer.parseInt(JOptionPane.showInputDialog("Buenos días, que operación quiera realizar? MULTIPLICACIÓN 1, DIVISIÓN 2, SUMA 3 O RESTA 4?"));
        switch(operar.operando){
               case 1:
                   System.out.println(operar.multiplicar(0.0));
                   break;
               case 2:
                   System.out.println(operar.divide(0.0));
                   break;
               case 3:
                   System.out.println(operar.sumar(0.0));
                   break;
               case 4:
                   System.out.println(operar.restar(0.0));
                   break;
                   
                   
           }
    }
}
