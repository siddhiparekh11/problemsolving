
package knodeinorder;

import java.util.LinkedList;
import java.util.Queue;

public class KNodeInorder {

  public static void main(String[] args) {
    
    Node root = null;
    root = createTree(root,6,4);
    root = createTree(root,271,3);
    root = createTree(root,561,3);
    root = createTree(root,28,1);
    root = createTree(root,0,1);
    root = createTree(root,17,1);
    root = createTree(root,3,1);
    
    //inorder(root);
    System.out.println(findKNode(root,7).val);
    
  }
  
  public static Node findKNode(Node root,int k){
    if(root==null)
      return null;
    Node iter = root;
    while(iter!=null){
      int lsize = iter.left!=null?iter.left.count:0;
      if(lsize+1<k)//node in the right subtree
      {
        iter=iter.right;
        k-=lsize+1;
        continue;
      }
      if(lsize==k-1)//it is the root
      {
        return iter;
      }else{
        iter=iter.left;
      }      
    }
    return null;
  }
  public static Node createTree(Node root,int val,int count){
    if(root==null){
      root = createNode(val,count);
    }else{
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
        Node temp = q.poll();
        if(temp.left!=null){
          q.add(temp.left);
        }else{
          temp.left = createNode(val,count);
          break;
        }
        if(temp.right!=null){
          q.add(temp.right);
        }else{
          temp.right = createNode(val,count);
          break;
        }        
      }
      
   }
    return root;
  }
  
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
    System.out.println(root.val);
    inorder(root.right);
  }
  
  public static Node createNode(int val,int count){
     Node n = new Node();
     n.val = val;
     n.left = null;
     n.right = null;
     n.count = count;
     return n;
  }
  
}
class Node {
  int val;
  Node left;
  Node right;
  int count;
  Node(){
    
  }
  Node(int val,int count){
    this.val = val;
    this.left = null;
    this.right = null;
    this.count = count;
  }
}

