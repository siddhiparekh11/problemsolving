package solution;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        int l;
        //remove consecutives
        s=s.replaceAll("([a-z])(\\1)","");
        System.out.println("Removing consecutives");
        System.out.println(s);
       //remove single instances of characters
        String t="";
        
        int max=0;
        s=removeDistinctChar(s);
        System.out.println("Removing single instances");
        System.out.println(s);
        //remove consequent characters
        s=s.replaceAll("([a-z])\\1", "");
        System.out.println("Removing consecutives");
        System.out.println(s);
       //finding number of distinct characters
         t=s;
        t=t.replaceAll("([a-z])(?=.*\\1)","");
        System.out.println("Counting distinct characters");
        System.out.println(t);
        String reg="";
        //forming pairs of distinct characters and 
        String[] arr1=t.split("");
        for(int j=0;j<arr1.length;j++)
        {
            
            
            for(int k=j+1;k<arr1.length;k++)
            {
               t=s;
                reg="";
                reg=reg.concat("[^").concat(arr1[j]).concat(arr1[k]).concat("]");
                System.out.println(reg);
                t=t.replaceAll(reg,"");
                if(t.matches("([a-z])(\\1)")) // if it has consecutives
                    break;
                if(t.length()>=max)
                    max=t.length();
                System.out.println("String:" + t);
                System.out.println("Max:" + max);
                
            }
        }
        //printing the length of the maximum

        System.out.println(max);
        
        
    }
    static String removeDistinctChar(String str)
    {
        //System.out.println(str);
        String[] arr=str.split("");
        String[] arr2=str.split("");
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            flag=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    arr[j]="*";
                    flag=true;
                }
                
            }
            if(flag)
                arr[i]="*";
            
        }
        String g="";
      //  g=Arrays.toString(arr);
       // System.out.println(g);
        for(int h=0;h<arr.length;h++)
        {
            if(arr[h].equals("*")!=true)
                arr2[h]="";
            g=g.concat(arr2[h]);
        }
        //g=Arrays.toString(arr2);
       // System.out.println(g);
        
        return g;
    }
        
  }
