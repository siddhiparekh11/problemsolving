
package swaparrayelements;

import java.util.HashSet;

public class SwapArrayElements {

  public static void main(String[] args) {
      /*int[] arr1 ={4,1,2,1,1,2};
      int[] arr2 ={3,6,3,3};*/
      
      int arr1[] = {5, 7, 4, 6};
       int arr2[] = {1, 2, 3, 8};
      
      HashSet<Integer> set = makeSet(arr2);
      Integer target = getTarget(arr1,arr2);
      int[] pair = new int[2];
      
     
      
      if(target==null)
        System.out.println("There doesn't exist any such pair");
      
      System.out.println(set);
      System.out.println(target);
      
      
      for(int i:arr1){
        int diff = Math.abs(i-target);
        System.out.println(diff);
        //System.out.println(diff);
        if(set.contains(diff)){
          pair[0] = i;
          pair[1] = diff;
          break;
        }
      }
      
      System.out.println(pair[0]+" "+pair[1]);
      
      
  }
  
  
  
  public static HashSet<Integer> makeSet(int[] arr){
    HashSet<Integer> set = new HashSet<>();
    for(int i: arr){
      set.add(i);     
    }
    return set;
  }
  
  
  public static Integer getTarget(int[] arr1,int[] arr2){
    int sum1 = sum(arr1);
    int sum2 = sum(arr2);
    
   // System.out.println(sum1);
   // System.out.println(sum2);
    
    if((sum1+sum2)%2!=0)
      return null;
    
    return (sum1-sum2)/2;
    
  }
  
  public static int sum(int[] arr){
    int sum = 0;
    for(int i: arr){
      sum += i;
    }
    return sum;
  }
  
}
