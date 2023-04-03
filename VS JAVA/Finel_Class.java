final class A{
    void value(){
        System.out.println("It is a super class");
        System.out.println("It can not inheritance");
    }
}

class B extends A{
    void value(){
       System.out.println("It is a child class"); 
    }
}

public class Finel_Class {
    public static void main(String args[]) {
        B b1=new B();
        b1.value();
    }   
}
