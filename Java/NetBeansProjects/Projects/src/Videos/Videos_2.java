/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videos;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author ikerf
 */
public class Videos_2 {
    Vector datos = new Vector();
    Scanner in = new Scanner(System.in);
    //Atributos
    String name;
    String comentario; 
    public Videos_2(){
    
    }
    public void datos(){
    Videos_1 v = new Videos_1();
    System.out.println("Ingrese el nombre del video");
    String nombre = in.next();
    v.setName(nombre);
    System.out.println("Ingrese el número de visitas");
    int visitas = in.nextInt();
    v.setVisitas(visitas);
    System.out.println("Ingrese el link");
    String link = in.next();
    v.setLink(link);
    datos.add(v);
}
    public void Imprimir_catálogo() throws IOException{
        for(int i = 0; i <datos.size(); i++){
            Videos_1 v = (Videos_1) datos.get(i);
            System.out.println("\t\t____________________________________________________________________");
            System.out.println("\t\tEl video en cuestión tiene las siguientes características: ");
            System.out.println("\t\tEl nombre del video: "+v.getName());
            System.out.println("\t\tLa cantidad de visitas que tiene: " + v.getVisitas());
            System.out.println("\t\tEl link al video es: "+ v.getLink());
            System.out.println("\t\t_____________________________________________________________________");
        }
        
    }
    public void Ver_Youtube() throws IOException{
        
        System.out.println("¿Cuál video quiere ver en youtube?");
        int opcion = in.nextInt()-1;
        Videos_1 v = (Videos_1) datos.get(opcion);
         
        Runtime.getRuntime().exec("\\Windows\\System32\\cmd.exe /K start "+v.getLink());

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}
