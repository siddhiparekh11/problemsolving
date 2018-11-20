
package localclasses;


public class Localclasses {
    
    static int b=10;

   
    public static void main(String[] args) {
        
        System.out.println(verifyPalindrome("MadaM"));
        
    }
    
    public static boolean verifyPalindrome(String str)
    {
         final int strlen = str.length();
        
        
        
        class Palindrome{
            
            boolean result = true;
            
            
            Palindrome()
            {
                System.out.println(b);
                int j = strlen-1;
                for(int i=0;i<strlen/2;i++)
                {
                    if(str.charAt(i)==str.charAt(j))
                        j--;
                    else
                    {
                        result = false;
                        break;
                    }
                        
                }
            }
    
        }
        Palindrome obj = new Palindrome();
        return obj.result;
        
    }
        
    }
    

