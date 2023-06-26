/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.BorderLayout;


/**
 *
 * @author alanvega
 */
public class Juego extends Canvas implements Runnable{
    
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    private static volatile boolean enfuncionamiento = false;
    private static final String NOMBRE = "JUEGO";
    private static int aps = 0;
    private static int fps = 0;
    
    private static JFrame ventana;
    private static Thread thread;
    
   private Juego(){
       setPreferredSize(new Dimension(ANCHO, ALTO));
       
       ventana = new JFrame(NOMBRE);
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setResizable(false);
       ventana.setLayout(new BorderLayout());
       ventana.add(this, BorderLayout.CENTER);
       ventana.pack();
       ventana.setLocationRelativeTo(null);
       ventana.setVisible(true);
    
}
   public static void main(String[]args){
   
       Juego juego = new Juego();
       juego.iniciar();
       
   }
   
   private synchronized void iniciar(){
       enfuncionamiento = true;
       
       thread = new Thread(this, "Gráficos");
       thread.start();
   }
   
   private synchronized void detener(){
       enfuncionamiento = false;
       
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
   }
   
   private void actualizar(){
       aps++;
   }
   
   private void mostrar(){
       fps++;
   }

    @Override
    public void run() {
        final int NS_POR_SEGUNDO = 1000000000;
        final byte APS_OBJETIVO = 60;
        final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO/APS_OBJETIVO;
        
        long referenciaActualizacion = System.nanoTime();
        long referenciaContador = System.nanoTime();
        
        double tiempoTranscurrido;
        double delta = 0;
        
        while(enfuncionamiento){
        final long inicioBucle = System.nanoTime();
        tiempoTranscurrido = inicioBucle - referenciaActualizacion;
        referenciaActualizacion = inicioBucle;
        
        delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;
        
        while(delta >= 1){
            actualizar();
            delta--;
        }
            
        mostrar();
        
        if(System.nanoTime() - referenciaContador > NS_POR_SEGUNDO){
        ventana.setTitle(NOMBRE + "|| APS: " + aps + "|| FPS: " + fps);
        aps = 0;
        fps = 0;
        referenciaContador = System.nanoTime();
        }
        }
    }

}
