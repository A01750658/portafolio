/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Ejercicio2 {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce dos números separados por un -");
    String num = in.next();
    String[]nums = num.split("-");
    String numone = nums[0];
    String numtwo = nums[1];
    int num1 = Integer.parseInt(numone);
    int num2 = Integer.parseInt(numtwo);
    int suma = 0;
    int x = num2;
    int y = num1;
    suma = ((x+y)*(x+1+y))/2;
    if (num2<num1){
    System.out.println("Error, intente de nuevo");
    }{
    do {
        System.out.println(num1);
        num1++;
    }
    while(num2>=num1);
    }
    System.out.println("la suma es: " + suma);
    }
    
}
