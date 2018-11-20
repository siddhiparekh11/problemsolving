
package queueusingstacks;

import java.util.Stack;
import java.util.Scanner;


public class QueueUsingStacks {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Stack<Integer> newStack=new Stack<>();
        Stack<Integer> oldStack=new Stack<>();
        
        int choice;
        boolean flag=false;
        int val;
        while(true)
        {
            System.out.println("Enter operation enqueue(1), dequeue(2), exit(-1)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter element");
                    enqueue(newStack,sc.nextInt());
                    break;
                case 2:
                    val=dequeue(newStack,oldStack);
                    if(val!=-1)
                        System.out.println("The dequeued element is " + val);
                    else
                        System.out.println("The queue is empty");
                    break;
                case -1:
                    flag=true;
                    break;
            }
            if(flag)
                break;
               
            
        }
        
    }
    public static void enqueue(Stack<Integer> newStack,int data)
    {
        newStack.push(data);
        
    }
    public static int dequeue(Stack<Integer> newStack,Stack<Integer> oldStack)
    {
        boolean flag=false;
        int res;
        if(oldStack.empty())
        {
           while(!newStack.empty())
           {
               oldStack.push(newStack.pop());
               flag=true;
               
           }
           if(!flag)
               return -1;
           
               
        }
        res=oldStack.pop();
        return res;
    }
    
    
    
    
}
