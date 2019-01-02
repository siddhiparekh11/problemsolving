
package finddisappearednumber;

import java.util.ArrayList;
import java.util.List;


public class FindDisappearedNumber {

  
  public static void main(String[] args) {
    
    List<Integer> res = new ArrayList<>();
    //int[] arr = {4,3,2,7,8,2,3,1};
    //int[] arr ={1,1,1};
   // int[] arr ={1,2,3,4,5};
   int[] arr ={1,1,1,1,1};
    
    res = findDisappearedNumbers(arr);
    
    for(int i=0;i<res.size();i++)
      System.out.println(res.get(i));
    
  }
  
  public static List<Integer> findDisappearedNumbers(int[] nums) {
        
        int i=0;
        List<Integer> res = new ArrayList<>();
        while(i<nums.length){
         // System.out.println(i);
            if(nums[i]==i+1)
                i++;
            else if(nums[nums[i]-1]==nums[i])
                i++;
            else{
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1]= temp;
            }
        }
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                res.add(j+1);
        }
        
        return res;
        
    }
  
}
