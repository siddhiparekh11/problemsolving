
package bidirectionalsearch;

import java.util.ArrayList;

public class Vertex {
  
 int val;
 ArrayList<Vertex> nghbr;
 
 Vertex(int val){
   this.val = val;
   nghbr = new ArrayList<>();
 }
 
 public void addEdge(Vertex v){
   nghbr.add(v);
 }
 
  
}
