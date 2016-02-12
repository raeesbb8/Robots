package dinobot;

import org.jointheleague.graphical.robot.Robot;

public class dinobot { public static void main(String[] args) {
	
	
	Robot dinobot=new Robot();
    dinobot.penDown(); 
    for (int i = 0; i < 4; i++) {
	dinobot.move(400);	
	dinobot.turn(180+90);
	
	}
}

}
