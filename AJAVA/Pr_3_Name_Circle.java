import java.awt.*;
import java.applet.Applet;

public class Pr_3_Name_Circle extends Applet
{
    int applet_width=600;
    int applet_height=400;
    int circle_diameter=100;
    public void init()
    {
        super.setSize(applet_width,applet_height);
    }
    public void paint(Graphics G)
    {
        G.setColor(Color.RED);
            G.drawOval(applet_width/2-circle_diameter/2,circle_diameter,circle_diameter,circle_diameter);
            G.drawString("Jemish", 280, 160);
    }
}


// <applet code="Pr_3_Name_Circle.class" width="100" height="100"></applet>