/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package.main;
import java.util.LinkedList;
import java.awt.Graphics;
/**
 *
 * @author alanvega
 */
public class Handler {
    LinkedList<Game_Object> object = new LinkedList <Game_Object>();
    
    public void tick(){
        for(int i = 0; i < object.size(); i++){
            Game_Object tempObject = object.get(i);
            tempObject.tick();
        }
    }
    public void render(Graphics g){
        for(int i = 0; i < object.size(); i++){
            Game_Object tempObject = object.get(i);
            tempObject.render(g);
        }
    }
    public void addObject(Game_Object object){
        this.object.add(object);
    }
    public void removeObject(Game_Object object){
        this.object.remove(object);
    }
}
