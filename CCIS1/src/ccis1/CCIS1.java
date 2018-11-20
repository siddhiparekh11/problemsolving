
package ccis1;

//Program to check if a string contains all the unique character. Assuming that string contains characters from a to z

import java.util.Scanner;

public class CCIS1 {

    
    public static void main(String[] args) {
        
        String str=null;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        str=sc.nextLine();
        
        boolean res = uniquecharacters(str);
       
        if(res)
            System.out.println("String contains all the unique characters");
        else
            System.out.println("String does contains some duplicate characters");
        
        
    }
    
    static boolean uniquecharacters(String str)
    {
        int checker = 0;
        int bitIndex;
        
        for(int i=0;i<str.length();i++)
        {
            bitIndex = str.charAt(i) - 'a';
            
            //check for duplicates
            if( (checker & (1<<bitIndex)) > 0)
                return false;
            
            //else set the bit to 1 at bitIndex in checker
            checker = checker | (1<<bitIndex);
        }
        
        return true;
    }
    
}
