
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
public class Probandoreto36 {
    public static void main(String[] args){
        Random r = new Random();
        for(int i = 1; i < 52; i++){
            int randomer = r.nextInt(10000);
            String numero = String.valueOf(randomer);
            String[] n = numero.split(""); 
            if(Integer.parseInt(n[numero.length()-1])==2){
                System.out.println("El número " + numero);
                
            }
            
        }
    }
}
