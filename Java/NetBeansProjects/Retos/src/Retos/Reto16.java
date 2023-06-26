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
public class Reto16 {
    public Reto16(){
    
    }
    public void Reto16(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce el radio de la esfera: ");
    double rad = in.nextDouble();
    double vol = 4/3*Math.PI*Math.pow(rad, 3);
    System.out.println ("El volumen de la esfera es: " + vol + "cm^3");
    }
}
