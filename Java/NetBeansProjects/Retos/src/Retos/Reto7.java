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
public class Reto7 {
    public Reto7(){    
    }
    public void Reto7(){
    Scanner in = new Scanner (System.in);
    
    System.out.print("introduce un valor  ");
    int A = in.nextInt();
   
    int B = A%2;
    if (B == 0){
    System.out.println("el número es par");
    }
    else {
    System.out.println("el número es impar");
    }
    }
    
}
