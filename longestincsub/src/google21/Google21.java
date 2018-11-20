
package google21;
//Longest Increasing Subsequence using dynamic programming - n2 solution

import java.util.Arrays;

public class Google21 {

  public static void main(String[] args) {
    
    int[] arr = {9,1,3,7,5,6,20};
    int[] len = new int[arr.length];
    Arrays.fill(len, 1);
    lisLength(arr,len);
    int max = 0;
    for(int i=0;i<len.length;i++){
      if(max < len[i])
        max = len[i];
    }
    
    System.out.println(max);
    
  }
  
  public static void lisLength(int[] arr,int[] len){
    
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<i;j++){
        if(arr[j]<=arr[i]){
          len[i] = Math.max(len[i], len[j]+1);
        }
      }
    }
    
  }
  
}
