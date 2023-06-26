
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ikerf
 */
public class Reto {
    public static void main(String[] args){
        Random r = new Random();
        int[][] tablero = new int[64][64];
        double blanco = 0; 
        double negro = 0;
        for(int i = 0; i<tablero.length; i++){
            System.out.print("[|");
            for(int j = 0; j<64; j++){
                tablero[j][i] = r.nextInt(2);
                System.out.print(tablero[j][i] +"|");
                if(tablero[j][i]==0){
                    blanco ++;
                }
                else{
                    negro++;
                }
            }
            System.out.println("]");
        }
        
        System.out.println("\nEl porcentaje del tablero cubierto por blanco es de " + (blanco*100/(64*64)) + " Y el de negro es " + (negro*100/(64*64)) + " por ende el mayor es " +((blanco > negro) ? "blanco" : "negro"));
    }
}
