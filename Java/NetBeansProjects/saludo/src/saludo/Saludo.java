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
public class Saludo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Hola Usuario, qué quieres hacer?");
        System.out.println("\t 1.-Saludar alumno");
        System.out.println("\t 2.- Despedirme");
        
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                Saludos s = new Saludos();
                break;
            case 2:
                System.out.println("\n\n---------------------");
                System.out.println("HASTA PRONTO");
                break;
        }
        }while(opcion!=2);
    }
    
}
