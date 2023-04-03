import java.util.Scanner;
public class Addition_Matrix {
    public static void main(String args[]){
       int n=3;

        int a1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int a2[][]=new int[n][n];
        int sum[][]=new int[n][n];

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter Matrix Val of element " + (i+1)+"  "+(j+1)+" is :");
                a2[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=0;
                    sum[i][j]=a1[i][j]+a2[i][j];

                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
