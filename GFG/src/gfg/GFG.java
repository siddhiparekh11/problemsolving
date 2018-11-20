/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gfg;
import java .io.*;

/**
 *
 * @author siddhiparekh11
 */

 
class GFG 
{
     
    // Prints sums of all 
    // subsets of arr[l..r]
    static void subsetSums(int []arr, int l,
                            int r, int sum )
    {
         System.out.println(l + " " + r + " " + sum);
        // Print current subset
        if (l > r)
        {
            //System.out.print(sum + " ");
            return;
        }
     
        // Subset including arr[l]
        subsetSums(arr, l + 1, r, 
                   sum + arr[l]);
     
        // Subset excluding arr[l]
        subsetSums(arr, l + 1, r, sum);
    }
     
    // Driver code
    public static void main (String[] args)
    {
        int []arr = {1,2,3};
        int n = arr.length;
     
        subsetSums(arr, 0, n - 1, 0);
    }
}
