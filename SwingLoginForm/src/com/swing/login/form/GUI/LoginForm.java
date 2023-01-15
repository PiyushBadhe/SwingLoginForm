package com.swing.login.form.GUI;

import javax.swing.JButton;
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

	}

}
