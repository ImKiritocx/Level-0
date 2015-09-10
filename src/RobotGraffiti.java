import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	
	Robot bot = new Robot ();
	
	bot.setSpeed(10);
	bot.setPenColor(Color.BLUE);
	bot.setPenWidth(20);
	bot.turn(90);
	bot.penDown();
	bot.move(100);
	bot.turn(90);
	bot.move(100);
	bot.turn(90);
	bot.move(200);
	bot.turn(90);
	bot.move(200);
	bot.turn(90);
	bot.move(200);
	bot.hide();
}
}
