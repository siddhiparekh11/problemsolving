
package google27;


public class Google27 {


  public static void main(String[] args) {
    
    Node root=null;
    
    root=insertionBST(root,6);
    insertionBST(root,2);
    insertionBST(root,1);
    insertionBST(root,5);
    insertionBST(root,4);
    insertionBST(root,3);
    insertionBST(root,9);
    insertionBST(root,8);
    insertionBST(root,7);
    insertionBST(root,13);
    insertionBST(root,11);
    insertionBST(root,18);
    
    inorder(root);
    
   /*
    
    deleteBST(root,11);
    deleteBST(root,5);
    deleteBST(root,9);
    System.out.println();
    inorder(root);
    deleteBST(root,11);
    System.out.println();
    inorder(root);*/
    
  }
  
  public static Node insertionBST(Node root,int val){
    
    if(root==null){
      Node node = new Node();
      node.data = val;
      node.left = null;
      node.right = null;
      return node;
    }else if(root.data > val)
      root.left = insertionBST(root.left,val);
    else
      root.right = insertionBST(root.right,val);
    
    return root;    
  }
  
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }
  
  
  
  public static Node findInorderSuc(Node root){
    if(root.left==null)
      return root;
     Node result=findInorderSuc(root.left);    
    
    return result;
  }
  
  public static Node deleteBST(Node root,int val){
    if(root==null) // tree is empty
      return null;
    if(root.data > val)
      root.left = deleteBST(root.left,val);
    else if(root.data < val)
      root.right = deleteBST(root.right,val);
    else {
     //the node to be deleted is the leaf node
      if((root.left==null) && (root.right==null))
        return null;
      //the node to be delete has only one child
      else if((root.right==null) && (root.left!=null))
        return root.left;
      else if((root.left==null) && (root.right!=null))
        return root.right;
      else{
        Node key = findInorderSuc(root.right);
        root.data = key.data;
        root.right = deleteBST(root.right,root.data);        
      }     
    }    
    return root;
  }
  
}
