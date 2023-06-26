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
public class Reto44 {
    public Reto44(){
    
    }
    public void Reto44(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduzca un número");
    int num = in.nextInt();
    double factorial = 1;
    while (num != 0){
    factorial = factorial*num;
    num--;
    }
    System.out.println(factorial);
    }
}
