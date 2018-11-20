
package google25;

//finding cycles in undirected graph - union find method

import java.util.HashMap;

public class Google25 {
  
  HashMap<Integer,Node> nodes  = new HashMap<>();

  public static void main(String[] args) {
    
    Google25 g = new Google25();
    
    g.makeSet(0);
    g.makeSet(1);
    g.makeSet(2);
    g.makeSet(3);
    g.makeSet(4);
    
    System.out.println(g.unionSets(0, 1));
    System.out.println(g.unionSets(1, 2));
    System.out.println(g.unionSets(2, 0));
    System.out.println(g.unionSets(0, 3));
    System.out.println(g.unionSets(3, 4));
    
    
  }
  
  public void makeSet(int val){
    
    Node n = new Node();
    n.data = val;
    n.parent = n;
    n.rank = 0;
    nodes.put(val, n);
    
  }
  
  public Node findSetParent(Node set){
    Node p = set.parent;
    if(set==p)
      return p;
    p.parent = findSetParent(set.parent); // path compression
    return p;
  }
  
  public boolean unionSets(int v1,int v2){
    
    Node node1 = nodes.get(v1);
    Node node2 = nodes.get(v2);
    
    //find the parents
    Node parent1 = findSetParent(node1);
    Node parent2 = findSetParent(node2);
    
    if(parent1==parent2) //cycle detected
      return false;
    
    if(parent1.rank > parent2.rank){
      parent2.parent = parent1;
    }else if(parent2.rank > parent1.rank){
      parent1.parent = parent2;
    }else{
      parent1.rank = parent1.rank + 1;
      parent2.parent = parent1;
    }
    return true;
  }
  
}
