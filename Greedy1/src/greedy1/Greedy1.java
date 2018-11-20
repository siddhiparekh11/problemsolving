/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedy1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Greedy1 {

    static String gridChallenge(String[] grid) {
        // Complete this function
        String res="";
        char[] arr=new char[grid.length];
        char[][] arr1=new char[grid.length][grid.length];
        for(int i=0;i<grid.length;i++)
        {
            arr=grid[i].toCharArray();
            
            Arrays.sort(arr);
            arr1[i]=arr;
            
        }
        
        for(int i=0;i<grid.length-1;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
               int c1,c2;
                c1=(int)arr1[i][j];
                c2=(int)arr1[i+1][j];
                if(c1-c2<=0)
                {
                    res="YES";
                    //System.out.print(c1-c2);
                   // System.out.print(" ");
                    
                }
                else
                {
                    res="NO";
                    break;
                }
                    
            }
            if (res.equals("NO"))
                    break;
            System.out.println();
        }
        System.out.println("-------------------");
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        
        return res;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        String[] grid;
        String result="";
        for(int i=0;i<t;i++)
        {
            n = in.nextInt();
            grid = new String[n];
            for(int grid_i = 0; grid_i < n; grid_i++){
                grid[grid_i] = in.next();
            }
            if(n!=1)
                result = gridChallenge(grid);
            else
                result="YES";
            System.out.println(result);
        }
        in.close();
    }
}
