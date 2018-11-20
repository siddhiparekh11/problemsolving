/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gq1;

import java.util.Scanner;


public class GQ1 {

    
   
    public static void main(String[] args){
        
        String A,B;
        int res;
        Scanner sc=new Scanner(System.in);
        A=sc.next();
        B=sc.next();
        
        res=solution(A,B);
        
        if(res==-1)
            System.out.println("String B is not substring of String A");
        else
            System.out.println("String A is repeated " + res + " times and String B is a substring of this repeated string.");
        
        
        
        
    
    }
    public static int solution(String A, String B) {
        // write your code in Java SE 8
        
        if(A==null || B==null)
           return -1;
        
       boolean flag=true;       
        
        StringBuilder result=new StringBuilder();
        int count=0;
        while(true)
        {
            result.append(A);
            count++;
            if(result.toString().contains(B))
              break;
            if(count> (A.length() * B.length()))
            {
                flag=false;
                break;
            }
        }
        if(flag==false)
           count=-1;
        return count;
    }
    
}
