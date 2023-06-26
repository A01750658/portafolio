
import java.util.Arrays;
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
public class EjercicioClase3 {
   
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args){
        
        
        System.out.println("¿Cuántos códigos me vas a dictar?");
        String [] codigos = new String[in.nextInt()];
        llenarArreglo(codigos);
        
        System.out.println(Arrays.toString(codigos));
        
        System.out.println("Dime el id del código para generar un ticket");
        int opcion = in.nextInt();
        analizaCodigo(codigos[opcion]);
        
    }
    public static void llenarArreglo(String[] codigos){
        for(int i = 0; i<codigos.length; i++){
            System.out.println("Ingrese el código " + (i+1) +":" );
            codigos[i] = in.next();
        }
        System.out.println(Arrays.toString(codigos));
    }
    
    public static void analizaCodigo(String cod){
        System.out.println("Vamos a generar el siguiente código " + cod);
        int prod = Integer.parseInt(cod.substring(0,3));
        double costo = Double.parseDouble(cod.substring(3,7));
        double utilidad = Double.parseDouble(cod.substring(7,9));
        String suc = cod.substring(9,12);
        int desc = Integer.parseInt(""+cod.charAt(12));
        int pdesc = Integer.parseInt(cod.substring(13,15));
        char cupon = cod.charAt(15);
        imprimecodigo(prod, costo, utilidad, suc, desc, pdesc, cupon);
}
    public static void imprimecodigo(int prod, double costo, double utilidad, String suc, int desc, int pdesc, char cupon){
        System.out.println("Producto " + prod);
        System.out.println("Costo " + costo);
        System.out.println("Utilidad " + utilidad);
        System.out.println("Precio " + (costo/1-utilidad));
        System.out.println("Sucursal " + suc);
        System.out.println("Descuento " + desc);
        System.out.println("Porcentaje de descuento " + pdesc);
        System.out.println("Cupon = " + cupon);
    }
}
    