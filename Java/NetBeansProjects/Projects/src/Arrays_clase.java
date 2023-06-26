
import java.util.Arrays;
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
public class Arrays_clase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] temps = new double[in.nextInt()];
        double suma = 0.0;
        for(int i = 0; i < temps.length; i++){
            System.out.println("Ingrese la temperatura: ");
            temps[i] = in.nextDouble();
            System.out.println(temps[i] + "°C");
            suma += temps[i];
        }
        System.out.println(Arrays.toString(temps) +"\n el promedio de temperatura es:  " + (suma/temps.length));
        
    }
}
