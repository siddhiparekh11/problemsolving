
package ccis5;

import java.util.Scanner;


public class CCIS5 {

    
    public static void main(String[] args) {
        
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string 1");
        str1=sc.nextLine();
        
        System.out.println("Enter string 2");
        str2=sc.nextLine();
        
        boolean res=false;
        
        if(str1.length()==str2.length())
            res=checkReplace(str1,str2);
        else if((str1.length() +1) == str2.length())
            res=checkInsertRemove(str1,str2);
        else if ((str1.length()-1) == str2.length())
            res=checkInsertRemove(str2,str1);
            
        
        System.out.println(res);
        
        
    }
    
    static boolean checkReplace(String first, String second)
    {
        boolean flag=false;
        for(int i=0;i<first.length();i++)
        {
            if(first.charAt(i)!=second.charAt(i))
            {
                if(flag)
                    return false;
                flag=true;
            }
        }
        return true;
    }
    static boolean checkInsertRemove(String first, String second)
    {
        int ind1=0;
        int ind2=0;
        
        while((ind1<first.length()) && (ind2<second.length()))
        {
            if(first.charAt(ind1)!=second.charAt(ind2))
            {
                if(ind1!=ind2)
                    return false;
                ind2++;
                
            }
            else
            {
                ind1++;
                ind2++;
            }
        }
        
        
        return true;
    }
    
}
