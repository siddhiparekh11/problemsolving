
package setinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

  public static void main(String[] args) {
    
    //Set interface doesn't store duplicate values
    
    
    //TreeSet sorts the set values
    
    Set<Integer> sortedSet = new TreeSet<>();
    sortedSet.add(1);
    sortedSet.add(2);
    sortedSet.add(0);
    
    
    System.out.println(sortedSet);
    
    //HashSet doesn't sort the inserted values
    Set<Integer> unsortedSet = new HashSet<>();
    unsortedSet.add(-9);
    unsortedSet.add(1);
    unsortedSet.add(2);
    unsortedSet.add(-1);
    
    System.out.println(unsortedSet);
   
    
    
  }
  
}
