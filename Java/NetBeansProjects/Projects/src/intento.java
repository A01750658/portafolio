
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
public class intento {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un rango de esta forma: -2,2");
        String range = in.next();
        String[] separar = range.split(",");
        int x = Integer.parseInt(separar[0]);
        int y = Integer.parseInt(separar[1]);
        if(x>y){
                
            System.out.println("El primer numero ingresado es mayor, por favor vuélvalo a ingresar...");
            range=in.next();
            separar = range.split(",");
            x = Integer.parseInt(separar[0]);
            y = Integer.parseInt(separar[1]);  
        }
        int count=x;
        System.out.println("Los números son: ");
        while(x<y){
            System.out.print(x + " + " );
            count+=(x+1);
            
            x++;
        }
        System.out.println("Su resultado es "+count +"\n Adiós compañero");
    }
}
