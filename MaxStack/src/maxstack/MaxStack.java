
package maxstack;


import java.util.LinkedList;
import java.util.Scanner;


public class MaxStack {

    private static Node top;
    public static void main(String[] args) {
        
        LinkedList<Node> arr=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        
        int choice;
        boolean flag=false;
        int val;
        
        while(true)
        {
            System.out.println("Enter the operatio push(1), pop(2), max(3), exit(-1)");
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
                        System.out.println("The popped element is " + val) ;
                    else
                        System.out.println("The stack is empty");
                    break;
                    
                case 3:
                    val=max(arr);
                    if(val!=-1)
                        System.out.println("The max element is " + val) ;
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
    
    public static  void push(LinkedList<Node> arr,int data)
    {
          Node n=new Node();
          n.data=data;
          if(top==null || (data>=top.maxUntilNow))
              n.maxUntilNow=data;
          else
              n.maxUntilNow=top.maxUntilNow;
          n.next=top;
          top=n;
          
        
    }
    public static int pop(LinkedList<Node> arr)
    {
       int res;
        if(top==null)
       {
           
           return -1;
       }
       res=top.data;
       top=top.next;
       return res;
    }
    
    public static int max(LinkedList<Node> arr)
    {
        int res;
        if(top==null)
            return -1;
        else
            res=top.maxUntilNow;
        return res;
    }
    
}
