import java.applet.*;
import java.awt.*;

public class Pr_1_Life_Cycle extends Applet{
    String msg="";
    public void init(){
        msg+="init() ==>";
    }
    public void start(){
        msg+="start() ==>";
    }
    public void stop(){
        msg+="stop() ==>";
    }
    public void paint(Graphics g){
        msg+="paint() ==>";

        g.drawString(msg,20,20);
    }
}


/* <applet code="Pr_1_Life_Cycle.class" width=800 height=300></applet> */
