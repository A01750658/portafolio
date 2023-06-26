/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ikerf
 */
public class Red_de_Heroes {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int continuar;
        Vector equipos = new Vector();
        do{
        System.out.println("Bienvenido a la red de héroes de Iker, ¿qué quiere hacer el día de hoy?");
        System.out.println("1.-Ingresar un nuevo escuadron");
        System.out.println("2.-Ver los escuadrones");
        System.out.println("3. Rankear a los escuadrones");
        int op = in.nextInt();
        switch(op){
            case 1: 
                Escuadron e = new Escuadron();
        System.out.println("Vamos a ingresar a nuestro escuadron");
        System.out.println("______________________________________");
        System.out.println("Ingrese el nombre de su escuadron ");
        e.setName(in.next());
        System.out.println("Ingrese su asignación");
        e.setAsignacion(in.next());
        System.out.println("Ingrese su ranking");
        e.setRanking(in.next());
        equipos.add(e);
        System.out.println("Vamos a ingresar a los héroes");
        do{
            e.crear_escuadron();
            System.out.println("¿Quiere agregar a otro héroe al escuadrón" + e.getName() + " Sí = 1 | No = 2");
            op = in.nextInt();
           
        }while(op==1);
                break; 
            case 2: 
                System.out.println("\tLa academia de Iker contiene los siguientes escuadrones: ");
       
        
        for(int i = 0; i<equipos.size(); i++){
            Escuadron es = (Escuadron) equipos.get(i);
            System.out.println("Escuadron " + (i+1));
            System.out.println(es.getName());
        }
        System.out.println("¿Sobre qué escuadron quiere iterar?");
        int opcion = in.nextInt()-1;
        Escuadron es = (Escuadron) equipos.get(opcion);
        es.mostrar_escuadron();
                break; 
            case 3:
                System.out.println("Pendiente");
            case 4:
                System.out.println("Merci");
                break;
                
        }
            System.out.println("¿Quiere continuar? 1. Sí | 2. No");
            continuar = in.nextInt();
        }while(continuar==1);
        System.out.println("Gracias");
    }
}
