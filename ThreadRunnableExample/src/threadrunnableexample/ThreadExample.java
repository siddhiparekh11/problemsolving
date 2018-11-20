
package threadrunnableexample;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadExample extends Thread {
  
  public void run(){
    for(int i=0;i<100;){
      try {
        Thread.sleep(1000);
        System.out.println(i);
        i+=10;
      } catch (InterruptedException ex) {
        Logger.getLogger(ThreadRunnableExample.class.getName()).log(Level.SEVERE, null, ex);
      }     
   }
  }
  
}
