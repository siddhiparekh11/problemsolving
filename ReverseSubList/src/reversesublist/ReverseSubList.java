
package reversesublist;

public class ReverseSubList {

  public static void main(String[] args) {
    
    Node head = null;
    head = createList(head,11);
    head = createList(head,12);
    head = createList(head,13);
    head = createList(head,14);
    head = createList(head,15);
    head=createList(head,16);
    
    traverse(head);
    System.out.println();
    int s = 1;
    int e = 6;
    Node node = head;
    int k=1;
    while(k<s)
      node = node.next;
    
   //head = reverseSublist(head,s,e);
   node.next=reverseSublist(head,2,6);
    traverse(head);
    
  }
  
  public static Node reverseSublist(Node head,int s,int e){
    if(head==null)
      return null;
    if(s==e)
      return head;
    
    Node dummy = new Node();
    dummy.val = 0;
    dummy.next = head;
    
    int k=1;
    while(k<s){
      dummy=dummy.next;
      k++;
    }
    
    Node current = dummy.next;
    while(s++<e){
      Node temp = current.next;
      current.next = temp.next;
      temp.next = dummy.next;
      dummy.next=temp;
    }
    
    return dummy.next;
    
  }
  
  public static Node createList(Node head,int val){
    Node n = new Node();
    n.val = val;
    n.next = null;
    if(head==null){
      head = n;
    }else{
      Node temp = head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=n;
    }
    return head;
  }
  
  public static void traverse(Node head){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.val + "->");
      temp=temp.next;
    }    
  }
  
  
}

class Node {
  int val;
  Node next;
}