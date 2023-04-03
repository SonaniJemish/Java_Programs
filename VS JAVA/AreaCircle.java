import java.util.Scanner;

class circle{
    final double PI=3.14;

    circle(double r){
        double ans=PI*r*r;

        System.out.println("Area of circle is : "+ans);
    }
}

public class AreaCircle {
    public static void main(String[] args) {
        Scanner rad=new Scanner(System.in);
        System.out.print("Enter radius value : ");
        double r=rad.nextDouble();

        circle a= new circle(r);
    }
}
