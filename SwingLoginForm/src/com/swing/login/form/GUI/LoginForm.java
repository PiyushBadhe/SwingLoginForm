package com.swing.login.form.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		// Adding Action to buttons
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (checkData(userText.getText(), passwordText.getText())) {
					JOptionPane.showMessageDialog(panel, "Hello Mr. " + userText.getText() +
					" Welcome to the Application!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(panel, "Invalid username or password",
							"Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(cancelButton, "Login Cancelled by the user",
						"Login Termination", JOptionPane.OK_CANCEL_OPTION);
				System.exit(0);
			}
		});
		
		
			
		/*
		 #1 
		  	- Our goal is to develop a login module that authenticates users based on a predefined username and password
		 	- Hence adding actions or functionalities to the login and cancel buttons
		 	- First, creating a static boolean method first hand (before adding Components) to check whether the username and password is correct or not
		 	- Meaning, when user enters username and password and hit login button, firstly this checkData() method
		 	  will check the data and if its correct, it will authenticate the user and displays a message else an error message will be shown
		 #2	
		 	- Now as we captured and analyzed the data whether its correct or not, adding action to the buttons is only remaining task to be done
		 	- By using .addActionListener(); we can bring those buttons into action
		 	- And by using JOptionPane class, we can show message dialogs for successful, unsuccessful logins and also a terminating message 
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
