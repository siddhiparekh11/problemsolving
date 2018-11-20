
package avltree;


public class AVLTree {

 
  private static Node root;
  public static void main(String[] args) {
    
    root=null;
   /* add(43);
    add(18);
    add(22);
   add(9);
   add(21);
    add(6);
   add(20);
   add(8);
    add(63);
   add(50);
   add(62);
    add(51);*/
   
   add(10);
   add(20);
   add(30);
   add(40);
   add(50);
   add(25);
    
    inorder(root);
    
  }
  
  
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
    System.out.println(root.val);
    inorder(root.right);
  }
  
  
  
  public static void add(int val){
    Node node = new Node(val);
   if(root==null){
     root = node;
   }else
     add(root,node);   
  }
  
  public static void add(Node parent,Node newnode){
    if(parent.val >= newnode.val){
      if(parent.left==null){
        parent.left = newnode;
        newnode.parent = parent;
        checkbalance(newnode);
         
      }
      else
        add(parent.left,newnode);
    }else{
      if(parent.right==null){
        parent.right = newnode;
        newnode.parent = parent;
        checkbalance(newnode);
         
      }
      else
        add(parent.right,newnode);
    }
    
   
    
  }
  
  public static int height(Node root){
    if(root==null)
      return -1;
    int lh = height(root.left) + 1;
    int rh = height(root.right) + 1;
    
    return Math.max(lh, rh);
  }
  
  public static void checkbalance(Node node){
    int h = height(node.left) - height(node.right);
    if((h > 1) || (h < -1)){
      rebalance(node);
    }
    
    if(node.parent==null)
      return;
    checkbalance(node.parent);   
  }
  
  public static void rebalance(Node node){
    int h = height(node.left) - height(node.right);
    //imbalance is in left subtree
    int val=0;
    if(h>1){
       val = node.val;
      if(height(node.left.left) > height(node.left.right)){
        node = rightRotate(node);
        //changing the parent left or right pointers
       /* if(node.parent!=null)
          node.parent.right = node;*/ 
      }
      else{
        node = leftrightRotate(node);
       /* if(node.parent!=null)
            node.parent.left = node;*/
       
      }
    
      
    }else{
      if(height(node.right.right) > height(node.right.left)){
        node = leftRotate(node);
       /* if(node.parent!=null)
          node.parent.left = node;*/
      }
      else{
        node = rightleftRotate(node);
       /* if(node.parent!=null)
          node.parent.right = node;*/
        
      }
      
    }
    if(node.parent!=null)
      fixParentChild(node.parent,node,val);
    
    if(node.parent==null)
      root = node;
    
    
  }
  
  public static void fixParentChild(Node parent,Node newchild,int oldchildval){
    if(parent.left.val==oldchildval)
      parent.left = newchild;
    else
      parent.right = newchild;
   
  }
  
  public static Node leftRotate(Node node){
    
    Node temp = node.right;
    
    if(temp.left!=null)
      temp.left.parent = node;
    node.right = temp.left;
    
    temp.left = node;
    temp.parent = node.parent;
    node.parent = temp;
    
    return temp;
    
  }
  
  public static Node rightRotate(Node node){
    
    Node temp = node.left;
    
    if(temp.right!=null)
      temp.right.parent = node;
    node.left = temp.right;
    
    temp.right = node;
    temp.parent = node.parent;
    node.parent = temp;
    
    
    return temp;
    
  }
  
  public static Node rightleftRotate(Node node){
    
    node.right = rightRotate(node.right);   
    return leftRotate(node);
        
    
  }
  
  public static Node leftrightRotate(Node node){
    
    node.left = leftRotate(node.left);    
    return rightRotate(node);
    
  }
  
  
  
}
