/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alanvega
 */
public class Reto41 {
   public Reto41(){
   
   }
   public void Reto41(){
   Scanner in = new Scanner (System.in);
   System.out.print("¿Cuántas notas va a introducir? ");
   double [] notas = new double [in.nextInt()];
   double suma = 0;
   int i;
   for ( i = 0; i<notas.length; i++){
   System.out.print("Introduce la nota del alumno " + (i+1) + ":");
   notas[i]=in.nextDouble();
   suma +=notas[i];
   }
   double promedio = suma/notas.length;
   System.out.println("El promedio del grupo es: " + promedio);
   for (i = 0; i<notas.length;i++){
   if (notas[i]>promedio) {
   System.out.println("el alumno: " + (i+1) + " está arriba de la media");
   }
   }
   }
}