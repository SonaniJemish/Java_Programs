class A{
    static int x=7012;
}

class B extends A{
    int x=10;
    void display(){
        System.out.println("Supar class static x is : "+A.x);
        System.out.println("Sub x is : "+x);
    }
}



public class Sub_Supar_Class {
    public static void main(String args[]) {
        B b=new B();
        b.display();
    }
}
