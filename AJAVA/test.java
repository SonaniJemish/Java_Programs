import java.awt.*;
import java.awt.event.*;

public class test extends Frame implements ActionListener{
    Frame f;
    MenuBar mb ;
    Menu[] sem = new Menu[6];
    MenuItem[][] semmi = new MenuItem[6][3];
    TextArea ta;
    String[][] strSem ={
         {"fca","Maths","fde"},
         {"amaths","12","465"},
         {"amaths","12","465"},
         {"amaths","12","465"},
         {"amaths","12","465"},
         {"amaths","12","465"}};
    test(){
        f= new Frame("Jaimin");
        f.setVisible(true);
        f.setSize(100,200);
        mb = new MenuBar();
        for(int i =0 ; i<6;i++){
        sem[i] = new Menu("Semester"+(i+1));
        for(int j =0 ; j<3;j++){
            semmi[i][j] = new MenuItem(strSem[i][j]);
            semmi[i][j].addActionListener(this);
            sem[i].add(semmi[i][j]);
        }
        mb.add(sem[i]);
        }
        f.setMenuBar(mb);
        ta = new TextArea("        ");
        f.add(ta);
      
        f.addWindowListener(new WindowAdapter (){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e){ 
        ta.setText("Semester "+e.getActionCommand()+" Clicked ");
    }
    public static void main(String[] args) {
        test  p10 = new test();
        
    }
}