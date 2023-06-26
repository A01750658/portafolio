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
public class Reto22 {
    public Reto22(){
   
    }
    public void Reto22(){
     Scanner in = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    String num = in.next();
    int num2 = Integer.parseInt(num);
    int op = num2%10;
    System.out.println((op==0)? "el número es múltiplo de 10" : "el número no es méltiplo de 10");
    }
}
