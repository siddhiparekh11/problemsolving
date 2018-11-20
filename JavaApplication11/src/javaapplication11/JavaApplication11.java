/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication11 {

    public static void main(String[] args) {
        
        Node node;
        Node head=new Node();
        head.data=0;
        head.prev=null;
        head.next=null;
        
        head=SortedInsert(head,1);
        head=SortedInsert(head,4);
        head=SortedInsert(head,2);
        head=SortedInsert(head,3);
        head=SortedInsert(head,7);
        head=SortedInsert(head,6);
        head=SortedInsert(head,9);
        head=SortedInsert(head,10);
        
        
        
        node=head;
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        
        
    }
   
    
    static Node SortedInsert(Node head,int data) {
    
    Node current, node,prev;
    prev=null;
    boolean flag=false;
    if(head.data==0)
    {
        head.data=data;
        head.prev=null;
        head.next=null;
    }
    else
    {
       current=head;
        
        while(current!=null)
        {
            
            if(data<=current.data)
            {
                node=new Node();
                node.data=data;
                node.next=current;
                node.prev=current.prev;
                if(node.prev==null)
                    head=node;
                
                current.prev=node;
                if(prev!=null)
                 prev.next=node;
                flag=true;
                break;
                
            }
            
           prev=current;
           current=current.next;
            
      }
        if(!flag)
        {
            node=new Node();
            node.data=data;
            node.next=null;
            node.prev=prev;
            prev.next=node;
        
        }
    }
    
  
    
  return head;
}

}
