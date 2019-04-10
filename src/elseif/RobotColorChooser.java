//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 3; i++) {

			String color = JOptionPane.showInputDialog("what color should the robot's pen be?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (color.equals("red")) {
				r.setPenColor(Color.red);
			} else if (color.equals("blue")) {
				r.setPenColor(Color.blue);
			} else if (color.equals("green")) {
				r.setPenColor(Color.green);
			} else {
				r.setRandomPenColor();
			}

			// 6. If the user doesn’t enter anything, choose a random color
			r.penDown();
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them
			r.setPenWidth(10);
			// 4. Set the pen width to 10
			r.setSpeed(100);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			for (int h = 0; h < 3; h++) {
				r.move(100);
				r.turn(360 / 3);
			}

		}
	}
}
