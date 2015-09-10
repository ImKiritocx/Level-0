// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[] args) {
		String first = JOptionPane.showInputDialog("What's your first name?");
		String last = JOptionPane.showInputDialog("What's your last name?");
		String destination = JOptionPane.showInputDialog("Where is your destination?");
		String bday = JOptionPane.showInputDialog("when's your birthday?");
		String gender = JOptionPane.showInputDialog("What's your gender?");
		JOptionPane.showMessageDialog(null,last + " / " + first + " ( " + bday + " , " + gender + " )\n" + "Treveling to: "+ destination );
	}
	
}


