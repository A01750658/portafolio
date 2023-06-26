/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videos;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ikerf
 */
public class IkersMind {
    
    public static void main(String[] args) throws IOException{
        Vector watchlists = new Vector();
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido suscriptor al inicio. \n¿Qué quiere hacer el día de hoy?");
        System.out.println("1.Crear su watchlist. \n2.Operar sobre su watchlist");
        int control = 0;
        do{
            System.out.print("Ponga su selección: "); 
            int seleccion = in.nextInt();
            switch(seleccion){
                case 1: 
                    Videos_2 v = new Videos_2();
                    System.out.println("Ingrese el nombre de su watchlist");
                    v.setName(in.next());
                    System.out.println("Ingrese un breve comentario");
                    v.setComentario(in.next());
                    watchlists.add(v);
                    int controles = 1;
                    do{
                        System.out.println("Vamos a agregar un video a su watchlist");
                        v.datos();
                        System.out.println("¿Quiere ingresar otro video? S=1 N =2");
                        controles = in.nextInt();
                    }while(controles==1);
                    break;
                case 2:
                    System.out.println("Éstas son las Watchlists que tiene registradas");
                    for(int i = 0; i<watchlists.size(); i++){
                        Videos_2 vi = (Videos_2) watchlists.get(i);
                        System.out.println((i+1)+".-"+vi.getName());
                        System.out.println("    Descripción: "+vi.getComentario());
                        
                    }
                    System.out.println("¿Qué Watchlist quiere revisar?");
                    int opciones = in.nextInt()-1;
                    Videos_2 vl = (Videos_2) watchlists.get(opciones);
                    vl.Imprimir_catálogo();
                    vl.Ver_Youtube();
                    break;
                default:
                    System.out.println("En progreso");
                    break;
                   
            }
            System.out.println("¿Quiere continuar? S=0; N=1");
            control = in.nextInt();
        }while(control==0);
        System.out.println("Muchas gracias");
        
    }
}
