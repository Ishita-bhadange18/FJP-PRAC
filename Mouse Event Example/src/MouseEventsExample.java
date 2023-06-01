import java.awt.*;
import java.awt.event.*;

public class MouseEventsExample extends Frame implements MouseListener {
    public MouseEventsExample() {
        setTitle("Mouse Events Example");
        setSize(300, 200);
        setLocationRelativeTo(null);

        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
        setVisible(true);
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public static void main(String[] args) {
        MouseEventsExample example = new MouseEventsExample();
        example.setVisible(true);
    }
}
