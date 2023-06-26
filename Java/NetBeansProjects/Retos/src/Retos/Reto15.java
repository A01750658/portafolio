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
public class Reto15 {
    public Reto15(){
    
    }
    public void Reto15(){
    Scanner in = new Scanner (System.in);
    System.out.println("Introduce el primer cateto");
    double catad = Math.pow (in.nextDouble(), 2);
    System.out.println("Introduce el segundo cateto");
    double catop = Math.pow (in.nextDouble(), 2);
    double sum = (catad + catop);
    double hypo = Math.sqrt(sum);
    System.out.println ("la hipotenusa es: " + hypo);
    }
}
