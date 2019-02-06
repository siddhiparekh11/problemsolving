
package testpalindrome;


public class TestPalindrome {

 
  public static void main(String[] args) {
    
    System.out.println(isPalindrome("Able was I, ere I saw Elba!"));
    
  }
  
  public static boolean isPalindrome(String s){
    
    int i=0;
    int j=s.length()-1;
    
    while(i<j){
      
      while(!Character.isLetterOrDigit(s.charAt(i)) && i<j)
        i++;
      while(!Character.isLetterOrDigit(s.charAt(j)) && i<j)
        j--;
      
      if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
        return false;
      
      i++;
      j--;   
      
    }
    
    return true;
    
  }
  
}
