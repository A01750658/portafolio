
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ikerf
 */
public class Examen2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, ingrese la cantidad de códigos de barra a recibir");
        int cantidad = in.nextInt();
        String[] codigos = new String[cantidad];
        int producto = 0;
        String productos = "";
        double costo = 0;
        double porcentaje = 0;
        double utilidad = 0;
        String tienda = "";
        int descuento = 0;
        int descuento_porcentaje = 0;
        String caracter = "";
        for(int i = 0; i<codigos.length; i++){
            System.out.println("Ingrese los códigos ");
            codigos[i] = in.next();
        }
        System.out.println("¿Cuál de los" + codigos.length +" tickets quiere evaluar? ");
        int evaluar = in.nextInt();
        String ticket = codigos[evaluar];
        producto = Integer.parseInt(ticket.substring(0,3));
        costo = Integer.parseInt(ticket.substring(3,7));
        utilidad += Integer.parseInt(ticket.substring(7,9));
        tienda += ticket.substring(9,12);
        String[] ca = ticket.substring(12).split("");
        descuento = Integer.parseInt(ca[0]);
        caracter += ticket.substring(15);
        String cupon = "";
        double precio = costo/(1-(utilidad/100));
        if(producto < 200){
            productos += "Pantalones";
        }
        else if(producto>=200 && producto <300){
            productos += "blusas";
        }
        else{
            productos += "zapatos";
        }
        if(descuento == 1){
            descuento_porcentaje = Integer.parseInt(ticket.substring(13,15));
        }
        else{
            descuento_porcentaje = 0;
        }
        if(caracter.equals("$")){
            cupon += "Cupón válido para un \n     descuento del 5% ";
        }
        else{
            cupon += "Cupón válido para un refresco \n       en la máquina de autoservico";
        }
        double porcentaje_1 = (descuento_porcentaje*0.01);
        System.out.println(descuento_porcentaje);
        double subtotal =precio - precio*porcentaje_1;
        System.out.println("     " + "Ticket: " + ticket + "     ");
        System.out.println("-------------------------------------");
        System.out.println("    Bienvenido a la tienda de Iker");
        System.out.println("       Detalles de la compra: ");
        System.out.println(productos +"(" + producto +")"+"           $" + precio);
        System.out.println("Descuento:                   " + descuento_porcentaje  +"%");
        System.out.println("______________________________________");
        System.out.println("SUBTOTAL                   $" +(subtotal));
        System.out.println("IVA                        $" + (precio*0.16));
        System.out.println("Total a pagar              $" + (subtotal+precio*0.16));
        System.out.println("");
        System.out.println("   Compra realizada en la tienda " +tienda);
        System.out.println("     ||°CUPÓN DE DESCUENTO°||");
        System.out.println("    " +cupon);
        System.out.println("         MERCI MON AMI");
        System.out.println("         Hasta la próxima");
        
        
    }
}
