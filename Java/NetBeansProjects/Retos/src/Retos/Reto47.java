/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author alanvega
 */
public class Reto47 {
    public Reto47(){
    
    }
    public void Reto47(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce una frase");
    String frase = in.nextLine();
    StringTokenizer partes = new StringTokenizer(frase, " ");
    int count = partes.countTokens();
	while(partes.hasMoreTokens()){
            System.out.println(partes.nextToken());
        }
    System.out.println("El número de palabras es: " + count);
    }
}
