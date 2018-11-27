
package lru;

import java.util.HashMap;
import java.util.LinkedList;


/*
  1 - Apple
  2 - Orange
  3 - Lemon
  4 - Water Melon
  5 - Guava

*/

public class LRU {

    private static int cacheSize = 5;
    private static LinkedList<Node> doublyList = new LinkedList<>();
    private static HashMap<Integer,Node> map = new HashMap<>();
    private static Node head,tail;
  
  public static void main(String[] args) {    
    head=tail=null;
    
    setKey(1,"Apple");
    setKey(2,"Orange");
    setKey(3,"Lemon");
    setKey(4,"Water Melon");
    setKey(5,"Guava");
    
    printList();
    
   
    
    System.out.println(getValue(2));
    
    printList();
    
    System.out.println(getValue(3));
    
    printList();
    
    
    setKey(1,"Chickoo");    
    printList();
    
    setKey(6,"Eggplant");
    
    printList();
    
    
    
    
    
    
    
    
    
  }
  
  public static void printList(){
    Node node = head;
    System.out.println();
    while(node!=null){
      System.out.println(node.key + " " + node.val);
      node = node.next;
    }
  }
  
  public static String getValue(int key){
    Node item = map.get(key);
    if(item==null)
      return "No items found";
    if(head!=item){
      removeFromList(item);
      insertInFront(item);
    }
      return item.val;
  }
  
  public static void removeFromList(Node item){
    if(item==null)
      return;
    
    if(item.prev!=null)
      item.prev.next = item.next;
    if(item.next!=null)
      item.next.prev = item.prev;
    
    //if the node we are deleting is the last node    
    if(item==tail)
      tail = item.prev;       
    //if the node we are deleting is the first node    
    if(item==head)
      head = item.next;    
  }
  
  public static void insertInFront(Node item){
    
    if(head==null){
      head = tail = item;
      return;
    }
    head.prev = item;
    item.next = head;
    head = item;   
  }
  
  public static void removeKey(int key){
    Node item = map.get(key);
    removeFromList(item);
    map.remove(key);
  }
  
  public static void setKey(int key,String val){
    //remove key if it already exists
    if(map.containsKey(key))
      removeKey(key);
    
    //if the cache has reached its maximum size
    if(map.size()==cacheSize && tail!=null){
      removeKey(tail.key);
    }
    
    //inserting the new node
    Node node = new Node(key,val);
    insertInFront(node);
    map.put(key, node);
    
  }
  
}



class Node {
  int key;
  String val;
  Node prev,next;
  Node(int key,String val){
    this.key = key;
    this.val = val;
  }
}
