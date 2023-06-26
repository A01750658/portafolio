/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import java.util.ArrayList;
import java.awt.Color;

/**
 *
 * @author alanvega
 */
public class Screen {
    public int[][] map;
    public int mapWidth, mapHeight, width, height;
    public ArrayList textures;
    public Screen(int[][] m, ArrayList tex, int w, int h){
        map = m;
        textures = tex;
        width = w;
        height = h;
    }
    public int[] update(Camera camera, int[] pixels){
       for(int n=0; n<pixels.length/2; n++){
           if(pixels[n] != Color.DARK_GRAY.getRGB()) pixels[n] = Color.DARK_GRAY.getRGB();
       }
       for(int i=pixels.length/2; i<pixels.length; i++){
           if(pixels[i] != Color.gray.getRGB()) pixels[i] = Color.gray.getRGB();
       }
    for(int x=0; x<width; x=x+1){
        double cameraX = 2 * x / (double)(width) -1;
        double rayDirX = camera.xDir + camera.xPlane * cameraX;
        double rayDirY = camera.yDir + camera.yPlane * cameraX;
        
    }
    }
    
}
