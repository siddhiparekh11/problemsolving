
package palindrome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Palindrome {

 
  public static void main(String[] args) throws FileNotFoundException, IOException {
     BufferedReader r = new BufferedReader(new FileReader("palindrome.in"));
    BufferedWriter w = new BufferedWriter(new FileWriter("output.in"));
    
    int n = Integer.valueOf(r.readLine());
    
    int counter = 1;
    while(r.ready()){
      String s = r.readLine();
      System.out.println(s);
      w.write("Case #" + counter + "\n");
      if(isPalindrome(s))
        w.write("yes" + "\n");
      else
        w.write("no" + "\n");
      counter++;
      
    }
    w.close();
    r.close();
    
    print();
  }
  
  public static void print() throws FileNotFoundException, IOException{
     BufferedReader r = new BufferedReader(new FileReader("output.in"));
     while(r.ready()){
       System.out.println(r.readLine());
     }
     r.close();
  }
  
  public static boolean isPalindrome(String s){
    
    int len = s.length();
      for(int i=0;i<len/2;i++){
        if(s.charAt(i)==s.charAt(len-1-i)){
          continue;
        }else{
          return false;
        }          
      }
      return true;
    
  }
  
}
