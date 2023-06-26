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
public class Reto13 {
    public Reto13(){
    
    }
    public void Reto13(){
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa el valor del radio");
    double num = in.nextDouble();
    double longitud = 2*Math.PI*num;
    double area = Math.PI*Math.pow(num, 2);
    System.out.println("la longitud es: " + longitud);
    System.out.println("el área es: " + area);
    }
}
