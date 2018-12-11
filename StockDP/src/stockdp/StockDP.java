
package stockdp;

import java.util.Arrays;

//i think this a greedy solution
public class StockDP {

  public static void main(String[] args) {
    
   // int[] stocks = {7,1,5,3,6,4};
    int[] stocks = {7,6,4,3,1};
    int profit=0;
    int transaction  = 0;
    
    for(int i=0;i<stocks.length;i++){
      if(i==0){
        transaction=stocks[i];        
      }else{
        int diff = stocks[i] - transaction;
        if(diff<0){
          transaction = stocks[i];
        }else{
          if(diff>stocks[i]){
            transaction = stocks[i];
          }else{
            profit = Math.max( profit, diff);
          }
        }
      }
    }
    System.out.println(profit);
    
    
  }
  
}
