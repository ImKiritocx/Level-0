// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		int x = 10;
		int a = 30;
		// 3. Make a variable to hold the number of sides and set it to 0
		int angle = 0;
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		String answer = JOptionPane.showInputDialog("What spiral would you like me to make ?");
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		if (answer.equalsIgnoreCase("Triangle")) {
			
			angle = 120;
		}
		else if (answer.equalsIgnoreCase("Square")){
			
		angle = 90;
		}
		else if (answer.equalsIgnoreCase("Pentagon")) {
			angle = 360/5;
		}
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i dont know how to make a ... "+ answer);
		a=0;
		} 
			
		
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
			for (int i = 0; i < a; i++) {
				
				Tortoise.penDown();
				Tortoise.setSpeed(10);
				Tortoise.move(x);
				Tortoise.turn(angle);
				x=x+10;
				
			}
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
	}

}

