
package sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Sum {

  
  public static void main(String[] args) throws FileNotFoundException, IOException {
    
    BufferedReader r = new BufferedReader(new FileReader("sum_sample.in"));
    BufferedWriter w = new BufferedWriter(new FileWriter("output.in"));
    
    int n = Integer.valueOf(r.readLine());
    //System.out.println(n);
    
    for(int i=0;i<n;i++){
      String[] arr = r.readLine().split(" ");
      int sum = Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]);
     // System.out.println(sum);
      w.write("Case #" + (i+1) + "\n");
      w.write(sum+"\n");
    }
    w.close();
    r.close();
    r = new BufferedReader(new FileReader("output.in"));
    while(r.ready()){
      System.out.println(r.readLine());
    }
    r.close();
    
    
   
  }
  
}
