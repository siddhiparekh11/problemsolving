
package pkgsynchronized;

public class Synchronized {

  
  public static void main(String[] args) {
      Printer printer = new Printer();
      Services service1 = new Services(printer,"Thread 1");
      Services service2 = new Services(printer,"Thread 2");
      service1.start();
      service2.start();
  }
  
}
