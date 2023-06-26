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
public class Cazador {
    Vector ElVector = new Vector();
    public Cazador(){
    }
    public void GenerarDiamantes(){
    Diamante d = new Diamante();
    Scanner in = new Scanner(System.in);
        System.out.print("Introduce el nombre del diamante dipshit: ");
    d.setNombre(in.next());
        System.out.print("Introduce el valor del diamante dipshit: ");
    d.setValor(in.nextInt());
        System.out.print("Introduce la transparencia: ");
    d.setTransparencia(in.nextDouble());
    ElVector.add(d);
    }
    public void Imprimision(){
    for(int i = 0; i<ElVector.size();i++){
    Diamante x = (Diamante)ElVector.get(i);
        System.out.println("El nombre es: " + x.getNombre() + "\n");
        System.out.println("_______________________________________________________________________________________________________________________________");
        System.out.println("El valor es: " + x.getValor() + "\n");
        System.out.println("_______________________________________________________________________________________________________________________________");
        System.out.println("La transparencia es: " + x.getTransparencia() + "\n");
        System.out.println("_______________________________________________________________________________________________________________________________");
    }
    }
}
