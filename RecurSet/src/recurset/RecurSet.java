
package recurset;

import java.util.ArrayList;


public class RecurSet {

    
    public static void main(String[] args) {
       
        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(3);
        set.add(2);
        set.add(1);
        
        ArrayList<ArrayList<Integer>> allsubsets = getSubset(set,0);
        for(ArrayList<Integer> subset: allsubsets)
        {
            System.out.println(subset);
        }
    }
    
    static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set, int index)
    {
        ArrayList<ArrayList<Integer>> allsubsets = null ;
        
        //base case ... we start building from bottom up i.e. {3},{2}, {3,2}
        if(set.size()==index)
        {
            allsubsets = new ArrayList<ArrayList<Integer>>();
            allsubsets.add(new ArrayList<Integer>()); // consider this as empty set
            
        }
        else
        {
            allsubsets = getSubset(set,index + 1);
            int item = set.get(index);
            
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
            for(ArrayList<Integer> subset: allsubsets)
            {
                ArrayList<Integer> newSubset = new ArrayList<Integer>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
                
            }
            allsubsets.addAll(moreSubsets);
        }
        
        return allsubsets;
        
    }
    
}
