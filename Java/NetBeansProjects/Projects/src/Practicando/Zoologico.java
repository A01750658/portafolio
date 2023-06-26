/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ikerf
 */
public class Zoologico {
    Scanner in = new Scanner(System.in);
    int op;
    Vector Zoologico = new Vector();
    public void nuevas_jaulas(){
        
        Jaula j = new Jaula();
        System.out.println("Ingrese el nombre de la jaula");
        j.setName(in.next());
        System.out.println("Ingrese su locación (Norte, sur, este oeste)");
        j.setLocacion(in.next());
        System.out.println("Ingrese la cantidad de visitantes que recibe");
        j.setVisitantes(in.nextDouble());
        Zoologico.add(j);
        do{
            
            j.llenar_jaulas();
            System.out.println("¿Quiere agregar un animal? 1. Si | 2. No");
            op = in.nextInt();
        }while(op==1);
        
    }
    public void imprimir_jaulas(){
        System.out.println("El zoológico tiene las siguientes Jaluas: ");
        for(int i = 0; i<Zoologico.size(); i++){
            Jaula lugar = (Jaula) Zoologico.get(i);
            System.out.println((i+1)+"-:"+ lugar.getName());
        }
        System.out.println("¿Qué Jaula quiere imprimir?");
        op = in.nextInt()-1;
            Jaula j = (Jaula) Zoologico.get(op);
            j.Registro();
            
        
        
        
    }

    
}

