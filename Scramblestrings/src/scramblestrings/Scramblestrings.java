
package scramblestrings;

public class Scramblestrings {

  public static void main(String[] args) {
   
    String str = "SPRINT";
    scramble(str);
  }
  
  public static void scramble(String s){
    
    int len = s.length();
    if(len==0)
      return;
    for(int i=0;i<len;i++){
        String start ="";  
        if(i!=0){
          start = s.substring(0,i);
        }
        String end = s.substring(i+1);
        String nstr = start + end;
        System.out.println(nstr + " ");
        scramble(nstr);
        
    }
  }
  
}
