
package google10;

import java.util.HashMap;


public class Vertex {
  
  private char val;
  private int des;
  private int hdes;
  private int hval;
  private boolean isadded;
  private boolean visited;
  private HashMap<Vertex,Integer> ngbr;
  private Vertex prev;
  
  Vertex(char val,int hdes){
    this.val=val;
    this.des = Integer.MAX_VALUE;
    this.hdes = hdes;
    visited=false;
    isadded=false;
    hval = Integer.MAX_VALUE;
    ngbr = new HashMap<>();
    prev=null;
  }
  
  void addEdge(Vertex des,int weight){
    ngbr.put(des, weight);
  }

  public int getDes() {
    return des;
  }

  public void setDes(int des) {
    this.des = des;
  }

  public boolean isVisited() {
    return visited;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public char getVal() {
    return val;
  }

  public HashMap<Vertex, Integer> getNgbr() {
    return ngbr;
  }

  public Vertex getPrev() {
    return prev;
  }

  public void setPrev(Vertex prev) {
    this.prev = prev;
  }

  public boolean isIsadded() {
    return isadded;
  }

  public void setIsadded(boolean isadded) {
    this.isadded = isadded;
  }

  public int getHdes() {
    return hdes;
  }

  public void setHdes(int hdes) {
    this.hdes = hdes;
  }

  public int getHval() {
    return hval;
  }

  public void setHval(int hval) {
    this.hval = hval;
  }
  
  
  
  
  
}
