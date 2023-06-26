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
public class Reto10b {
    public Reto10b(){
    
    }
    public void Reto10b(){
    Scanner in = new Scanner (System.in);
    System.out.println("presiona Enter y después introduce tu nombre completo");
    String name = in.nextLine();
    System.out.println("Tu primer nombre es " + in.next());
    }
}
