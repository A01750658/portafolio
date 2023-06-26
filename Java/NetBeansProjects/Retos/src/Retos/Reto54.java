/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retos;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author alanvega
 */
public class Reto54 {
    public Reto54(){
    
}
    public void Reto54(){
        Vector ElVector2 = new Vector();
        Departamento d = new Departamento();
        Edificio e = new Edificio();
    Scanner in = new Scanner(System.in);
        System.out.println("Opción 0; Salir");
        System.out.println("Opción 1; Dar de alta departamento");
        System.out.println("Opción 2; Dar de baja el departamento");
        System.out.println("Introduzca la opción que quiera ejecutar");
        int opcion = in.nextInt();
    while (opcion != 0){
      switch (opcion){
          case 0:
              break;
          case 1: e.Deps();
                  e.calcvent();
                  e.calcpark();
          break;
          case 2: e.Depsminus();
                  e.calcvent();
                  e.calcpark();
          break;
          default: System.out.println("Introduzca una opción del menú");
              break;
      }  
    }
    }
}



