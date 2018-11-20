
package stringbuilder;


public class StringBuild {

 
  public static void main(String[] args) {
    
    int x=10;
    int j=0;
    int k=j+=x/2;
    System.out.println(x + " " + j + " " + k);
    StringBuilder str = new StringBuilder();
    
    
    
    System.out.println(str.capacity());
    
   str.append("Siddhi");
    
   System.out.println(str);
   
   str.insert(6, "SiddhiParekh",6,12);
   
   System.out.println(str);
   
   /*str.setLength(4);
   
   System.out.println(str);*/
   
   str.delete(6, 12);
   
   System.out.println(str);
   
   str.reverse();
   
   System.out.println(str);
   
   str.replace(0, 6, "Siddhi");
   
   System.out.println(str);
   
   
    
    
    
    
  }
  
}
