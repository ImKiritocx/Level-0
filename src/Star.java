import org.jointheleague.graphical.robot.Robot;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot gerry = new Robot("mini");
		gerry.penDown();
		gerry.setSpeed(10);
		for (int n = 0; n < 5; n++) {
			
		
		for (int i = 0; i < 5; i++) {
		
			gerry.move(100);
			gerry.turn(144);
		}
		gerry.setX(n+10);
		
		}
	}

}
