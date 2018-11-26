
package treeforestsamples;

import java.util.ArrayList;


public class TreeForestSamples {

  public static void main(String[] args) {
    
    Tree a = new Tree('A');
    a.addChildren(new Tree('B'));
    Tree c = new Tree('C');
    a.addChildren(c);
    c.addChildren(new Tree('D'));
    Tree e = new Tree('E');
    
    ArrayList<Tree> trees = new ArrayList<>();
    
    trees.add(a);
    trees.add(e);
    
    for(int i=0;i<trees.size();i++){
      System.out.println(trees.get(i).val + " 0" );
      DFS(trees.get(i),4);
    }
    
    
    
  }
  
  public static void DFS(Tree node,int lev){
    if(node==null)
      return;
    for(int i=0;i<node.children.size();i++){
      System.out.println(node.children.get(i).val + " " + lev);
      DFS(node.children.get(i),lev+4);
    }
  }
  
}

class Tree {
  char val;
  ArrayList<Tree> children;
  
  Tree(char val){
    this.val = val;
    this.children = new ArrayList<>();
  }
  
  public void addChildren(Tree child){
    this.children.add(child);
  }
}
