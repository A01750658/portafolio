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
public class Reto36 {
  public Reto36(){
  
  }
    public void Reto36(){
        int contador = 0;
  for (int i = 1; i<= 50; i++){
  double random1 = Math.floor(Math.random() * 1000000);
  System.out.println(random1);
  if (random1%10==2){
  contador++;
  }
  }
  System.out.println("La cantidad de números que terminan en 2 es: " + contador);
    }
}
