import javax.swing.JOptionPane;

public class Compliments {
	public static void main(String[] args) {
		
	String name = JOptionPane.showInputDialog("Give me a name in the class");	
			
	if (name.equalsIgnoreCase("June")) {
		speak("june You are a great teacher");
	}	
	else if (name.equalsIgnoreCase("meg")) {
		speak("meg you are a great teacher");
	}
	else if (name.equalsIgnoreCase("diego")) {	
		speak("diego you are a good programmer");  
	}
	else if (name.equalsIgnoreCase("roberto")) {
		speak(" roberto i like your glasses");
	}
	else if (name.equalsIgnoreCase("nancy")) {
		speak(" nancy you are beast at soccer");
	}
	else if (name.equalsIgnoreCase("khia")) {
		speak("khia you are very nice");
	}
	else if (name.equalsIgnoreCase("noelani")) {
		speak("noelani You are very funny");
	}
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }
	}































