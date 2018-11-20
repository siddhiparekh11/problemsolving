/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsetsbitwise;

import java.math.*;

/**
 *
 * @author siddhiparekh11
 */
public class SubsetsBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[] arr={'1','1','1','1','1','1','2','2','2','3','3'};
        int sum=0;
        int n=arr.length;
        for(int i=0;i<(int)Math.pow(2, n);i++)
        {
            System.out.print("{ ");
            sum=0;
            for(int j=0;j<n;j++)
            {
                if((i & (1 << j)) > 0)
                {
                    System.out.print(arr[j]+" ");
                    sum=sum+Integer.valueOf(String.valueOf(arr[j]));
                    
                }
                    
            }
            System.out.print("}");
            if(sum==6)
                System.out.println("--------->Sum=" + sum);
            else
                System.out.println();
            
           
              
        }
    }
    
}
