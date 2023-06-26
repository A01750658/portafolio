
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
public class oCA {
    public static void main(String[] args){
        Random r = new Random();
        int jugador_1 = 0;
        int jugador_2 = 0;
        boolean control = false;
        while(control==false){
           int a = r.nextInt(6)+1;
           int b = r.nextInt(6)+1;
           jugador_1 += a;
           System.out.println("El jugador 1, avanza " + a +" casillas. Actualmente se encuentra en el " + jugador_1);
           jugador_2 += b;
           System.out.println("El jugador 2, avanza " + b +" casillas. Actualmente se encuentra en el "+jugador_2);
           if(jugador_1 > 100|| jugador_2 >100){
               control = true;
           }
        }
        if(jugador_1>jugador_2){
            System.out.println("Felicidades, jugador_1");
        }
        else{
            System.out.println("Felicidades jugador_2");
        }
    }
}
