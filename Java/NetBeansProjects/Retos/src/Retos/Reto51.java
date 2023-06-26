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
public class Reto51 {
    public Reto51(){
    
    }
    public void Reto51(){
    Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo empezando por tu nombre: ");
    String nombre = in.nextLine();
    String[] partesnombre = nombre.split("");
    String name = partesnombre[0];
    String surname = partesnombre[1];
    String lastname = partesnombre[2];
    
    String letrassurname2 = surname.substring(0,1);
    char letraname = name.charAt(0);
    String letralastname = lastname.substring(0);
        System.out.println("Introduce la fecha de nacimiento en formato dd/mm/aa separada por /: ");
    String fecha = in.nextLine();
    String[] partesfecha = fecha.split("/");
    String dia = partesfecha[0];
    String mes = partesfecha[1];
    String año = partesfecha[2];
    String letra1 = "";
    String letra2 = "";
    int num1 = (int) Math.floor(Math.random()*27+1);
    int num2 = (int) Math.floor(Math.random()*27+1);
    switch (num1){
        case (1): letra1 = "A";
        case (2): letra1 = "B";
        case (3): letra1 = "C";
        case (4): letra1 = "D";
        case (5): letra1 = "E";
        case (6): letra1 = "F";
        case (7): letra1 = "G";
        case (8): letra1 = "H";
        case (9): letra1 = "I";
        case (10): letra1 = "J";
        case (11): letra1 = "K";
        case (12): letra1 = "L";
        case (13): letra1 = "M";
        case (14): letra1 = "N";
        case (15): letra1 = "Ñ";
        case (16): letra1 = "O";
        case (17): letra1 = "P";
        case (18): letra1 = "Q";
        case (19): letra1 = "R";
        case (20): letra1 = "S";
        case (21): letra1 = "T";
        case (22): letra1 = "U";
        case (23): letra1 = "V";
        case (24): letra1 = "W";
        case (25): letra1 = "X";
        case (26): letra1 = "Y";
        case (27): letra1 = "Z";   
    }
    switch(num2){
        case (1): letra2 = "A";
        case (2): letra2 = "B";
        case (3): letra2 = "C";
        case (4): letra2 = "D";
        case (5): letra2 = "E";
        case (6): letra2 = "F";
        case (7): letra2 = "G";
        case (8): letra2 = "H";
        case (9): letra2 = "I";
        case (10): letra2 = "J";
        case (11): letra2 = "K";
        case (12): letra2 = "L";
        case (13): letra2 = "M";
        case (14): letra2 = "N";
        case (15): letra2 = "Ñ";
        case (16): letra2 = "O";
        case (17): letra2 = "P";
        case (18): letra2 = "Q";
        case (19): letra2 = "R";
        case (20): letra2 = "S";
        case (21): letra2 = "T";
        case (22): letra2 = "U";
        case (23): letra2 = "V";
        case (24): letra2 = "W";
        case (25): letra2 = "X";
        case (26): letra2 = "Y";
        case (27): letra2 = "Z";
    }
    int lastnum = (int) Math.floor(Math.random()*9+1);
        System.out.println("Su RFC es: " + letrassurname2 + letralastname + letraname + año + mes + dia + letra1 + letra2 + lastnum);
    }
}
