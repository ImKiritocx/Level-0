import javax.swing.JOptionPane;

public class RollerCoaster {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you ?");
		int realHeight = Integer.parseInt(height);
		if (realHeight > 4 ) {
			JOptionPane.showMessageDialog(null, "You can ride!");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "sorry you cant ride, maybe when you grow a little more  =)");
		}
	}

}
