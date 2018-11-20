
package pkgabstract;


public class Abstract extends One {

  
  public static void main(String[] args) {
    
    One obj = new Abstract();
    obj.seta(20);
    obj.print();
   
  }
  
  void print(){
    System.out.println(this.geta());
  }
  
}

abstract class One{
  private int a;
  void seta(int a){
    this.a=a;
  }
  int geta(){
    return this.a;
  }
  abstract void print();
}