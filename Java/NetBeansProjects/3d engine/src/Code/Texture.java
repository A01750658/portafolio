/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author alanvega
 */
public class Texture {
    
    public static Texture wood = new Texture("Sprites/camino.png", 64);
    public static Texture brick = new Texture("Sprites/calle.png", 64);
    public static Texture bluestone = new Texture("Sprites/muro.png", 64);
    public static Texture stone = new Texture("Sprites/algo.png", 64);
    
    public ArrayList<Texture> textures;
    
    public int[] pixels;
    private String loc;
    public final int SIZE;
    public Texture(String location, int size){
        loc = location;
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        load();
        textures = new ArrayList<Texture>();
        textures.add(Texture.wood);
        textures.add(Texture.bluestone);
        textures.add(Texture.brick);
        textures.add(Texture.stone);
        
    }
    private void load(){
        try {
            BufferedImage image = ImageIO.read(new File(loc));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
