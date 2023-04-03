public class MaxNo_ConditionalOperator {
    public static void main (String arg[]){
        int max,a,b,c;
        a=112;
        b=54;
        c=87;

        System.out.println("a : "+a+"\nb : "+b+"\nc : "+c);

        max =(a>b?(a>c?a:c):(b>c?b:c));

        System.out.println("Maximum No is : "+max);
    }
}
