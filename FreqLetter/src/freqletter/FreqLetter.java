
package freqletter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;


public class FreqLetter {

 
  public static void main(String[] args) throws FileNotFoundException, IOException {
    
    BufferedReader r = new BufferedReader(new FileReader("letter_frequencies.in"));
    BufferedWriter w = new BufferedWriter(new FileWriter("output.in"));
    
    int n = Integer.valueOf(r.readLine());
    int counter = 1;
    while(r.ready()){
      
      List<Freq> fList = calFreq(r.readLine());
      w.write("Case #" + counter + "\n");
      for(int i=0;i<fList.size();i++){
        if(fList.get(i).c==' ')
          continue;
        w.write(fList.get(i).c + " " + fList.get(i).f + "\n");
      }
      counter++;
      
      
    }
    w.close();
    r.close();
    print();
  }
  public static void print() throws FileNotFoundException, IOException{
    BufferedReader r = new BufferedReader(new FileReader("output.in"));
     while(r.ready()){
       System.out.println(r.readLine());
     }
     r.close();
  }
  public static List<Freq> calFreq(String str){
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
    
    List<Freq> fList = new ArrayList<>(freqMap.values());
    Collections.sort(fList,new FreqComparator());    
    
    return fList;
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
       return -1;
     }else if(o1.f < o2.f){
      return 1;
     }else{
       if(o1.c > o2.c){
         return 1;
       }else{
         return -1;
       }
       
     }
  }
    
  
}
