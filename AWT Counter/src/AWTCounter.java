import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class AWTCounter extends Frame {
    private Label countLabel;
    private Button countButton;
    private int count;

    public AWTCounter() {
        setTitle("AWT Counter");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());



        countLabel = new Label("Count: 0");
        countButton = new Button("Count");
        count = 0;

        add(countLabel);
        add(countButton);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText("Count: " + count);
            }
        });
    }


    public static void main(String[] args) {
        AWTCounter counter = new AWTCounter();
        counter.setVisible(true);
    }


}

