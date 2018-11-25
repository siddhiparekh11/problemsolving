
package graycode;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

  public static void main(String[] args) {
    
   List<Integer> codes = grayCode(3);
   for(int i=0;i<codes.size();i++){
     System.out.println(codes.get(i));
   }
   
  }
  
  public static List<Integer> grayCode(int n) {
        
        List<Integer> codes = new ArrayList<>();
        grayCodeUtil(codes,n,0);
        return codes;
        
    }
    
    public static void grayCodeUtil(List<Integer> codes,int n,int num){
        
        //base case ..when there are no bits left
        if(n==0){
            codes.add(num);
            return;
        }
        //not inverting the current bit
        grayCodeUtil(codes,n-1,num);
        num = num ^ (1<<n-1);
        //inverting the current bit
        grayCodeUtil(codes,n-1,num);       
        
    }
  
}
