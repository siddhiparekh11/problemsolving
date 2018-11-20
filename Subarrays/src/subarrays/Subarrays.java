/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subarrays;

/**
 *
 * @author siddhiparekh11
 */
public class Subarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr={1,2,3};
        int sum=0,sum1=0;
        int n=arr.length;
        int count=1;
        for(int i=n-1;i>=0;i--)
        {
            sum=sum+ (arr[i]*count);
            sum1=sum1+sum;
            count++;
        }
        System.out.println(sum1);
    }
    
}
