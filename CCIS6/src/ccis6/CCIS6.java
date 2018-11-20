
package ccis6;

import java.util.Scanner;


public class CCIS6 {

    
    public static void main(String[] args) {
        
        String str;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        str=sc.nextLine();
        System.out.println("The compressed string is " + compressedString(str));
        
    }
    
    static String compressedString(String str)
    {
        StringBuilder cstr=new StringBuilder();
        int conscChars=0;
        
        for(int i=0;i<str.length();i++)
        {
            conscChars++;
            if((i==(str.length()-1))||(str.charAt(i)!=str.charAt(i+1)))
            {
                cstr.append(str.charAt(i));
                cstr.append(conscChars);
                conscChars=0;
            }
        }
        return cstr.length()>str.length()?str:cstr.toString();
    }
    
}
