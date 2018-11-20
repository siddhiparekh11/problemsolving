
package google13;

import java.util.Stack;


public class Tower {
  
  Stack<Integer> disks;
  int index;
  
  Tower(int i){
    this.disks = new Stack<Integer>();
    this.index = i;
  }
  
  public void add(int d){
    if((!disks.isEmpty()) && (disks.peek() <= d)){
      System.out.println("Error stacking " + d);  
      }
    else{
     disks.push(d);
    }
  }

  public int getIndex() {
    return index;
  }
  
  
  
  public void moveTopTo(Tower des){
    int top = this.disks.pop();
    des.add(top);
    
  }
  
  public void moveDisks(int n,Tower destination,Tower buffer){
    
    if(n>0){
      moveDisks(n-1,buffer,destination);
      moveTopTo(destination);
      buffer.moveDisks(n-1,destination,this);
    }
    
  }
  
  
}
