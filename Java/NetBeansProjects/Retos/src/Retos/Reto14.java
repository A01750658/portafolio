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
public class Reto14 {
    public Reto14(){
    
    }
    public void Reto14(){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduce la velocidad en km/h");
    double vel = in.nextDouble();
    double ms = (vel/3.6);
    System.out.println("la velocidad en m/s es: " + ms);
    }
}
