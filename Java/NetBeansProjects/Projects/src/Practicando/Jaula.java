/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ikerf
 */
public class Jaula {
    Scanner in = new Scanner(System.in);
    Vector jaulas;
    String name;
    String locacion; 
    Double visitantes;
    double comida; 
    public Jaula(){
        jaulas = new Vector();
    }
   
    public void llenar_jaulas(){
        
        Animales a = new Animales();
        System.out.println("Ingrese la especie del animal");
        a.setAnimal(in.next());
        System.out.println("Ingrese su peso");
        a.setPeso(in.nextDouble());
        System.out.println("Ingrese su tamaño");
        a.setTalla(in.nextDouble());
        jaulas.add(a);
        
        
    }
    public void Registro(){
        
        System.out.println("\tSe tienen las siguientes especificaciones de la Jaula " + name +":");
        
        for(int i = 0; i<jaulas.size(); i++){
            Animales a = (Animales) jaulas.get(i);
            System.out.println("\tNúmero " +(i+1) + ";");
            System.out.println("___________________________ ");
            System.out.println("\t\tAnimal: "+a.getAnimal());
            System.out.println("\t\tPeso: "+a.getPeso());
            System.out.println("\t\tTamaño: "+a.getTalla());
            System.out.println("___________________________");
        }

    }
    public void comidas(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public Double getVisitantes() {
        return visitantes;
    }

    public void setVisitantes( double visitantes) {
        this.visitantes = visitantes;
    }
    
    
}
