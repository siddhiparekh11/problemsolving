
package google5;

//matrix representation of a acyclic graph

import java.util.LinkedList;
import java.util.Queue;

public class Google5 {

  static final int V = 5;
  
  public static void main(String[] args) {
    
    int[][] mat = new int[V][V];
    
   // printGraph(mat);
    
    /*addEdge(mat,1,2);
    addEdge(mat,1,3);
    addEdge(mat,2,4);
    addEdge(mat,2,5);
    addEdge(mat,3,6);
    addEdge(mat,6,5);
    addEdge(mat,4,7);
    addEdge(mat,5,7);
    addEdge(mat,6,7);*/
    
    addEdge(mat,1,5);
    addEdge(mat,1,2);
    addEdge(mat,5,2);
    addEdge(mat,5,4);
    addEdge(mat,4,3);
    addEdge(mat,2,3);
    
   // printGraph(mat);
    //bfs(mat,1);
    dfs(mat,0,new boolean[V]);
    
  }
  
  public static void addEdge(int[][] mat,int src,int des){
    
    if(src>0 && des < V+1)
      mat[src-1][des-1]=1;
  }
  
  public static void printGraph(int[][] mat){
    
    for(int i=0;i<V;i++){
      for(int j=0;j<V;j++){
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static void bfs(int[][] mat,int src){
    
    Queue<Integer> q = new LinkedList<Integer>();
    boolean[] visited = new boolean[V];
    
    q.add(src-1);
    visited[src-1]=true;
    while(!q.isEmpty()){
      int item = q.poll();
      System.out.print((item +1) + "->");
      for(int i=0;i<V;i++){
        if((mat[item][i]!=0) && (!visited[i])){
          q.add(i);
          visited[i]=true;
        }
      }
    }
    
  }
  
  public static void dfs(int[][]mat,int src,boolean[] visited){
    
    System.out.print((src+1) + "->");
    visited[src]=true;
    for(int i=0;i<V;i++){
      if((mat[src][i]!=0) && (!visited[i])){
        dfs(mat,i,visited);
      }
    }
  }
  
}
