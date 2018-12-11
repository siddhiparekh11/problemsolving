
package dailycoding165;


public class DailyCoding165 {

 
  public static void main(String[] args) {
    
   // int[] arr = {3,4,9,6,1};
   //int[] arr = {1,2,3,4,5};
   int[] arr = {5,4,3,2,1};
    int[] res = new int[arr.length];
    
    for(int i=0;i<arr.length;i++){
      for(int j=arr.length-1;j>i;j--){
        if(arr[i]>arr[j]){
            res[i]+=1;
        }
      }
      System.out.println(res[i]);
    }
  }
  
}
