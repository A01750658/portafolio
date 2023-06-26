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
public class Reto24 {
    public Reto24(){
    
    }
    public void Reto24(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce el primer caracter:");
    char letra1 = in.nextLine().charAt(0);
    System.out.print("Introduce el segundo caracter:");
    char letra2 = in.nextLine().charAt(0);
    System.out.println((letra1 == letra2)?"Las dos letras son iguales" : "las dos letras son diferentes");
    }
}
