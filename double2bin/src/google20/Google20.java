
package google20;

import java.util.TreeSet;
//cci binary 2 - double to binary
public class Google20 {

  public static void main(String[] args) {
    
    System.out.println(double2Binary(0.5));
  }
  
  public static String double2Binary(double num){
    if(num >= 1 && num <= 0)
      return "ERROR";
    StringBuilder binary = new StringBuilder();
    binary.append(".");
    while(num>0){
      if(binary.length()>=32){
        System.out.println(binary);
        return "ERROR";
      }
      double r  = num * 2;
      if(r >= 1){
        binary.append("1");
        num = r - 1;
      }else {
        binary.append("0");
        num = r;
      }
   }
    return String.valueOf(binary);
 }
  
  
}
