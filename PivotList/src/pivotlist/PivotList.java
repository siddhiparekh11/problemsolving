
package pivotlist;

public class PivotList {


  public static void main(String[] args) {
    
    Node head = null;
    head = createList(head,7);
    head = createList(head,2);
    head = createList(head,2);
    head = createList(head,11);
    head = createList(head,7);
    head=createList(head,5);
    head = createList(head,11);
    
    traverse(head);
    System.out.println();
    head = pivotList(head,7);
    traverse(head);
    
  }
  
  public static Node pivotList(Node head,int pivot){
    //three heads
    Node lessHead = new Node(0);
    Node greatrHead = new Node(0);
    Node eqlHead = new Node(0);
    
    //three iterator
    Node lIter = lessHead;
    Node eIter = eqlHead;
    Node gIter = greatrHead;
    
    Node iter = head;
    
    while(iter!=null){
      if(iter.val<pivot){
        lIter.next=iter;
        lIter=iter;
      }else if(iter.val==pivot){
        eIter.next=iter;
        eIter=iter;
      }else{
        gIter.next=iter;
        gIter=iter;
      }
      iter=iter.next;
    }
    
    lIter.next=eqlHead.next;
    eIter.next = greatrHead.next;
    gIter.next =null;
    
    return lessHead.next;
    
    
   
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
  Node(){
    
  }
  Node(int val){
    this.val=val;
    this.next=null;
  }
}
