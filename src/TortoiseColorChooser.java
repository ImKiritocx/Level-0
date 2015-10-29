
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class TortoiseColorChooser {
	public static void main(String[] args) {
		Robot Tortoise = new Robot();
		Tortoise.penDown();
		Tortoise.changeRobot("/Users/league/Desktop/Level-0/src/ghettobart");
		// 3. ask the user what color they would like the tortoise to draw

		for (int i = 0; i < 100; i++) {

			String answer = JOptionPane.showInputDialog("What color would you want me to use ?");

			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (answer.equals("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			} else if (answer.equals("red")) {
				Tortoise.setPenColor(Color.RED);
			}

			// 5. if the user doesn’t enter anything, choose a random color
			if (answer.equals("")) {
				Tortoise.setPenColor(Colors.getRandomColor());
			}

			// 6. put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			Tortoise.setSpeed(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line
			// of code)
			//Tortoise.setAnimal(Animals.Unicorn);
			for (int j = 0; j < 3; j++) {
				Tortoise.move(100);
				Tortoise.turn(360 / 3);
			}
		}
	}

}
