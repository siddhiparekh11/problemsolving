
package google10;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;


public class Google10 {

 
  public static void main(String[] args) {
    
    //adding the vertices
   /* Vertex vs = new Vertex('S',10);
    Vertex va = new Vertex('A',9);
    Vertex vb = new Vertex('B',7);
    Vertex vc = new Vertex('C',8);
    Vertex vd = new Vertex('D',8);
    Vertex ve = new Vertex('E',0);
    Vertex vf = new Vertex('F',6);
    Vertex vg = new Vertex('G',3);
    Vertex vh = new Vertex('H',6);
    Vertex vl = new Vertex('L',6);
    Vertex vi = new Vertex('I',4);
    Vertex vj = new Vertex('J',4);
    Vertex vk = new Vertex('K',3);
    
    
    //adding the edges with their corresponding weights
    va.addEdge(vs, 7);
    va.addEdge(vb, 3);
    va.addEdge(vd, 4);
    vs.addEdge(va, 9);
    vs.addEdge(vc, 3);
    vs.addEdge(vb, 2);
    vb.addEdge(vs, 2);
    vb.addEdge(va,3);
    vb.addEdge(vd, 4);
    vb.addEdge(vh, 1);
    vd.addEdge(va, 4);
    vd.addEdge(vb, 4);
    vd.addEdge(vf, 5);
    vh.addEdge(vb, 1);
    vh.addEdge(vf, 3);
    vh.addEdge(vg, 2);
    vf.addEdge(vd, 5);
    vf.addEdge(vh, 3);
    vg.addEdge(vh, 2);
    vg.addEdge(ve, 2);
    ve.addEdge(vg, 2);
    ve.addEdge(vk, 5);
    vk.addEdge(ve, 5);
    vk.addEdge(vi, 4);
    vk.addEdge(vj, 4);
    vj.addEdge(vk,4);
    vj.addEdge(vi, 6);
    vi.addEdge(vk, 4);
    vi.addEdge(vj, 6);
    vj.addEdge(vl, 4);
    vi.addEdge(vl, 4);
    vl.addEdge(vi, 4);
    vl.addEdge(vj, 4);
    vl.addEdge(vc, 2);
    vc.addEdge(vl, 2);
    vc.addEdge(vs, 3);
    
    
    vs.setDes(0);
    PriorityQueue<Vertex> q = new PriorityQueue(7,new VertexComparator());
    vs.setHval(vs.getDes()+vs.getHdes());
    q.add(vs);
    asearch(q,ve);
    
    
    
    
    Vertex temp = ve;
    while(temp!=null)
    {
      System.out.print(temp.getVal() + " ");
      temp=temp.getPrev();
    }*/
   
   //adding the vertices
    Vertex va = new Vertex('A',3);
    Vertex vb = new Vertex('B',2);
    Vertex vc = new Vertex('C',2);
    Vertex vd = new Vertex('D',1);
    Vertex ve = new Vertex('E',2);
    Vertex vf = new Vertex('F',0);
    Vertex vg = new Vertex('G',1);
    
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
    va.setHval(va.getDes()+va.getHdes());
    q.add(va);
    asearch(q,vf);
    
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

  public static void asearch(PriorityQueue<Vertex> q,Vertex goal){
   
    while(!q.isEmpty()){
      Vertex curr = q.poll();
      if(curr==goal)
        break;
      //System.out.print(curr.getVal());
      curr.setVisited(true);
      for(Map.Entry<Vertex,Integer> e: curr.getNgbr().entrySet()){
        if(e.getKey().getDes()>(curr.getDes() + e.getValue())){
          e.getKey().setDes(curr.getDes() + e.getValue());
          }
        int h = e.getKey().getDes() + e.getKey().getHdes();
        if((!e.getKey().isVisited()) && (!e.getKey().isIsadded())){
          e.getKey().setHval(h);
          e.getKey().setIsadded(true);
          e.getKey().setPrev(curr);
          q.add(e.getKey());
        }else{
          if(e.getKey().getHval()>h){
            e.getKey().setHval(h);
            e.getKey().setPrev(curr);
          }
        }
        
      }
      
    }
    
  }
  
  
}

class VertexComparator implements Comparator<Vertex>{

  @Override
  public int compare(Vertex o1, Vertex o2) {
    if((o1.getHval()) >= (o2.getHval()))
      return 1;
    else 
      return -1;
  }
  
}
