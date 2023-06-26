/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saludo;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Saludos {
    public Saludos() {
        
        Scanner in = new Scanner(System.in);
        int opcion;
        
        System.out.println("------------");
        System.out.println("\t idioma lenguaje");
        System.out.println("\t 1.- Español");
        System.out.println("\t 2.- Ingles");
        System.out.println("\t 3.- Frances");
        System.out.println("\t 4.- Aleman");
        System.out.println("\t 5.- Italiano");
        System.out.println("\t 6.- Portugues");
        
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        
    }
    public void Saluda(String nombre){
        System.out.println("Hola" + nombre + "!");
        System.out.println("Que pasa crack");
        
    }
    
    public void Saluda(int edad){
        System.out.println("Hello there!, I know you're: " + edad + "years old");
        System.out.println("General Kenobi! I've been watching you");
    }
    
}
