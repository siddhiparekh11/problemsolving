
package dailycodingproblem217;


public class DailyCodingProblem217 {

  public static void main(String[] args) {
    
   /* System.out.println(isSparse(21));
    System.out.println(isSparse(22));
    System.out.println(isSparse(23));*/
    
    System.out.println(nearSparse(38));
    
  }
  
  public static boolean isSparse(int num){
    
    int rnum = num>>1;
    int res = num & rnum;
    if(res==0)
      return true;
    else
      return false;
  }
  
  public static int nearSparse(int num){
    
    if(num==0)
      return 1;
    
    int i=0;
    while(true){
      i=num++;
      if(isSparse(i))
        return i;
    }
    
    
    
  }
  
}
