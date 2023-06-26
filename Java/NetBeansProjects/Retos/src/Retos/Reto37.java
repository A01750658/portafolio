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
public class Reto37 {
    public Reto37(){
        
    }
    public void Reto37(){
    System.out.print("Introduce un número binario: ");
        Scanner in = new Scanner(System.in);
    int binario = in.nextInt(), resto, decimal=0, i=0;
       while (binario != 0){
           resto = binario % 10;
           decimal = decimal + (resto * (int) Math.pow(2, i));
           i++;
           binario = binario / 10;
       }
       System.out.println(decimal);
    }
}
