package Codigos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanvega
 */
public class Ejercicio1v2 {
    public static void main(String[]args){
     int i = 1;
        do
        {
            double x = i%9;
            if (x == 0) 
            {
                System.out.println("Alan Rodrigo Vega");
            }
            else
            {
                System.out.print(i);
                System.out.print("* 2 =");
            System.out.println((i-2)/3);
            }
        i = i + 1;
        }
        while(i > 0 && i <= 100);
    }
}
