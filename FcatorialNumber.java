import java.util.*;

public class FcatorialNumber {
    public static void printFactorial(int a){

        if(a<0){
            System.out.println("Invalid number");
            return;
        }
        int fact=1;

        for(int i=a; i>=1; i-- ){

            fact = fact * i;

        }
        System.out.println("Factorial of given number : "+fact);
        return;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
