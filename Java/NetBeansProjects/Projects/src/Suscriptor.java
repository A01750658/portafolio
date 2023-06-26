
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
public class Suscriptor {
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        int cantidad_suscriptores = 49;
        System.out.println("Ingrese su nombre ");
        String nombre = in.next();
        System.out.println(nombre + "¿está suscrito al canal? s/n");
        String respuesta = in.next();
        if(respuesta.equalsIgnoreCase("s")){
            System.out.println("Bienvenido de vuelta, " + nombre);
        }
        else{
            System.out.println("¿Te gustaría suscribirte? s/n");
            String pregunta = in.next();
            if(pregunta.equalsIgnoreCase("S")){
                cantidad_suscriptores++;
                System.out.println("Bienvenido " + nombre + " eres el suscriptor número "+ cantidad_suscriptores);
            }
            else{
                System.out.println("Gracias, vuelva pronto");
            }
        }
    }
}
