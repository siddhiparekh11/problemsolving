
package pkg8queensproblem;

import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
        
        ArrayList<Integer[]> mat = new ArrayList<Integer[]>();
        Integer[] columns = new Integer[8];
        int row=0;
        
        mat=placeQueens(row,columns,mat);
        
        for(int i=0;i<mat.size();i++)
        {
            for(int j=0;j<mat.get(i).length;j++)
            {
                System.out.print(mat.get(i)[j] + " ");
            }
            System.out.println();
        }
        
    }
    static ArrayList<Integer[]> placeQueens(int row,Integer[] columns, ArrayList<Integer[]> mat)
    {
        if(row==8)
        {
            mat.add(columns.clone());
            
        }
        else
        {
            for(int col=0;col<8;col++)
            {
                if(check(row,col,columns))
                {
                    columns[row]=col;
                    placeQueens(row+1,columns,mat);
                }
            }
        }
        
        return mat;
        
    }
    
    static boolean check(int row1, int col1, Integer[] columns)
    {
        for(int row2=0;row2<row1;row2++)
        {
            int col2=columns[row2];
            
            if(col2==col1) // they shouldn't be in the same columns
                return false;
            
            int coldis=Math.abs(col2-col1);
            int rowdis = row1-row2;
            
            if(coldis==rowdis) //diagonal condition
                return false;
            
        }
        
        return true;
    }
    
}
