
package ccim1;

import java.util.Scanner;


public class CCIM1 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter n");
        n=sc.nextInt();
        
        int[][] mat=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }      
        
        rotateMatrix90(mat,n);
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
    } 
    
    
    static void rotateMatrix90(int[][] mat,int n)
    {
        for(int i=0;i<n/2;i++)//no. of layers which needs to be rotated
        {
            for(int j=i;j<n-1-i;j++)
            {
                int top = mat[i][j];
                mat[i][j] = mat[n-1-j][i];
                mat[n-1-j][i]=mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j]=mat[j][n-1-i];
                mat[j][n-1-i]=top;
            }
        }
    }
    
}
