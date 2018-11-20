
package pramp1;
  import java.io.*;
import java.util.*;

public class Pramp1 {
  static int shiftedArrSearch(int[] shiftArr, int num) {
    
       int pivot = pivotElement(shiftArr,0,shiftArr.length-1);
       System.out.println("Pivot " + pivot);
       int res=0;
    if(shiftArr[pivot]==num)
      return pivot;
  if(((pivot!=0) && num>shiftArr[pivot] && (num>shiftArr[shiftArr.length-1])) || pivot==shiftArr.length-1)
       {
         res = binarySearch(shiftArr,0,pivot-1,num);
       }
       else
       {
         res = binarySearch(shiftArr,pivot,shiftArr.length-1,num);
         System.out.println("res " + res);
       }
      return res;
  }
  
  static int binarySearch(int[] shiftArr,int low,int high,int num)
  {
      int mid=0;
      if(low<=high)
      {
          mid=(low+high)/2;
          System.out.println("mid " + mid);
          if(shiftArr[mid]==num)
            return mid;
          else if(num < shiftArr[mid])
            mid = binarySearch(shiftArr,low,mid-1,num);
          else
            mid = binarySearch(shiftArr,mid+1,high,num);
        
      }
     return mid;
  }

  static int pivotElement(int[] shiftArr,int begin,int end)
  {
        int mid=0;
        while(begin<=end)
        {
           mid = (begin+end)/2;
           if( mid==0 || (shiftArr[mid]<shiftArr[mid-1]))
           {
               return mid;
           }
           else if(shiftArr[mid]>shiftArr[0])
           {
               begin=mid+1;
           }
           else
           {
              end=mid-1;
           }
        }
    return mid;
  }
  public static void main(String[] args) {
    
    int[] shiftArr={0,1,2,3,4,5};
    int num=1;
    
    int res=shiftedArrSearch(shiftArr,num);
    System.out.println(res);
    

  }

}

