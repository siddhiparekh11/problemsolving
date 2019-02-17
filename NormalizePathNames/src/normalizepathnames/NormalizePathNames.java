
package normalizepathnames;

import java.util.Stack;


public class NormalizePathNames {

  
  public static void main(String[] args) {
    
    System.out.println(shortestEquPath("/../"));
    System.out.println(shortestEquPath("sc//./../tc/awk/././"));
    System.out.println(shortestEquPath("a//././../b/../c"));
    
  }
  public static String shortestEquPath(String path){
    if(path.equals(""))
      return "not a legal path";
    
    Stack<String> pathNames = new Stack<>();
    
    //if a path is an absolute path
    if(path.startsWith("/"))
      pathNames.add("/");
    
    for(String token : path.split("/")){
      if(token.equals("..")){
        if(pathNames.isEmpty() || pathNames.peek().equals("..")){
          pathNames.push(token);
        }
        else{
        if(pathNames.peek().equals("/"))
          return "can't go above root";
        pathNames.pop();
      }
    }else if(!token.equals(".") && !token.isEmpty()){
        pathNames.push(token);
     }
  }
  
  StringBuilder result = new StringBuilder();
  if(!pathNames.isEmpty()){
    result.append(pathNames.pop());
    while(!pathNames.isEmpty()){
      if(!pathNames.peek().equals("/"))
        result.append("/");
      if(!pathNames.isEmpty())
      result.append(pathNames.pop());
    }
  }
  
      return result.toString();
    
    
    
    
      
  }
  
}
