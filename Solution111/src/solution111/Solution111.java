
package solution111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Solution111 {

  public static void main(String[] args) {
   
    List<List<Integer>> forwardRouteList = new ArrayList<>();
    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(2000);
    forwardRouteList.add(a);
   /* a.clear();
    a.add(2);
    a.add(4000);
    forwardRouteList.add(a);
    a.add(3);
    a.add(6000);
    forwardRouteList.add(a);*/
     List<List<Integer>> returnRouteList = new ArrayList<>();
     List<Integer> b = new ArrayList<>();
    b.add(1);
    b.add(2000);
    returnRouteList.add(b);
    b.clear();
    b.add(2);
    b.add(2000);
    returnRouteList.add(b);
    
    List<List<Integer>> res = optimalUtilization(3000,forwardRouteList,returnRouteList);
    System.out.println("hello");
     
  }
  public static List<List<Integer>> optimalUtilization(int maxTravelDist, 
                                    List<List<Integer>> forwardRouteList,
                                    List<List<Integer>> returnRouteList)
      
	{
	    
	    List<Dis> dlist = new ArrayList<>();
	    for(int i=0;i<forwardRouteList.size();i++){
	        for(int j=0;j<returnRouteList.size();j++)
	        {
	            int tot = forwardRouteList.get(i).get(1) + returnRouteList.get(j).get(1);
	            List<Integer> list = new ArrayList<>();
	            list.add(forwardRouteList.get(i).get(0));
	            list.add(returnRouteList.get(j).get(0));
	            Dis d = new Dis(tot,list);
	            dlist.add(d);
	        }
	    }
	    Collections.sort(dlist,new DisCom());
	    List<List<Integer>> res = new ArrayList();
	   
	    for(int i=0;i<dlist.size();i++){
	        
	        if(dlist.get(i).tot==maxTravelDist){
	            res.add(dlist.get(i).cord);
	            
	        }
	        if((dlist.get(i).tot < maxTravelDist) && (res.size()==0)){
	            res.add(dlist.get(i).cord);
	            break;
	        }        
	    }
	    
	    return res;
	    
    }
    
}

class Dis {
    List<Integer> cord;
    int tot;
    Dis(int tot,List<Integer> cord){
        this.cord = cord;
        this.tot = tot;
    }
}

class DisCom implements Comparator<Dis> {
    @Override
    public int compare(Dis d1, Dis d2){
        if(d1.tot > d2.tot)
            return -1;
        else 
            return 1;
    }
}
}
