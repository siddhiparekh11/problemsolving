
package javaapplication209;
 import java.util.List;
import java.math.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JavaApplication209 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  }
 


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants, 
                                         List<List<Integer>> allLocations, 
                                         int numRestaurants)
	{
	    
	    List<Loc> res = new ArrayList<>();
	    float ans=(float) 0.0;
	    for(int i=0;i<allLocations.size();i++){
	        int x = allLocations.get(i).get(0);
	        int y = allLocations.get(i).get(1);
	        ans = (float) Math.sqrt((x*x) + (y*y));
	        Loc l = new Loc(ans,allLocations.get(i));
	        res.add(l);
	    }
	    Collections.sort(res,new LocComp());
	    List<List<Integer>> r = new ArrayList<>();
	    for(int i=0;i<numRestaurants;i++){
	        r.add(res.get(i).cor);
	    }
	    
	    return r;
	    
	}
    
}
class Loc{
    float dis;
    List<Integer> cor;
    Loc(float dis,List<Integer> cor){
        this.dis = dis;
        this.cor = cor;
    }
    
}

class LocComp implements Comparator<Loc> {
    
    @Override
    public int  compare(Loc l1, Loc l2){
        if(l1.dis > l2.dis)
            return 1;
        else
            return -1;
            
    }
}
  

