
package conncomudg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnComUDG {

  public static void main(String[] args) {
    
    LinkedList<Integer>[] graph = new LinkedList[5];
    
    for(int i=0;i<5;i++){
      graph[i] = new LinkedList<Integer>();
    }
    
    graph[0].add(1);
    graph[1].add(0);
    graph[1].add(2);
    graph[2].add(1);
    graph[3].add(4);
    graph[4].add(3);
    
    boolean[] visited = new boolean[5];
    
    List<List<Integer>> res = new ArrayList<>();
    for(int i=0;i<graph.length;i++){
      if(!visited[i]){
        res.add(bfs(graph,visited,i));
      }
    }
    
    for(int i=0;i<res.size();i++){
      for(int j=0;j<res.get(i).size();j++){
        System.out.print(res.get(i).get(j));
      }
      System.out.println();
    }
    
  }
  
  public static List<Integer> bfs(LinkedList<Integer>[] graph,boolean[] visited, int ind){
    
      Queue<Integer> queue = new LinkedList<>();
      queue.add(ind);
      visited[ind]=true;
      List<Integer> res = new ArrayList<>();
      
      while(!queue.isEmpty()){
        int v = queue.poll();
        res.add(v);
        for(int i=0;i<graph[v].size();i++){
          int n = graph[v].get(i);
          if(!visited[n]){
            visited[n]=true;
            queue.add(n);
          }
        }
      }
      
    return res;
  }
  
}
