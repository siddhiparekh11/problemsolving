
package balancedtree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;
public class BalancedTree {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        int data;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            root=insert(root,data);
        }
        inorder(root);
        System.out.println();
        System.out.println("Height of the tree " + treeHeight(root));
        
    }
    public static int treeHeight(Node root)
    {
        int lh,lr;
        int res;
        if(root==null)
        {
            return 0;
        }
        lh=treeHeight(root.left)+1;
        lr=treeHeight(root.right)+1;
        if(Math.abs(lh-lr)<=1)
                res=lh>lr?lh:lr;
        else
                res=-1;
        return res;
        
    }
    public static Node insert(Node root,int data)
    {
        
        Queue<Node> q=new LinkedList<Node>();
        if(root==null)
        {
            Node temp=new Node();
            temp.data=data;
            temp.left=null;
            temp.right=null;
           
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
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    
}
