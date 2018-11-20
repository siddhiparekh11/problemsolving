
package robbersdp;

import java.util.Scanner;


public class RobbersDP {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of houses");
        int n=sc.nextInt();
        int[] robArr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the total value of house " + (i+1));
            robArr[i]=sc.nextInt();
        }
        
        System.out.println("The maximum amount the robbers were able to rob is " + rob(robArr,robArr.length-1));
        
    }
    
    public static int rob(int[] robArr,int ind)
    {
        if(ind < 0)
        {
            return 0;
        }
        else if(ind ==0)
        {
            return robArr[0];
        }
        else if(ind == 1)
        {
            return Math.max(robArr[0],robArr[1]);
        }
        
        
        return Math.max(robArr[ind] + rob(robArr,ind-2), rob(robArr,ind-1));   
    }
    
}
