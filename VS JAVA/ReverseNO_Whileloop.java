import java.util.Scanner;
public class ReverseNO_Whileloop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Print No : ");
        int no = sc.nextInt();
        int a=0;
        int b=0;

        while(no!=0){
            a=no%10;
            b=b*10+a;
            no=no/10;
        }
        System.out.println("Reverse no of 12345 is : "+b);
    }
}
