
package stringwellformed;

import java.util.HashMap;
import java.util.Stack;

public class StringWellFormed {

  public static void main(String[] args) {
   
      System.out.println(isWellFormed("()()()"));
      System.out.println(isWellFormed("(()()){([])}"));
      System.out.println(isWellFormed("([)(])([)"));System.out.println(isWellFormed("[[[}]]]"));
      
  }
  
  public static boolean isWellFormed(String str){
    Stack<Character> stack = new Stack<>();
    HashMap<Character,Character> map = new HashMap<>();
    map.put(')','(');
    map.put(']','[');
    map.put('}','{');
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if(c=='(' || c=='{' || c=='['){
        stack.push(c);
      }else{
        if(stack.isEmpty()||map.get(c)!=stack.peek())
          return false;
        stack.pop();
      }
    }
    return true;    
  }
  
}
