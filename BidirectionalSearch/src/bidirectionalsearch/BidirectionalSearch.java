
package bidirectionalsearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BidirectionalSearch {

  public static void main(String[] args) {
    
    //add vertices
    
    Vertex a = new Vertex(0);
    Vertex b = new Vertex(1);
    Vertex c = new Vertex(2);
    Vertex d = new Vertex(3);
    
    Vertex e = new Vertex(4);
    Vertex f = new Vertex(5);
    
    Vertex g = new Vertex(6);
    Vertex h = new Vertex(7);
    Vertex i = new Vertex(8);
    Vertex j = new Vertex(9);
    Vertex k = new Vertex(10);
    Vertex l = new Vertex(11);
    Vertex m = new Vertex(12);
    Vertex n = new Vertex(13);
    Vertex o = new Vertex(14);
    
    
    
    //add edges
    
    a.addEdge(e);
    e.addEdge(a);
    
    b.addEdge(e);
    e.addEdge(b);
    
    c.addEdge(f);
    f.addEdge(c);
    
    d.addEdge(f);
    f.addEdge(d);

    e.addEdge(g);
    g.addEdge(e);
    
    f.addEdge(g);
    g.addEdge(f);
    
    g.addEdge(h);
    h.addEdge(g);
    
    h.addEdge(i);
    i.addEdge(h);
    
    i.addEdge(j);
    j.addEdge(i);
    
    i.addEdge(k);
    k.addEdge(i);
    
    j.addEdge(l);
    l.addEdge(j);
    
    j.addEdge(m);
    m.addEdge(j);
    
    k.addEdge(n);
    n.addEdge(k);
    
    k.addEdge(o);
    o.addEdge(k);
    
    //bfs and calculating 
    

    
    boolean[] visited1 = new boolean[15];
    boolean[] visited2 = new boolean[15];
    
    
    bfs(a,n,visited1,visited2);
    
    
    
    
    
    
    
    
    
  }
  
  public static void bfs(Vertex start,Vertex goal,boolean[] visited1,boolean[] visited2){
    
    Queue<Vertex> queue1 = new LinkedList<Vertex>();
    Queue<Vertex> queue2 = new LinkedList<Vertex>();
    queue1.add(start);
    queue2.add(goal);
    Vertex intersecting = null;
    boolean flag=false;
   
    visited1[start.val] = true;
    visited2[goal.val]=true;
    
    while(!queue1.isEmpty() && !queue2.isEmpty()){
      Vertex temp1 = queue1.poll();
      Vertex temp2 = queue2.poll();
      for(int i=0;i<temp1.nghbr.size();i++){         
        if(!visited1[temp1.nghbr.get(i).val]){
          visited1[temp1.nghbr.get(i).val]=true;
          if(visited2[temp1.nghbr.get(i).val] && (!flag)){
            flag=true;
            intersecting = temp1.nghbr.get(i);
            System.out.println("Queue1");
          }
           visited1[temp1.val]=true;
          queue1.add(temp1.nghbr.get(i));
        }
      }
      for(int i=0;i<temp2.nghbr.size();i++){        
        if(!visited2[temp2.nghbr.get(i).val]){
          visited2[temp2.nghbr.get(i).val] = true;
          if(visited1[temp2.nghbr.get(i).val] && !flag){
            flag=true;
            intersecting = temp2.nghbr.get(i);
            System.out.println("Queue2");
          }
          queue2.add(temp2.nghbr.get(i));
        }
      }
      
    }
    
    System.out.println(intersecting.val);
  }
  
  
}
