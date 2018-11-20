
package sortstackrecursion;

import java.util.Stack;


public class SortStackrecursion {

   
    public static void main(String[] args) {
        
        Stack<Integer> stack=new Stack<>();
        
        Stack<Integer> stack1=new Stack<>();
        
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);
        stack1.add(4);
        stack1.add(5);
        
        System.out.println(stack1.peek());
        
        
        
        sortstack(stack,13);
        sortstack(stack,22);
        sortstack(stack,31);
        sortstack(stack,4);
        sortstack(stack,25);
        
        System.out.println(stack.peek());
        
    }
    
    public static void sortstack(Stack<Integer> stack,int data)
    {
       
        if(stack.isEmpty())
        {
            stack.push(data);
            return;
        }
        int temp=stack.peek();
        if(temp>data)
        {
            stack.push(data);
            return;
        }
        temp=stack.pop();
        sortstack(stack,data);
        stack.push(temp);
        
        
            
    }
    
}
