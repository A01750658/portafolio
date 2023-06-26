/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ikerf
 */
public class Examen {
    //Matrícula = A01749675, debo de: dividir entre 2 y sumar 5)
    public static void main(String[] args){
       String array = "";
       int count = 0;
        for(int i = 1; i<101; i++){
            double operando = (i/2)+5;
            String operandos = String.valueOf(operando);
            String[] oper = operandos.split("");
            if(operando%9==0||oper[operandos.length()-3].equals("9")){
                System.out.println("A01749675, Iker Fuentes");
                
                while(count<=5){
                    array+=("/" + operandos );
                    count++;
                }  
            }
            else{
                System.out.println("" + i +"/2 +5 = "+operando);
       
            }
            
            
            }
        String[] arrays = array.split("/");
        for(int x = 0; x<5; x++){
            System.out.println("\n\nCasos Iker" + arrays[x]);
        }
        }
    }

