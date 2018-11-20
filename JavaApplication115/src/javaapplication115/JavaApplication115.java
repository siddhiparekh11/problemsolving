
package javaapplication115;


public class JavaApplication115 {

  private int a;
  
  public static void staticPrint(){
    System.out.println("Hello from super static");
  }
  
  JavaApplication115(int a){
    this.a=a;
  }
  public int getA(){
    System.out.println("Superclass method is called");
    return this.a;
  }
  /*public void print(){
    System.out.println("Hello from super");
  }*/
  public static void main(String[] args) {
    
    Derived d = new Derived(5);
    System.out.println(d.getA());
    JavaApplication115 obj = new Derived(6);
    d.print(); //interesting Interface2 method print will be called as it will override interface1 method
    /*obj = new JavaApplication115(7);
    obj.print();*/
    Derived.staticPrint();
    JavaApplication115.staticPrint();
    Experiment e = new Experiment();
    e.covariantRetType().getA();
    
  }
  
}
class Derived extends JavaApplication115 implements Interface1,Interface2{
  
  Derived(int a){
    super(a);
  }
 /* public void print(){
    System.out.println("Hello from Derived");
  }*/
  /*public int getA(){
    System.out.println("Derived class method is called");
    return -1;
  }*/
  
  public static void staticPrint(){
    System.out.println("Hello from subclass static");
  }
  
}

interface Interface1{
  default void print(){
    System.out.println("Hello from Interface1");
  }
}

interface Interface2 extends Interface1{
  default void print(){
    System.out.println("Hello from Interface2");
  }
}

class Experiment{
  public JavaApplication115 covariantRetType(){
    return new Derived(5);
  }
}