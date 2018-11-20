
package mapinterface;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

  public static void main(String[] args) {
    
    //unsorted hashmap
    
    Map<String,Integer> results = new HashMap<>();
    results.put("Siddhi",100);
    results.put("Ishani", 90);
    results.put("Bhavna", 80);
    

    
    for(Map.Entry<String,Integer> e:results.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    
    //sorted map
    Map<String,Integer> result = new TreeMap<>();
    result.put("Siddhi",100);
    result.put("Ishani", 90);
    result.put("Bhavna", 80);
    

    
    for(Map.Entry<String,Integer> e:result.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    
    //maintain the insertion order faster than treemap and internal representation as doubly linked list
    Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
    linkedHashMap.put(1, "Siddhi");
    linkedHashMap.put(2,"Bhavna");
    linkedHashMap.put(3, "Ishani");
    
    linkedHashMap.put(2,"Vijay");
    
    for(Map.Entry<Integer,String> e:linkedHashMap.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    
    
    
    
    
    
    
  }
  
}
