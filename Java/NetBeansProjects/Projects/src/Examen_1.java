
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
public class Examen_1 {
    public static void main(String[] args){
        //Mi matrícula es A01749675, por lo que debo de usar un while
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un rango de esta forma: -2,2");
        String range = in.next();
        String[] separar = range.split(",");
        int x = Integer.parseInt(separar[0]);
        int y = Integer.parseInt(separar[1]);
        while(x>y){
            System.out.println("El primer numero ingresado es mayor, por favor vuélvalo a ingresar...");
            range=in.next();
            separar = range.split(",");
            x = Integer.parseInt(separar[0]);
            y = Integer.parseInt(separar[1]);            
        }
        while(x!=y){
            x+=(x+1);
        }
        System.out.println(x);
    }

}






