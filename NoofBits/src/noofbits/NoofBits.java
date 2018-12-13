
package noofbits;

public class NoofBits {

  public static void main(String[] args) {
    int n = 5;
    int[] memo = new int[n+1];
    for(int i=1;i<=n;i++){
      memo[i] = memo[i>>1] + (i&1);
      System.out.println(memo[i]);
    }
    
  }
  
}
