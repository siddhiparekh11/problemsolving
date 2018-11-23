
package dailyproblem146;

public class DailyProblem146 {

  public static void main(String[] args) {    
   //setting the root node
    Node root = new Node();
    root.val = 0;
    root.left = null;
    root.right = null;    
    
   //creation of left and right child of root
   Node rleft = new Node();
   rleft.val = 1;
   rleft.left = null;
   rleft.right = null;
   
   Node rright = new Node();
   rright.val = 0;
   rright.left = null;
   rright.right = null;
   
   root.left = rleft;
   root.right = rright;
   
   // creation of subtrees of rright
   
   Node rightl = new Node();
   rightl.val = 1;
   rightl.left = null;
   rightl.right = null;
   
   Node rightr = new Node();
   rightr.val = 0;
   rightr.left = null;
   rightr.right = null;
   
  rright.left = rightl;
  rright.right = rightr;
  
  // creation of left subtree of rightl
  
  Node rightrl = new Node();
  rightrl.val = 0;
  rightrl.left = null;
  rightrl.right = null;
  
  Node rightrr = new Node();
  rightrr.val = 0;
  rightrr.left = null;
  rightrr.right = null;
  
  rightl.left = rightrl;
  rightl.right = rightrr; 

  //printing the tree
  inorder(root);
  
  //purging the zeros out of the tree
  root = purge(root);
  
  //printing the new tree
  System.out.println();
  inorder(root);
  }
  
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
    System.out.print(root.val);
    inorder(root.right);    
  }
  
  public static Node purge(Node root){
    if(root==null)
      return null;
    if((root.val==0) && (root.left==null && root.right==null))
      return null;
    root.left = purge(root.left);
    root.right = purge(root.right);
    
    return root;
  }
  
  
  
}

class Node {
  int val;
  Node left;
  Node right;
}
