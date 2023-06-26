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
public class Reto47a {
    public Reto47a(){
    Scanner in = new Scanner (System.in);
    System.out.print("Introduzca una frase: ");
    String frase = in.nextLine();
    frase = frase.replaceAll("  ", " ");
    String [] partes = frase.split(" ");
    int count = partes.length;
    System.out.println("El número de palabras es: " + count);
    }
}
