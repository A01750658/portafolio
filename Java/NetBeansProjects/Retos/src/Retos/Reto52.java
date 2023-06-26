/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author alanvega
 */
public class Reto52 {
    public Reto52(){
    
    }
    public void Reto52(){
    Scanner in = new Scanner(System.in);
    double[] kilates = new double[50];
    int i;
    Cazador c = new Cazador();
    Vector ElVector2 = new Vector();
    for (i = 0; i<50; i++){
    kilates[i] = (double) Math.floor(Math.random()*50+0.1);
    if (kilates[i]>47.8){
        System.out.println("El valor en kilates es: ");
       c.GenerarDiamantes();
    ElVector2.add(kilates[i]);
        System.out.println(ElVector2);
    }
    }
    c.Imprimision();
    }
    
}
