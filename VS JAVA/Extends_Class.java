class Superclass{
    public Superclass(String str){
        System.out.println("Base class consructor : "+str);
    } 
}

class Subclass extends Superclass{
    public Subclass(){
        super("Parent Constructor");
        System.out.println("Subclass Constructor : "+"Child Consructor");
    }
}

public class Extends_Class {
    public static void main(String args[]){
        Subclass obj=new Subclass();
    }
}
