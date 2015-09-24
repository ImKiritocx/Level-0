import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
		String answer = JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
	
		if (answer.equalsIgnoreCase("Incorrectly")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
	
		else {
			JOptionPane.showMessageDialog(null, "You're Dumb");
		}
		// 6. Add some more riddles
		String answer1 = JOptionPane.showInputDialog("What gets wet when drying?");
		
		if (answer1.equalsIgnoreCase("a towel")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
	
		else {
			JOptionPane.showMessageDialog(null, "You're Dumb");
		}
		String answer2 = JOptionPane.showInputDialog("I am a mother and a father, but have never given birth.Im rarely still, but i never wander. What am I?");
		
		if (answer2.equalsIgnoreCase("a tree")) {
			JOptionPane.showMessageDialog(null, "correct!");
			score = score + 1;
		}
	
		else {
			JOptionPane.showMessageDialog(null, "You're Dumb");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "score "+ score);
	}
}
