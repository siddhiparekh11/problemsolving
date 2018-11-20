
package google14;

//Permute with no duplicates

import java.util.ArrayList;

public class Google14 {

  
  public static void main(String[] args) {
    
    String s = "abcd";
    char[] carr = s.toCharArray();
    ArrayList<String> permutations = new ArrayList<String>();
    int ind = 0;
    permute("",carr,permutations,ind,s.length());
    for(int i=0;i<permutations.size();i++)
      System.out.println(permutations.get(i) + " " + (i+1));
  }
  
  public static void permute(String s, char[] carr,ArrayList<String> permutations,int ind,int tlen){
    
    if(s.length()==tlen){
      permutations.add(s);
      return;
    }
    for(int i=0;i<=s.length();i++){
      String newstr="";
      if(i==s.length()){
        newstr = s + String.valueOf(carr[ind]);
      }
      else{
          newstr = s.substring(0,i)+ String.valueOf(carr[ind]) + s.substring(i);
      }
     permute(newstr,carr,permutations,ind+1,tlen);
    }
    
    
  }
  
}
