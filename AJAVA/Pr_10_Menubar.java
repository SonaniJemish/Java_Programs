import java.awt.*;
import java.awt.event.*;

public class Pr_10_Menubar implements ActionListener{

    Frame f;
    TextArea ta;
    MenuBar mb;
    Menu m;
    MenuItem m1,m2,m3,m4;


    Pr_10_Menubar(){
        f = new Frame();

        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        mb = new MenuBar();
        
        f.setMenuBar(mb);
        f.setSize(300, 300);
        
        m = new Menu("File");
        
        mb.add(m);

        m1 = new MenuItem("New");
        m2 = new MenuItem("Open");
        m3 = new MenuItem("Save");
        m4 = new MenuItem("Save As");

        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);

        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);

        ta = new TextArea(" ",2,30);
        
        
        f.add(ta);

        f.addWindowListener(new WindowAdapter (){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e){

        ta.setText(e.getActionCommand()+" Clicked ");

    }

    public static void main(String[] args) {
        Pr_10_Menubar p10 = new Pr_10_Menubar();
    }
}
