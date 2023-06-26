/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Reto48 {
    public Reto48(){
    
    }
    public void Reto48(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce cuántos números aleatorios se generarán: ");
    int nums [][] = new int [in.nextInt()][in.nextInt()];
    int menores = 0;
    int mayores = 0;
    int i;
    int j = 0;
    for (i= 0; i < nums.length; i++ ){
        
        for(j = 0; j < nums.length; j++){
    nums [i] [j] = (int) Math.floor (Math.random()*200+1);
    
    if (nums [i] [j]<50){
    menores++;
    }
    if (nums [i] [j]>170){
    mayores++;
    }
    
    }
        
    }
    System.out.println(Arrays.deepToString(nums));
    System.out.println("la longitud del arreglo es: " + nums.length);
    System.out.println("La cantidad de números menores a 50 es: " + menores);
    System.out.println("La cantidad de números mayores a 170 es: " + mayores);
    }
}
