
package findduplicatesinarray;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {

  public static void main(String[] args) {
   
    int[] arr = {4,3,2,7,8,2,3,1};
    System.out.println(findDuplicates(arr));
  }
  
  public static List<Integer> findDuplicates(int[] arr){
    
    List<Integer> dup = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      int ind = Math.abs(arr[i])-1;
      if(arr[ind]<0)
        dup.add(Math.abs(arr[i]));
      else
        arr[ind]=-arr[ind];        
    }
    return dup;
    
  }
  
}
