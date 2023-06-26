/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

/**
 *
 * @author alanvega
 */
public class Ejercicio1 {
    public static void main (String[]args){
    int i = 1;
    do{
    double x = i%9;
    if (x == 0){
    System.out.println("Alan Vega");
    }
    else{
    System.out.println(i);
    System.out.println((i-2)/3);
    }
    i= i+1;
    }while(i>0 && i < 100);
   }
}
