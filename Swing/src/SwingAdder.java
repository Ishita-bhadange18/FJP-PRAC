import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingAdder extends JFrame {
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JLabel resultLabel;

    public SwingAdder() {
        setTitle("Swing Adder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        // Create components
        num1TextField = new JTextField(10);
        num2TextField = new JTextField(10);
        JButton addButton = new JButton("ADD");
        JButton subtractButton = new JButton("SUB");
        JButton clearButton = new JButton("CLEAR");
        resultLabel = new JLabel("Result: ");

        // Create panel and add components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Number 1:"));
        panel.add(num1TextField);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2TextField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(clearButton);
        panel.add(resultLabel);

        // Add panel to the frame
        add(panel);

        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1TextField.getText());
                int num2 = Integer.parseInt(num2TextField.getText());
                int result = num1 + num2;
                resultLabel.setText("Result: " + result);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(num1TextField.getText());
                int num2 = Integer.parseInt(num2TextField.getText());
                int result = num1 - num2;
                resultLabel.setText("Result: " + result);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1TextField.setText("");
                num2TextField.setText("");
                resultLabel.setText("Result: ");
            }
        });
    }

    public static void main(String[] args) {
        SwingAdder adder = new SwingAdder();
        adder.setVisible(true);
    }
}

