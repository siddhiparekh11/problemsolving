/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.Scanner;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,p,q;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=sc.nextInt();
        q=sc.nextInt();
        
        for(int i=n;i>0;i--)
        {
            if((i%p==0 || i%q==0) && digitExtractor(i,p,q))
            {
                System.out.print("OUTTHINK ,");
            }
            else if(i%p==0 || i%q==0)
            {
                System.out.print("OUT ,");
            }
            else if(digitExtractor(i,p,q))
            {
                System.out.println("THINK ,");
            }
            else
            {
                System.out.print(i + ",");
            }
            
        }
        
    }
    static boolean digitExtractor(int i,int p,int q)
    {
         boolean flag=false;
         int dig;
         while(i!=0)
         {
             dig=i%10;
             i=i/10;
             if(dig==p || dig==q)
             {
                 flag=true;
                 break;
             }
         }
         
         return flag;
    }
    
}
