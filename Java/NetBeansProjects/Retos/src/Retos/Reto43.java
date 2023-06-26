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
public class Reto43 {
    public Reto43(){
    
    }
    public void Reto43(){
    Scanner in = new Scanner (System.in);
    double [][] saldosmes = new double [3][12];
    double [] saldoaño = new double [3];
    saldoaño [0] = 0;
    saldoaño [1] = 0;
    saldoaño [2] = 0;
    double suma = 0;
    for (int i = 0; i < saldosmes.length; i++){
    System.out.println("Favor de ingresar sus salarios mensuales del año " + (2017+i));
    for (int j = 0; j < 12; j++){
    saldosmes [i] [j] = in.nextDouble();
    saldoaño [i] += saldosmes [i] [j];
    }
    
    for (int x = 0; x<3; x++){
    System.out.println("Saldo anual de " + (2017+x) + " es " + (saldoaño[x]));
    suma += saldoaño[x];
    }
    }
    System.out.println (suma);
    System.out.println("Promedio de los tres años: " + (suma/3));
    }
}
