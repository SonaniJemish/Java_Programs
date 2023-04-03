public class PrimeNo {
    public static void main (String args[]){
        int n=10,temp;
        for(int i=1; i<=n;i++){
            temp=0;
            for(int j=2; j<=n/2; j++){
                if(i%j==0){
                    temp++;
                    break;
                }
            }
            if (temp==0){
            System.out.println("Prime No : "+i );
            }
        }
    }
}
