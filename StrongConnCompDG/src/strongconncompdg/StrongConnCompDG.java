
package strongconncompdg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StrongConnCompDG {

  public static void main(String[] args) {
    
    //int[][] graph = {{0,1,0,0,0,0},{0,0,1,0,0,0},{1,0,0,0,1,0},{0,0,0,0,1,0},{0,0,0,0,0,1},{0,0,0,1,0,0}};
    int[][] graph ={{0,0,1,1,0},{1,0,0,0,0},{0,1,0,0,0},{0,0,0,0,1},{0,0,0,0,0}};
    int[][] transpose = new int[graph[0].length][graph.length];
    
    for(int j=0;j<graph[0].length;j++){
      for(int i=0;i<graph.length;i++){
        transpose[j][i] = graph[i][j];
      }
    } 
    
    Stack<Integer> stack = new Stack<>();
    boolean[] visited = new boolean[graph.length];
    
    for(int i=0;i<graph.length;i++){
        if(!visited[i]){
          dfs(graph,stack,visited,i);
        }
      }
    
    Arrays.fill(visited,false);
    List<List<Integer>> connCom = new ArrayList<>();
    
    while(!stack.isEmpty()){
      Stack<Integer> res = new Stack<Integer>();
      int v = stack.pop();
      if(!visited[v]){
        dfs(transpose,res,visited,v);
        List<Integer> inn = new ArrayList<>();
        while(!res.isEmpty())
          inn.add(res.pop());
        connCom.add(inn);
      }     
    }
    
    for(int i=0;i<connCom.size();i++){
      for(int j=0;j<connCom.get(i).size();j++){
        System.out.print(connCom.get(i).get(j));
      }
      System.out.println();
    }
    
    
  }
  
  
  
  public static void dfs(int[][]graph,Stack<Integer> stack,boolean[] visited,int r){
    
    visited[r]=true;
    for(int i=0;i<graph[r].length;i++){
      if(!visited[i] && graph[r][i]==1){
        dfs(graph,stack,visited,i);
      }
    }
    stack.add(r);  
    
  }
  
}
