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
public class Reto25 {
    public Reto25(){
    }
    public void Reto25(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduzca las dos letras separadas por una coma: ");
    String letras = in.next();
    if (mayus(letras)){ 
     System.out.println("las letras son mayusculas");
    }
    else if (minus(letras)){
    System.out.println("las letras son minusculas");
    }
    else{
    System.out.println("las letras son mixtas");
    }
    }
    public static boolean mayus (String s){
        return s.equals(s.toUpperCase());
    }
    public static boolean minus (String s){
        return s.equals(s.toLowerCase());
    }
}
