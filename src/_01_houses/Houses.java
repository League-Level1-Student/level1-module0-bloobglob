package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot rob = new Robot();
	public void run() {
		rob.hide();
		rob.penUp();
		rob.moveTo(40, 500);
		rob.penDown();
		rob.setPenWidth(10);
		drawHouse("medium", "red");
		drawHouse("small", "blue");
		drawHouse("large", "gray");
		drawHouse("small", "yellow");
		drawHouse("medium", "yellow");
		drawHouse("large", "gray");
		drawHouse("small", "blue");
		drawHouse("small", "yellow");
		drawHouse("medium", "gray");
		drawHouse("medium", "blue");
		drawHouse("small", "blue");
	}
	void drawHouse(String size, String color) {
		int sizeNum;
		if(size.equalsIgnoreCase("small")) {
			sizeNum=120;
		}else if(size.equalsIgnoreCase("medium")) {
			sizeNum=180;
		}else{
			sizeNum=252;
		}
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(Color.red);
		}else if(color.equalsIgnoreCase("gray")) {
			rob.setPenColor(Color.darkGray);
		}else if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.red);
		}else {
			rob.setPenColor(Color.yellow);
		}
		rob.setAngle(0);
		rob.setSpeed(100);
		rob.move(sizeNum);
		rob.turn(90);
		rob.move(sizeNum/3);
		rob.turn(90);
		rob.move(sizeNum);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(40);
	}
	
}
