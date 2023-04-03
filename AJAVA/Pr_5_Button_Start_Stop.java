import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_5_Button_Start_Stop extends Applet implements ActionListener
{
    Button b1;

    public void init(){
         b1 = new Button("Start");
        add(b1);
        b1.addActionListener(this);
        b1.setPreferredSize(new Dimension(100,50));        
    }
    public void actionPerformed(ActionEvent e){
        if(b1.getLabel()=="Start"){
            b1.setLabel("Stop");
        }
        else{
            b1.setLabel("Start");
        }
    }
}

// <applet code="Pr_5_Button_Start_Stop.class" width="300" height="250"></applet>