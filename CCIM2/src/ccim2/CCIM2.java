
package ccim2;

import java.util.Scanner;


public class CCIM2 {

    
    public static void main(String[] args) {
        
        
        int m,n;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        
        int[] row = new int[m];
        int[] col= new int[n];
        
        int[][] arr=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((row[i]==1) || (col[j]==1))
                {
                    arr[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
}
