/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphproject;

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
        n.incoming=null;
        n.outgoing=null;
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
       if(flag1 && flag2){
        if(startNode.outgoing==null)
        {
            startNode.outini();
            
        }
        if(endNode.incoming==null)
        {
            endNode.incini();
        }
         startNode.outgoing.add(endNode);
         endNode.incoming.add(startNode);
            
        
            return true;
       }
        
        return false;
    }
    
    void buildOrder()
    {
        Queue<Node> ord=new LinkedList<Node>();
        
        //find the initial nodes which has no incoming edges and add them to queue
        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).incoming==null)
            {
                vertices.get(i).visited=1;
                
                ord.add(vertices.get(i));
            }
        }
        
        //now the usual bfs 
        while(!ord.isEmpty())
        {
            Node temp = ord.remove();
            System.out.println(temp.data + " ");
            if(temp.outgoing!=null)
            {
                for(int j=0;j<temp.outgoing.size();j++)
                {
                    temp.outgoing.get(j).incoming.remove(temp);
                    
                    if(temp.outgoing.get(j).incoming.size()==0)
                        temp.outgoing.get(j).incoming=null;
                    
                    if((temp.outgoing.get(j).incoming==null) && (temp.outgoing.get(j).visited==-1))
                    {
                        temp.outgoing.get(j).visited=1;
                        ord.add(temp.outgoing.get(j));
                    }
                }
                temp.outgoing=null;
            }
        }
        
        
        //check if cycles exists
        for(int i=0;i<vertices.size();i++)
        {
            if(vertices.get(i).visited==-1)
            {
                System.out.println("Build Order doesn't exist");
                break;
            }
        }
        
        
    }
    
    
    
    
 
}
