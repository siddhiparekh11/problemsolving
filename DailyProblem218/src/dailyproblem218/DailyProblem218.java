//reverse a directed graph - transpose of graph matrix
package dailyproblem218;

import java.util.LinkedList;


public class DailyProblem218 {

  public static void main(String[] args) {    
    
    //matrix representation
   /* int[][] graph = {{0,1,0,1},{0,0,1,0},{0,0,0,0},{0,0,1,0}};
    int[][] transpose = new int[graph.length][graph[0].length];    
    for(int j=0;j<graph[0].length;j++){
      for(int i=0;i<graph.length;i++){
        transpose[j][i] = graph[i][j];
        System.out.print(transpose[j][i]);
      }      
      System.out.println();
    }*/
    
    //list representation
    LinkedList<Integer>[] lgraph = new LinkedList[4];
    LinkedList<Integer>[] tgraph = new LinkedList[4];
    
    for(int i=0;i<4;i++){
      lgraph[i] = new LinkedList<Integer>();
      tgraph[i] = new LinkedList<Integer>();
    }
    
    lgraph[0].add(0);
    lgraph[0].add(1);
    lgraph[0].add(0);
    lgraph[0].add(1);
    
    lgraph[1].add(0);
    lgraph[1].add(0);
    lgraph[1].add(1);
    lgraph[1].add(0);
    
    lgraph[2].add(0);
    lgraph[2].add(0);
    lgraph[2].add(0);
    lgraph[2].add(0);
    
    lgraph[3].add(0);
    lgraph[3].add(0);
    lgraph[3].add(1);
    lgraph[3].add(0);
    
    
    for(int i=0;i<lgraph.length;i++){
      for(int j=0;j<lgraph[i].size();j++){        
          tgraph[j].add(i,lgraph[i].get(j));        
      }
    }
    
    for(int i=0;i<tgraph.length;i++){
      for(int j=0;j<tgraph[i].size();j++){
        System.out.print(tgraph[i].get(j));        
      }
      System.out.println();
    }   
    
    
  }
  
}
