package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String aboutHuman1 = "Wow, you are alive!";
		String aboutHuman2 = "You are alive, wow such a discovery!";
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. In a pop-up, tell the user what is remarkable about that person. 
String Input = JOptionPane.showInputDialog("Enter your name(Ex: Human1, Human2)");
	
if(Input.equals("Human1")) {
	
	JOptionPane.showMessageDialog(null, aboutHuman1);
	
	
}


if(Input.equals("Human2")) {

JOptionPane.showMessageDialog(null, aboutHuman2);


}
















}}
