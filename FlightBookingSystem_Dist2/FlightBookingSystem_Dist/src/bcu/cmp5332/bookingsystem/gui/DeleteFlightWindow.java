package bcu.cmp5332.bookingsystem.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField; 
import javax.swing.UIManager;

import bcu.cmp5332.bookingsystem.commands.DeleteFlight;
import bcu.cmp5332.bookingsystem.commands.Command;
import bcu.cmp5332.bookingsystem.main.FlightBookingSystemException;

public class DeleteFlightWindow extends JFrame implements ActionListener {
    private MainWindow mw;
    private JTextField flightId = new JTextField();
    private JButton confirm = new JButton("Confirm");

    public DeleteFlightWindow(MainWindow mw) {
        this.mw = mw;
        initialize();
    }

    private void initialize() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            // Handle exception
            ex.printStackTrace();
        }

        setTitle("Delete Flight with Id");

        setSize(350, 220);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 2));
        topPanel.add(new JLabel("Flight Id : "));
        topPanel.add(flightId);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 1));
        bottomPanel.add(confirm);

        confirm.addActionListener(this);

        this.getContentPane().add(topPanel, BorderLayout.NORTH);
        this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
        setLocationRelativeTo(mw);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == confirm) {
            deleteFlight();
        }
    }

    private void deleteFlight() {
        try {
            String flightID = flightId.getText();
            int flightno = Integer.parseInt(flightID);
            // create and execute the DeleteFlight Command
            Command deleteFlight = new DeleteFlight(flightno);
            deleteFlight.execute(mw.getFlightBookingSystem());
            // hide (close) the DeleteFlightWindow
            this.dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid Flight ID. Please enter a valid integer.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (FlightBookingSystemException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
