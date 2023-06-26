/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heroes;

/**
 *
 * @author ikerf
 */
public class Heroe {
    int rank;
    String nombre; 
    String superpoder; 
    double poder; 

    public Heroe() {
    }
    public void describir_heroe(){
        System.out.println("El heroe "+nombre+" tiene el superpoder de " + superpoder +" y tiene un nivel de poder " + poder);
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }
    
}
