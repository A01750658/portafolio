/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Reto46 {
    public Reto46(){
    
    }
    public void Reto46(){
    Scanner in = new Scanner (System.in);
    double [] nums = new double [20];
    int count = 0;
    for (int i = 0; i<nums.length; i++){
    double random = Math.floor (Math.random()*1000000+1);
    if (nums [i]%2 == 0){
    nums[i] = random;
    count++;
    System.out.println(nums[i]);
    if (count==20){
    System.out.println("Se han completado 20 números pares");
    }
    }
    }
    }
}
