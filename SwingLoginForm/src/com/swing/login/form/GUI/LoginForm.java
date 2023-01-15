package com.swing.login.form.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm {

	public static boolean checkData (String userName, String password) {
		if (userName.equals("piyushbadhe") && password.equals("12345678")) {
			return true;
		}
		return false;
	}
	
	
		// Method to place components
		public static void addComponentsToPanel (JPanel panel) {
			
			JLabel userLabel = new JLabel("Username");
			JTextField userText = new JTextField();
			JLabel passwordLabel = new JLabel("Password");
			JTextField passwordText = new JTextField();
			
			// Buttons
			JButton cancelButton = new JButton("Cancel");
			JButton loginButton = new JButton("Login");
			
			// Adding Components to panel
			panel.add(userLabel);
			panel.add(userText);
			panel.add(passwordLabel);
			panel.add(passwordText);
			panel.add(cancelButton);
			panel.add(loginButton);
			
			/*
			  	- Our goal is to develop a login module that authenticates users based on a predefined username and password
			 	- Hence adding actions or functionalities to the login and cancel buttons
			 	- First, creating a static boolean method first hand (before adding Components) to check whether the username and password is correct or not
			 	- Meaning, when user enters username and password and hit login button, firstly this checkData() method
			 	  will check the data and if its correct, it will authenticate the user and displays a message else an error message will be shown
			 */
			
		}
	
	
	public static void main(String[] args) {
		
		// Java Frame
		JFrame frame = new JFrame ("Login Form");
		// Using GridLayout to simplify the UI
		JPanel panel = new JPanel(new GridLayout(3, 2, 15, 15)); // (int rows, int cols, int hgap, int vgap)
		
		// Calling the method addComponentsToPanel
		addComponentsToPanel(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close and Exit
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);  // Positioned the frame in the center of the screen
		frame.getContentPane().add(panel);	// Added component panel to the Content Pane
		frame.setVisible(true);				// Makes the frame appear on the screen when run

	}

}
