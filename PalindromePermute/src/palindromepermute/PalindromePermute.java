
package palindromepermute;

import java.util.HashMap;
import java.util.Map;


public class PalindromePermute {

  
  public static void main(String[] args) {
    
    String s = "iiddi";
    
    boolean isOdd = s.length()%2==0?false:true;
    
    HashMap<Character,Integer> map = new HashMap<>();
    
    for(int i=0;i<s.length();i++){
      char c = s.charAt(i);
        if(map.containsKey(c))
        {
          map.put(c,map.get(c)+1);
        }else{
          map.put(c,1);
        }
    }
    
    int count=0;
    char[] arr = new char[s.length()];
    int sind=0,eind = s.length()-1;
    char c1='\0';
    for(Map.Entry<Character,Integer> e: map.entrySet()){
      if(e.getValue()%2==0 || (e.getValue()%2==1 && e.getValue()!=1)){
        prepareArr(arr,sind,eind,e.getKey(),e.getValue()/2);
        sind+=e.getValue()/2;
        eind-=e.getValue()/2;
        if((e.getValue()%2==1 && e.getValue()!=1)){
          c1= e.getKey();
          count++;
        }
        continue;
      }        
      else{
        c1=e.getKey();
        count++;
      }
    }
    
    if((isOdd && count==1) || (!isOdd && count==0)){
        if(isOdd)
          arr[sind] = c1;
        System.out.println("Palindrome");
        System.out.println(String.valueOf(arr));
    }else{
      System.out.println("Not Palindrome");
    }
    
    
    
    
    
  }
  
  public static void prepareArr(char[] arr,int sind,int eind,char c,int r){
    
    for(int i=sind;i<sind+r;i++){
      arr[sind] = c;
    }
    
    for(int j=eind;j>eind-r;j--){
      arr[eind] = c;
    }
    
  }
  
}
