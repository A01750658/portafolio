/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alanvega
 */
public class Arreglos {
    public static void main (String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("¿Cuántas temperatuas vas a mandar?");
    double[] temps = new double [in.nextInt()];
    double suma = 0.0;
    for (int i =0; i<temps.length;i++){
    System.out.println("Dame una temperatura" + i+1 + "por favor");
    temps[i]=in.nextDouble();
    suma += temps[i];
    }
    System.out.println("La longitud del arreglo es: " + temps.length);
    System.out.print(Arrays.toString(temps));
    System.out.println("El promedio de temperatura es: "+ suma/temps.length);
    }
}
