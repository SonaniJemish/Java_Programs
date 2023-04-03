interface Animal{
    void Animal_name();
}
interface Birds{
    void Birds_name();
}

class A implements Animal,Birds{
    public void Animal_name(){
        System.out.println("Animal name is : Lion,Tiger,Elephent");
    }
    public void Birds_name(){
        System.out.println("Birds name is : Parret,Owl,Peacock");
    }
}

public class Interface_Using {
    public static void main(String args[]) {
        A a1=new A();
        a1.Animal_name();
        a1.Birds_name();
    }
}
