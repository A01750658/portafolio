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
public class Reto18 {
    public Reto18(){
    
    }
    public void Reto18(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce una cantidad: ");
    int cant = in.nextInt();
    int millares, centenas, decenas, unidades;
    unidades = cant%10;
    cant = cant/10;
    decenas = cant%10;
    cant = cant/10;
    centenas = cant%10;
    millares = cant/10;
    System.out.println("Millares: " + millares);
    System.out.println("Millares: " + millares);System.out.print("Centenas: " + centenas);
    System.out.println("Millares: " + millares);System.out.print("Centenas: " + centenas);System.out.print("Decenas: " + decenas);
    System.out.println("Millares: " + millares);System.out.print("Centenas: " + centenas);System.out.print("Decenas: " + decenas);System.out.print("Unidades: " + unidades);
    }
}
