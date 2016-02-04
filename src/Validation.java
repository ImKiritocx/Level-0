

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
for (int i = 0 ; i < 10; i++) {
		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		int num = new Random().nextInt(5);
		// 2. On paper, write all the numbers that get printed when you run this class
		System.out.println(num);

		// 3. Use the randomNumber to give the user a random compliment.
		
			
		
		if (num==0) {
			JOptionPane.showMessageDialog(null, "You are very smart");
		}
		else if (num==1){
		JOptionPane.showMessageDialog(null, "Youre as cool as June");	
		
		}
		else if (num==2) {
			JOptionPane.showMessageDialog(null, "You are very funny");
			
		}
		else if (num==3) {
			JOptionPane.showMessageDialog(null, "you have nice shoes");
		}
		else if (num==4) {
			JOptionPane.showMessageDialog(null, "I like your shirt");
		}
		}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}

