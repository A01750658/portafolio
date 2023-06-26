/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author alanvega
 */
public class HojaSprites {

    private final int ancho;
    private final int alto;

    public final int[] pixeles;

    public HojaSprites(final String rut, final int ancho, final int alto) {
        this.ancho = ancho;
        this.alto = alto;

        pixeles = new int[ancho * alto];

        BufferedImage imagen; 
        try{
        imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
        imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        
    }
    public int getAncho(){
        return ancho;
    }

}
