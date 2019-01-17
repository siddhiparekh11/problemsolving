
package secondlargestbst;

import java.util.ArrayList;

public class SecondLargestBST {

  public static void main(String[] args) {
    
    Node root = null;
    root = addBST(root,10);
    root = addBST(root,5);
    root = addBST(root,20);
    root = addBST(root,1);
    root = addBST(root,6);
    root = addBST(root,30);
    
    inorder(root);
    ArrayList<Integer> list = new ArrayList<>();
    secLargest(root,list);
    if(list.size()==2)
      System.out.println(list.get(1));
    if(list.size()==1)
      System.out.println(list.get(0));
    if(list.size()==0)
      System.out.println(list);
    
   
  }
  
  public static Node addBST(Node root,int val){    
    if(root==null){
      Node node  = new Node();
      node.val = val;
      node.left=null;
      node.right=null;
      return node;
    }
    if(val<root.val)
      root.left = addBST(root.left,val);
    else
      root.right = addBST(root.right,val); 
    
    return root;
  }
    
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
   //System.out.println(root.val);
    inorder(root.right);
  }
  
  public static void secLargest(Node root,ArrayList<Integer> list){
      if(root==null)
        return;
      secLargest(root.right,list);
      if(list.size()<2)
        list.add(root.val);
      if(list.size()<2)
        secLargest(root.left,list);
  }
      
  
}

class Node {
  
  int val;
  Node left;
  Node right;
}
