/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;

/**
 *
 * @author alanvega
 */
public class Reto4 {
    public Reto4() {
    }
    public void Reto4(){
    int A = 4;
    int B = 8;
    int C = 10;
    int D = 6;
    //variable que gurda el valor para que no cambie
    int vault = B;
    B = C;
    C = A;
    A = D;
    D = vault;
    System.out.println (A);
    System.out.println (B);
    System.out.println (C);
    System.out.println (D);
    }
}
