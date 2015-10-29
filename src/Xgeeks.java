// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class Xgeeks {
public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			
		// 1. Save the superpower for each person in a variable.
		String power = JOptionPane.showInputDialog(null, "Whos power do you want to know ?");
		// 2. Ask the user to enter a name. Store their answer in a variable.
		if (power.equalsIgnoreCase("gerry")) {
			JOptionPane.showMessageDialog(null, "gerry is a fast typer");
		}
		else if (power.equalsIgnoreCase("diego")) {
			JOptionPane.showMessageDialog(null, "diego is best a last minute prjects");
		}
		else if (power.equalsIgnoreCase("nancy")) {
			JOptionPane.showMessageDialog(null, "nancy is a good motivater and great and socializing");
		}
		else if (power.equalsIgnoreCase("noelani")) {
			JOptionPane.showMessageDialog(null, "noelani is good with adaptibility");
		}
		else{
			JOptionPane.showMessageDialog(null, power +" is a Super Geek");
		}
		// 3. Show the superpower in a pop-up, depending on the name entered. 
		}
	}
}

