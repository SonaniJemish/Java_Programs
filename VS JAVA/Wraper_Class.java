public class Wraper_Class {
    public static void main(String args[]){

        byte b=10;
        int i=70;
        short s=12;
        long l=7012l;
        float f=70.12f;
        double d=20.62d;
        char c='J';
        boolean bl=true;

        Byte byteobj=b;
        Integer intobj=i;
        Short shortobj=s;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean booleanobj=bl;

        intobj.toString();
        String st="7012";
        int a=Integer.parseInt(st);
        int max=Integer.MAX_VALUE;
        long l1=Long.parseLong(st);

        System.out.println("Print Object Value\n");
        System.out.println("Byte Object : "+byteobj.toString());
        System.out.println("Integer Object : "+intobj);
        System.out.println("Short Object : "+shortobj );
        System.out.println("Long Object : "+longobj);
        System.out.println("Float Object : "+floatobj);
        System.out.println("Double Object : "+doubleobj);
        System.out.println("Character Object : "+charobj);
        System.out.println("Boolean Object : "+booleanobj);
        System.out.println("Max Integer : "+max);
        System.out.println("Long Integer : "+l1);
        System.out.println("String to Integer : "+a);

    }
}
