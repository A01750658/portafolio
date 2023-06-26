/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propio;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Propio {
    int operando;
    int cantidad; 
    double[] numeros = new double[cantidad];
    
   public Propio(){
       cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Con cuántos números va a trabajar?"));
       for(int i = 0; i<cantidad; i++){
           numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i+1)));
           
           
       }
      
   }
   public double sumar (double n1) {
       double suma = 0;
       for(int i = 0; i<numeros.length; ){
           suma += numeros[i];
       }
       return suma;
   }
    public double restar (double n1) {
       double resta = numeros[0];
       for(int i = 1; i<numeros.length; ){
           resta -= numeros[i];
       }
       return resta;
   }
    public double multiplicar (double n1) {
       double multiplica = numeros[0];
       for(int i = 1; i<numeros.length; ){
           multiplica *= numeros[i];
       }
       return multiplica;
   }
    public double divide (double n1) {
       double dividir = numeros[0];
       for(int i = 1; i<numeros.length; ){
           dividir /= numeros[i];
       }
       return dividir;
   }
    
}
   
