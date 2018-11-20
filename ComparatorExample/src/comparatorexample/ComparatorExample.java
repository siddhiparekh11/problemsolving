
package comparatorexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorExample {

  public static void main(String[] args) {
    
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(101);
    numbers.add(100);
    numbers.add(203);
    numbers.add(201);
    
    Comparator<Integer> c = new Comparator<Integer>(){
        public int compare(Integer i,Integer j){          
         return i%10>j%10?1:-1;          
        }
  };
    
    Collections.sort(numbers,c);
    
    Iterator i = numbers.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    
    
    
  }
  
}
