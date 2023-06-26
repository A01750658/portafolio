
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ikerf
 */
public class Ayuda_34 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random r = new Random(120); 
        String [] nadadores = new String[10];
        double[][] vueltas = new double[5][10];
        for(int i = 0; i<10; i++){
            System.out.println("Nombre del nadador " + (i+1));
            nadadores[i] = in.next();
        }
        for(int i = 0; i<5; i++){
            System.out.println("\n");
            for(int j = 0; j<10; j++){
                System.out.print("|");
                vueltas[i][j] = r.nextDouble();
                System.out.print(vueltas[i][j]);
                System.out.print("|");
            }
    }
        System.out.println("\n");
        
        for(int i = 0; i<5; i++){
            System.out.println("Prueba "+(i+1));
        double oro = 0.0;
        int participante = 0;
        double plata = 0.0;
        int participante_2 = 0;
        double bronce = 0.0;
        int participante_3 = 0;
        
        for(int j = 0; j<10; j++){
            
            if(vueltas[i][j]>oro){
                oro = vueltas[i][j];
                participante = j;
            }
        }
        
        for(int x = 0; x< 10; x++){
            if(vueltas[i][x]>plata && vueltas[i][x] != oro){
                plata = vueltas[i][x];
                participante_2 = x;
            }
        }
        
        for(int y = 0; y<10; y++){
           if(vueltas[i][y]>bronce && vueltas[i][y] != plata && vueltas[i][y] != oro ){
                bronce = vueltas[i][y];
                participante_3 = y;
            } 
        }
         System.out.println("Oro = " + nadadores[participante] + "    con un tiempo de " + oro);
            System.out.println("Plata = " + nadadores[participante_2] +"    con un tiempo de " + plata);
            System.out.println("bronce = " + nadadores[participante_3] +"    con un tiempo de " + bronce);
            System.out.println("___________________________________________________________");
        }   
            
            
            
        }
            
        
}
