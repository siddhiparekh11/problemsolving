
package google26;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

public class Google26 {

  public static void main(String[] args) {
    
    //add vertices
    Vertex A = new Vertex('a');
    Vertex B = new Vertex('b');
    Vertex C = new Vertex('c');
    Vertex D = new Vertex('d');
    Vertex E = new Vertex('e');
    
    
    //add edges
    
    B.addEdge(A,1);
    A.addEdge(C,1);
   // A.addEdge(B,1); for noncyclic graph
    C.addEdge(B,1);
  // B.addEdge(C,1); for noncyclic graph
    C.addEdge(D,1);    
    D.addEdge(E,1);
    
    
    
    
    System.out.println(detectCycle(A));
    
   
  }
  
  public static boolean detectCycle(Vertex start){
    
   
    Boolean result=false;
    if(start.isVisited==0)
      start.isVisited = 1;
    for(Map.Entry<Vertex,Integer> e:start.neighrs.entrySet()){
      Vertex n = e.getKey();
      if(n.isVisited==1)
        return true;
      if(n.isVisited!=2)
        result = detectCycle(e.getKey());      
    }
    start.isVisited=2;
    return result?true:false;
  }
  
}
