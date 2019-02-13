
package clonelinkedlist;

public class CloneLinkedList {

  public static void main(String[] args) {
    
    Node head = null;
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    
    head = createLinkedList(head,n1,n1);
    head = createLinkedList(head,n2,n3);
    head = createLinkedList(head,n3,n2);
    head = createLinkedList(head,n4,n2);
    
    traverseLinkedList(head);
    System.out.println();
    Node head1 = null;
    head1 = createClone(head,head1);
   // traverseLinkedList(head1); will throw error as initially all random null
    head1 = changePointers(head,head1);
    head1 = changeRandom(head1);
    traverseLinkedList(head1);
    
    
  }
  
public static Node changePointers(Node head,Node head1){  
  Node temp = head;
  Node temp1 = head1;
  Node n = head;
  while(temp1!=null){
    n = n.next;
    temp.next = temp1;
    temp1.random = temp;
    temp1=temp1.next;    
    temp = n;
  }  
  return head1;                                                                                                                                                                                                                                                                    
}  

public static Node changeRandom(Node head1){
  Node temp = head1;
  while(temp!=null){
    temp.random = temp.random.random.next;
    temp = temp.next;
  }
  return head1;
}


  
 public static Node createClone(Node head,Node head1){
   Node temp = head;
   while(temp!=null){
     Node node = new Node(temp.val);
     head1 = createLinkedList(head1,node,null);
     temp=temp.next;
   }
   return head1;
 } 
  
 public static Node createLinkedList(Node head,Node node,Node random){
    node.random = random;
    if(head==null){
      head = node;
      return head;
    }else{
      Node temp = head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=node;
      return head;
    }
  }
  
  public static void traverseLinkedList(Node head){
    if(head==null)
      return;
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.val+" ->"+temp.random.val+"=>");
      temp=temp.next;
    }
  }
  
}

class Node {
  int val;
  Node next;
  Node random;
  Node(int val){
    this.val = val;
    this.next=null;
    this.random = null;
  }
}
