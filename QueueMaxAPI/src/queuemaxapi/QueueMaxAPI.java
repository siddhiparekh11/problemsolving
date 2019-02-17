
package queuemaxapi;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueMaxAPI {

  public static void main(String[] args) {
    Queue<Integer> q = new ArrayDeque<>();
    Deque<Integer> d = new ArrayDeque<>();
    
    enqueue(q,d,3);
    enqueue(q,d,1);
    enqueue(q,d,3);
    enqueue(q,d,2);
    enqueue(q,d,0);
    
    System.out.println(d);
    enqueue(q,d,1);
    System.out.println(d);
    deque(q,d);
    System.out.println(d);
    deque(q,d);System.out.println(d);
    enqueue(q,d,2);
    System.out.println(d);
    enqueue(q,d,4);
    System.out.println(d);
    deque(q,d);
    System.out.println(d);
    enqueue(q,d,4);
    System.out.println(d);
    System.out.println(q);
    
    
    
    
  }
  
  public static void enqueue(Queue<Integer> q,Deque<Integer> d,int val){
    q.add(val);
    while(!d.isEmpty() && d.peekLast()<val){
      d.removeLast();
    }
    d.addLast(val);
  }
  
  public static void deque(Queue<Integer> q,Deque<Integer> d){
    int res = q.remove();
    if(res==d.peekFirst()){
      d.removeFirst();
    }
    System.out.println(res);
  }
  
  public static void max(Deque<Integer> d){
    System.out.println(d.peekFirst());
  }
  
  
}
