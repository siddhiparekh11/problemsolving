
package reversewordsinsentence;

public class ReverseWordsInSentence {

  public static void main(String[] args) {
    
    System.out.println(reverseSentence("ram is costly"));
    
  }
  
  
  //ram is costly
  //yltsoc si mar
  public static String reverseSentence(String str){
    
    int s = 0;
    int e = str.length() -1;
    char[] arr =str.toCharArray();
    reverse(arr,0,e);
    s=0;
    e=0;
    int len = str.length();
    while(s<len){
      while(s<e||s<len&&arr[s]==' ')//s<e is for the second and so forth iteration
        s++;
      while(e<s||e<len&&arr[e]!=' ')//e<s is for the second and so forth iteration
        e++;
      reverse(arr,s,e-1);
    }
    return String.valueOf(arr);
  } 
  
  public static void reverse(char[] arr,int start,int end){
    while(start<end){
      char c = arr[start];
      arr[start]=arr[end];
      arr[end] = c;
      start++;
      end--;
    }
  }
  
}
