
package noofstairs;

import java.util.Scanner;

public class Noofstairs {

    
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter total number of stairs:");
       int n=sc.nextInt();
       int ways=new Noofstairs().noOfStairs(n);
       System.out.println("The no. of ways you can climb " + n + " stairs is " + ways);
       
        
       
    
    }
    
    int noOfStairs(int totStairs)
    {
       int res=0;
        if(totStairs<0)
            return 0;
        if(totStairs==0)
            return 1 ;
        
        
        
            return noOfStairs(totStairs-1)+noOfStairs(totStairs-2)+noOfStairs(totStairs-3);
        
        
    }
}
