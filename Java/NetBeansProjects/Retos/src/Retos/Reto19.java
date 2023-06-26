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
public class Reto19 {
    public Reto19(){
    
    }
    public void Reto19(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int N = in.nextInt();
    int uno,dos,tres,cuatro,cinco;
    uno = N%10;
    N = N/10;
    dos = N%10;
    N = N/10;
    tres = N%10;
    N = N/10;
    cuatro = N%10;
    N = N/10;
    cinco = N%10;
    System.out.println(cinco);
    System.out.print(cinco);System.out.println(cuatro);
    System.out.print(cinco);System.out.print(cuatro);System.out.println(tres);
    System.out.print(cinco);System.out.print(cuatro);System.out.print(tres);System.out.println(dos);
    System.out.print(cinco);System.out.print(cuatro);System.out.print(tres);System.out.print(dos);System.out.println(uno);
    }
    
}
