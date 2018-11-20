
//latest day having k empty slot between the two flowers

package kemptyslot;

import java.util.Scanner;

/*
10000
10001
10101
10111
11111
*/

public class KEmptySlot {

   
    public static void main(String[] args) {
        
      //  int[] flwr = {1,4,3,2,5};
        int[] flwr = { 1,5,3,4,2};
        Scanner sc = new Scanner(System.in);
        int len = flwr.length;
        int max=0;
        int k;
        System.out.println("Enter the value of k");
        k=sc.nextInt();
        
        
        int[] gardn = new int[flwr.length];
        
        //iterate through the flower array 
        for(int i=0;i<flwr.length;i++)
        {
            
            
            if(isValidKSlots(flwr,gardn,len,flwr[i]-1,k))
            {
               // System.out.println("I am called");
                max=i+1;
            }
        }
        
        System.out.println(max);
       
    }
    
    public static boolean isValidKSlots(int[] flwr,int[] gardn,int len,int slot,int k)
    {
        gardn[slot]=1;
        boolean flag1,flag2;
        flag1=flag2=false;
        //k empty slots can be on either side of a flower
        //checking for the right hand side of the flower
        if((slot+k+1<len) && gardn[slot+k+1]==1)
        {
            flag1=true;
           for(int i=1;i<=k;i++)
           {
               if(gardn[slot+i]==1)
                   flag1=false;
           }
          if(flag1)
              return flag1;
          
        }
        //checking for the left hand side of the flower
        if((slot-k-1>=0) && gardn[slot-k-1]==1)
        {
            flag2=true;
            for(int i=1;i<k;i++)
            {
                if(gardn[slot-i]==1)
                    flag2=false;
            }
           
            if(flag2)
                return flag2;
            
            
            
        }
        System.out.println(flag1 || flag2);
        return flag1 || flag2;
    }
    
}
