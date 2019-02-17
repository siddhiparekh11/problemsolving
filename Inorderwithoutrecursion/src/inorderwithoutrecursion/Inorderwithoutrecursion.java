
package inorderwithoutrecursion;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Inorderwithoutrecursion {

  public static void main(String[] args) {
    
    Node root = null;
    root = createTree(root,6);
    root = createTree(root,271);
    root = createTree(root,561);
    root = createTree(root,28);
    root = createTree(root,0);
    root = createTree(root,3);
    root = createTree(root,17);
    
    inorder(root);
    System.out.println(inorderLoop(root));
   
  }
  
  public static List<Integer> inorderLoop(Node root){
    Deque<Node> q = new ArrayDeque<>();
    List<Integer> res = new ArrayList<>();
    q.add(root);
    while(!q.isEmpty()){
      Node temp = q.poll();
      if(temp!=null){
        if(temp.isLeftVis)
          res.add(temp.val);
        else{
          if(temp.left!=null && temp.right!=null){
            q.addFirst(temp.right);
            temp.isLeftVis = true;
            q.addFirst(temp);
            q.addFirst(temp.left);
          }else{
            temp.isLeftVis = true;
            q.addFirst(temp);
          }
        }
      }
    }
    return res;
  }
  
  public static Node createTree(Node root,int val){
    if(root==null){
      root = createNode(val);
    }else{
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
        Node temp = q.poll();
        if(temp.left!=null){
          q.add(temp.left);
        }else{
          temp.left = createNode(val);
          break;
        }
        if(temp.right!=null){
          q.add(temp.right);
        }else{
          temp.right = createNode(val);
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
   public static Node createNode(int val){
     Node n = new Node();
     n.val = val;
     n.left = null;
     n.right = null;
     n.isLeftVis = false;
     return n;
  }
  
}

class Node {
  int val;
  Node left;
  Node right;
  boolean isLeftVis;
}
