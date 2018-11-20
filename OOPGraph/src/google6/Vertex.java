
package google6;

import java.util.LinkedList;


public class Vertex {
  
  int val;
  LinkedList<Vertex> ngbr;
  boolean visited;
  
  Vertex(int val){
    this.val = val;
    this.visited=false;
    ngbr = new LinkedList<Vertex>();
  }
  
  public void addEdge(Vertex end){
    this.ngbr.add(end);
  }
  
}
