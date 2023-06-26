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
public class Reto15b {
    public Reto15b(){
        
    }
    public void Reto15b(){
    Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer cateto");
        double catad = in.nextDouble();
        System.out.println("Introduce el segundo cateto");
        double catop = in.nextDouble();
        double hypo = Math.hypot(catop, catad);
        System.out.println("La hipotenusa es: " + hypo);
    }
}
