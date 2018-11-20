
package magicalvowel;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class MagicalVowel {

    
    public static void main(String[] args) {
        
        System.out.println(magicalVowel("aeiaaioooaauuaeiou"));
        System.out.println(magicalVowel("aeaaaaaeiou"));
        System.out.println(magicalVowel("aiiiuuooeiou"));
        
        
        
    }
    
    
    public static int magicalVowel(String s)
    {
        
        
        boolean flag=true;
        LinkedHashMap<Character,Integer> tab=new LinkedHashMap<Character, Integer>();
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        
        
          if(!isVowel(s))
              return 0;
          
          map.put('a','a');
          map.put('e','a');
          map.put('i', 'e');
          map.put('o','i');
          map.put('u', 'o');
          
          tab.put('a',0);
          tab.put('e',0);
          tab.put('i',0);
          tab.put('o',0);
          tab.put('u',0);
          
          char[] arr=s.toCharArray();
         // System.out.println(arr);
         
          tab.put(arr[0], 1);
          for(int i=1;i<arr.length;i++)
          {
             // if(arr[i]>arr[i-1])
               //   tab.put(arr[i], tab.get(map.get(arr[i]))+1);
              if(arr[i]==arr[i-1])
                  tab.put(arr[i],tab.get(arr[i])+1);
              else if(arr[i-1]==map.get(arr[i]))
                  tab.put(arr[i], tab.get(map.get(arr[i]))+1);
              
                  
                  
          }
        
        return tab.get('u');
    }
    public static boolean isVowel(String s)
    {
        char[] arr=new char[5];
        
        if(s.contains("a"))
        {
            if(arr[0]!='a')
                arr[0]='a';
        }
        if(s.contains("e"))
        {
            if(arr[1]!='e')
                arr[1]='e';
        }
        if(s.contains("i"))
        {
            if(arr[2]!='i')
                arr[2]='i';
        }
        if(s.contains("o"))
        {
            if(arr[3]!='o')
                arr[3]='o';
        }
        if(s.contains("u"))
        {
            if(arr[4]!='u')
                arr[4]='u';
        }
        
        if(String.valueOf(arr).equals("aeiou"))
            return true;
        else
            return false;
        
    }
    
}
