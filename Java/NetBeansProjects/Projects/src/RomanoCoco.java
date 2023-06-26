
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
public class RomanoCoco {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un número en binario");
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
       
        
            
       String numeros = String.valueOf(suma); 
      
       

       int x = Integer.parseInt(numeros.substring(0));
       int y = Integer.parseInt(numeros.substring(1));
       int z = Integer.parseInt(numeros.substring(2));
       String numero_roman = "";
  
       switch(z){
           case 0:
               numero_roman +="";
               break;
           case 1: 
               numero_roman += "I";
               break;
           case 2:
               numero_roman += "II";
               break;
           case 3:
               numero_roman += "III";
               break;
           case 4:
               numero_roman += "IV";
               break;
           case 5: 
               numero_roman += "V";
               break;
           case 6: 
               numero_roman += "VI";
               break;
           case 7: 
               numero_roman += "VII";
               break;
           case 8: 
               numero_roman += "VIII";
               break;
           case 9:
               numero_roman += "IX";
               break;
           default:
               numero_roman += "";
                 
       }
       switch(y){
           case 0:
               numero_roman +="";
               break;
           case 1: 
               numero_roman += "X";
               break;
           case 2:
               numero_roman += "XX";
               break;
           case 3:
               numero_roman += "XXX";
               break;
           case 4:
               numero_roman += "XL";
               break;
           case 5: 
               numero_roman += "L";
               break;
           case 6: 
               numero_roman += "LX";
               break;
           case 7: 
               numero_roman += "LXX";
               break;
           case 8: 
               numero_roman += "LXXX";
               break;
           case 9:
               numero_roman += "XC";
               break;
           default:
               numero_roman += "";
       }
       switch(x){
           case 0:
               numero_roman +="";
               break;
           case 1: 
               numero_roman += "C";
               break;
           case 2:
               numero_roman += "CC";
               break;
           case 3:
               numero_roman += "CCC";
               break;
           case 4:
               numero_roman += "CD";
               break;
           case 5: 
               numero_roman += "D";
               break;
           
           default:
               numero_roman += "";
       }
       System.out.println("Numero romano = " + numero_roman);
       
        
    }
}

