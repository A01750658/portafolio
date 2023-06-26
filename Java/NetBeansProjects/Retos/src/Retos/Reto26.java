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
public class Reto26 {
    public Reto26(){
    
    }
    public void Reto26(){
    Scanner in = new Scanner(System.in);
    System.out.print("Ingrese una letra o número: ");
    char input = in.next().charAt(0);
    boolean comp = Character.isDigit(input);
    if (comp == true){
    System.out.println("El dato es un número");
    }
    else{
    System.out.println("El dato no es un número");
    }
    }
}
