/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author alanvega
 */
public class Reto40 {
        public Reto40(){
        }
        public void Reto40(){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 10 números: ");
        int [] nums = new int [10];
        int suma = 0;
        for (int i = 0; i<nums.length; i++){
        System.out.println("Dame un número " + (i+1) + ":");
        nums[i] = in.nextInt();
        suma += nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("El promedio de los números es: " + suma/nums.length);
        }
}
