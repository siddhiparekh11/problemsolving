
package listlevelorder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListLevelOrder {

  public static void main(String[] args) {
    
    Node root = null;
    root = insert(root,8);
    root = insert(root,3);
    root = insert(root,10);
    root = insert(root,1);
    root = insert(root,6);
    root = insert(root,14);
    
    List<List<Integer>> results = bfs(root);
    for(int i=0;i<results.size();i++)
      System.out.println(results.get(i));
    
    
  }
  
  public static Node insert(Node root,int val){
    if(root==null){
      Node n = new Node();
      n.val = val;
      n.left = null;
      n.right = null;
      return n;
    }
    if(val < root.val)
      root.left = insert(root.left,val);
    if(val > root.val)
      root.right = insert(root.right,val);
    return root;
  }
  
  public static List<List<Integer>> bfs(Node root){
    
    if(root==null)
      return null;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    List<List<Integer>> results = new ArrayList<>();
    
    while(!q.isEmpty()){
      int s = q.size();
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<s;i++){
        Node n = q.poll();
        list.add(n.val);
        if(n.left!=null)
          q.add(n.left);
        if(n.right!=null)
          q.add(n.right);
      }
      results.add(list);     
    }
    
    return results;   
    
  }
  
  
  
  
  
}
class Node {
  int val;
  Node left;
  Node right;
}
