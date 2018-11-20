/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author siddhiparekh11
 */
public class JavaApplication22 {

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t;
        int lv,rv;
        boolean flag=true;
        Node root=new Node();
        root.data=1;
        root.left=null;
        root.right=null;
        root.lev=1;
        Node nd=root;
        while(n>0)
        {
            for(int j=0;j<2;j++)
            {
                insert(root,sc.nextInt());
            }
                n--;
        }
        //inorder(root);
        t=sc.nextInt();
       for(int i=0;i<t;i++)
        {
            swap(root,sc.nextInt());
            inorder(root);
        }
    }
   static void insert(Node root,int item)
   {
       
       Queue<Node> q=new LinkedList<Node>();
       q.add(root);
       while(!q.isEmpty())
       {
           Node tem=q.remove();
           if(tem.left==null && tem.data!=-1)
           {
               tem.left=new Node();
               tem.left.data=item;
               tem.left.lev=tem.lev+1;
               tem.left.left=null;
               tem.left.right=null;
               break;
           }
           else if(tem.left!=null)
           {
               q.add(tem.left);
           }
           if(tem.right==null && tem.data!=-1)
           {
               tem.right=new Node();
               tem.right.data=item;
               tem.right.lev=tem.lev+1;
               tem.right.left=null;
               tem.right.right=null;
               break;
           }
           else if(tem.right!=null)
           {
               q.add(tem.right);
           }
       }
       
       
   }
   static void inorder(Node root)
   {
       if(root!=null)
       {
           
           inorder(root.left);
           if(root.data!=-1)
           System.out.print(root.data +" ");
           inorder(root.right);
       }
   }
   static void swap(Node root,int level)
   {
       Queue<Node> q=new LinkedList<Node>();
       Node swap;
       
       q.add(root);
       while(!q.isEmpty())
       {
           Node temp=q.remove();
           if(temp.lev%level==0) 
           {
               swap=temp.left;
               temp.left=temp.right;
               temp.right=swap;
               
           }
           if(temp.left!=null)
               q.add(temp.left);
           if(temp.right!=null)
               q.add(temp.right);
          
       }
   }
}
