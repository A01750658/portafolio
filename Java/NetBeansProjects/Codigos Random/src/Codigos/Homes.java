/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Homes {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    System.out.println("Introduzca la marca");
    String marca = in.next();
    if (marca == "Nissan"){
    System.out.println("Marca correcta");
    }
    else{
    System.out.println("Marca incorrecta");
    }
    }
}
