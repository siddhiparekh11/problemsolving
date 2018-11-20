
package knapsack;

public class Knapsack {

  
  public static void main(String[] args) {
  
    int[] weights = {10,20,30};
    int[] values = {60,100,120};
    int cap = 50;
    
    System.out.println(ks(weights,values,0,50));
    
    
  }
  
  public static int ks(int[] weights,int[] values,int ind,int rc){
    if((ind==weights.length) || rc == 0)
      return 0;
    int next = ind + 1;
    if(weights[ind]>rc)
      return ks(weights,values,next,rc);
    int res1 = ks(weights,values,next,rc);
    int res2 =  values[ind] + ks(weights,values,next,rc-weights[ind]);
    
    return Math.max(res1, res2);
  }
  
}
