package reversestack;

import java.util.Stack;
import java.util.Scanner;
public class ReverseStack {

    
    public static void main(String[] args) {
        
        Stack<Integer> s=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        boolean flag=false;
        while(true)
        {
            System.out.print("The operation Push(1), Reverse(2), Print(3), exit(-1)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter an element");
                    push(s,sc.nextInt());
                    break;
                case 2:
                    reverse(s);
                    break;
                case 3:
                    print(s);
                    break;
                case -1:
                    flag=true;
                    break;
                    
            }
            if(flag)
                break;

        }
        
        
    }
    public static void print(Stack<Integer> s)
    {
        Integer[] a=new Integer[s.size()];
        for( Integer i : s.toArray(a))
        {
            System.out.println(i);
        }
    }
    public static void push(Stack<Integer> s,int data)
    {
        s.push(data);
    }
    public static void reverse(Stack<Integer> s)
    {
        int val;
        if(!s.isEmpty())
        {
            val=s.peek();
            System.out.println(val);
            
            s.pop();
            reverse(s);
            insertAtBottom(s,val);
        }
    }
    public static void insertAtBottom(Stack<Integer> s,int data)
    {
        int val;
        if(s.isEmpty())
            s.push(data);
        else
        {
           val=s.pop();
           insertAtBottom(s,data);
           s.push(val);
        }
            
    }
    
}
