import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Pr_11_JTextField extends Frame implements ActionListener{
    JTextField jt;
    JButton jb;
    JLabel jl;    
    
    Pr_11_JTextField(){

        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.CENTER));

         jt = new JTextField(10);
         jb = new JButton("Submit");
         jb.addActionListener(this);
         jl = new JLabel();

        add(jt);
        add(jb);
        add(jl);
        
    }

    public void actionPerformed(ActionEvent e){
        jl.setText(jt.getText());
        jt.setText(null);
    }
    

    public static void main(String[] args) {
        new Pr_11_JTextField();
    }

}

