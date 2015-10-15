
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "September 2th";
		String dadsBirthday = "September 24th";
		String myBirthday = "Feburary 20th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String answer = JOptionPane.showInputDialog("Who's Birthday do you want to know ?");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
		if (answer.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		else if (answer.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		// print dad's birthday
		// 6. if user asked for your name
		else if (answer.equalsIgnoreCase("gerry")) {
			System.out.println(myBirthday);
		}
		// print myBirthday
		// 7. otherwise print ""
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	}
}