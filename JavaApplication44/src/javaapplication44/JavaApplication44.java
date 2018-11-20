/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int res=countPalindromes("abc");
        System.out.println(res);
    }
    static int countPalindromes(String s) {
       
        int k=0;
        int count=0;
        
        String[] temp=new String[100];
        String[] rev=new String[100];
            
        for(int i=0;i<s.length()-1;i++)
        {
              temp[k]=String.valueOf(s.charAt(i));
              rev[k]=String.valueOf(s.charAt(i));
              count++;
              k++;
            for(int j=i+1;j<s.length();j++)
            {
               
                temp[k]=temp[k-1] + String.valueOf(s.charAt(j));
                rev[k]=String.valueOf(s.charAt(j)) + rev[k-1];
                if(temp[k].equals(rev[k]))
                    count++;
                k++;
                
            }
        
        
        }
        
        return count+1;

    }
}
