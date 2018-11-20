
package setofstacks;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class SetOfStacks {

    
    private static ArrayList<Stack<Integer>> s;
    private static int cap;
    private static int count;
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        s=new ArrayList<Stack<Integer>>();
        
        
        System.out.println("Enter the maximum capacity of each stack");
        cap=sc.nextInt();
        System.out.println("cap " + cap);
        
        int choice;
        boolean flag=false;
        int val;
        
        while(true)
        {
            System.out.println("Enter the operatio push(1), pop(2), popAtIndex(3), print(4), exit(-1)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter data");
                    push(sc.nextInt());
                    break;
                case 2:                    
                    val=pop();
                    if(val!=-1)
                        System.out.println("The popped element is " + val) ;
                    else
                        System.out.println("The stack is empty");
                    break;
                case 3:
                    System.out.println("Enter the index of the stack");
                    val=sc.nextInt();
                    if(val>=0 && val<s.size())
                        System.out.println("The popped element is " + popIndex(val));
                    else
                        System.out.println("The index of stack is invalid or stack is empty");
                    break; 
               
                case 4:
                    printStacks();
                    break;
                    
               
                case -1:
                    flag=true;
                    break;
                    
            }
            if(flag)
                break;
            
            
        }
        
    }
    
    public static void push(int data)
    {
        Stack<Integer> last=getLastStack();
        if(last!=null && count<cap)
        {
            //System.out.println(last.size());
            last.push(data);
           // System.out.println(count);
            count++;
            
        }
        else
        {
            Stack<Integer> n=new Stack<Integer>();
            count=0;
            n.push(data);
            count=count+1;
            s.add(n);
            System.out.println("New stack has been added");
        }
        
    }
    
    public static int pop()
    {
        int res=-1;
        Stack<Integer> last=getLastStack();
        if(last==null)
            return -1;
        if(last.size()!=0)
            res=last.pop();  
        if(last.size()==0)
        {
            s.remove(s.size()-1);
            System.out.println("Stack has been removed");
        }
        return res;
    }
    
    public static int popIndex(int ind)
    {
        return rearrangeStacks(ind,true);
    }
    
    public static int rearrangeStacks(int ind, boolean removedTop)
    {
        int res;
        
        if(removedTop)
        {
            res=s.get(ind).pop();
        }
        else
        {
            res=s.get(ind).lastElement();
            s.get(ind).remove(s.get(ind).lastElement());
            
            
        }
        if(s.get(ind).size()==0)//base condition
        {
                s.remove(ind);
                
                
        }
        else
        {
            if((ind-1)>=0)
                s.get(ind).add(0,rearrangeStacks(ind-1,false));
        }
        
        return res;
    }
    
    public static Stack<Integer> getLastStack()
    {
        if(s.size()==0)
            return null;
        return s.get(s.size()-1);
    }
    
    public static void printStacks()
    {
        if(!s.isEmpty())
        {
            for(int i=0;i<s.size();i++)
            {
                System.out.println(s.get(i));
            }
        }
        else
        {
            System.out.println("Stack is empty");
        }
        
    }
}
