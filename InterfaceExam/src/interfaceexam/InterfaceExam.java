
package interfaceexam;

public class InterfaceExam implements java.lang.CharSequence{

  String str;
  public static void main(String[] args) {
    InterfaceExam i = new InterfaceExam();
    System.out.println(i.length());
    System.out.println(i.charAt(6));
    System.out.println(i.subSequence(0, 12));
    
  }
  
  InterfaceExam(){
    str = "hkeraPihddiS";
  }
  
  public int returnInd(int ind){
    int len = str.length()-1;
    return len - ind;
  }
  
  

  @Override
  public int length() {
    
    return returnInd(0) + 1;
  }

  @Override
  public char charAt(int index) {
    
    if(index < 0 || index >= str.length())
      throw new IndexOutOfBoundsException();
    
    return str.charAt(returnInd(index));
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    
    if(start==end)
      return "";
    
    if((start >= str.length()) || (start < 0))
      throw new IndexOutOfBoundsException();
    
    if((end > str.length()) || (end < 0))
      throw new IndexOutOfBoundsException();
    
    
    
    int newstart = returnInd(start);
    int newend = returnInd(end);
    String res = "";
    
    for(int i=newstart;i>newend;i--)
    {
      res = res + str.charAt(i);
    }
    
    return res;
   }
  
  
  
}
