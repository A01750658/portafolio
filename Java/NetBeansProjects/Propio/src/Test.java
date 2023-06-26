
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ikerf
 */
public class Test {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       String binario = "";
       String texto = in.next();
       for(int i = 0; i <texto.length(); i++){
            Vector bin = new Vector();
            char palabra = texto.substring(i).charAt(0);
            int ascii = (int) palabra;
            System.out.println(ascii);
            do{
                bin.add(String.valueOf((ascii%2)));
                ascii = (int) ascii/2;
                System.out.println(ascii);
                
            }while(ascii>1);
            bin.add(1);
            String binarios = "";
            for(int j = bin.size()-1; j>=0; j--){
                binarios += String.valueOf(bin.get(j));
                
            }
            binario += "0b"+binarios +" ";
            bin.clear();
            
        }
       System.out.println(binario);
    }
}
