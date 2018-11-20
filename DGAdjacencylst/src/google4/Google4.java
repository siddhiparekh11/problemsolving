
package google4;

//Adjacency list for directed graph

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class Google4 {

  public static void main(String[] args) {
    
    Graph g = new Graph(5);
  /*  g.addEdge(0, 1);
    g.addEdge(1, 0);
    g.addEdge(1, 2);
    g.addEdge(2, 1);
    g.addEdge(2, 3);
    g.addEdge(3, 2);
    g.addEdge(3, 4);
    g.addEdge(4, 3);
    g.addEdge(4, 2);
    g.addEdge(2, 4);
    g.addEdge(0, 2);
    g.addEdge(2, 0);*/
  
    g.addEdge(0,4);
    g.addEdge(0,1);
    g.addEdge(4,1);
    g.addEdge(4,3);
    g.addEdge(3,2);
    g.addEdge(1,2);
    
   // g.printGraph();
   // g.bfs(0);
    //g.iniVisited();
    g.dfs(0);
    
    
  }
  
}

class Graph{
  
  int V;
  LinkedList<Integer>[] edges;
  boolean visited[];
  
  Graph(int V){
    this.V=V;
    visited = new boolean[V];
    edges = new LinkedList[V];
    for(int i=0;i<V;i++){
      edges[i] = new LinkedList<Integer>();
    }
  }
  
  void addEdge(int src,int des)
  {
    edges[src].addFirst(des);
  }
  
  void printGraph(){
    for(int i=0;i<V;i++){
      ListIterator iterator = edges[i].listIterator();
      System.out.print(i + "->");
      while(iterator.hasNext()){
        System.out.print(iterator.next() + "->");
      }
      System.out.println();
    }
  }
  
  void bfs(int src){
    
    Queue<Integer> queue = new LinkedList<>();
    
    queue.add(src);
    visited[src]=true;
    while(!queue.isEmpty()){
      int res = queue.poll();
      System.out.print(res + "->");
      ListIterator<Integer> i = edges[res].listIterator();
      while(i.hasNext()){
        int ngbr = i.next();
        if(!visited[ngbr]){
          queue.add(ngbr);
          visited[ngbr]=true;
        }
      }
    }
  }
  
  void iniVisited(){
    for(int i=0;i<V;i++){
      visited[i]=false;
    }
  }
  
  void dfs(int src){
    
    Iterator<Integer> i = edges[src].iterator();
    System.out.print(src + "->");
    visited[src]=true;
    while(i.hasNext()){
      int neig=i.next();
      if(!visited[neig])
        dfs(neig);
    }
    
  }
  
}
