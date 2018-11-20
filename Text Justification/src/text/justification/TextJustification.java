
package text.justification;

import java.util.Arrays;

public class TextJustification {

  private static String s ="Siddhi wants to work for Google";
  private static String[] words = s.split(" ");
  private static int badness[][] = new int[words.length][words.length+1];
  private static final int max_width = 15;
  private static long[] memo = new long[words.length+1];
  private static int length = words.length;
  private static int[] parent = new int[length];
  public static void main(String[] args) {
    
    for(int i=0;i<length;i++){
        Arrays.fill(badness[i], -1);
    }
    
    
    
    Arrays.fill(memo, -1);
    
    calBadness();
   // printBadness();
    
  System.out.println(justify(0));
 System.out.println("Hello");
   
  }
  
  public static long justify(int ind){
    
    long bval;
    if(ind == length)
      return 0;
    if(memo[ind]!=-1)
      return memo[ind];
    long min = Integer.MAX_VALUE;
    for(int j= ind + 1;j<=length;j++){
      bval=0;
      long jval = justify(j);
      bval = jval  + badness[ind][j-1];     
  //   System.out.print(bval + " ");
      if(min>bval){
        min=bval;
        parent[ind]=j;
      }
      
    }
 //  System.out.println();
    memo[ind] = min;
   System.out.println(ind + " "+memo[ind]);
   return memo[ind];
  }
  
  public static void printBadness(){
    for(int i=0;i<length;i++){
      for(int j=0;j<length;j++){
        System.out.print(badness[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static void calBadness(){
    
    String temp;
    for(int i=0;i<length;i++){
      temp="";
      for(int j=i;j<length;j++){
        if(i==j)
          temp = words[j];
        else
          temp = temp + " " + words[j];
        
        int len = max_width - (temp.length());
        if(len >=0)
          badness[i][j] = (int)Math.pow(len, 3);
        else
          badness[i][j] = Integer.MAX_VALUE;      
      }
    }
    
  }
  
}
