
package test;

/**
 *
 * @author siddhiparekh11
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Test {

    


    private static int n;
    private static int top=-1,top1=-1;
    private static int[] arr,max;
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        max=new int[n];
        
        int q;
        for(int i=0;i<n;i++)
        {
            q=sc.nextInt();
            switch(q)
            {
                case 1:
                      int it=sc.nextInt();
                      push(it);
                      break;
                case 2:
                      pop();
                      break;
                case 3:
                      max();
                      break;
            }
            
        }
    }
    public static void push(int item)
    {
            top++;
            arr[top]=item;                          
            if(top1==-1 || arr[top]>=max[top1])
            {
               max[++top1]=arr[top];         
            
            }
        
    }
    public static void pop()
    {
       if(arr[top]==max[top1])
           top1=top1-1;
        top--;
       
    }
    public static void max()
    {
       
        if(top1!=-1)
        System.out.println(max[top1]);
    }
    
}

