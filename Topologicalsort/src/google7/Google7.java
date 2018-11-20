
package google7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Google7 {

  static final int  V = 6;

  public static void main(String[] args) {
    
    LinkedList<Integer>[] adjlst = new LinkedList[V];
    for(int i=0;i<V;i++){
      adjlst[i] = new LinkedList<Integer>();
    }
    
    addEdge(adjlst,5,2);
    addEdge(adjlst,5,0);
    addEdge(adjlst,4,0);
    addEdge(adjlst,4,1);
    addEdge(adjlst,2,3);
    addEdge(adjlst,3,1);
    
    
    
    topologicalSort(adjlst);
    
    
  }
  
  public static void addEdge(LinkedList<Integer>[] adjlst,int sv,int ev){
    
    adjlst[sv].add(ev);
  }
  
  public static void topologicalSort(LinkedList<Integer>[] adjlst){
    Stack<Integer> s = new Stack<Integer>();
    boolean[] visited = new boolean[V];
    
    
    for(int i=1;i<V;i++){
       if(!visited[i]){
        visited[i]=true;
        dfs(adjlst,s,i,visited);
       }
    }
    while(!s.isEmpty()){
      System.out.print(s.pop() + "->");
    }
  }
  public static void dfs(LinkedList<Integer>[] adjlst,Stack<Integer>s,int sver,boolean[] visited){
    
       System.out.println(sver + " I am called!");
       Iterator<Integer> i = adjlst[sver].iterator();
       while(i.hasNext()){
         int nver = i.next();
         if(!visited[nver]){
           visited[nver]=true;
           dfs(adjlst,s,nver,visited);
        }
       }
       s.push(sver);
      
    
  }
  
}
