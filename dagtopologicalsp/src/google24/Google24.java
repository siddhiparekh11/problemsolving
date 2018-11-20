
package google24;
//shortest path DAG - topological sort

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Stack;

public class Google24 {

  public static void main(String[] args) {
    
    //add vertices
    Vertex A = new Vertex('a');
    Vertex B = new Vertex('b');
    Vertex C = new Vertex('c');
    Vertex D = new Vertex('d');
    Vertex E = new Vertex('e');
    Vertex F = new Vertex('f');
    Vertex G = new Vertex('g');
    Vertex H = new Vertex('h');
    
    //add edges
    A.addEdge(B, 3);
    A.addEdge(C, 6);
    
    B.addEdge(C, 4);
    B.addEdge(D, 4);
    B.addEdge(E, 11);
    
    C.addEdge(D,8);
    C.addEdge(G, 11);
    
    D.addEdge(E,-4);
    D.addEdge(F,5);
    D.addEdge(G,2);
    
    E.addEdge(H,9);
    F.addEdge(H, 1);
    F.addEdge(H, 2);
    
    //get the topological ordering
    Stack<Vertex> s = new Stack<>();
    topologicalOrd(A,s);
    ArrayList<Vertex> order = new ArrayList<>();
    while(!s.isEmpty())
      order.add(s.pop());
    
    //find shortest path
    A.setDis(0);
    shortestPathDAG(order);
    
    Vertex temp = H;
    while(temp!=null){
      System.out.println(temp.getC());
      temp = temp.getParent();
    }
    
    
   
  }
  
  public static void topologicalOrd(Vertex src,Stack<Vertex> s){
        
    src.isVisited=true;
    for(Map.Entry<Vertex,Integer> e:src.neighrs.entrySet()){
      if(!e.getKey().isVisited)
        topologicalOrd(e.getKey(),s);
    }
    s.push(src);
    
  }
  
  public static void shortestPathDAG(ArrayList<Vertex> order){
    
    for(int i=0;i<order.size();i++){
      for(Map.Entry<Vertex,Integer> e:order.get(i).neighrs.entrySet()){
        int d = (order.get(i).getDis())+e.getValue();
        if(e.getKey().getDis() > d){
          e.getKey().setDis(d);
          e.getKey().setParent(order.get(i));
        }
       }
    }
    
  }
  
}
