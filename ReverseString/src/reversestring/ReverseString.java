
package reversestring;


public class ReverseString {

  
  public static void main(String[] args) {
    
    String str ="Hello I am Siddhi.";
    char[] arr = str.toCharArray();
    int len = arr.length;
    
    for(int i=0;i<len/2;i++){
      char c = arr[len-1-i];
      arr[len-1-i] = arr[i];
      arr[i] = c;
    }
    
    System.out.println(String.valueOf(arr));
  }
  
}
