
package google3;


public class Google3 {

 
  public static void main(String[] args) {
    
    int[] arr = {-2,1,12,41,45};
    int[] arr1 = {-10,-7,-5,-2,-1,3,4,5,7,8,10};
    System.out.println(magicIndexDup(arr1,0,arr1.length-1));
   
  }
  public static int magicIndex(int[] arr,int low,int high){
    int res=0;
    
    if(low <= high){
      
       int mid = (low + high)/2;
       if(mid == arr[mid])
           res = mid;
       else if(mid > arr[mid])
          res = magicIndex(arr,mid+1,high);
       else if(mid < arr[mid])
          res = magicIndex(arr,low,mid-1);
    }
    return res;
}
  
  public static int magicIndexDup(int[] arr,int low,int high){
    
   if(low > high) return -1;   
     
      int mid = (low+high)/2;
      if(mid == arr[mid])
        return mid;
      int newhigh = Math.min(mid-1, arr[mid]); //arr[mid] can be greater than mid for left hand side
      int left= magicIndexDup(arr,low,newhigh);
        if(left>=0)
          return left;
      int newlow = Math.max(mid+1, arr[mid]);
      int right= magicIndexDup(arr,newlow,high);
          return right;
    
  
    
  }

  
}
