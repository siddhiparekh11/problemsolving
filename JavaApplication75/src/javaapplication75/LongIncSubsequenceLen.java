
package javaapplication75;

import java.util.Arrays;
import java.util.Scanner;


public class LongIncSubsequenceLen {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter total no. of elements");
        n=sc.nextInt();
        
        int[] arr = new int[n];
        int[] lis = new int[n];
        
        for(int i=0;i<n;i++)
        {
                arr[i]=sc.nextInt();
                lis[i]=1;
        }
        
        longIncSubsequence(arr,arr.length,lis);
        Arrays.sort(lis);
        System.out.println(lis[n-1]);
        
    }
    
    static void longIncSubsequence(int[] arr,int ind, int[] lis)
    {
        if(ind==1)
           return;
        
        longIncSubsequence(arr,ind-1,lis); // substitutes for(int i=1;i<arr.length();i++)
        for(int j=0;j<ind-1;j++)
        {
            if(arr[j]<arr[ind-1])
            {
                int temp = lis[j] + 1;
                if(temp > lis[ind-1])
                    lis[ind-1] = temp;
            }
        }
        
        
    }
    
}
