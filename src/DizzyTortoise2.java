import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise2 {

	public static void main(String[] args) {
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 * 
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
		String answer = JOptionPane.showInputDialog("how many times do you want the totoise to spin from 1-10");
		int x = Integer.parseInt(answer);
		dance(x);
		

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
