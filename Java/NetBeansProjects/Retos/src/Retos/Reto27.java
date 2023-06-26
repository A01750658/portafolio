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
public class Reto27 {
    public Reto27(){
    
   
   }
    public void Reto27(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce el dividendo: ");
    double x = in.nextDouble();
    System.out.println("Introduce el divisor: ");
    double y = in.nextDouble();
   
   
   if (y == 0) {
   System.out.println("Introduce otro número");
   y = in.nextDouble();
   if (y == 0 ){
   System.out.println("Infinito");
   }
    }
   else{
       double div = (x/y);
       System.out.println(div);
   }
    }
   }


