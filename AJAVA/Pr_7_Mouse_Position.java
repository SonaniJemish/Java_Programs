import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_7_Mouse_Position extends Applet
        implements MouseListener, MouseMotionListener {

    String msg = "";

    int x, y;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g) {

        showStatus(msg);
        g.fillRect(x, y, 15, 15);
        g.drawString("x: " + x + " Y:" + y, 15, 15);
    }

    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        msg = "X=" + x + "Y=" + y;
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
        msg = "X=" + x + "Y=" + y;
    }

    public void mouseClicked(MouseEvent arg0) {}
    public void mouseEntered(MouseEvent arg0) {}
    public void mouseExited(MouseEvent arg0) {}
    public void mousePressed(MouseEvent arg0) {}
    public void mouseReleased(MouseEvent arg0) {}
}

// <applet code="Pr_7_Mouse_Position.class" width="400" height="400"></applet>
