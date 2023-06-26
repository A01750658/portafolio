/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package Yeet;

import java.util.Random;

 
/**
 * @author alanvega
 */
public class GameLogic {
    
    public int setImage(){
    Random r = new Random();
    int ni = r.nextInt(7) + 1;
    return ni;
    }
    
    public int[]setHints(){
    int [] numbers = new int[7];
    int count = 0;
    while (count<8){
        Random r = new Random();
        int nh = r.nextInt(7) + 1;
        int nvr = 0;
        for(int i = 0; i < 7; i++){
            if(numbers[i] == nh){
                nvr++;
            }
        }
        if(nvr < 1){
        numbers[count] = nh;
        count++;
        }
    }
    return numbers;
    } 
    public String[] objetos(){
    String[] nombres = new String[8];
    nombres[1] = "R2D2";
    nombres[2] = "Pikachu";
    nombres[3] = "pantera rosa";
    nombres[4] = "iron man";
    nombres[5] = "bob esponja";
    nombres[6] = "stitch";
    nombres[7] = "simba";
    return nombres;
    }
    
}



