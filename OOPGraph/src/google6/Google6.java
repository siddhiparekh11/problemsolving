
package google6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Google6 {

  public static void main(String[] args) {
    
    Vertex v1 = new Vertex(1);
    Vertex v2 = new Vertex(2);
    Vertex v3 = new Vertex(3);
    Vertex v4 = new Vertex(4);
    Vertex v5 = new Vertex(5);
    
    v1.addEdge(v5);
    v1.addEdge(v2);
    v2.addEdge(v3);
    v5.addEdge(v4);
    v5.addEdge(v2);
    v4.addEdge(v3);
    
    bfs(v1);
    
     
  }
  
  public static void bfs(Vertex start){
    
    Queue<Vertex> q = new LinkedList<>();
    q.add(start);
    start.visited=true;
    
    while(!q.isEmpty()){
      Vertex curr = q.poll();
      System.out.print(curr.val + "->");
      Iterator<Vertex> i = curr.ngbr.iterator();
      while(i.hasNext()){
        Vertex v = i.next();
        if((!v.visited)){
          v.visited=true;
          q.add(v);
        }
      }
    }
    
    
  }
  
  
}


