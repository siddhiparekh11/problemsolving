
package minjumps;

import java.util.Scanner;


public class MinJumps {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter number of elements in an array");
        n=sc.nextInt();
        
        int[] arr = new int[n];
        int[] minarr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        minarr[0]=1;
       System.out.println(minJumps(arr,0,minarr));
       
       for(int i=0;i<n;i++)
       {
           System.out.print(minarr[i] + " ");
       }
        
    }
    
    static int minJumps(int[] arr,int ind,int[] minarr)
    {
        
        if(ind == (arr.length-1))
            return 0;
        
        if(arr[ind]==0)
            return Integer.MAX_VALUE;
        
        int min=Integer.MAX_VALUE;
        
        for(int i=ind+1;(i<=arr.length-1) && (i<=ind+arr[ind]);i++)
        {
            int jumps = minJumps(arr,i,minarr);
            
            if((jumps!=Integer.MAX_VALUE) && jumps+1<min)
            {
                min=jumps+1;
                minarr[i]=min;
            }
            
        }
            
            
        return min;
    }
    
}
