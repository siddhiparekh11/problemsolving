
package set;

import java.util.Collections;
import java.util.HashSet;


public class Set {

  
  public static void main(String[] args) {
    
    java.util.Set<String> s = new HashSet<String>();
    
    Collections.addAll(s, "Jim likes mary".split(" "));
    System.out.println(s.size());
    Collections.addAll(s,"Kate likes Tom".split(" "));
    System.out.println(s.size());
    
    
  }
  
}
