import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot r2d2 = new Robot ();
		// 3. Put the robot's pen down
		r2d2.penDown();
		// 6. Make the tortoise move as fast as possible
		r2d2.setSpeed(10);
		// 5. Do everything below here 4 times
		for (int i = 0; i < 4 ; i++) {
			
		
		// 		2. Move your robot 200 pixels
		r2d2.move(200);
		// 		4. Turn the robot 90 degrees to the right (90 degrees)
		r2d2.turn(90);
		}
	}
}
