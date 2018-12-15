
package kpairsum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Kpairsum {

  
  public static void main(String[] args) {
    
     // int[] arr = {7,6,12,3,9,3,5,1};
      int[] arr = {6,6,3,9,3,5,1};
      //int[] arr = {6,6,6,6};
      int k = 12;
      int res = 0;
     
      HashMap<Integer,Integer> count = new HashMap<>();
      Set<List<Integer>> resSet = new HashSet<>();
      
      for(int i=0;i<arr.length;i++){
      
        count.put(arr[i],count.getOrDefault(arr[i],0)+1);
        
      }
      
      for(int i=0;i<arr.length;i++){
        int diff = k - arr[i]; //arr might not contain the difference so you are containsKey
        if(count.get(arr[i])>0){
          count.put(arr[i], count.get(arr[i])-1);
          if(count.containsKey(diff) && count.get(diff)>0){
            res++;
            List<Integer> list = new ArrayList<>();
            list.add(arr[i]);
            list.add(diff);
            count.put(diff,count.get(diff)-1);
            resSet.add(list);
          }
        }        
      }
      
      System.out.println(resSet);
      
  }
  
}
