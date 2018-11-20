
package google28;

public class Google28 {

  static Node prev;
  static Node head;
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
    
   // inorder(root);
    
    convertToDoubly(root);
    
    while(head!=null){
      System.out.println(head.data);
      head = head.next;
    }
    
  }
  
  public static void convertToDoubly(Node root){
    if(root==null)
      return;
    convertToDoubly(root.prev);
    /*if(head==null)
      head=root;*/
    if(prev==null){
      prev = head= root;
    }else{
      prev.next = root;
      root.prev = prev;
      prev = root;
    }
    convertToDoubly(root.next);
  }
  
  public static void inorder(Node root){
    if(root==null)
      return;
    inorder(root.prev);
    System.out.print(root.data + " ");
    inorder(root.next);
  }
  
  public static Node insertionBST(Node root,int val){
    
    if(root==null){
      Node node = new Node();
      node.data = val;
      node.prev = null;
      node.next = null;
      return node;
    }else if(root.data > val)
      root.prev = insertionBST(root.prev,val);
    else
      root.next = insertionBST(root.next,val);
    
    return root;    
  }
  
  
  
}
