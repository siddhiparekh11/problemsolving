
package timedifference;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class TimeDifference {

  private static int hits;
  public static void main(String[] args) {
    
    
    hits=0;
    LinkedHashMap<LocalDateTime,Integer> hitsCount = new LinkedHashMap<>();    
    hitsCount.put(LocalDateTime.now().minusMinutes(15), 5);
    hitsCount.put(LocalDateTime.now().minusMinutes(2), 4);
    hitsCount.put(LocalDateTime.now().minusMinutes(3), 3);
    hitsCount.put(LocalDateTime.now().minusMinutes(4), 2);
    hitsCount.put(LocalDateTime.now().minusMinutes(5), 1);
    hitsCount.put(LocalDateTime.now().minusMinutes(6), 11);
    
    System.out.println(getHits(hitsCount));
    
   
    
  }
  
  public static void logHits(LinkedHashMap<LocalDateTime,Integer> hitsCount){
    
    LocalDateTime dt = LocalDateTime.now();
    if(hitsCount.containsKey(dt))
    {
       int pval = hitsCount.get(dt);
       hitsCount.put(dt,pval+1);
    }else{
      hits = hits +1;
      hitsCount.put(dt,hits);
    }
   
  }
  
  public static int getHits(LinkedHashMap<LocalDateTime,Integer> hitsCount){
    
    LocalDateTime today = LocalDateTime.now();
    today = today.minusMinutes(6);
    LocalDateTime today1 = LocalDateTime.now();
    int result=0;
    for(Map.Entry<LocalDateTime,Integer> e:hitsCount.entrySet()){
      LocalDateTime curr = e.getKey();
      if(curr.isBefore(today1) && curr.isAfter(today))
        result = result + e.getValue();        
    }
    
    return result;
    
  }
  
  
  
}
