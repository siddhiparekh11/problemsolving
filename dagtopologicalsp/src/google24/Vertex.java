
package google24;

import java.util.HashMap;

public class Vertex {
  
  char c;
  HashMap<Vertex,Integer> neighrs;
  boolean isVisited;
  int dis;
  Vertex parent;
  
  Vertex(char c){
    this.c = c;
    this.neighrs = new HashMap<>();
    isVisited = false;
    dis=Integer.MAX_VALUE;
    parent= null;
  }

  public char getC() {
    return c;
  }

  public void setC(char c) {
    this.c = c;
  }

  public HashMap<Vertex, Integer> getNeighrs() {
    return neighrs;
  }

  public void addEdge(Vertex v, int val){
    this.neighrs.put(v,val);
  }

  public boolean isIsVisited() {
    return isVisited;
  }

  public void setIsVisited(boolean isVisited) {
    this.isVisited = isVisited;
  }

  public int getDis() {
    return dis;
  }

  public void setDis(int dis) {
    this.dis = dis;
  }

  public Vertex getParent() {
    return parent;
  }

  public void setParent(Vertex parent) {
    this.parent = parent;
  }
  
  
  
  
  
  
  
}
