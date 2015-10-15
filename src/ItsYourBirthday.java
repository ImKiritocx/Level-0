import javax.swing.JOptionPane;

public class ItsYourBirthday {
public static void main(String[] args) {
	String answer =JOptionPane.showInputDialog("Wen is your birthday");
	if (answer.equals("10/14")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
}
}
