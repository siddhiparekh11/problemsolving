
package google22;

//longest increasing subsequence nlogn solution

import java.util.Arrays;
import java.util.HashMap;

public class Google22 {

  public static void main(String[] args) {
    
    //int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
    //int[] arr = {3,4,-1,5,8,2,3,12,7,9,10};
    int[] arr = {10,9,2,5,3,7,101,18};
    int len = arr.length;
    HashMap<Integer,Integer> indexes = new HashMap<>();
    for(int i=0;i<len;i++)
      indexes.put(arr[i], i);
    int k = 0;
    int[] buffer = new int[len];
    int[] parent = new int[len];
    int max=buffer[k]=arr[0]; 
    int maxi = 0;
    parent[k]=-1;
    for(int i=1;i<len;i++){
      if(arr[i]<buffer[k]){
        System.out.print(buffer[k] + " ");
       int ind = binarySearch(buffer,arr[i],0,maxi);
       if(ind!=-1){
       System.out.println("bs " + buffer[ind]);
       buffer[ind] = arr[i];
       parent[i]=parent[ind];
       }
      }else{
        buffer[++k]=arr[i];
        parent[i]=indexes.get(buffer[k-1]);
        maxi = k;
      } 
    }
   System.out.println("The length of the longest substring is " + (k+1));
   
    
  }
  
  public static int binarySearch(int[] buffer,int val,int low,int high){
    
    int mid=0;
    while(low<=high){
      mid = (low+high)/2;
      if((mid==0) && buffer[mid] > val)
        return mid;
      else if(mid!=0 && (buffer[mid-1]< val && buffer[mid] > val))
        return mid;
      else if(buffer[mid]>val)
        high = mid - 1;
      else if(buffer[mid] < val)
        low = mid + 1;
    }
    
    return -1;
    
  }
  
 
  
}
