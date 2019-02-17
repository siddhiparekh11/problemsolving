
package istreesymmetric;

import java.util.LinkedList;
import java.util.Queue;

public class IsTreeSymmetric {

  public static void main(String[] args) {
    
    Node root = null;
    root = createTree(root,1);
    root = createTree(root,2);
    root = createTree(root,3);
    root = createTree(root,4);
    root = createTree(root,5);
    root = createTree(root,6);
    root = createTree(root,7);
    
    Node root1 = null;
    root1 = createSymmTree(root1);
    
    inorder(root1);
    System.out.println(isSymmetric(root1));
    
  }
  
  public static Node createSymmTree(Node root1){
    Node n1 = new Node(314);
    Node n2 = new Node(6);
    Node n3 = new Node(6);
    Node n4 = new Node(2);
    Node n5 = new Node(2);
    Node n6 = new Node(3);
    Node n7 = new Node(3);
    
    n1.left = n2;
    n1.right = n3;
    n2.right = n4;
    n3.left = n5;
    n4.right = n6;
    n5.left = n7;
    
    root1 = n1;
    return root1;
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
     return n;
  }
  public static boolean isSymmetric(Node root){
    if(root==null)
      return false;    
    return checkSymmetric(root.left,root.right);    
  }
  
  public static boolean checkSymmetric(Node left,Node right){
    if(left==null && right==null)
      return true;
    
    if(left!=null && right!=null){      
      return left.val==right.val && checkSymmetric(left.left,right.right) && checkSymmetric(left.right,right.left);     
    }
    
    return false;    
  } 
}

class Node {
  int val;
  Node left;
  Node right;
  Node(){
    
  }
  Node(int val){
    this.val = val;
    this.left = null;
    this.right = null;
  }
}
