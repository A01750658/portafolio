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
public class Reto45 {
    public Reto45(){
    
    }
    public void Reto45(){
    Scanner in = new Scanner (System.in);
    double [] randoms = new double [50];
    for (int i = 0; i<randoms.length; i++){
    randoms [i] = Math.floor (Math.random()*20 + 45);
    System.out.println(randoms [i]);
    }
    System.out.println("Introduce un número entre 20 y 65: ");
    double num = in.nextDouble();
    int count = 0;
    for (int i = 0; i<randoms.length; i++){
    if (num == randoms[i]){
    count++;
    }
    }
    System.out.println("Este número se repite: " + count + " veces");
    }
}
