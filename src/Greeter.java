import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String z = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null, "Hi " + z);
	String l = JOptionPane.showInputDialog("");
}
}
