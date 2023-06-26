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
public class Reto38 {
    public Reto38(){
    }
    public void Reto38(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce un número del 1 al 500: ");
    int x = in.nextInt();
    int centenas ;
    int decenas ;
    int unidades ;
     unidades = x%10;
    x = x/10;
    decenas = x%10;
    x = x/10;
    centenas = x%10;
    String unitates = null;
    String tens = null;
    String centum = null;
    if (x>500){
    System.out.println("número no válido");
    }
    else{}
    switch (unidades){
        case (1):
            unitates = "I";
            break;
        case (2):
            unitates = "II";
            break;
        case (3):
            unitates = "III";
            break;
        case (4):
            unitates = "IV";
            break;
        case (5):
            unitates = "V";
            break;
        case (6):
            unitates = "VI";
            break;
        case (7):
            unitates = "VII";
            break;
        case (8):
            unitates = "VIII";
            break;
        case (9):
            unitates = "IX";
            break;
        default:
            System.out.println("número no válido");
            break;
    }
    switch (decenas){
        case (1):
            tens = "X";
            break;
        case (2):
            tens = "XX";
            break;
        case (3):
            tens = "XXX";
            break;
        case (4):
            tens = "XL";
            break;
        case (5):
            tens = "L";
            break;
        case (6):
            tens = "LX";
            break;
        case (7):
            tens = "LXX";
            break;
        case (8):
            tens = "LXXX";
            break;
        case (9):
            tens = "XC";
            break;
        default :
            System.out.println("número no válido");
            break;
    }
    switch (centenas){
        case (1):
            centum = "C";
            break;
        case (2):
            centum = "CC";
            break;
        case (3):
            centum = "CCC";
            break;
        case (4):
            centum = "CD";
            break;
        case (5):
            centum = "D";
            break;
        default:
            System.out.println("número no válido");
            break;
    }
    System.out.println("El número en romano es: " + centum + tens + unitates);
    }
}
