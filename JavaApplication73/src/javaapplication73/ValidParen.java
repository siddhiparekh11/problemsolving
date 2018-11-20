
package javaapplication73;

import java.util.ArrayList;
import java.util.Scanner;


public class ValidParen {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("Enter number of pairs");
        n=sc.nextInt();
        
        ArrayList<String> list = new ArrayList<String>();
        char[] str = new char[n*2];
        
        validParen(list,n,n,str,0);
        
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
    
    static void validParen(ArrayList<String> list, int left, int right, char[] str,int count)
    {
        if(left<0 || right<left)
            return;
        
        if(left==0 && right==0)
        {
            list.add(String.valueOf(str));
        }
        else
        {
            if(left > 0)
            {
                str[count]='(';
                validParen(list,left-1,right,str,count+1);
            }
            
            if(right > left)
            {
                str[count]=')';
                validParen(list,left,right-1,str,count+1);
            }
        }
        
    }
    
}
