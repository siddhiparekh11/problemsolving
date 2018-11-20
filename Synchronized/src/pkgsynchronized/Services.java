
package pkgsynchronized;

public class Services extends Thread{
  
  Printer printer;
  String threadName;
  
  public Services(Printer printer,String threadName){
    this.printer = printer;
    this.threadName = threadName;
  }
  
  public void run(){
    printer.print(threadName);
    System.out.println("I am executed");
  }
}
  

