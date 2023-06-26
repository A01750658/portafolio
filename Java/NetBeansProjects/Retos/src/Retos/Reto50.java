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
public class Reto50 {
    public Reto50(){
    
    }
    public void Reto50(){
    Scanner in = new Scanner (System.in);
        System.out.print("Introduce cuántos números aleatorios quieres dipshit: ");
    int [][] num = new int[in.nextInt()][5];
    int i;
    int j;
    int linea2;
    int x;
    for(i=0; i<num.length; i++){
    num[i][0] = (int) Math.floor(Math.random()*99+1);
    num[i][1] = num[i][0]+num[i][0]/2;
    linea2 = num[i][0];
    x = linea2%10;
    num[i][2] = num[i][0]*x;
    num[i][3] = num [i][2]-num[i][1];
    if(num[i][3]%2==0){
    num[i][4] = 1;
    }
    if(num[i][3]%2!=0){
    num[i][4] = 0;
    }
    }
    for(i = 0;i<5;i++){
    System.out.println("");
    System.out.println("");
    for(j=0;j<num.length;j++){
    System.out.print(num[j][i]+" || ");
    }
    }
    }
    }


