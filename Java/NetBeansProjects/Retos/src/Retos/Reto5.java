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
public class Reto5 {
    public Reto5() { 
    }
    public void Reto5(){
    Scanner in = new Scanner(System.in);
    System.out.println("Asigna número 1");
    int numone = in.nextInt();
    System.out.println("Asigna número 2");
    int numtwo = in.nextInt();
    
    int suma = (numone + numtwo);
    int resta = (numone - numtwo);
    int mult = (numone * numtwo);
    double div = (numone / numtwo);
    double pot = Math.pow(numone, numtwo);
    double mod = (numone % numtwo);
    System.out.println ("Suma: " + suma);
    System.out.println ("Resta: " + resta);
    System.out.println ("Multiplicacion: " + mult);
    System.out.println ("División: " + div);
    System.out.println ("Potencia: " + pot);
    System.out.println ("Módulo: " + mod); 
    }
}
