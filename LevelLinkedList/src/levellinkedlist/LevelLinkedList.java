
package levellinkedlist;

import java.util.Scanner;
import java.util.*;

public class LevelLinkedList {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int data;
        Node root=null;
        HashMap<Integer,LinkedList<Node>> map=new HashMap<Integer,LinkedList<Node>>();
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            root=bsfInsert(root,data);
        }
       System.out.println("Inorder traversal");
       inorder(root);
       System.out.println();
       populatingLinkedList(root,map);
       System.out.println("Printing the hashmap");
       for(int i=0;i<map.size();i++)
       {
           for(int j=0;j<map.get(i).size();j++)
           {
               System.out.print(map.get(i).get(j).data + " ");
           }
           System.out.println();
       }
        
    }
    public static Node bsfInsert(Node root,int data)
    {
        Queue<Node> q=new LinkedList<Node>();
        if(root==null)
        {
            Node temp=new Node();
            temp.data=data;
            temp.left=null;
            temp.right=null;
            temp.lev=0;
            root=temp;
            return root;
             
        }
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            
            if(temp.left==null)
            {
                temp.left=new Node();
                temp.left.data=data;
                temp.left.lev=temp.lev + 1;
                temp.left.left=null;
                temp.left.right=null;
                break;
            }
            else
            {
                q.add(temp.left);
            }
            if(temp.right==null)
            {
                temp.right=new Node();
                temp.right.data=data;
                temp.right.lev=temp.lev + 1;
                temp.right.left=null;
                temp.right.right=null;
                break;
            }
            else
            {
                q.add(temp.right);
            }
        }
        return root;
    }
    public static void populatingLinkedList(Node root,HashMap<Integer,LinkedList<Node>> map)
    {
         Queue<Node> q=new LinkedList<Node>();
        
        q.add(root);
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            if(map.containsKey(temp.lev))
            {
               
                map.get(temp.lev).add(temp);
            }
            else
            {
                map.put(temp.lev, new LinkedList<Node>());
                map.get(temp.lev).add(temp);
                
            }
            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
               q.add(temp.right);
            }
        }
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }
    
    
}
