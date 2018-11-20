
package pkgsynchronized;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Printer {
  
  synchronized void print(String thread){
    for(int i=0;i<100;){
      try {
        Thread.sleep(1000);
        System.out.println(thread + i);
        i=i+10;
      } catch (InterruptedException ex) {
        System.out.println(thread + " is interrupted");
        return;
      }    
   }  
  }
}
