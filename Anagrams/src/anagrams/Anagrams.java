
package anagrams;


public class Anagrams {

  
  public static void main(String[] args) {
    
    String str1 = "Parliament";
    String str2 = "partIAL Myn";
    boolean result;
    
    str1=removeJunk(str1);
    str2=removeJunk(str2);
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();
    str1=sort(str1);
    System.out.println(str1);
    str2=sort(str2);
    result=str1.equals(str2);
    System.out.println(str2);
    System.out.println(result);
  }
  
  //to remove spaces and other punctuations
  public static String removeJunk(String str){
      StringBuilder strnew = new StringBuilder(str);
      for(int i=0;i<strnew.length();i++){
        if(!Character.isLetter(strnew.charAt(i)))
          strnew.delete(i, i+1);
       }
     return strnew.toString();
   }
  
  //sort the two strings
  public static String sort(String str){
      char[] chararr = str.toCharArray();
      java.util.Arrays.sort(chararr);
      return String.valueOf(chararr);
  }
  
}
