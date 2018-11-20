
package queue;

import java.util.Scanner;

public class Queue {

    private static Node head,front,rear;
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int opr,item;
        opr=item=0;
        head=front=rear=null;
        int i=0;
        System.out.println("Enter 1 for enqueue and 2 for dequeue");
        while(true)
        {
            opr=sc.nextInt();
            switch(opr)
            {
                case 1:
                    item=++i;
                    enqueue(item);
                    break;
                case 2:
                    dequeue();
                    break;
            }
           System.out.println("Do you want to continue? Y/N, enter -1 to exit");
           
           if(opr==-1)
               break;
            
        }
        
        
    }
    public static void enqueue(int item)
    {
        Node n=new Node();
        n.data=item;
        n.next=null;
        
            if(head==null)
            {
                head=n;
                front=rear=head;
            }
            else
            {
                rear.next=n;
                rear=n;
            }
        
    }
    public static void dequeue()
    {
        if(front==null)
        {
            System.out.println("There are no items in the queue");
        }
        else
        {
            System.out.println("The item deleted is " + front.data);
            front=front.next;
            head=front;
            if(front==null)
                rear=front;
        }
        
    }
    
}
