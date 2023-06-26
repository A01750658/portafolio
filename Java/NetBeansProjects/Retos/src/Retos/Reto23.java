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
public class Reto23 {
    public Reto23(){
    
    }
    public void Reto23(){
    Scanner in = new Scanner(System.in);
    System.out.print("Ingrese un caracter: ");
    char letra = in.nextLine().charAt(0);
    System.out.println((Character.isUpperCase(letra)?"la letra es mayúscula":"la letra es minúscula"));
    }
}
