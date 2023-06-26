/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alanvega
 */
public class Reto49 {
    public Reto49(){
    
}
    public void Reto49(){
    Scanner in = new Scanner(System.in);
    String [] swimer = new String [10];
    double [][] pruebas = new double [10][5];
    double [] oro = {100, 100, 100, 100, 100};
    double [] plata = {100, 100, 100, 100, 100};
    double [] bronce = {100, 100, 100, 100, 100};
    int i;
    int j;
    int x ;
    int y;
    int z;
    int z2;
    int z3;
    int posicion1 = 0;
    int posicion2 = 0;
    int posicion3 = 0;
    System.out.println("Introduce nombres dipshit");
    Random r = new Random();
    for (i=0; i<10; i++){
    swimer [i] = in.nextLine();
    }
    for(i=0; i<10; i++){
    
        for(j = 0; j < 5; j++){
        pruebas [i] [j] = (double) Math.floor(Math.random()*100.0+1.0);
        }
    }
    for(x = 0; x<10; x++){
    for(y = 0; y<5; y++){
    for(z=0; z<10; z++){
    if(oro[y]>pruebas[x][y]){
    oro[y]=pruebas[x][y];
    posicion1 = x;
    }
    }
    for(z2=0; z2<10; z2++){
    if(plata[y]>pruebas[x][y] && pruebas[x][y]!=oro[y]){
    plata[y]=pruebas[x][y];
    posicion2 = x;
    }
    }
    for(z3=0; z3<10; z3++){
    if(bronce[y]>pruebas[x][y] && pruebas[x][y]!=oro[y] && pruebas[x][y] != plata[y]){
    bronce[y]=pruebas[x][y];
    posicion3 = x;
    }
    }
System.out.println("El premio de oro de la " + (y+1) + "ª " + "prueba es: " + swimer[posicion1] + " con un tiempo de " + oro[y]+"\n"); 
System.out.println("El premio de plata de la " + (y+1) + "ª " + "prueba es: " + swimer[posicion2] + " con un tiempo de " + plata[y]+"\n");  
System.out.println("El premio de bronce de la "+ (y+1) + "ª " + "prueba es: " + swimer[posicion3] + " con un tiempo de " + bronce[y]+"\n");  
System.out.println("_______________________________________________________________________________________________________________________________");
    }
    }
    }
}