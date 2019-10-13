package _01_houses;

import java.lang.ProcessBuilder.Redirect;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot roby=new Robot("batman");
public static void main(String[] args) {
	
	roby.moveTo(50, 550);
	roby.setSpeed(150);
	roby.penDown();
	for (int i = 0; i < 10; i++) {
Random randy=new Random();
int num=randy.nextInt(9);
if (num>6) {
	drawHouse("large","BLUE");
}
else if (num<3 && num<=6) {
	drawHouse("medium", "GREEN");
}else if (num>0 && num<=3) {
	drawHouse("small", "RED");
}
}
}
static void drawHouse(String Height, String Color) {
	int size=0;
	if (Height.contentEquals("small")) {
		size=60;
		roby.setPenColor(java.awt.Color.RED);
	}
	if (Height.contentEquals("medium")) {
		size=120;
		roby.setPenColor(java.awt.Color.GREEN);
	}	
	if (Height.contentEquals("large")) {
		size=250;
		roby.setPenColor(java.awt.Color.BLUE);
	}
	roby.move(size);
	roby.turn(90);
	roby.move(20);
	roby.turn(90);
	roby.move(size);
	roby.turn(270);
	roby.move(20);
	roby.turn(270);
}
}

