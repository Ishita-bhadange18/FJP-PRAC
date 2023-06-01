import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class KeyStatusApplet extends Applet implements KeyListener {
    private String status;

    public void init() {
        status = "";

        // Set the focus to the applet window to receive key events
        setFocusable(true);
        requestFocus();

        // Add the key listener to the applet window
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("Key Status: " + status, 20, 20);
    }

    public void keyPressed(KeyEvent e) {
        status = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        status = "Key Released: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e) {
        status = "Key Typed: " + e.getKeyChar();
        repaint();
    }
}
