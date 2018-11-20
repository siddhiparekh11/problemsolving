
package google15;

//permute with duplicates

import java.util.ArrayList;
import java.util.HashMap;

public class Google15 {

 
  public static void main(String[] args) {
    
    String str ="aac";
    HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
    ArrayList<String> permutations  = new ArrayList<String>();
    createHashTb(hashmap,str);
    permute("",hashmap,permutations,str.length());
    for(int i=0;i<permutations.size();i++){
      System.out.println(permutations.get(i));
    }
  }
  
  public static void createHashTb(HashMap<Character,Integer> hmap, String str){
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      if(!hmap.containsKey(c)){
        hmap.put(c, 1);
      }else{
        hmap.put(c,hmap.get(c)+1);
      }
    }
  }
  
  public static void permute(String str, HashMap<Character,Integer> hmap,ArrayList<String> permutations,int rem){
    if(rem==0){
      permutations.add(str);
      return;
    }
    for(char c: hmap.keySet()){
      int count = hmap.get(c);
      if(count>0){
        hmap.put(c, count-1);
        permute(str+c,hmap,permutations,rem-1);
        hmap.put(c,count);
      }
    }
  }
  
}
