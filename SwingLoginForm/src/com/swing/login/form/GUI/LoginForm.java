package com.swing.login.form.GUI;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm {

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
