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
public class Palindromos {
    public static void main (String [] args){
    Scanner in = new Scanner (System.in);
    System.out.print("Introduce una palabra: ");
    String palabra = in.next();
    String invertida = "";
    for (int i = palabra.length() - 1; i>=0; i--){
    invertida += palabra.charAt(i);
    }
    if (invertida.equals(palabra))
    {
     System.out.println("La palabra es un anagrama");
    }
    else {
    System.out.println("la palabra no es un anagrama");
    }
    }
}
