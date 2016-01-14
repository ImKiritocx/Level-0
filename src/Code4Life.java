import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	/*
	 * Ask the user how many hours they spent coding this week.
	 
	 * 1. If it's more than 3, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */

	public static void main(String[] args) {
		//playBatmanTheme();
		String hours = JOptionPane.showInputDialog("how many hours did you spend coding this week?");
		int realHours = Integer.parseInt(hours);
		if (realHours>5) {
			playBatmanTheme();
		}
		else if (realHours<2){
			JOptionPane.showMessageDialog(null, "stop watching youtube and write code instead.");
		}
		else if (realHours > 3){
			
			JOptionPane.showMessageDialog(null, "You are a code ninja");
		}
		}
	

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

