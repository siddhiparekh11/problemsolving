
package reversestringpunctuation;

public class ReverseStringPunctuation {

  public static void main(String[] args) {
    
    
    String str ="hello$$$$$$$$$world";
    char[] arr = str.toCharArray();
    
    int i =0;
    int j = str.length()-1;
    
    while(i<j){
      char c1 = str.charAt(i);
      char c2 = str.charAt(j);
      if(Character.isLetter(c1) && Character.isLetter(c2)){
        swap(i,j,arr);
        i++;
        j--;
      }else if(Character.isLetter(c1) && !Character.isLetter(c2)){
        j--;
      }else if(!Character.isLetter(c1) && Character.isLetter(c2)){
        i++;
      }else{
        i++;
        j--;
      }
    }
    
    System.out.println(String.valueOf(arr));
    
  }
  
  public static void swap(int i,int j,char[] arr){
    char temp =arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
}
