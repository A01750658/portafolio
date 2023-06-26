/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alanvega
 */
public class Room {
    int number;
	String name;
	List<String> desc = new ArrayList<String>();
	List<String> exits = new ArrayList<String>();
	public Room(int x)
	{
		
		number = x;
		
	}
}
