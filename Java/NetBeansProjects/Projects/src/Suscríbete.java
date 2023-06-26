
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
public class Suscríbete {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero binario ");
        String binario = in.next();
        int numero = Integer.parseInt(binario,2);
        System.out.println(numero);
    }
}
