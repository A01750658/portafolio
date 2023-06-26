/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Reto11 {
    public Reto11(){
    
    }
    public void Reto11(){
    Scanner in = new Scanner (System.in);
    System.out.print ("Introduzca un número: ");
    int num = in.nextInt();
    System.out.println ("El doble del número que introdujo es: " + num*2);
    System.out.println ("El triple del número que introdujo es: " + num*3);
    }
}

