
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentResultGUI extends JFrame {
    private JTextField[] subjectFields;
    private JButton calculateButton;

    public StudentResultGUI() {
        setTitle("Student Result");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel[] subjectLabels = new JLabel[5];
        subjectFields = new JTextField[5];

        for (int i = 0; i < 5; i++) {
            subjectLabels[i] = new JLabel("Subject " + (i + 1) + ":");
            subjectFields[i] = new JTextField();
            mainPanel.add(subjectLabels[i]);
            mainPanel.add(subjectFields[i]);
        }

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });

        mainPanel.add(calculateButton);
        add(mainPanel);
    }

    private void calculateResult() {
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            String marksStr = subjectFields[i].getText();
            int marks = Integer.parseInt(marksStr);
            totalMarks += marks;
        }

        double average = totalMarks / 5.0;
        String result = (average >= 60) ? "Pass" : "Fail";

        ResultWindow resultWindow = new ResultWindow(average, result);
        resultWindow.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentResultGUI gui = new StudentResultGUI();
                gui.setVisible(true);
            }
        });
    }
}

class ResultWindow extends JFrame {
    public ResultWindow(double average, String result) {
        setTitle("Result");
        setSize(200, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());
        JLabel averageLabel = new JLabel("Average: " + average);
        JLabel resultLabel = new JLabel("Result: " + result);
        panel.add(averageLabel);
        panel.add(resultLabel);
        add(panel);
    }
}
