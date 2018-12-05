
package sortedmerge;

//cracking the coding interview sorting
public class SortedMerge {

  public static void main(String[] args) {
    
    int[] arr1 = new int[10];
    int[] arr2 = {2,3,5,6,7,9};
    
    arr1[0] = 1;
    arr1[1] = 4;
    arr1[2] = 8;
    arr1[3] = 10;
    
    //pointers for the array
    int p1,p2,p3; 
    p1 = 3;
    p2 = arr2.length - 1;
    p3 = arr1.length - 1;
    
    while(p2>=0 && p1>=0){
      if(arr1[p1]>arr2[p2]){
        arr1[p3] = arr1[p1];
        p1--;
      }else{
        arr1[p3] = arr2[p2];
        p2--;
      }
      p3--;
    }
    
    if(p2>=0){
      for(int i=p3;i>=0;i--){
        arr1[p3] = arr2[p2];
        p2--;
      }        
    }
    
    for(int i:arr1){
      System.out.print(i + " ");
    }
   
  }
  
}
