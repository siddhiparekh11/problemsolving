
package google12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Google12 {

  public static void main(String[] args) {
    
    Box b1 = new Box(4,3,4);    
    Box b3 = new Box(2,3,1);
    Box b4 = new Box(3,3,5);
    
    ArrayList<Box> boxes = new ArrayList<>();
    boxes.add(b1);    
    boxes.add(b3);
    boxes.add(b4);
    Collections.sort(boxes, new BoxComparator());
    int[] stackMemo = new int[boxes.size()];
    int maxHeight = recurArrangeBox(boxes,null,0,stackMemo);
    System.out.println(maxHeight);
  }
  
  public static int recurArrangeBox(ArrayList<Box> boxes,Box base,int index,int[] stackMemo){
    
    if(index==boxes.size())
      return 0;
    Box newBase = boxes.get(index);
    int hBase = 0;
    if((base == null) || newBase.canBeAbove(base)){
      if(stackMemo[index]==0){
        stackMemo[index] = recurArrangeBox(boxes,newBase,index+1,stackMemo);
        stackMemo[index] += newBase.h;
      }
      hBase = stackMemo[index];
    }
    int hNoBase = recurArrangeBox(boxes,base,index+1,stackMemo);
    
    return Math.max(hBase, hNoBase);
    
  }
  
}

class BoxComparator implements Comparator<Box> {
  @Override
  public int compare(Box o1, Box o2) {
    return o2.h - o1.h;
  }
}
