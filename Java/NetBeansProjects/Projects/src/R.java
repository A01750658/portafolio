
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
public class R {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número ");
        int a = in.nextInt();
        int b = a/100;
        int c = a/10;
        int d = a/1;
        int e = a/1000;
        System.out.println(a +" descomposición: ");
        System.out.println(e);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
                
    }
}
