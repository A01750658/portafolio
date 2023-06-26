
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ikerf
 */
public class Ejercicio {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número binario");
        int suma = 0; 
        String binario = in.next();
        String[] binarios = binario.split("");
        for(int i = binarios.length-1; i>=0; i--){
            suma+= Math.pow(2, i)*Integer.parseInt(binarios[i]);
        }
        System.out.println(suma);
    }
}
