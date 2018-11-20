
package cc1s2;

import java.util.HashMap;
import java.util.Scanner;


public class CC1S2 {

    
    public static void main(String[] args) {
        
        
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string1");
        s1=sc.nextLine();
        
        System.out.println("Enter string2");
        s2=sc.nextLine();
        
        System.out.println(permuteOfEachOther(s1,s2));
        
        
        
    }
    static boolean permuteOfEachOther(String s1, String s2)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
        if(s1.length() != s2.length())
            return false;
        
        for(int i=0;i<s1.length();i++)
        {
           char temp = s1.charAt(i);
            if(map.containsKey(temp))
            {
                int count = map.get(temp);
                map.put(temp, count++);
            }
            else
                map.put(temp, 0);
        }
        
        for(int j=0;j<s2.length();j++)
        {
            if(!map.containsKey(s2.charAt(j)))
            {
                return false;
            }
        }
        return true;
    }
    
}
