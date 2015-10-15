import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Octagon {
	public static void main(String[] args) {
		 
		String answer = JOptionPane.showInputDialog("why shape would you like me to draw");
		if (answer.equalsIgnoreCase("octagon")) {

			Robot bob = new Robot();
			bob.penDown();
			bob.setSpeed(10);
			for (int i = 0; i < 8; i++) {
				bob.move(100);
				bob.turn(360 / 8);
			}
		}
		if (answer.equalsIgnoreCase("triangle")) {
			Robot bob = new Robot();
			bob.penDown();
			bob.setSpeed(10);
			for (int i = 0; i < 3; i++) {
				bob.move(100);
				bob.turn(360 / 3);
			}
		}
	}
}
