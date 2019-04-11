
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "November 15th";
		String dadsBirthday = "October 10th";
		String myBirthday = "November 16th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String birthchoice = JOptionPane.showInputDialog("what birthday do you want");
		// 3. Print out what the user typed

		// 4. if user asked for "mom"
		if (birthchoice.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (birthchoice.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (birthchoice.equals("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "sorry I don't remember that person's birthday");
		}
		// print mom's birthday
		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
