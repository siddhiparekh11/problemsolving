
package minsumdistinctelement;

public class MinSumDistinctElement {

  public static void main(String[] args) {
    int[] arr = {2,2,2,2,2};
    
   
    int prev = arr[0];
     int sum = prev;
    
    for(int i=1;i<arr.length;i++){
      
      if(arr[i]<=prev){
        prev = prev + 1;
        sum = sum + prev;
      }else{
        sum = sum + arr[i];
        prev=arr[i];
      }
      
    }
    
    System.out.println(sum);
    
  }
  
}
