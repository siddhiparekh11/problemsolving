
package addlinkedlistdigits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddLinkedListDigits {

  public static void main(String[] args) {
    
    Node head1 = null;
    head1 = createLinkedList(head1,5);
   head1 = createLinkedList(head1,6);
    head1 = createLinkedList(head1,3);  
    head1 = createLinkedList(head1,4);
   // traverseLinkedList(head1);
    
    System.out.println();
    
    Node head2 = null;
   head2=createLinkedList(head2,8);
   head2 = createLinkedList(head2,4);
    head2 = createLinkedList(head2,2);
    head2 = createLinkedList(head2,2);
   // traverseLinkedList(head2);
    
    List<Integer> list = new ArrayList<>();
    
    int len1 = calLength(head1);
    int len2 = calLength(head2);
    int diff = 0;
    int c=0;
    
    boolean isLenEq = true;
   
    List<Integer> list2 = new ArrayList<>();
    Node nhead1 = head1;
    Node nhead2 = head2;
    
    if(len1>len2){
      diff = len1-len2;      
      c =1;
      while(c<=diff){
        list2.add(nhead1.val);
        nhead1 = nhead1.next;
        c++;
      }
      isLenEq = false;
    }else if(len1 < len2){
      diff = len2-len1;     
      c =1;
      while(c<=diff){
        list2.add(nhead2.val);
        nhead2 = nhead2.next;
        c++;
      }     
      isLenEq = false;
    }
    int res = addLinkedList(nhead1,nhead2,list);
    
    //both the linkedlist have same length and carry is not zero
    if(isLenEq && res!=0){
        list.add(res);
    }
    
    Collections.reverse(list2);
    //both the linkedlist have different length 
    if(!isLenEq){
      for(int i=0;i<list2.size();i++){
        list.add((list2.get(i) + res)%10);
        res = res/10;
      }
    }
    
    
    Collections.reverse(list);
    System.out.println(list);
    
    
   
    
  }
  
 
  public static int calLength(Node head1){
    int count = 0;
    Node temp = head1;
    while(temp!=null){
      count++;
      temp=temp.next;
    }
    return count;
  }
  
  //add two linkedlist of the same length and return the carry
  public static int addLinkedList(Node head1,Node head2,List<Integer> list){
    if(head1==null && head2==null)
      return 0;
    int sum = 0;    
    sum+= addLinkedList(head1.next,head2.next,list) + head1.val + head2.val;
    list.add(sum%10);
    return sum/10;    
  }
  
  
  public static Node createLinkedList(Node head,int val){
    Node node = new Node();
    node.val=val;
    node.next=null;
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
      System.out.print(temp.val+" ->");
      temp=temp.next;
    }
  }
  
}

class Node {
  int val;
  Node next;
}
