
package weirdmatrix;
import java.util.Scanner;

public class Weirdmatrix {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        
        int[][] in=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter element at row " + i + " and col " + j);
                in[i][j]=sc.nextInt();
            }
        }
        
        int[][] out=new int[r][c];
        
        out[0][0]=in[0][0];
        
        for(int row=0;row<r;row++)
        {
            for(int col=0;col<c;col++)
            {
                if(row==0 && col!=0)
                    out[row][col]=out[row][col-1]+in[row][col];
                else if(col!=0)
                    out[row][col]=-out[row-1][col-1]+out[row-1][col]+out[row][col-1]+in[row][col];
                else if(row!=0 && col==0)
                    out[row][col]=out[row-1][col]+in[row][col];
                
                System.out.print(out[row][col] + " ");

            }
            System.out.println();
        }
        
        
    }
    
}
