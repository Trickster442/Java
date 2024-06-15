import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class CalculatorGUI extends JFrame implements ActionListener {

    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;
    private Calculator logic;

    public CalculatorGUI() {
        logic = new Calculator();

        setTitle("Simple Calculator");
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JLabel("Num 1:"));
        num1Field = new JTextField(5);
        panel.add(num1Field);

        panel.add(new JLabel("Num 2:"));
        num2Field = new JTextField(5);
        panel.add(num2Field);

        String[] operations = {"+", "-", "*", "/"};
        for (String op : operations) {
            JButton button = new JButton(op);
            button.addActionListener(this);
            panel.add(button);
        }

        panel.add(new JLabel("Result = "));
        resultLabel = new JLabel("0");
        panel.add(resultLabel);

        add(panel);
        
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (command) {
                case "+":
                    result = logic.add(num1, num2);
                    break;
                case "-":
                    result = logic.subtract(num1, num2);
                    break;
                case "*":
                    result = logic.multiply(num1, num2);
                    break;
                case "/":
                    result = logic.divide(num1, num2);
                    break;
            }
            resultLabel.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
