
package google18;

public class Google18 {

  public static void main(String[] args) {
    
    String str1 = "ABCDGHAEDFHR";
    String str2 = "AEDFHR";
    int[][] memo = new int[str1.length()][str2.length()];
    System.out.println(longestSub(str1,str2,0,0,memo));
    
  }
  
  public static int longestSub(String seq1,String seq2,int p,int q,int[][] memo){
    
    if((p==seq1.length()) || (q==seq2.length()))
      return 0;
    if(seq1.charAt(p)==seq2.charAt(q))
      return 1 + longestSub(seq1,seq2,++p,++q,memo);
    
    if(memo[p][q]!=0)
      return memo[p][q];
    
    int res1 = longestSub(seq1,seq2,p+1,q,memo);
    int res2 = longestSub(seq1,seq2,p,q+1,memo);
    
     memo[p][q] = Math.max(res1, res2); // time complexity becomes o(nm) ..without memo it is 2 to the power (n+m)
     
     return memo[p][q];
    
  }
  
}
