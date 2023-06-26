/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propio;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Calculadora {
    Pattern numeral = Pattern.compile("[0-9]");
    
    int cantidad; 
    double[] numeros;
    //Operaciones
    double sumar;
    double multiplicar;
    double dividir;
    double restar;
    //Avanzado
    String[] operando_1;
    int [] operando_2;
    double[] operando_3;
    double[] operando_4;
    ArrayList<Double> semi_resultado = new ArrayList<>();
    ArrayList<Double> resultado = new ArrayList<>();
    int cont;
    int contar = 0;
    double finales;
    double parciales = 0;
    public Calculadora(){
        
        
        }
    public void operandocompleto1(){
        
        double[][] operando;
        String operando_S = JOptionPane.showInputDialog("Ingrese la operación");
        String [] operando_Sp = operando_S.split(" ");
        operando = new double[operando_Sp.length][3];
        for(int i = 0; i<operando_Sp.length; i++){
            switch(operando_Sp[i]){
                case "/":
                    if(semi_resultado.size() > 0){
                       dividir = semi_resultado.get(semi_resultado.size()-1) / Double.parseDouble(operando_1[i+1]); 
                    }
                    else{
                        dividir = Double.parseDouble(operando_Sp[i-1]) / Double.parseDouble(operando_Sp[i+1]);
                    }
                    operando[i][0] = dividir;
                    semi_resultado.add(dividir);
                    break;
                case "*":
                    if(semi_resultado.size() > 0){
                       multiplicar = semi_resultado.get(semi_resultado.size()-1) * Double.parseDouble(operando_1[i+1]);
                       
                    }
                    else{
                       multiplicar = Double.parseDouble(operando_Sp[i-1])*Double.parseDouble(operando_Sp[i+1]); 
                    }      
                    operando[i][0] = multiplicar;
                    semi_resultado.add(multiplicar);
                    break;
            }
                    
                    
            }
            
        
    }
    
    public void operandocompleto(){
        cont = 0;
        String operando = JOptionPane.showInputDialog("Ingrese la operación");
        operando_1 = operando.split(" ");
        if(operando_1.length % 2==0){
            operando_2 = new int[operando_1.length/2];
        }
        else{
        operando_2 = new int[(operando_1.length+1)/2-1];
        }
        System.out.println(operando);
        for(int i = 0; i<operando_1.length; i++){
            
            if(operando_1[i].equals("+")||operando_1[i].equals("-")){
                operando_2[cont] = i;
                cont++;
            }
        }
        System.out.println(Arrays.toString(operando_2));
        for(int j = 0; j<operando_1.length; j++){
            switch(operando_1[j]){
                case "/":
                    if(semi_resultado.size() > 0){
                       dividir = semi_resultado.get(semi_resultado.size()-1) / Double.parseDouble(operando_1[j+1]); 
                    }
                    else{
                        dividir = Double.parseDouble(operando_1[j-1]) / Double.parseDouble(operando_1[j+1]);
                    }
                    semi_resultado.add(dividir);
                    System.out.println("Result: "+semi_resultado.get(semi_resultado.size()-1));
                    break;
                case "*":
                    if(semi_resultado.size() > 0){
                       multiplicar = semi_resultado.get(semi_resultado.size()-1) * Double.parseDouble(operando_1[j+1]);
                       
                    }
                    else{
                      multiplicar = Double.parseDouble(operando_1[j-1]) * Double.parseDouble(operando_1[j+1]); 
                    
                    }
                    semi_resultado.add(multiplicar);
                    System.out.println("Result: "+ semi_resultado.get(semi_resultado.size()-1));
               
  
            }
            
        }
        for(int i = 0; i<operando_1.length; i++){
            
            if(i == operando_2[contar]){
                switch(operando_1[operando_2[contar]]){
                    case "+":
                        if(resultado.size() > 0){
                              finales += (resultado.get(resultado.size()-1)+semi_resultado.get(i+1));
                              resultado.add(finales);
                }
                        else{
                             if(semi_resultado.size() >= 3 ){
                                finales += (semi_resultado.get(i-1)+semi_resultado.get(i+1)); 
                                resultado.add(finales);
                    }
                             else if(semi_resultado.size()== 2 ){
                                finales += (semi_resultado.get(semi_resultado.size()-1)+semi_resultado.get(semi_resultado.size()-2)); 
                                resultado.add(finales);
                    }
                    else{
                                finales += semi_resultado.get(semi_resultado.size()-1) + Double.parseDouble(operando_1[i+1]);
                    }
                   
                }
                        break;
                    case "-":
                        if(resultado.size() > 0){
                            finales += (resultado.get(resultado.size()-1)-semi_resultado.get(i+1));
                            resultado.add(finales);
                }
                       else{
                            if(semi_resultado.size() >= 3 ){
                               finales += (semi_resultado.get(i-1)-semi_resultado.get(i+1)); 
                               resultado.add(finales);
                    }
                             else if(semi_resultado.size()== 2 ){
                                    finales += (semi_resultado.get(semi_resultado.size()-1)-semi_resultado.get(semi_resultado.size()-2)); 
                                    resultado.add(finales);
                    }
                             else{
                                    finales += semi_resultado.get(semi_resultado.size()-1) - Double.parseDouble(operando_1[i+1]);
                    }
                           
                }
                        break;
                }
   
            }
 
        }
        
        
        System.out.println("Vamosssssss " + finales);
        
    }
    public void llenarArreglo(){
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números va a usar?"));
        numeros = new double[cantidad];
        for(int i = 0; i<cantidad; i++){
        numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i+1)));
    }
    }
    public double[] suma(){
        sumar = 0;
        for(int i = 0; i<cantidad; i++){
            sumar += numeros[i];
        }
        System.out.println(sumar);
        return numeros;
    }
    public double[] resta(){
        restar = numeros[0];
        for(int i = 0; i<cantidad; i++){
            restar -= numeros[i];
        }
        System.out.println(restar);
        return numeros;
    }
    public double[] multiplicar(){
        multiplicar = numeros[0];
        for(int i = 0; i<cantidad; i++){
            multiplicar *= numeros[i];
        }
        System.out.println(multiplicar);
        return numeros;
    }
    public double[] dividir(){
        dividir = numeros[0];
        for(int i = 0; i<cantidad; i++){
            dividir/= numeros[i];
        }
        System.out.println(dividir);
        return numeros;
    }
    }
    
    

