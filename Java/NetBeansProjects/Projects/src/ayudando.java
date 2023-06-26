
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
public class ayudando {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de números");
       double suma = 0; 
       double promedio; 
       int contador = 0;
        double[] numeros = new double[in.nextInt()];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese el número" + (i+1));
            numeros[i] = in.nextDouble();
            if((i+1)%2==0){
                suma += numeros[i];
                contador++;
            }
        }
        promedio = (double) suma/contador;
        System.out.println("Promedio "+promedio);
    }
}
