
package groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class GroupAnagrams {

  public static void main(String[] args) {
    
    HashMap<String,ArrayList<String>> map = new HashMap<>();
    
    String[] strarr = {"eat", "tea", "tan", "ate", "nat", "bat"};
    
    for(int i=0;i<strarr.length;i++){
      char[] sorted = strarr[i].toCharArray();
      Arrays.sort(sorted);
      String str = String.valueOf(sorted);
      if(!map.containsKey(str)){
        ArrayList<String> list = new ArrayList<>();
        list.add(strarr[i]);
        map.put(str, list);
      }else{
        map.get(str).add(strarr[i]);
      }      
    }
    
    for(Map.Entry<String,ArrayList<String>> e:map.entrySet()){
      System.out.println(e.getKey() + "->" + e.getValue() );
    }
    
   
  }
  
}
