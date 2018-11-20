/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htmltree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author siddhiparekh11
 */
 
public class Htmltree {
    
    static class Node{
    
    int id;
    String className;
   ArrayList<Node> children;
   
   Node(String className,int id)
   {
       this.id=id;
       this.children = new ArrayList<Node>();
       this.className=className;
   }
   
   void addChild(Node child)
   {
       this.children.add(child);
   }
   
   
}

   
    public static void main(String[] args) {
       
        Node body = new Node("class1",0);
        Node div1 = new Node("div1",1);
        Node div2 = new Node("class1",2);
        
        body.addChild(div2);
        body.addChild(div1);
        
        div1.addChild(new Node("class1",3));
        
        
        ArrayList<Node> result = bfs(body,"class1");
        
        for(int i=0;i<result.size();i++)
        {
            System.out.println(result.get(i).id);
        }
        
        
    }
    
    public static ArrayList<Node> bfs(Node root,String className)
    {
        ArrayList<Node> result = new ArrayList<Node>();
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            if(temp.className.equals(className))
                result.add(temp);
            
            for(int i=0;i<temp.children.size();i++)
            {
                q.add(temp.children.get(i));
            }
        }
        
        return result;
    }
    
}


