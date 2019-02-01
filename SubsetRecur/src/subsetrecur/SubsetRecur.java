
package subsetrecur;

import java.util.ArrayList;
import java.util.List;


public class SubsetRecur {

 private static List<List<Integer>> res = new ArrayList<>();
  public static void main(String[] args) {
     int[] arr = {1,2,3,4};
     String result = "";
     int currInd = 0;
     recurSubset(arr,currInd,new ArrayList<>());
     
     System.out.println(res);
     
  }
  
  public static void recurSubset(int[] arr,int currInd,List<Integer> list){
    if(currInd == arr.length){
      System.out.println(list);
      res.add(list);
      return;
    }
    recurSubset(arr,currInd+1,list);
    List<Integer> n = new ArrayList<Integer>();
    n.addAll(list);
    n.add(arr[currInd]);
    recurSubset(arr,currInd+1,n);
  }
    
  
}
