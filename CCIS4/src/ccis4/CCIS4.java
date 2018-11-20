
package ccis4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CCIS4 {

    
    public static void main(String[] args) {
        
        String str;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string");
        str=sc.nextLine();
        
        countChars(str);
        
       
    }
    
    static void countChars(String str)
    {
        
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        boolean flag=true;
        int oddCount=0;
        for(int i=0;i<str.length();i++)
        {
            char temp = str.charAt(i);
            if(map.containsKey(temp))
            {
                int tCount=map.get(temp);
                tCount++;
                map.put(temp,tCount);
                
            }
            else
            {
                map.put(temp,1);
            }
        }
        
        for(Map.Entry<Character,Integer> e: map.entrySet())
        {
            if(e.getValue()%2==0)
            {
                
            }
            else if(e.getValue()==1)
            {
                oddCount++;
            }
            else
            {
                flag=false;
            }
            
        }
        
        if(flag && (oddCount==1 || oddCount==0))
            System.out.println("Given string is a permutation of a palimdrone");
        else
            System.out.println("Given string is not a permutation of a palimdrone");
        
        
    }
    
}
