//Magic square using Siam's method
import java.util.Scanner;
public class magicsq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();
        int[][] magicSq = new int[n][n];
        
        int row = 0;
        int col = n/2;
        int totalnum = n*n;

        for(int i = 1 ;i<=totalnum;i++){
            magicSq[row][col]=i;

            int nxtrow = row-1;
            int nxtcol = col+1;

            if(nxtrow<0){
                nxtrow = n - 1;
            }
            if(nxtcol==n){
                nxtcol=0;
            }
            if(magicSq[nxtrow][nxtcol]!=0){
                row = row+1;
            }
            else{
                row = nxtrow;
                col = nxtcol;
            }
         }
         System.out.println("Your "+n+" * "+n+" Magic Square");
         //calculating the sum
         int sum = n*(n*n+1)/2;
         System.out.print("The sum of each row and col is: "+sum+"\n");

         for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%4d",magicSq[i][j]);

            }
            System.out.println();
         }







        sc.close();
    }
}