
package successornode;

import java.util.*;

public class SuccessorNode {

   
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int low,high;
        //inserting in the array
        Node root=null;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //binary search and insertion
        low=0;
        high=n-1;
        root=binarySearch(root,arr,low,high);
        inorder(root);
        System.out.println("Enter the node you want to find successor of");
        searchBST(root,sc.nextInt());
    }
     public static Node binarySearch(Node root,int[] arr,int low,int high)
    {
        int mid;
        if(low<=high)
        {
            mid=(low+high)/2;
            if(root==null)
                root=insertBinarySearchTree(root,arr[mid],null);
            else
                root=insertBinarySearchTree(root,arr[mid],root.parent);
            binarySearch(root,arr,low,mid-1);
            binarySearch(root,arr,mid+1,high);
        }
        
         return root;   
        
        
    }
    public static Node insertBinarySearchTree(Node root,int data,Node parent)
    {
        Node temp;
        if(root==null)
        {
            temp=new Node();
            temp.data=data;
            temp.left=null;
            temp.right=null;
            temp.parent=parent;
            root=temp; 
            return root;
        }
        if(data<root.data)
            root.left=insertBinarySearchTree(root.left,data,root);
        else
            root.right=insertBinarySearchTree(root.right,data,root);
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
    public static void searchBST(Node root,int data)
    {
        if(root.data==data)
        {
            searchSuccessor(root);
        }
        if(data<root.data)
            searchBST(root.left,data);
        else if(data>root.data)
            searchBST(root.right,data);
        
    }
    public static void searchSuccessor(Node n)
    {
        if(n.right==null && n.parent.right!=n)
        {
            if(n.parent!=null)
                System.out.println(n.parent.data);
            else
                System.out.println("Root node doesn't have a parent");
        }
        else if(n.right==null && n.parent.right==n)
        {
            while(n.parent!=null && n.parent.right==n)
            {
                if(n.parent!=null)
                    n=n.parent;
                else
                    break;
            }
            if(n.parent==null)
                System.out.println("There is no successor as this is last node");                
            else if(n.parent.right!=n)
                System.out.println("The successor node is "+ n.parent.data);
        }
        else if(n.right!=null)
        {
            leftMostNode(n.right);
        }
        
    }
    public static void leftMostNode(Node n)
    {
        Node temp=n;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        System.out.println("The successor node is "+ temp.data);
    }
    
}
