package GUI.practise;

import javax.swing.*;

public class FirstGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java program using label (swing)
		// to display the message “GFG WEB Site Click”
		

		// Main class
				// Creating instance of JFrame
				JFrame frame = new JFrame();

				// Creating instance of JButton
				JButton button = new JButton(" GFG WebSite Click");

				// x axis, y axis, width, height
				button.setBounds(150, 200, 220, 50);

				// adding button in JFrame
				frame.add(button);

				// 400 width and 500 height
				frame.setSize(500, 600);

				// using no layout managers
				frame.setLayout(null);

				// making the frame visible
				frame.setVisible(true);
			
		

	}

}
