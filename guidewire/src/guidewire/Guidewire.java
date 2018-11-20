
package guidewire;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;



public class Guidewire {

  
  public static void main(String[] args) {
   DateFormat formatter = new SimpleDateFormat("dd.mm.yyyy");
   String s ="789 20.07.2001 sdsd.html\n 89 21.07.2000 sdsd.txt\n";      
   
   ArrayList<Date> dates = new ArrayList<Date>();
        String[] lines = s.split("\n");
        
        for(int i=0;i<lines.length;i++){
            String[] q = lines[i].trim().split(" ");
            
            double b = Double.valueOf(q[0].trim());
            if(b > (80 * Math.pow(2,10)))
              continue;
            
            String name = q[2];
            name = name.toLowerCase();
            if(name.contains(".txt") || name.contains(".xml") || name.contains(".html")){
               try{
                dates.add(formatter.parse(q[1]));
               }catch(Exception e){
                   
               }
            }
            else
               continue;
  }
        Collections.sort(dates);
        System.out.println(dates.get(0));
  
}
}
