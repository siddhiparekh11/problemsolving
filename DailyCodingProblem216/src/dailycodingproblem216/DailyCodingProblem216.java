
package dailycodingproblem216;

import java.util.HashMap;

public class DailyCodingProblem216 {

  public static void main(String[] args) {
    
    HashMap<Character,Integer> roman = new HashMap<>();
    roman.put('M',1000);
    roman.put('D', 500);
    roman.put('C',100);
    roman.put('L',50);
    roman.put('X',10);
    roman.put('V',5);
    roman.put('I',1);
    
    System.out.println(getDecimal(roman,"MCMIV"));
    
    
  }
  
  public static int getDecimal(HashMap<Character,Integer> roman,String rnum){
    char[] arr = rnum.toCharArray();
    int sum=0;
    for(int i=0;i<arr.length-1;i++){
      int num = roman.get(arr[i]);
      if(num>roman.get(arr[i+1])){
        sum+=num;
      }else{
        sum-=num;
      }
    }
    sum+=roman.get(arr[arr.length-1]);
    return sum;
  }
  
}
