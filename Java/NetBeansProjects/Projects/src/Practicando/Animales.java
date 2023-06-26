/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicando;

/**
 *
 * @author ikerf
 */
public class Animales {
    String animal;
    double peso;
    double talla;
    public Animales(){
    
}
    public void imprimir_animal(){
        System.out.println("El animal es un(a) " +animal+ ", mide " + talla + " metos y pesa " + peso + " kilos");   
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }
    
    
}
