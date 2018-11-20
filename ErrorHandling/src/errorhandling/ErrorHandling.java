
package errorhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class ErrorHandling {

  
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(10);
   /* ArrayList<Integer> list2=null;*/
   try{
    for(int i=0;i<10;i++){
      list.add(i+1);
    }}finally{}
   
  /*  try(PrintWriter p = new PrintWriter(new File("test.txt"))){
      p.println("Hello World");
    }catch(Exception e){
      e.printStackTrace();
    }*/
    try{
      System.out.println(list.get(12));
      
    }catch(Exception e){ // catch(except1|except2 e) for defining multiple exception in single catch block
      e.printStackTrace();
    }
    /*catch(NullPointerException e){
      System.out.println("Null Pointer Exception");
    }*/
  }
  
}
