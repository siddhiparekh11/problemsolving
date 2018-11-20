
package polymorphism;


public class Polymorphism {

  private int a;
  Polymorphism(){
    a=10;
  }
  public void print(){
    System.out.println(a);
  }
  public static void main(String[] args) {
    Polymorphism p = new Polymorphism(); // call superclass print 
    p.print();
    Polymorphism d = new Derived(); //call derived class print - virtual method invocation
    d.print();
  }
  
}

class Derived extends Polymorphism{
  private boolean a;
  Derived(){
    a=true;
  }
  public void print(){
    System.out.println(a);
  }
  
}
