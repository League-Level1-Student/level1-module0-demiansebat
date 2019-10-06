package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot roby=new Robot("batman");
public static void main(String[] args) {
	
	roby.moveTo(50, 550);
	roby.setSpeed(150);
	roby.penDown();
	for (int i = 0; i < 10; i++) {
drawHouse("small");
}
}
static void drawHouse(String Height) {
	if (Height.contentEquals("small")) {
	}
	if (Height.contentEquals("medium")) {
	}	
	if (Height.contentEquals("large")) {
	}
	roby.move(100);
	roby.turn(90);
	roby.move(20);
	roby.turn(90);
	roby.move(100);
	roby.turn(270);
	roby.move(20);
	roby.turn(270);
}
}

