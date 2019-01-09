
package hashmapex;

import java.util.HashMap;
import java.util.Map;


public class HashMapEx {

  
  public static void main(String[] args) {
    
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    map.put(11,0);
    map.put(12,90);
    System.out.println(map.putIfAbsent(1, Integer.MIN_VALUE));
    System.out.println(map.get(1));
    
    Map<Integer,Integer> m = new HashMap<Integer,Integer>();
    
    m.putAll(map);
    
    for(Map.Entry<Integer,Integer> e:m.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    
  }
  
}
