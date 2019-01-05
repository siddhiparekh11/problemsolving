
package deletebinaryheap;

import java.util.ArrayList;


public class DeleteBinaryHeap {

  public static void main(String[] args) {
    
    
    int[] arr = {22,78,10,56,12,7};
    
    for(int i=(arr.length/2)-1;i>=0;i--){
      heapify(arr,arr.length,i);
    }
    delete(arr);
    for(int i:arr){
      System.out.println(i);
    }   
  }
  
  public static void delete(int[] arr){
    
    if(arr!=null){
      System.out.println("The deleted element is " + arr[0]);
      arr[0]=arr[arr.length-1];
      arr[arr.length-1] = Integer.MIN_VALUE;
      heapify(arr,arr.length-1,0);
    }
    
  }
  
  public static void heapify(int[] arr,int n,int i){
    
      int ele = i;
      int lchild = (2*i) + 1;
      int rchild = (2*i) + 2;
      
      if(lchild<n && arr[ele]>arr[lchild])
        ele = lchild;
      if(rchild<n && arr[ele]>arr[rchild])
        ele = rchild;
      
      if(ele!=i){
        int temp = arr[i];
        arr[i] = arr[ele];
        arr[ele] = temp;
        
        heapify(arr,n,ele);
      }
  }
  
}
