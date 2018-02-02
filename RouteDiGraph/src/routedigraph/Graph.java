/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routedigraph;

import java.util.*;

/**
 *
 * @author siddhiparekh11
 */
public class Graph {
    
    private ArrayList<Node> vertices;
    
    Graph()
    {
        vertices=new ArrayList<Node>();
    }
    
    boolean addNode(int data)
    {
        Node n=new Node();
        n.data=data;
        n.visited=-1;
        n.connections=null;
        vertices.add(n);
        return true;
    }
    boolean addEdge(int val1,int val2)
    {
        Node startNode,endNode;
        startNode=endNode=null;
        boolean flag1,flag2;
        flag1=flag2=false;
        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).data==val1){
                startNode=vertices.get(i);
                flag1=true;
            }
            if(vertices.get(i).data==val2){
                endNode=vertices.get(i);
                flag2=true;
            }
        }
        if(startNode.connections==null)
        {
            startNode.initialize();
            
        }
         startNode.connections.add(endNode);
            
        if(flag1 && flag2)
            return true;
        
        return false;
    }
    void printGraph()
    {
        for(int i=0;i<vertices.size();i++)
        {
            System.out.println("Node:" + vertices.get(i).data);
            if(vertices.get(i).connections!=null)
            {
                for(int j=0;j<vertices.get(i).connections.size();j++)
                {
                    System.out.println(vertices.get(i).connections.get(j).data + "->");
                }
            }
        }
    }
    
    boolean routeBfs(int val1,int val2)
    {
        boolean flag=false;
        Queue<Node> q=new LinkedList<Node>();
        reset();
        int ind=returnStartInd(val1);
        if(ind!=-1){
       
            q.add(vertices.get(ind)); //root node
        
            vertices.get(ind).visited=0; //visiting
            while(!q.isEmpty())
            {
                Node temp=q.remove();
                if(temp.connections!=null)
                {
                    for(int i=0;i<temp.connections.size();i++)
                    {
                        if(temp.connections.get(i).visited==-1) //unvisited
                        {
                            if(temp.connections.get(i).data==val2)
                            {
                                flag=true;
                                break;
                            }
                            else
                            {
                                temp.connections.get(i).visited=0;
                                q.add(temp.connections.get(i));
                            }
                        }
                    }
                }
                temp.visited=1; //visited
                if(flag)
                    break;
            }   
            
            
            
        }
        
        
        
        
        
        
        return flag;
        
    }
    
    int returnStartInd(int val)
    {
        int ind=-1;
        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).data==val)
                ind=i;
        }
        
        return ind;
    }
    
    void reset()
    {
       for(int i=0;i<vertices.size();i++)
       {
           vertices.get(i).visited=-1;
       }
    }
}
