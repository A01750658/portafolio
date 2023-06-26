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
public class Reto39 {
    public Reto39(){
    }
    public void Reto39(){
    Scanner in = new Scanner(System.in);
    System.out.print("Ingresa 10 números separados por comas: ");
    String num = in.next();
    String [] nums = num.split(",");
    String numone = nums[0];
    String numtwo = nums[1];
    String numthree = nums[2];
    String numfour = nums[3];
    String numfive = nums[4];
    String numsix = nums[5];
    String numseven = nums[6];
    String numeight = nums[7];
    String numnine = nums[8];
    String numten = nums[9];
    int num1 = Integer.parseInt(numone);
    int num2 = Integer.parseInt(numtwo);
    int num3 = Integer.parseInt(numthree);
    int num4 = Integer.parseInt(numfour);
    int num5 = Integer.parseInt(numfive);
    int num6 = Integer.parseInt(numsix);
    int num7 = Integer.parseInt(numseven);
    int num8 = Integer.parseInt(numeight);
    int num9 = Integer.parseInt(numnine);
    int num10 = Integer.parseInt(numten);
    
    double prom = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10 ;
    System.out.println("el promedio de los números es: " + prom);
    }
}
