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
public class Reto12 {
    public Reto12(){
    
    }
    public void Reto12(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce un número de grados");
    int grados = in.nextInt();
    int fahren = 32+(9*grados/5);
    System.out.println ("La temparatúra en grados Fahrenheit es: " + fahren);
    }
}