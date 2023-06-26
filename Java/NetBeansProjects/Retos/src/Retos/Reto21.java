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
public class Reto21 {
    public Reto21(){
    
    }
    public void Reto21(){
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce tu fecha de nacimiento en formato dd/mm/aaaa con diagonales: " );
    String fecha = in.next();
    String[] partes = fecha.split("/");
    String day = partes[0];
    String month = partes[1];
    String year = partes[2];
    int numday = Integer.parseInt(day);
    int nummonth = Integer.parseInt(month);
    int numyear = Integer.parseInt(year);
    int suma = numday+nummonth+numyear;
    int uno, dos, tres, cuatro;
    uno = suma%10;
    suma = suma/10;
    dos = suma%10;
    suma = suma/10;
    tres = suma%10;
    suma = suma/10;
    cuatro = suma%10;
    int lucknum = uno+dos+tres+cuatro;
    System.out.println("Su número de la suerte es: " + lucknum);
    }
}
