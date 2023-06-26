/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ikerf
 */
public class Escuadron {
    Scanner in = new Scanner(System.in);
    String name; 
    String ranking; 
    String asignacion; 
    
    Vector escuadrones = new Vector();

    public Escuadron() {
    }
    public void crear_escuadron(){
        Heroe h = new Heroe(); 
        System.out.println("Ingrese el nombre del héroe");
        h.setNombre(in.next());
        System.out.println("Ingrese su superpoder");
        h.setSuperpoder(in.next());
        System.out.println("Ingrese su nivel de poder");
        h.setPoder(in.nextDouble());
        escuadrones.add(h);
    }
    public void mostrar_escuadron(){
        double suma = 0;
        System.out.println("Todos los héroes registrados en el escuadron " + name +" con la asignación " + asignacion);
        for(int i = 0; i<escuadrones.size(); i++){
            Heroe h = (Heroe) escuadrones.get(i);
            System.out.println("__________________________________");
            System.out.println("\tHeroe" +(i+1));
            System.out.println("|Nombre: "+h.getNombre());
            System.out.println("|Super poder: "+h.getSuperpoder());
            System.out.println("|Nivel de poder: "+h.getPoder());
            System.out.println("__________________________________");
            suma += h.getPoder();
        }
        double promedio = suma/escuadrones.size();
        System.out.println("El promedio de poder del escuadron "+name +" es de " +promedio);
        
        System.out.println("¿Quiere conocer a un héroe en específico? Ingrese el número");
        int seleccionar = in.nextInt()-1;
        Heroe h = (Heroe) escuadrones.get(seleccionar);
        h.describir_heroe();
        
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

   
    
}
