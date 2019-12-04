package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging
 * You want to leave a message on one of the Windows computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 *  System
 * 
 */

public class SecretMessageBox {

	// 0. Make a main method and put steps 1-5 inside it
	public static void main(String[] args) {
	//to tell the NEXT user that they can only see the secret message 
	//    if they can guess(not match, pop-up "INTRUDER!!"

		
	
	// 1. Set a password in a String variable
	String password = "I am better then you ahahahah you cant guss this password because its too long and complex and i also have to do homework which i hate.....";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
	  String message = JOptionPane.showInputDialog("Type a secret message or alse you die");
	JOptionPane.showMessageDialog(null, "what is the password?");
	// 3. Now use a pop-up s the password
    String guss = JOptionPane.showInputDialog("Type password (HERE)");
	// 4. If their guess matches the password, show them the secret message

    
    if (guss.equals( password )){ 
		
		
		
		
	
JOptionPane.showMessageDialog(null, message);
}
    else {
    	
    	JOptionPane.showMessageDialog(null,"If password is wrong, slap them in the face");
    	JOptionPane.showMessageDialog(null, "*slaps*");
    	JOptionPane.showMessageDialog(null, "try again and get slapped again please");
    	
    }

   	}}
		


