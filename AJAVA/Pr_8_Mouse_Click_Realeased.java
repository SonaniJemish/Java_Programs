import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_8_Mouse_Click_Realeased extends Applet implements MouseListener, MouseMotionListener{
    
    String msg="";
    
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        g.drawString(msg, 50, 50);
    }

    public void mousePressed(MouseEvent m){
        msg="mouse clicked";
        repaint();
    }

    public void mouseReleased(MouseEvent m){
        msg="mouse released";
        repaint();
    }

    public void mouseDragged(MouseEvent m){}
    public void mouseClicked(MouseEvent m){}
    public void mouseEntered(MouseEvent m){}
    public void mouseExited(MouseEvent m){}
    public void mouseMoved(MouseEvent m){}

   
}


// <applet code="Pr_8_Mouse_Click_Realeased.class" width="400" height="400"></applet>
