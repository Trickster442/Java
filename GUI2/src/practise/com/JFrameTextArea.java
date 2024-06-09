package practise.com;

import javax.swing.*;
import java.awt.*;

public class JFrameTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setLocation(150, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane(); // Get the content pane

        JMenuBar menuBar = new JMenuBar(); // Create a menu bar
        JMenu menu1 = new JMenu("Menu1"); // Create a menu
        menuBar.add(menu1); // Add menu to menu bar

        frame.setJMenuBar(menuBar); // Set the menu bar for the frame

        JPanel flowPanel = new JPanel(new FlowLayout()); // Create a panel with FlowLayout
        
        // Adding components
        JTextArea text1 = new JTextArea(5, 20); // specify rows and columns
        JTextField textf1 = new JTextField(20); // specify columns
        JButton add = new JButton("add");
        JButton clear = new JButton("clear");

        // Add components to the panel
        flowPanel.add(text1);
        flowPanel.add(textf1);
        flowPanel.add(add);
        flowPanel.add(clear);

        // Add the panel to the content pane with BorderLayout.NORTH
        contentPane.add(flowPanel, BorderLayout.NORTH);

        frame.setVisible(true); // Make the frame visible
    }
}
