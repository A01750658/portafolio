
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
public class Retospractica {
    public static void main(String [] args){
        //Fix import
        Scanner in = new Scanner(System.in);
        //Proceso
        System.out.println("Ingrese un número binario");
        String binario = in.next();
        int control = binario.length()-1;
        double suma = 0;
        String [] binarios = binario.split("");
        
        for(int i = 0; i<binario.length(); i++){
            double numero = Double.parseDouble(binarios[i]);
            double resultado_1 = Math.pow(2,control)*numero;
            control--;
            suma += resultado_1;
    }
        System.out.println(suma);
}
}
