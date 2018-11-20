
package cc1m22;

import java.util.Scanner;


public class CC1M22 {

    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int m,n;
        boolean frhZero,fchZero;
        frhZero=fchZero=false;
        
        System.out.println("Enter the no. of rows");
        m=sc.nextInt();
        
        System.out.println("Enter the no. of columns");
        n=sc.nextInt();
        
        int[][] mat = new int[m][n];
        
        //initialize the matrix
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
                
            }
        }
        
        //checking the zeroes in the matrix and setting the first row and column accordingly
        
        for(int j=0;j<n;j++)
        {
            if(mat[0][j]==0)
                frhZero=true;
        }
        for(int i=0;i<m;i++)
        {
            if(mat[i][0]==0)
                fchZero=true;
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                
                if(mat[i][j]==0)
                {
                    mat[i][0]=0;
                    mat[0][j]=0;
                }
            }
        }
        
        //updating the matrix rows
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                
                
                if(mat[i][0]==0 || mat[0][j]==0)
                {
                    mat[i][j]=0;
                }
                
           System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(frhZero)
                {
                    mat[0][j]=0;
                }
                if(fchZero)
                {
                    mat[i][0]=0;
                }
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    
}
