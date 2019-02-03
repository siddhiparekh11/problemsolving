
package secondsmallestarray;


public class SecondSmallestArray {

  public static void main(String[] args) {
    
   // int[] arr = {10,5,10};
    //int[] arr = {12,35,1,10,34,1};
    int[] arr = {10, 10, 10};
    
    
    int fMin,sMin;
    fMin=sMin= Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
      if(arr[i]>fMin){
        int temp= fMin;
        fMin= arr[i];
        sMin=temp;
      }else if(arr[i]>sMin && arr[i]!=fMin){
        sMin=arr[i];
      }
      
    }
    
    System.out.println(fMin);
    System.out.println(sMin);
    
    
  }
  
}
