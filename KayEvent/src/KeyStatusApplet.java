import java.applet.Applet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyStatusApplet extends Applet implements KeyListener {
    String status;

    @Override
    public void init() {
        status = "No key pressed";
        addKeyListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Key Status: " + status, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        status = "Key Typed";
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        status = "Key Pressed";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        status = "Key Released";
        repaint();
    }
}

