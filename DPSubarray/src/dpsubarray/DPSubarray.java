
package dpsubarray;

import java.util.Scanner;


public class DPSubarray {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       // largeSum(arr);
        kadame(arr);
    }
    
    //brute force
    public static void largeSum(int[] arr)
    {
        int si,ei;
        si=ei=0;
        int sum;
        int max=0;
        for(int i=0;i<arr.length-1;i++)
        {
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum>max)
                {
                    max=sum;
                    si=i;
                    ei=j;
                    
                }
            }
            
        }
        
        System.out.println(si + " " + ei);
    }
    
    public static void kadame(int[] arr)
    {
        int maxg=Integer.MIN_VALUE; //global max
        int sum=0;
        int maxi=Integer.MIN_VALUE; //max at index i
        int si=-1,ei=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum<=arr[i])
            {
                maxi=arr[i];
                sum=arr[i];
                si=i;
            }
            else
            {
                maxi=sum;
            }
            if(maxg<=maxi)
            {
                ei=i;
            }
            maxg=Math.max(maxg, maxi);
        }
        if(si>ei)
            si=ei;
        System.out.println(maxg);
        System.out.println(si + " " + ei);
    }
    
    
    
}
