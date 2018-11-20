
package nextclosesttime;

import java.util.HashSet;
import java.util.Set;

public class NextClosestTime {

  public static void main(String[] args) {
    
    String s = nextClosestTime("23:59");
    System.out.println(s);
   
  }
  
  
    public static String nextClosestTime(String time) {
      
        int cur = 60 * Integer.parseInt(time.substring(0, 2));
      //  System.out.println(cur);
       // System.out.println(time.substring(3));
        cur += Integer.parseInt(time.substring(3)); //you get the total minutes
         System.out.println(cur);
        Set<Integer> allowed = new HashSet();
        for (char c: time.toCharArray()) if (c != ':') {         
          allowed.add(c-'0');
        }
        System.out.println(6%10);

        while (true) {
            cur = (cur + 1) % (24 * 60);
          System.out.println(cur);
            int[] digits = new int[]{cur / 60 / 10, cur / 60 % 10, cur % 60 / 10, cur % 60 % 10};
        
            search : {
                for (int d: digits) if (!allowed.contains(d)) break search;
                return String.format("%02d:%02d", cur / 60, cur % 60);
            }
        }
    }
}
  

