
package reversepolishnotation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntBiFunction;

public class ReversePolishNotation {

  public static void main(String[] args) {
   
    System.out.println(rpn("3,4,+,2,*,1,+"));
  }
  
  public static int rpn(String exp){
    Deque<Integer> presult = new ArrayDeque<>();
    
    Map<String,ToIntBiFunction<Integer,Integer>> operators=new HashMap<>(); 
    operators.put("+",(y,x)->x+y);
    operators.put("-",(y,x)->x-y);
    operators.put("*",(y,x)->x*y);
    operators.put("/",(y,x)->x/y);
    
    for(String token: exp.split(",")){
      if(operators.get(token)!=null){
        if(presult.size()<=1)
          return 0; //invalid expression
        presult.addFirst(operators.get(token).applyAsInt(presult.removeFirst(), presult.removeFirst()));
      }else{
        presult.addFirst(Integer.parseInt(token));
      }
    }
    if(presult.size()>1)
      return 0; //invalid exp
    return presult.removeFirst();   
  }
  
}
