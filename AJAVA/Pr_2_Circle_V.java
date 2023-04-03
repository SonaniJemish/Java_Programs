import java.awt.*;
import java.applet.Applet;

public class Pr_2_Circle_V extends Applet{
    int applet_width=600;
    int applet_height=600;
    int circle_diameter=50;
    int count=10;
    public void init(){
        super.setSize(applet_width,applet_height);
    }
    public void paint(Graphics G){
        G.setColor(Color.RED);
        for(int i=0;i<count;i++){
            G.drawOval(getWidth()/2-circle_diameter/2,i*circle_diameter,circle_diameter,circle_diameter);
        }
    }
}


// <applet code="Pr_2_Circle_V.class" width="100" height="100"></applet>