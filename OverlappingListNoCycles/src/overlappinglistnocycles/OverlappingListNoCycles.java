
package overlappinglistnocycles;

public class OverlappingListNoCycles {


  public static void main(String[] args) {
    
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    
    n1.next = n2;
    n2.next=n1;
    n4.next=n5;
    n5.next=n6;
   n3.next=n4;
   n6.next=null;
    
    
    Node head1 = n1;
    Node head2 = n3;

    System.out.println(isOverlapCyclicList(head1,head2));
    /*traverse(head1);
    System.out.println();
    traverse(head2);
     System.out.println();
    System.out.println(isOverlap(head1,head2));*/
    
    
  }
  
 public static boolean containCycles(Node head){
   Node slow = head;
   Node fast = head;
   while(fast!=null && fast.next!=null){     
     slow = slow.next;
     fast = fast.next.next;
     if(slow==fast)
       return true;    
   }
   return false;
 } 
 
 public static boolean isOverlapCyclicList(Node head1,Node head2){
   boolean flag1,flag2;
   flag1 = containCycles(head1);
   flag2 = containCycles(head2);
   
   if(!flag1 && !flag2){
     return isOverlap(head1,head2);
   }else if((!flag1 && flag2) || (!flag2 && flag1)){
     return false; //if one list cyclic and other is not they do not overlap
   }else{
     Node temp1 = head1;
     Node temp2 = head2;
     do{
       temp1=temp1.next;
     }while(temp1!=head1 && temp1!=temp2);
     return (temp1==temp2)?true:false;
   }
   
 }
 
 public static boolean isOverlap(Node head1,Node head2){
   int l1 = length(head1);
   int l2 = length(head2);
   
   if(l1>l2){
     head1 = advanceListKPos(head1,l1-l2);
   }else if(l2>l1){
     head2 = advanceListKPos(head2,l2-l1);
   }
   while(head1!=null && head2!=null && head1!=head2){
     head1=head1.next;
     head2=head2.next;
   }
   if(head1==null)
     return false;
   return true;
 } 
  
 
 public static Node advanceListKPos(Node list,int k){
   Node temp = list;
   int c=1;
   while(c++<=k)
     temp=temp.next;
   return temp;
 } 
 
 public static int length(Node head){
   int c =1;
   if(head==null)
     return 0;
   Node temp = head;
   while(temp!=null){
     temp=temp.next;
     c++;
   }
   return c-1;
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
