
package allpairsofsumk;

import java.util.HashMap;

public class AllPairsofSumK {

  public static void main(String[] args) {
    
    int[] arr = {10, 12, 10, 15, -1, 7, 6, 
                   5, 4, 2, 1, 1, 1};
    HashMap<Integer,Integer> map = new HashMap<>();
    int sum =11;
    
    for(int x: arr){
      int complement = sum -x;
      if(map.getOrDefault(complement, 0) > 0){
        System.out.println(x + " " + complement);
        updateMap(map,complement,-1);
      }else{
        updateMap(map,x,1);
      }
    }
    
  }
  
  public static void updateMap(HashMap<Integer,Integer> map,int key,int val){
    map.put(key,map.getOrDefault(key,0)+val);
  }
  
}
