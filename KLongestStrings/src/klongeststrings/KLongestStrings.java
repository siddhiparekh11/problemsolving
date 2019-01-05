
package klongeststrings;

import java.util.Comparator;
import java.util.PriorityQueue;


public class KLongestStrings {

  static PriorityQueue<String> queue = new PriorityQueue<>(new StringComparator());
 
  public static void main(String[] args) {
   
    String[] arr = {"Siddhi","Ishani","Bhavana","Vijay","Anil","Bahubali","JKRowling"};
    kLongest(arr,3);
    
    while(!queue.isEmpty()){
      System.out.println(queue.poll());
    }  
    
  }
  
  public static void kLongest(String[] stream,int k){
    
    for(int i=0;i<stream.length;i++){
      queue.add(stream[i]); //o(logn) for insert and remove
      if(queue.size()==k+1){
        queue.poll(); // complexity o(logn) ..finding the min ele i.e. o(1) and then heapify which is o(logn)
      }
    }
  }
  
}

class StringComparator implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    if(o1.length()>o2.length())
      return -1;
    if(o1.length()<o2.length())
      return 1;
    else 
      return 0;
  }

 
  
}
