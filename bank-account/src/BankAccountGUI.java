import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//This class should extend JFrame and implement the ActionListener Interface
public class BankAccountGUI extends JFrame implements ActionListener{
	//complete the implementation of the different user interface components  
	private JLabel amountLabel = new JLabel("Amount");
	private JTextField amountField = new JTextField(5);
	
	private JButton depositAmount = new JButton("Deposit");
	private JButton withdrawAmount = new JButton("Withdraw");
	
	private JLabel balanceAmount = new JLabel("Starting Balance: 0.0");
	//create the three panels topPanel, middlePanel and bottomPanel 
	private JPanel topPanel = new JPanel();
	
	private JPanel middlePanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	
	// declare a new BankAccount object (myAccount) with account number and name of your choice here
	BankAccount myAccount = new BankAccount("23232", "user1");
	
	public BankAccountGUI()
	{
		
		//set the title for the frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exists the application when frame is closed
	
		//set the frame size and location
		setSize(400,150);
		setLocationRelativeTo(null);
		
		//add the action listeners for your buttons 
		depositAmount.addActionListener(this);
        withdrawAmount.addActionListener(this);
		
		topPanel.add(amountLabel);
		topPanel.add(amountField);
		
		middlePanel.add(depositAmount);
		middlePanel.add(withdrawAmount);
		bottomPanel.add(balanceAmount);
		//add the buttons to the middlePanel here
		//add the balanceLabel to the bottom Panel 
		
		
		add (BorderLayout.NORTH, topPanel);
		add (BorderLayout.CENTER, middlePanel);
		add (BorderLayout.SOUTH, bottomPanel);
		// add the middlePanel to the CENTER of the frame here
		//add the bottomPanel to the bottom of the frame here
		
			
		// set the fame visibility to true
		setVisible(true);
	}
	
 
	@Override
    public void actionPerformed(ActionEvent e) {
        // Get text from amountField and convert to double
        String text = amountField.getText();
        double amount = 0;

        try {
            amount = Double.parseDouble(text);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Handle deposit button click
        if (e.getSource() == depositAmount) {
        	myAccount.deposit(amount);
        	balanceAmount.setText(String.format("Current Balance: $%.2f", myAccount.getBalance()));
        	
        } 
        // Handle withdraw button click
        else if (e.getSource() == withdrawAmount) {
            boolean success = myAccount.withdraw(amount);
            if (success) {
            	balanceAmount.setText(String.format("Current Balance: $%.2f", myAccount.getBalance()));
                System.out.println("Withdrew amount: " + amount);
            } else {
                JOptionPane.showMessageDialog(this, "Insufficient funds", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
