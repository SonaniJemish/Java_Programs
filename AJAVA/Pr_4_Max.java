import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Pr_4_Max extends Applet implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1;
    public void init()
    {
        Label l1=new Label("Value 1");
        t1=new TextField(4);
        Label l2=new Label("Value 2");
        t2=new TextField(4);
        Label l3=new Label("Value 3");
        t3=new TextField(4);
        Label l4=new Label("Largest Number");
        t4=new TextField(4);
        b1=new Button("Find");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        int i,j,k,max;
        i=Integer.parseInt(t1.getText());
        k=Integer.parseInt(t3.getText());
        j=Integer.parseInt(t2.getText());

        max = ((i > j && i > k)? i : (j > k )? j : k);

        t4.setText(" "+max);

    }   
}



// <applet code="Pr_4_Max.class" height="300" width="400"></applet>