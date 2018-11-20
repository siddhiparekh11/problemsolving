
package commonancestor;
import java.util.*;

public class CommonAncestor {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        Node root=null;
        int data;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        System.out.println("Enter the nodes");
        for(int i=0;i<n;i++)
        {
            data=sc.nextInt();
            root=insert(root,data);
        }
        inorder(root);
        System.out.println("Enter the nodes for which you want to find common ancestor");
        Node nd=commonAncestor(root,sc.nextInt(),sc.nextInt(),null);
        if(nd==null)
            System.out.println("No common ancestor found");
        else 
            System.out.println("First common ancestor is " + nd.data);
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
    public static Node commonAncestor(Node root,int p,int q,Node parent)
    {
        
        Node n=null;
        if(root==null)
        {
            return null;
        }
        if(root.data==p || root.data==q)
        {
            return parent;
        }
       
        if(searchNode(root.left,p) && searchNode(root.right,q))
        {
            n=root;   
        }
        else if(searchNode(root.left,q) && searchNode(root.right,p))
        {
            n=root;
        }
        if(n==null)
            n=commonAncestor(root.left,p,q,root);
        if(n==null)
            n=commonAncestor(root.right,p,q,root);
        
        return n;
        
    }
    public static boolean searchNode(Node root,int data)
    {
       boolean flag=false;
        if(root==null)
           return false;
        if(root.data==data)
        {
            
            return true  ;
        }
        flag=searchNode(root.left,data);
        if(!flag)
          flag=searchNode(root.right,data);
        
        return flag;
        
    }
    
}
