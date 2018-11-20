
package ccis7;

import java.util.Scanner;


public class CCIS7 {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        
        System.out.println("Enter string 1");
        s1=sc.nextLine();
        
        System.out.println("Enter string 2");
        s2=sc.nextLine();
        
        System.out.println(isRotate(s1,s2));
        
    }
    
    static boolean isRotate(String s1, String s2)
    {
        if((s1.length()!=0) && (s1.length() == s2.length()))
        {
            String newStr=s1+s1;
            return newStr.contains(s2);
        }
        
        return false;
        
    }
    
}
