
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
public class CajaFuerte {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su contraseña ");
        int password = in.nextInt();
        boolean test = false; 
        do{
        for(int i =0; i<10000; i++){
            if(i==password){
                test=true;
                System.out.println("Im In " + password + " oh si");
            }
        }
        }while(test=false);
    }
}
