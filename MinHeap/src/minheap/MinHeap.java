
package minheap;

import static java.lang.Integer.min;
import java.util.Scanner;

public class MinHeap {

    private static int ind;
    public static void main(String[] args) {
        
        int[] heap=new int[7];
        Scanner sc=new Scanner(System.in);
       // ind=0;
        int choice;
        boolean flag=false;
        
        
        while(true)
        {
            System.out.println("Enter operation insert(1), getminimum(2), print(3), extractmin(4), exit(-1)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter data");
                    insert(heap,sc.nextInt());
                    break;
                case 2:
                    System.out.println("The minimum element is " + getMin(heap));
                    break;
                case 3:
                    print(heap);
                    break;
                case 4:
                    System.out.println("The extracted element is " + extractMin(heap));
                    break;
                case -1:
                    flag=true;
                    break;
            }
            if(flag)
              break;
        
        }
        
       
    }
    
    public static void insert(int[] heap, int data)
    {
        int temp;
        int tind;
        int pind;
       
        if(ind!=heap.length)
        {
            heap[ind]=data;
            tind=ind;
            if(tind!=0)
            {
                while(true)
                {
                    if(tind==0)
                        break;
                    
                    if(((tind%2==0) && (heap[tind]< heap[(tind/2)-1])) ||((tind%2!=0) && (heap[tind]< heap[(tind/2)])))
                    {
                       if(tind%2==0)
                       {
                           pind=(tind/2)-1;
                       }
                       else
                       {
                           pind=tind/2;
                       }
                        temp=heap[tind];
                        heap[tind]=heap[pind];
                        heap[pind]=temp;
                        
                        tind=pind;
                        
                    
                    }
                    else
                    {
                        break;
                    }
                    
                }
            }
            if(ind!=heap.length-1)
                ind++;
           
        }
        else
        {
            System.out.println("Heap is full");
        }
    }
    
    public static int extractMin(int[] heap)
    {
        int res;
        if(ind!=-1)
        {
            res=heap[0]; //extract the minimum element
            //swap the minimum element with the rightmost element
            int temp=heap[0];
            heap[0]=heap[ind];
            heap[ind]=0; //assuming there are no negative and zero values in the heap
             //check this
            print(heap);
            //mainting the min heap property
            heapify(heap);
            ind=ind-1;
            return res;
            
            
        }
        else
        {
            System.out.println("Heap is empty");
        }
        return -1;
        
    }
    public static void heapify(int[] heap) // can you do it with recursion
    {
        int temp;
        int i=0;
        int val;
        int j,k;
        j=(i*2)+1;
        k=(i*2)+2;
        while(i<(heap.length/2))
        {
            val=min(heap[j],heap[k]);
            System.out.println(val);
            if((val==heap[j]) && (heap[i]>heap[j]) && heap[j]!=0) //left child
            {
                temp=heap[i];
                heap[i]=heap[j];
                heap[j]=temp;
                i=j;
                
                
                
                
            }
            else if((val==heap[k]) && (heap[i]>heap[k]) && heap[k]!=0)//right child
            {
                temp=heap[i];
                heap[i]=heap[k];
                heap[k]=temp;
                
                i=k;
                
                
            }
            else
            {
                break;
            }
            j=(i*2)+1;
            k=(i*2)+2;
           
        }
    }
    public static int getMin(int[] heap)
    {
        if(ind!=-1)
        {
            return heap[ind];
        }
        
        return -1;
    }
    public static void print(int[] heap)
    {
        for(int i=0;i<heap.length;i++)
        {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    
}
