
package graphinsert;

import java.util.Scanner;
import java.util.*;
public class GraphInsert {

    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n; //total number of nodes
       int data,src,des;
       int adj; //total number of adjacent nodes
       HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
       System.out.println("Enter total number of nodes");
       n=sc.nextInt();
       //Add nodes
       for(int i=0;i<n;i++)
       {
           System.out.println("Enter node");
           data=sc.nextInt();
           System.out.println("Enter total no. of adjacent nodes");
           adj=sc.nextInt();
           ArrayList<Integer> temp=new ArrayList<Integer>();
           for(int j=0;j<adj;j++)
           {
               System.out.println("Enter adjacent node no. " + (j+1));
               temp.add(sc.nextInt());
           }
           map.put(data,temp);           
       }
       //Print nodes
       for(Map.Entry<Integer,ArrayList<Integer>> m: map.entrySet())
       {
           System.out.print(m.getKey().toString() + ": ");
           for(Integer i: m.getValue())
           {
               System.out.print(i+ " ");
           }
           System.out.println();
       }
       //BSF to see if there is a route between the two nodes
       System.out.println("Enter source node");
       src=sc.nextInt();
       System.out.println("Enter destination node");
       des=sc.nextInt();
        if(bsfGraph(map,src,des))
            System.out.println("The route exists.");
        else
            System.out.println("The route does not exist");
       
          
    }
    public static boolean bsfGraph(HashMap<Integer,ArrayList<Integer>> map,int src,int des)
    {
        boolean flag=false;
        if(!map.containsKey(src))
            return flag;
        Queue<ArrayList<Integer>> q=new LinkedList<ArrayList<Integer>>();
        ArrayList<Integer> visited=new ArrayList<Integer>();
        q.add(map.get(src));
        visited.add(src);
        while(!q.isEmpty())
        {
            ArrayList<Integer> temp=q.remove();
            if(temp.contains(des))
            {
                flag=true;
                break;
            }
            else
            {
                
                for(int k=0;k<temp.size();k++)
                {
                    if(!visited.contains(temp.get(k)))
                    {
                        visited.add(temp.get(k));
                        q.add(map.get(temp.get(k)));
                    }
                }
            }
            
                
        }
        
        
        
       return flag;
    }
    
    
}
