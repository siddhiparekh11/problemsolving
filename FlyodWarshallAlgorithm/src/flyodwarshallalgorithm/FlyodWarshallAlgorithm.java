
package flyodwarshallalgorithm;

//complexity is o(n3)
public class FlyodWarshallAlgorithm {

  public static void main(String[] args) {
    
    int[][] graph = {{0,5,99999,10},{99999,0,3,99999},{99999,99999,0,1},{99999,99999,99999,0}};
    floydMarshal(graph);
    printGraph(graph);
    
  }
  
  public static void floydMarshal(int[][] graph){
    
    //taking every vertex as intermediate vertex
    for(int k=0;k<graph.length;k++){
      //for all intermediate vertex we are calculating the solution matrix
      for(int i=0;i<graph.length;i++){
        for(int j=0;j<graph.length;j++){
          
          graph[i][j] = Math.min(graph[i][j], graph[i][k]+graph[k][j]);
          
        }
      }
    }
    
  }
  
  public static void printGraph(int[][] graph){
    
    for(int i=0;i<graph.length;i++){
      for(int j=0;j<graph.length;j++){
        System.out.print(graph[i][j] + " ");
      }
      System.out.println();
    }
  }
  
}
