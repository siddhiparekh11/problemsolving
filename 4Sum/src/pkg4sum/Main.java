
package pkg4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;


public class Main {

  
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4};
    
    System.out.println(fourSum(arr,10));
    
  }
  public static List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> results = new ArrayList<>();
        if(nums.length<4)
            return results;
        int k1 = (target/2);
        int k2 = target - k1;
        
        Arrays.sort(nums);
        HashSet<List<Integer>> pairs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
          int r1 = binarySearch(nums,k1-nums[i]);
          if(r1!=-1 && r1!=i)
          {
              List<Integer> pair = returnPair(nums[i],nums[r1]);
              pairs.add(pair);
          }
          int r2 = binarySearch(nums,k2-nums[i]);
           if(r2!=-1 && r2!=i)
          {
              List<Integer> pair = returnPair(nums[i],nums[r2]);
              pairs.add(pair);
          }               
        }
        
        Iterator h = pairs.iterator();
        List<List<Integer>> tlist = new ArrayList<>();
        while(h.hasNext()){
           // System.out.println(h.next());
            tlist.add((List<Integer>)h.next());
        }
       int len = tlist.size(); 
       for(int i=0;i<len-1;i++){
           for(int j=i+1;j<len;j++){
               int v1 = tlist.get(i).get(0);
               int v2 = tlist.get(i).get(1);
               int sum1 = v1 + v2 ;
               int v3 = tlist.get(j).get(0);
               int v4 = tlist.get(j).get(1);
               int sum2 = v3+v4;
               if(sum1+sum2==target){
                   List<Integer> res = new ArrayList<>();
                   res.add(v1);
                   res.add(v2);
                   res.add(v3);
                   res.add(v4);
                   results.add(res);
               }
           }
       }
        
        
        return results;
        
            
    }
    
   
    
    
    
    public static int binarySearch(int[] nums,int val)
    {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==val)
                return mid;
            else if(nums[mid]>val)
                high=mid-1;
            else
                low=mid+1;
        }
        
        return -1;
    }
    
    public static List<Integer> returnPair(int i,int j){
        List<Integer> list = new ArrayList<>();
        if(i<j){
            list.add(0,i);
            list.add(1,j);
        }else{
            list.add(0,j);
            list.add(1,i);
        }
        return list;
    }
}
