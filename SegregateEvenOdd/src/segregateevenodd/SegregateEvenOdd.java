
package segregateevenodd;

public class SegregateEvenOdd {

 
  public static void main(String[] args) {
    
   // int[] arr = {12,34,45,9,8,90,3};
  // int[] arr = {3,5,7,1,2,2};
  int[] arr ={1,2,3,4,5};
    segregateEvenOdd(arr);
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
  
  }
  
  public static void segregateEvenOdd(int[] arr){
    
    int eC=0;
    int oC=arr.length-1;
    
    while(eC<oC){
      if(arr[eC]%2==0)
        eC++;
      else{
        swap(arr,eC,oC);
        oC--;
      }
    } 
    
  }
  
  public static void swap(int[] arr,int even,int odd){
    int temp = arr[even];
    arr[even] = arr[odd];
    arr[odd] = temp;
  }
  
}
