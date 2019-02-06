
package nextpermutation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
  public static void main(String[] args) {
    
    List<Integer> perm = new ArrayList<>();
    perm.add(0);
    perm.add(1);
    perm.add(2);
    
    System.out.println(perm);
    nextPermutation(perm);
    System.out.println(perm);
    
    
  }
  
  public static void nextPermutation(List<Integer> perm){    
    int invPoint = perm.size()-2;
    while(invPoint>=0){
      if(perm.get(invPoint)<perm.get(invPoint+1))
        break;
      invPoint--;
    }    
    if(invPoint==-1){
      System.out.println("This is the last permutation");
      return ; //there is no permutation after this
    }
    for(int i=perm.size()-1;i>invPoint;i--){
      if(perm.get(i)>perm.get(invPoint)){
        Collections.swap(perm, i, invPoint);
        break;
      }
   }
   Collections.reverse(perm.subList(invPoint+1, perm.size()));    
  }  
}
