/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alanvega
 */

public class Reto42 {
    public Reto42(){
    }
    public void Reto42(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce el número de veces que quieres que itere el programa: ");
    int num = in.nextInt();
    List <Integer> Fibonacci = new ArrayList <> ();
    Fibonacci.add(1);
    Fibonacci.add(1);
    for (int i = 1; i<num; i++){
    int eqation = Fibonacci.get(i)+Fibonacci.get(i-1);
    Fibonacci.add (eqation);
    }
    System.out.println(Fibonacci);
    }
}
