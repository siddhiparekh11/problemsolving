
package threadrunnableexample;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadRunnableExample implements Runnable {

 
  public static void main(String[] args) {
    
    //ThreadRunnableExample instance = new ThreadRunnableExample();
    //Thread thread = new Thread(instance);
    //thread.start();
    
    ThreadExample thread = new ThreadExample();
    thread.start();
    
  }

  @Override
  public void run() {
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
