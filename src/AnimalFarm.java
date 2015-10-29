import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
		for (int i = 0; i < 100; i++) {
			
		
		String answer = JOptionPane.showInputDialog("What animal do you want?");
		/* 2. Make it so that the user can keep entering new animals. */
		if (answer.equalsIgnoreCase("cow")){
			
			playMoo();
		}
		else if(answer.equalsIgnoreCase("duck")){
			playQuack();
		}
		else if(answer.equalsIgnoreCase("llama")){
			playLlama();
		}
		else if(answer.equalsIgnoreCase("dog")){
			playWoof();
		}
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}
	  String quackFile = "/Users/league/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/league/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/league/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/league/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/league/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


