
package adjacencylistgraph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//undirected graph

public class Adjacencylistgraph {

        private static int V=5; //no.of vertices
        private static LinkedList<Integer> adjlist[]=new LinkedList[V];
        private static boolean[] visited=new boolean[V];
        
       Adjacencylistgraph()
       {
           for(int i=0;i<V;i++)
           {
               adjlist[i]=new LinkedList<>();
           }
       }
    
    public static void main(String[] args) {
        
        Adjacencylistgraph a = new Adjacencylistgraph();
    
        
       //adding the edges
       addedge(0,1);
       addedge(0,2);
      
             addedge(1,2);
       addedge(1,3);
             addedge(1,4);
             addedge(2,0);
       addedge(2,1);
       addedge(2,3);
            addedge(3,1);
            addedge(3,2);
       addedge(3,4);
       addedge(4,1);
            addedge(4,3);
       
       //printing using bfs
      // bfs(0);
      
     dfs(0);
        
        
        
        
       
        
    }
    
    public static void addedge(int src,int des)
    {
        adjlist[src].add(des);
    }
    
    public static void bfs(int src)
    {
        
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        visited[src]=true;
        
        while(!queue.isEmpty())
        {
            int temp = queue.remove();
            
            
            System.out.println(temp);
            Iterator<Integer> i = adjlist[temp].iterator();
            while(i.hasNext())
            {
                int temp1=i.next();
                if(!visited[temp1])
                {
                    queue.add(temp1);
                    visited[temp1]=true;
                    
                }
            }
            
        }
        
        
    }
    
    public static void dfs(int src)
    {
        visited[src]=true;
        System.out.println(src);
        
        Iterator<Integer> i = adjlist[src].iterator();
            while(i.hasNext())
            {
                int temp1=i.next();
                if(!visited[temp1])
                {
                    dfs(temp1);
                    
                }
            }
        
        
        
    }
    
}
