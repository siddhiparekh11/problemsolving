
package firstrepeatedcharacter;

import java.util.HashMap;
import java.util.Scanner;


public class FirstRepeatedCharacter {

    
    public static void main(String[] args) {
        
        String str;
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        HashMap<Character,Integer> countChar=new HashMap<>();
        
        
        System.out.println("Enter a string");
        str=sc.nextLine();
        
        for(int i=0;i<str.length();i++)
        {
            if(countChar.containsKey(str.charAt(i)))
            {
                System.out.println("The first repeated character is " + str.charAt(i));
                countChar.put(str.charAt(i),countChar.get(str.charAt(i))+1);
                flag=true;
                break;
                
            }
            else
            {
                countChar.put(str.charAt(i), 1);
            }
        }
        if(!flag)
            System.out.println("There are no repeated characters in the given string");
        
        
    }
    
}
