/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diameterbinarytree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author siddhiparekh11
 */
public class DiameterBinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
        int res=diameterTree(root,arr);
        Collections.sort(arr);
        System.out.println("Diameter of the tree "+arr.get(arr.size()-1));
    }
    public static int treeHeight(Node root)
    {
        int lh,lr;
        if(root==null)
        {
            return -1;
        }
        lh=treeHeight(root.left)+1;
        lr=treeHeight(root.right)+1;
        
        return lh>lr?lh:lr;
        
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
    public static int diameterTree(Node root,ArrayList<Integer> arr)
    {
        int lh,lr,max,res;
        
        if(root==null)
        {
            return -1;
        }
        lh=treeHeight(root.left)+1;
        lr=treeHeight(root.right)+1;
        res=lh+lr+1;
        arr.add(res);
        return res;
    }
}
