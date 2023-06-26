/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;

import java.util.Scanner;

/**
 *
 * @author ikerf
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Zoologico z = new Zoologico();
        int opcion = 0; 
        do{
            System.out.println("Bienvenido alo Zoológico de Iker, qué quiere hacer hoy?");
            System.out.println("1. Agregar una Jaula");
            System.out.println("2. Ver Jaulas");
            System.out.println("3.Nada");
            int control = in.nextInt();
            switch(control){
                case 1: 
                    z.nuevas_jaulas();
                    break;
                case 2:
                    z.imprimir_jaulas();
                    break;
                case 3:
                    System.out.println("Merci Beaucoup");
                    break; 
            }
            System.out.println("¿Quiere continuar? 1 sí, 2 no.");
            opcion = in.nextInt();
            
        }while(opcion==1);
        

    }
}
