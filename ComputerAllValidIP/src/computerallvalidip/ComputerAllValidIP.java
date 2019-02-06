
package computerallvalidip;

import java.util.ArrayList;
import java.util.List;

public class ComputerAllValidIP {

  public static void main(String[] args) {
   
    List<String> results = getValidIp("19216811");
    for(int i=0;i<results.size();i++)
      System.out.println(results.get(i));
    
  }
  
  public static List<String> getValidIp(String s){
    List<String> results = new ArrayList<>();
    int len = s.length();
    for(int i=1;i<4 && i<len;i++){
      final String first = s.substring(0,i);
      if(isValidPart(first)){
        for(int j=1;i+j<len && j<4;j++){
          final String second = s.substring(i,i+j);
          if(isValidPart(second)){
            for(int k=1;i+j+k<len && k<4;k++){
              final String third = s.substring(i+j,i+j+k);
              final String fourth = s.substring(i+j+k);
              if(isValidPart(third) && isValidPart(fourth)){
                results.add(first+"."+second+"."+third+"."+fourth);
              }
            }
          }
        }
      }
    }
    return results;
  }
  
  public static boolean isValidPart(String s){
    if(s.length()>3){
      return false;
    }
    if(s.startsWith("0") && s.length()>1){
      return false;
    }
    int val=Integer.parseInt(s);
    return val<=255 && val>=0;
  }
  
}
