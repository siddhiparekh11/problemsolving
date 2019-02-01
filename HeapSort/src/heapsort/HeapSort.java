 
package heapsort;


//time complexity is nlogn
//here max heap is getting created
public class HeapSort {

   
    public static void main(String[] args) {
        
        int[] arr={12,13,5,7,11,6};
        sort(arr);
        
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        
    }
    
    public static void sort(int[] arr)
    {
        int n=arr.length;
        
        //heapify the input array before the sort
        for(int i=(n/2)-1;i>=0;i--)
            heapify(arr,n,i);
        
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            heapify(arr,i,0);
           // System.out.println(arr[0]);
        }
    }
    
    //time complexity is log n
    public static void heapify(int[] arr,int n,int i)
    {
        int max = i; // root
        int left = (2*i) + 1; //leftchild
        int right = (2*i) + 2; //rightchild
        
        if(left<n && arr[left]>arr[max])
            max=left;
        
        if(right<n && arr[right]>arr[max])
            max=right;
        
        if(max!=i)
        {
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
            heapify(arr,n,max);
        }
            
        
    } 
    
}
