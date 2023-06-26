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
public class Reto17 {
    public Reto17(){
    }
    public void Reto17(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce el primer cateto: ");
    double cat1 = in.nextDouble();
    System.out.println("Introduce el segundo cateto: ");
    double cat2 = in.nextDouble();
    System.out.println("Introduce el tercer cateto: ");
    double cat3 = in.nextDouble();
    double semi = (cat1 + cat2 + cat3)/2;
    double area = semi*(semi - cat1)*(semi - cat2)*(semi - cat3);
    System.out.println("El área del triángulo es igual a: " + Math.sqrt(area));
    }
}