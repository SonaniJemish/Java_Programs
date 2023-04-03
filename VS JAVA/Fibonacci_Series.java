public class Fibonacci_Series {
       public static void main(String args[]){
     int a=0, b=1, temp;
        for(int i=1; i<=20 ; i++){
            System.out.println(a+" , ");

            temp=a+b;
            a=b;
            b=temp;
        }
    }
}
