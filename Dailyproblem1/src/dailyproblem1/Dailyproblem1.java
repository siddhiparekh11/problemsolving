
package dailyproblem1;

import java.util.HashMap;

//Given an array find any pair that has sum equal to k
public class Dailyproblem1 {

    
    public static void main(String[] args) {
        
        int[] arr={10,15,3,7};
        int[] arr1={18,2,-1,0};
        int[] helper=new int[arr.length];
        int k=17;
        
        printPair(arr,k);
        mergeSort(arr1,helper,0,arr1.length-1);
        printPair1(arr1,0,arr1.length-1,k);
    
    
    }
    
    //hashing
    //time complexity o(n)
    //space complexity o(n)
    public static void printPair(int[] arr,int k)
    {
        int l=arr.length;
        int temp;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<l;i++)
        {
            temp=k-arr[i];
            if(temp!=0 && map.containsKey(temp))
            {
                System.out.println(map.get(k-arr[i]) + " " + arr[i]);
                break;
            }
            map.put(arr[i],arr[i]);
        }
        
    }
    
    public static void mergeSort(int[] arr,int[] helper,int low,int high)
    {
        if(low<high)
        {
            int mid = (low + high)/2;
            mergeSort(arr,helper,low,mid);
            mergeSort(arr,helper,mid+1,high);
            merge(arr,helper,low,mid,high);
            
        }
        
    }
    public static void merge(int[] arr,int[] helper,int low,int mid,int high)
    {
        //copying the two halves into the helper array
        for(int i=low;i<=high;i++){
            helper[i]=arr[i];
        }
        
        int helperLeft=low;
        int helperRight=mid+1;
        int curr=low;
        
        //sorting the two halves
        
        while(helperLeft<=mid && helperRight<=high)
        {
            if(helper[helperLeft]<=helper[helperRight])
            {
                arr[curr]=helper[helperLeft];
                helperLeft++;
            }
            else
            {
                arr[curr]=helper[helperRight];
                helperRight++;
            }
            curr++;
        }
        
        //copying the remaining half
        int remaining = mid - helperLeft;
        
        for(int i=0;i<=remaining;i++)
        {
            arr[curr+i]=helper[helperLeft+i];
        }
        
        
        
    }
    
    public static void printPair1(int[] arr,int low,int high,int k)
    {
        while(low<high)
        {
            if(arr[low]+arr[high]==k){
                
                System.out.println(arr[low] + " " + arr[high]);
                break;
                
            }
            else if(arr[low] + arr[high] < k)
                low++;
            else
                high--;
        }
    }
    
}
