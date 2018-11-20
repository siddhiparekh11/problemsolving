
package dailyproblem4;

import java.util.Scanner;


public class Dailyproblem4 {

   
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total elements of an array");
        n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        
        System.out.println(findMinPos(arr));
        
    }
    
    
   //check to see if they are all positive ... complexity is o(n)...complexity is based on the number of swaps ...bucket sort
    public static int findMinPos(int[] arr)
    {
        int len=arr.length;
        boolean flag=false;
        for(int i=0;i<len;i++)
        {
            while(arr[i]!=i)
            {
                if(arr[i]<=0 || arr[i]>=len)
                   break;
                
                if(arr[i]==arr[arr[i]]) //duplicates
                    break;
                
                int temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }
        }
        
       
        
        for(int i=1;i<len;i++)
        {
            if(arr[i]!=i)
                return i;
        }
        
        if(arr[0]<=0 || arr[0]>len)
            return len;
        else
            return len+1;
        
    }
       
       
    
    
    
    
}
