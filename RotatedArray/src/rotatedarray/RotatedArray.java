
package rotatedarray;

public class RotatedArray {

  public static void main(String[] args) {
    
    int[] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
    int[] arr1 = {2,2,3,2,2,2,2,2,2,2};
    System.out.println(rotatedSortedSearch(arr1,0,9,2));
    
  }
  
  public static int rotatedSortedSearch(int[] a,int low,int high,int ele){
    if(high<low)
      return -1;
    
    int mid = (low+high)/2;
   // System.out.println(mid);
    if(a[mid]==ele){
      return mid;
    }
    
    //left half is sorted
    if(a[low]< a[mid]){
      if(ele >= a[low] && ele <= a[mid])
        return rotatedSortedSearch(a,low,mid-1,ele);
      else
        return rotatedSortedSearch(a,mid+1,high,ele);    
    } //left half is not sorted
    else if(a[mid] < a[low]){
      if(ele<=a[high] && ele >=a[mid])
        return rotatedSortedSearch(a,mid+1,high,ele);
      else
        return rotatedSortedSearch(a,low,mid-1,ele);     
    }else if(a[mid]==a[low]){
      if(a[mid]!=a[high])
        return rotatedSortedSearch(a,mid+1,high,ele);
      else{
        int res = rotatedSortedSearch(a,low,mid-1,ele);
        if(res==-1){
          return rotatedSortedSearch(a,mid+1,high,ele);
        }
          return res;        
      }
    }
    
    return -1;
  }
    
    
  
  
}
