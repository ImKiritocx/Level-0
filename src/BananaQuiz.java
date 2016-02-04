
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("te gustan los platanos?");
		//2. if they say no, 
		if (answer.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Estas loca(a)");
		}
		
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		else if (answer.equalsIgnoreCase("yes")) {
			String hobby = JOptionPane.showInputDialog("what is your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}

}