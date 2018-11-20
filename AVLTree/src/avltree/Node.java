
package avltree;

public class Node {
  
  int val;
  Node right;
  Node left;
  Node parent;
  
  Node(int val){
    this.val = val;
    parent = right = left = null;
  }
  
}
