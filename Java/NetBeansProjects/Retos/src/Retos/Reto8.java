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
public class Reto8 {
    public Reto8(){
    
    }
    public void Reto8(){
    Scanner in = new Scanner (System.in);
    System.out.print ("introduce un valor");
    int B = in.nextInt();
    if (B>=0){
    System.out.println ("El número es positivo");
    }
    else {
    System.out.println("El número es negativo");
    }
    }
}
