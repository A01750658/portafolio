
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanvega
 */
public class Randomization {
    public int [] getCardNumbers(){
    int [] numbers = new int [8];
    int count = 0;
    while (count<16){
        Random r = new Random();
        int na = r.nextInt(8) + 1;
        int nvr = 0;
        for (int i = 0; i < 8; i++){
            if(numbers[i] == na){
                nvr++;
            }
        }
        if(nvr < 2){
        numbers [count] = na;
        count++;
        } 
        
    }
    return numbers;
    }
    
}
