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
public class Edificio {
    Vector ElVector = new Vector();
    Scanner in = new Scanner(System.in);
    int vents;
    public Edificio(){
     
        
    }
    public void Deps(){
        
    Departamento d = new Departamento();
    
        System.out.print("Introduzca el número de departamentos que dará de alta");
    d.setNumdep(in.nextInt());
        System.out.print("Introduzca el número de ventanas que tendrá cada departamento");
    d.setNumvent(in.nextInt());
        System.out.println("Introduzca el número de metros cuadrados por edificio");
    d.setM2(in.nextInt());
    ElVector.add(d);
    vents = d.numvent;
    }
    public void Depsminus(){
        System.out.println("Introduzca el número de departamento que dará de baja");
    int x = in.nextInt();
        System.out.println("El departamento ha sido eliminado");
        Departamento d = (Departamento)ElVector.get(x);
        System.out.println("Número de departamento: "+ d.getNumdep());
    ElVector.remove(x);
        
    }
    public void calcvent(){
        Departamento d = new Departamento();
    int ventanas = ElVector.size()*d.numvent;
        System.out.println("El número de ventanas: " + ventanas);
    
    }
    public void calcpark(){
        Departamento d = new Departamento();
    int parque = d.numdep*d.m2;
        System.out.println("El número de parque necesario es: " + parque);
    }
    }

