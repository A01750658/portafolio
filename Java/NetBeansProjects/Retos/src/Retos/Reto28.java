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
public class Reto28 {
    public Reto28(){
    
    }
    public void Reto28(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce la hora en formato 12 horas y con el am o pm en mayúsculas");
    int h = in.nextInt();
    int m = in.nextInt();
    int s = in.nextInt();
    String zona = in.next();
    if (h>12){
    System.out.println("La hora no es válida");    
    }
    if (m>60){
    System.out.println("Los minutos no son válidos");
    }
    if(s>60){
    System.out.println("Los segundos no son válidos");
    }
    else{
    switch (zona){
        case "AM":
            System.out.println("La hora es: " + (h) + ":" + (m) + ":" + (s) + ":");
        case "PM":
            switch (h){ 
            case 1:
                System.out.println("La hora es: 13:" + ":" + (m) + ":" + (s));
                break;
            case 2:
                System.out.println("La hora es: 14" + ":" + (m) + ":" + (s));
                break;
            case 3:
                System.out.println("La hora es: 15" + ":" + (m) + ":" + (s));
                break;
            case 4:
                System.out.println("La hora es: 16" + ":" + (m) + ":" + (s));
                break;
            case 5:
                System.out.println("La hora es: 17" + ":" + (m) + ":" + (s));
                break;
            case 6:
                System.out.println("La hora es: 18" + ":" + (m) + ":" + (s));
                break;
            case 7:
                System.out.println("La hora es: 19" + ":" + (m) + ":" + (s));
                break;
            case 8:
                System.out.println("La hora es: 20" + ":" + (m) + ":" + (s));
                break;
            case 9:
                System.out.println("La hora es: 21" + ":" + (m) + ":" + (s));
                break;
            case 10:
                System.out.println("La hora es: 22" + ":" + (m) + ":" + (s));
                break;
            case 11:
                System.out.println("La hora es: 23" + ":" + (m) + ":" + (s));
                break;
            case 12:
                System.out.println("La hora es: 24" + ":" + (m) + ":" + (s));
                break;
            }
    }
    }
    }
}
