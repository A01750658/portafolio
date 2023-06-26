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
public class Examen2 {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce el número de tickets: ");
    String [] ticketnum = new String [in.nextInt()];
    String ticket = "";
    for (int i = 0; i<=ticketnum.length; i++){
    System.out.println("Introduce el número de ticket");
    ticket = in.nextLine();
    }
    
    System.out.println("Ingrese que ticket desea imprimir, empezando por el 0");
    int numtick = in.nextInt();
    String num = ticketnum[numtick];
        char tipo = ticket.charAt(0);
        String prenda;
        if (tipo == 0){
        prenda = "error";
        }
        else if (tipo == 1){
        prenda = "pantalon";
        }
        else if (tipo == 2){
        prenda = "blusas";
        }
        else {
        prenda = "zapatos";
        }
        String costo = ticket.substring(3,6);
        int costonum = Integer.parseInt (costo);
        String utilidad = ticket.substring(6,7);
        int utilidadnum = Integer.parseInt (utilidad);
        double precio = costonum/(1-(utilidadnum/100));
        String disc = ticket.substring(11);
        double discount = Integer.parseInt(disc);
        String porsche;
        double porcentaje;
        String binario;
        if (discount == 1){ 
        porsche = ticket.substring(12,14);
        porcentaje = (Integer.parseInt(porsche))/100;
        binario = "Hay descuento";
        precio = precio+precio*porcentaje;
        }
        else {
        binario = "no hay descuento";
        }
        String cupon = ticket.substring(15);
        double impuesto = precio*0.16;
        System.out.println("tipo de prenda: " + prenda);
        System.out.println("el precio es: " +precio);
        System.out.println("el impuesto es: " + impuesto);
        System.out.println ("el precio es: " + (precio + impuesto));
    }
}
