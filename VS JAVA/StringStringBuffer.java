public class StringStringBuffer {
    public static void main(String args[]){
        String s1="Sonani";
        String s2="206230307012";
        String s3="Bhavanagar";
        String s4="Gandhingar";
        String s5="Surat";

        System.out.println("String 1 : "+s1);
        System.out.println("String 2 : "+s2);
        System.out.println("String 3 : "+s3);
        System.out.println("String 4 : "+s4);
        System.out.println("String 5 : "+s5);
        System.out.println("\n\n\n");

        StringBuffer st=new StringBuffer("Sonani Jemish");

        System.out.println("String Length : "+st.length());
        st.append(" Nitinkumar");
        System.out.println("String Append : "+st);
        System.out.println("String Capacity : "+st.capacity());
        System.out.println("String Reverse : "+st.reverse());      
        System.out.println("String Upper Case : "+s1.toUpperCase());
        System.out.println("String Lower Case : "+s1.toLowerCase());
    }
}
