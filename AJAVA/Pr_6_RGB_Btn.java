import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Pr_6_RGB_Btn extends Applet implements ActionListener
{
    Button b;
    Frame f;


    public Pr_6_RGB_Btn(){
        f = new Frame() ;
        b= new Button("Red");
        f.setBackground(Color.red);
        b.addActionListener(this);
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.add(b);
        f.setVisible(true); 
    }
    public void actionPerformed(ActionEvent e){
        if(b.getLabel()=="Red"){
            b.setLabel("Green");
            f.setBackground(Color.green);
        }
        else if (b.getLabel()=="Green") {
            b.setLabel("Blue");
            f.setBackground(Color.blue);
        } else {
            b.setLabel("Red");
            f.setBackground(Color.red);
        }
    }

    public static void main() {
        Pr_6_RGB_Btn f= new Pr_6_RGB_Btn();
        
    }
}



// <applet code="Pr_6_RGB_Btn.class" width="400" height="400"></applet>
