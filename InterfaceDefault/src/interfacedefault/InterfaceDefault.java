
package interfacedefault;


public class InterfaceDefault implements Example {

 
  public static void main(String[] args) {
    
    Example obj = new InterfaceDefault();
    obj.sayHello();
    Example.sayHelloStatic();
    System.out.println(Example.PI);
    
  }
  
}

interface Example{
  
  double PI = 4.5;
  default void sayHello()
  {
    System.out.println("Hello from the interface");
  }
  static void sayHelloStatic()
  {
    System.out.println("Hello from static method of interface");
  }
}
