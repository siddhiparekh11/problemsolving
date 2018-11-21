
package dailycodingprb145;

//Given the head of singlylinkedlist swap every two nodes
//1->2->3->4 to 2->1->4->3
//1->2->3->4->5 to 2->1->4->3->5

public class DailyCodingPrb145 {

  public static void main(String[] args) {
    
    Node head = createNode(null,1);
    head = createNode(head,2);
    head = createNode(head,3);
    head = createNode(head,4);
    head = createNode(head,5);
    head = createNode(head,6);
    head = createNode(head,7);
    printNode(head);
    swapNodes(head);
    System.out.println();
    printNode(head);
    
    
    
  }
  
  public static void swapNodes(Node head){
    
    Node prev,curr;
    if(head==null || (head.next==null))
      return;
    prev = head;
    curr = head.next;
    while(curr!=null){
      int temp = prev.val;
      prev.val = curr.val;
      curr.val = temp;
      
      prev = curr.next;
      curr = prev!=null?prev.next:null;
     /* if(prev!=null)
        curr = prev.next;
      else
        curr = null;*/
    }
    
    
  }
  
  public static void printNode(Node head){
    Node node = head;
    while(node!=null){
      System.out.print(node.val);
      if(node.next!=null)
        System.out.print("->");
      node=node.next;
    }    
  }
  
  
  public static Node createNode(Node head,int v){
    if(head==null){
      Node node = new Node();
      node.val=v;
      node.next=null;
      head=node;
    }else{
      Node node = head;
      while(node.next!=null)
        node = node.next;
      node.next = new Node();
      node.next.val = v;
      node.next.next=null;      
    }
    return head;
  }
  
}
class Node {
    int val;
    Node next;
}