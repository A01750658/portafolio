/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
import java.util.Scanner;
/**
 *
 * @author alanvega
 */
public class Game_Logic {
    public Game_Logic() {

	}

	public void waitforCommand() {

		System.out.println("What do?");
		Scanner sc = new Scanner(System.in);
		String com = sc.nextLine();
		// parse the command by spaces
		// read each word into an array valueString s = "This is a sample
		// sentence.";
		String[] words = com.split(" ");
		processCommand(words);

	}

	public void processCommand(String[] x) {
	}
}
