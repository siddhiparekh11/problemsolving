
package pkg3stackssinglearray;

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the total capacity of the array");
             int cap=sc.nextInt();
             
             int[] arr=new int[cap];
             int[] top=new int[3];
             
             int[] sCap=new int[3]; // individual stack capacity, counter will be incremented everytime we push and decremented everytime we pop
             int[] iniInd=new int[3]; //initial index of stack
             
             
            
             //initializing all the elements to -1
             for(int i=0;i<cap;i++)
             {
                 arr[i]=-1;
             }
             
             int div=cap/3;
             
             //setting the top pointers 
             top[0]=0;
             top[1]=top[0] + div;
             top[2]=top[1] + div;
             
             //setting the initial index .. we will need this if the stack gets empty and we need to refill it
             iniInd[0]=top[0];
             iniInd[1]=top[1];
             iniInd[2]=top[2];
             
             //setting the total number of elements in each stack as 0
             for(int i=0;i<3;i++)
             {
                 sCap[i]=0;
             }
             
             
             
             
             int choice;
             int k;
             boolean flag=false;
             
             
             
             
             while(true)
             {
                 System.out.println("Enter the operation 1(push), 2(pop), 3(seek), 4(print)");
                 System.out.println("Enter the stack number 0,1,2");
                 System.out.println("Enter -1 to exit");
                 choice=sc.nextInt();                 
                 k=sc.nextInt();//k is the no of the stack
                 switch(choice)
                 {
                     case 1:
                         System.out.println("Enter the data(int)");
                         push(arr,top,sCap,iniInd,k,sc.nextInt());
                         break;
                     case 2:
                         pop(arr,top,sCap,iniInd,k);
                         break;
                     case 3:
                         seek(arr,top,k);
                         break;
                     case 4:
                         print(arr);
                         break;
                     case -1:
                         flag=true;
                         break;
                         
                 }
                 if(flag)
                     break;
                 
                 
             }
             
             
             
             
        
    }
    
    public static void print(int[] arr)
    {
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void push(int[] arr,int[] top,int[] sCap,int[] iniInd,int k,int data)
    {
        if(((k==2 && ((top[k])==(arr.length-1))) || (k!=2 && ((top[k])==((iniInd[k+1])-1)))) && arr[top[k]]!=-1)
        {
            System.out.println("The stack is full");
        }
        else
        {
            if(arr[top[k]]==-1)
            {
                arr[top[k]]=data;
                top[k]=top[k]+1;
                if((k==2 && (top[k]==arr.length)) || (k!=2 && top[k]>=iniInd[k+1]))
                {
                    //System.out.println("The stack is full");
                    top[k]=top[k]-1;
                }
                
                    sCap[k]=sCap[k]+1;
            }
            
        }
        
    }
    
    public static void pop(int[] arr,int[] top,int[] sCap,int[] iniInd,int k)
    {
        if(arr[top[k]]!=-1)
        {
              System.out.println("The deleted element is " + arr[top[k]]);
                arr[top[k]]=-1;
                
                sCap[k]=sCap[k]-1;//total number of elements in the stack
                if(sCap[k]==0)
                {
                    top[k]=iniInd[k];
                }
                else
                {
                    top[k]=top[k]-1;//actual index of elements in the array
                }
        }
        else
        {
            System.out.println("The stack is empty");
        }
    }
    public static void seek(int[] arr,int[] top,int k)
    {
        if(arr[top[k]]!=-1)
         System.out.println("The element at position " + top[k] + " is " + arr[top[k]]);
        else
         System.out.println("The stack is empty");
    }
    
}
