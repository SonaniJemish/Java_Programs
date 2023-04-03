import java.awt.*;
import java.awt.event.*;

public class Pr_9_RGB_CheckBox implements ItemListener{
    
    Frame f;
    Checkbox c1,c2,c3;
    Canvas cv;
    int red=0,green=0,blue=0;

    public Pr_9_RGB_CheckBox(){
        
        f = new Frame("RGB Checkbox");

        c1=new Checkbox("Red");
        c2=new Checkbox("Green");
        c3=new Checkbox("Blue");
        
        
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        cv= new Canvas();
        cv.setSize(50,50);

        f.setLayout(new FlowLayout());

        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.add(cv);

        f.setSize(300,300);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){
        if(c1.getState())
            red=255;
        else
            red = 0;
        if(c2.getState())
            green=255;
        else
            green=0;
        if(c3.getState())
            blue=255;
        else
            blue=0;
        

        Color cr= new Color(red,green,blue);
        cv.setBackground(cr);
    }

    public static void main(String[] args) {
        Pr_9_RGB_CheckBox f =new Pr_9_RGB_CheckBox();
    }
}
