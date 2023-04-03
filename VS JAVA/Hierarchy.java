interface P1{
    int a=12;
    public void displayA();
}

interface P2{
    int b=70;
    public void displayB();
}

interface P12 extends P1,P2{
    int c=7012;
    public void displayC();
}

class Q implements P12{
    @Override
    public void displayA(){
        System.out.println(a);
    }
    @Override
    public void displayB(){
        System.out.println(b);
    }
    @Override
    public void displayC(){
        System.out.println(c);
    }
}

public class Hierarchy {
    public static void main(String args[]) {
        Q q=new Q();
        q.displayA();
        q.displayB();
        q.displayC();
    }
}
