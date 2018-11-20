
package google19;

//descending weights - bucket sort

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Google19 {

  public static void main(String[] args) {
    
    int[] n = {5,4,3,2,1};
    int k = 2;
    HashMap<Integer,LinkedList<Integer>> buckets = new HashMap<>();
    if(k>0)
      bucketSort(n,buckets,k);
    
     Map<Integer,LinkedList<Integer>> treeMap = new TreeMap<>(Collections.reverseOrder());
     treeMap.putAll(buckets);
    for(Map.Entry<Integer,LinkedList<Integer>> bucket : treeMap.entrySet()){
      System.out.print(bucket.getValue());
    }
    
  }
  
  public static void insertionSort(LinkedList<Integer> bucket,int val){
    
    int cntr = 0;
    boolean flag = false;
    while(cntr<bucket.size()){
      if(val <= bucket.get(cntr)){
        bucket.add(cntr,val);
        flag = true;
        break;
      }
      cntr++;
    }
    if(!flag)
      bucket.addLast(val);
    
  }
  
  //classifying the elements in their respective buckets
  public static void bucketSort(int[] arr,HashMap<Integer,LinkedList<Integer>> buckets,int k){
    int len = arr.length;
    for(int i=0;i<len;i++){
      int key = arr[i]%k;
      if(!buckets.containsKey(key)){
        buckets.put(key,new LinkedList<Integer>());        
      }
      insertionSort(buckets.get(key),arr[i]);     
    }    
  }
  
}


