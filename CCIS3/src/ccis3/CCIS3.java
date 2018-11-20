
package ccis3;

import java.util.Scanner;


public class CCIS3 {

   
    public static void main(String[] args) {
        
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        str = sc.nextLine();
        
        replaceSpaces(str);
        
        
   
    }
    
    static void replaceSpaces(String str)
    {
        int newSize = str.length() + (countSpaces(str)*2);
        char[] arr = new char[newSize];
        
        
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                arr[newSize-1]='0';
                arr[newSize-2]='2';
                arr[newSize-3]='%';
                
                newSize = newSize-3;
            }
            else
            {
                arr[newSize-1] = str.charAt(i);
                newSize=newSize-1;
            }
        }
        
        System.out.println(String.valueOf(arr));
       
    }
    
    static int countSpaces(String str)
    {
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
                count++;
        }
        
        return count;
    }
    
    
    
    
    
}
