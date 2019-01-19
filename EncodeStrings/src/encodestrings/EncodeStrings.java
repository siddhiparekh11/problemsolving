
package encodestrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EncodeStrings {

 
  public static void main(String[] args) {
    encode("abbcadac");
  }
  
  public static void encode(String str){
    HashMap<Character,Freq> freqMap = new HashMap<>();
    
    for(int i=0;i<str.length();i++){
      char c = str.charAt(i);
      Freq f;
      if(freqMap.containsKey(c)){
        f = freqMap.get(c);
        f.f++;
      }else{
         f = new Freq(c,1);
        freqMap.put(c,f);
      }      
    }
    
   // printMap(freqMap);
    System.out.println("---------------");
    List<Freq> fList = new ArrayList<>(freqMap.values());
    Collections.sort(fList,new FreqComparator());    
    printList(fList);
    System.out.println("-------------");
    
    HashMap<Character,String> pattern = new HashMap<>();
    String s ="1";
    for(int i=0;i<fList.size();i++){
      if(i==0){
        pattern.put(fList.get(i).c,s);
      }else{
        s = "0" + s;
        pattern.put(fList.get(i).c,s);
      }
    }
    
    for(Map.Entry<Character,String> e: pattern.entrySet()){
      System.out.println(e.getKey() + " " + e.getValue());
    }
    
    
  }
  
  public static void printList(List<Freq> list){
    for(int i=0;i<list.size();i++)
      System.out.println(list.get(i).c + " " +list.get(i).f);
  }
  
  public static void printMap(HashMap<Character,Freq> map){
    
    for(Map.Entry<Character,Freq> e: map.entrySet()){
      System.out.println(e.getValue().c + " " + e.getValue().f);
    }
    
  }
  
}

class Freq {
  char c;
  int f;
  Freq(char c,int f){
    this.c =  c;
    this.f = f;
  }
}

class FreqComparator implements Comparator<Freq> {

  @Override
  public int compare(Freq o1, Freq o2) {
     if(o1.f > o2.f){
       return 1;
     }
     return -1;
  }
    
  
}
