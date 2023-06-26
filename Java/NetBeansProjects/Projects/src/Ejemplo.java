
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
public class Ejemplo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Este es un programa que divide dos números y comprueba si el divisor noi es 0, así que ingrese dos números");
        double hello_there = in.nextDouble();
        double general_kenobi = in.nextDouble();
        if(general_kenobi!=0){
            System.out.println("Es lógico, tenga un uen día" + (hello_there/general_kenobi));
        }
        else{
            System.out.println("No es posible, pues el divisor es : " + general_kenobi);
        }
        
    }
}
