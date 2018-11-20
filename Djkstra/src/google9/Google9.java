
package google9;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class Google9 {

  
  public static void main(String[] args) {
    
    //adding the vertices
    Vertex va = new Vertex('A');
    Vertex vb = new Vertex('B');
    Vertex vc = new Vertex('C');
    Vertex vd = new Vertex('D');
    Vertex ve = new Vertex('E');
    Vertex vf = new Vertex('F');
    Vertex vg = new Vertex('G');
    
    //adding the edges with their corresponding weights
    va.addEdge(vb,4);
    va.addEdge(vc,3);
    va.addEdge(ve,7);
    vb.addEdge(va, 4);
    vb.addEdge(vc,6);
    vb.addEdge(vd, 5);
    vc.addEdge(va,3);
    vc.addEdge(vb,6);
    vc.addEdge(vd,11);
    vc.addEdge(ve,8);
    vd.addEdge(vb,5);
    vd.addEdge(vc, 11);
    vd.addEdge(ve, 4);
    vd.addEdge(vf, 2);
    vd.addEdge(vg, 10);
    ve.addEdge(va, 7);
    ve.addEdge(vc,8);
    ve.addEdge(vd, 2);
    ve.addEdge(vg, 5);
    vf.addEdge(vd, 2);
    vf.addEdge(vg, 3);
    vg.addEdge(vd, 10);
    vg.addEdge(vf, 3);
    vg.addEdge(ve, 5);
    
    va.setDes(0);
    PriorityQueue<Vertex> q = new PriorityQueue(7,new VertexComparator());
    q.add(va);
    djkstra(q,vf);
    
    System.out.println();
    System.out.println(va.getDes());
    System.out.println(vb.getDes());
    System.out.println(vc.getDes());
    System.out.println(vd.getDes());
    System.out.println(ve.getDes());
    System.out.println(vf.getDes());
    System.out.println(vg.getDes());
    
    
    Vertex temp = vf;
    while(temp!=null)
    {
      System.out.print(temp.getVal() + " ");
      temp=temp.getPrev();
    }
    
    
    
    
  }

  public static void djkstra(PriorityQueue<Vertex> q,Vertex goal){
    
    while(!q.isEmpty()){
      Vertex curr = q.poll();
      if(curr==goal)
        break;
      System.out.print(curr.getVal());
      curr.setVisited(true);
      for(Map.Entry<Vertex,Integer> e: curr.getNgbr().entrySet()){
        if(e.getKey().getDes()>(curr.getDes() + e.getValue())){
          e.getKey().setDes(curr.getDes() + e.getValue());
          e.getKey().setPrev(curr);
          }
        if((!e.getKey().isVisited()) && (!e.getKey().isIsadded())){
          e.getKey().setIsadded(true);
          q.add(e.getKey());
        }
      }
      
    }
    
  }  
  
  
}

class VertexComparator implements Comparator<Vertex>{

  @Override
  public int compare(Vertex o1, Vertex o2) {
    if(o1.getDes() > o2.getDes())
      return 1;
    else 
      return -1;
  }
}
