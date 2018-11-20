
package genericexample1;

public class GenericExample1<T> implements Shape<T> {
  
  private T type;
  public GenericExample1(T type){
    this.type = type;
  }

  public static void main(String[] args) {
    
    GenericExample1<String> obj = new GenericExample1<String>("Rectangle");
    System.out.println(obj.getType());
    
  }

  @Override
  public T getType() {
    return type;
  }
  
}
