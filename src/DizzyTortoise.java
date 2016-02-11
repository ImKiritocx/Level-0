import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
//		  1. Use the dance method to make the Tortoise spin.
		  String num = JOptionPane.showInputDialog("how dizzy do you want the tortooise to get from 1-10");
		  int num1 = Integer.parseInt(num);
		  //* 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		// * that number of times.
		 dance(num1);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
