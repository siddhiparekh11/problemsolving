
package rangebinarysearch;

public class RangeBinarySearch {

  public static void main(String[] args) {
    
    int[] arr = {12,20,32,40,52};
    
    int ans = binarySearch(arr,0,arr.length-1,12);
    System.out.println(ans);
    
  }
  
  public static int binarySearch(int[] arr,int low,int high,int val){
    int mid=-1;
    if(low<high){
       mid = (low+high)/2;
      if(val==arr[mid])
        return mid;
      else if(val<arr[mid]){
        return binarySearch(arr,low,mid-1,12);
      }
      else{
        return binarySearch(arr,mid+1,high,12);
      }
       
      }
    
      return mid;
  }
  
}
