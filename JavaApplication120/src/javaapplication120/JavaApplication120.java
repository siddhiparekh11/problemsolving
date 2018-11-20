
package javaapplication120;

import java.util.ArrayList;


public class JavaApplication120 {

  
  public static void main(String[] args) {
   
    Boolean b = new Boolean("TRUE");
    boolean b1 = new Boolean("null");
    System.out.println(b + " " + b1);
    
    
    Person[] arr = new Person[2];
    arr[1] = new Person();
    arr[2] = new Person();
    System.out.println(arr[0].age);
    
    
   
  
  
}
}

class Person {
  
  int age=10;
  
  
}
