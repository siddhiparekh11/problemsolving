
package sortstack;

import java.util.Scanner;

public class SortStack {

    private static int top=-1;
    
    public static void main(String[] args) {
        
        int cap;
        int choice;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter maximum stack capacity");
        cap=sc.nextInt();
        int[] arr=new int[cap];
        boolean flag=false;
        int val;
        
        while(true)
        {
            System.out.println("Enter operation Push(1), Pop(2), Peek(3), Exit(-1)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter data");
                    push(arr,sc.nextInt());
                    break;
                case 2:
                    val=pop(arr);
                    if(val!=-1)
                        System.out.println("The popped item is " + val);
                    else
                        System.out.println("The stack is empty");
                    break;
                case 3:
                    val=peek(arr);
                    if(val!=-1)
                        System.out.println("The item at the top is " + val);
                    else
                        System.out.println("The stack is empty");
                    break;
                case -1:
                    flag=true;
                    break;
            }
            if(flag)
                break;
        }
        
        
        
        
        
        
    }
    
    public static void push(int[] arr,int data)
    {
        
        if(top==arr.length-1)
        {
            System.out.println("Stack is full.");
        }
        else
        {
            if((top==-1) || (data<=arr[top]))
            {
                arr[++top]=data;
                
            }
            else
            {
                int k=top;
                arr[++top]=arr[k];
                arr[k]=0;
                int i=0;
                
                while(i<=top-1)
                {
                    if(arr[i]<=data)
                    {
                        
                        for (int j=top-1;j>=i;j--)
                        {
                            if(j==0 && i==0)
                            {
                                arr[j]=data;
                            }
                            else
                            {
                                arr[j]=arr[j-1];
                            }
                            
                            
                        }
                        arr[i]=data;
                        break;
                    }
                   
                    i++;
                    
                }
                
                
            }
           
            
        }
        
    }
    public static int pop(int[] arr)
    {
        int res;
        if(top!=-1)
        {
            res=arr[top];
            top=top-1;
        }
        else
        {
            return -1;
        }
        
        return res;
    }
    public static int peek(int[] arr)
    {
        int res;
        if(top==-1)
            return -1;
        else
            res=arr[top];
        return res;
    }
    
}
