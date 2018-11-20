
package google11;


public class Google11 {

  
  public static void main(String[] args) {
    
    recurParen("",2,2,4);
    
  }
  
  public static void recurParen(String s,int left,int right,int len){
    
    if(left==0 && right==0)
     System.out.println(s);
    
    if(left<=right){
      if(left>0)
        recurParen(s + "(",left-1,right,len);
      if(right>left)
        recurParen(s + ")",left,right-1,len);
    }
  
    
  }
  
}
