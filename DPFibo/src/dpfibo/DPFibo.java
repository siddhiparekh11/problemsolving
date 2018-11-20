
package dpfibo;

import java.util.Scanner;


public class DPFibo {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int[] memoarr=new int[n+1];
       // System.out.println("The fibonacchi number at position " + n + "is  " + fib(n,memoarr));
        System.out.println("The fibonacchi number at position " + n + "is  " + fibo(n));
        
        
        
    }
    
    //top-down approach with memoization
    public static int fib(int n,int[] memoarr)
    {
        if(n==0 || n==1)
            return n;
       
        if(memoarr[n]==0)
            memoarr[n]=fib(n-1,memoarr) + fib(n-2,memoarr);
        
            return memoarr[n];
    }
    
    //bottom-up approach 
    public static int fib(int n)
    {
        int[] memoarr=new int[n+1];
        memoarr[0]=0;
        memoarr[1]=1;
        
        for(int i=2;i<=n;i++)
        {
            memoarr[i]=memoarr[i-1]+memoarr[i-2];
        }
        return memoarr[n];
    }
    
    //bottom-up approach slight better
    public static int fibo(int n)
    {
        int a,b,c;
        a=0;
        b=1;
        c=a+b;
        if(n==0)
            return a;
        if(n==1)
            return b;
        
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            
            
        }
        
        return c;
    }
    
}
