
package degreeofarray;

import java.util.HashMap;
import java.util.Map;


public class DegreeofArray {

    
    public static void main(String[] args) {
        
        int[] arr={1,2,2,3,1,4,2};
        int res;
        res = findMaxDegree(arr);
        
        System.out.println(res);
        
    }
    
    static int findMaxDegree(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> startIndex = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> endIndex = new HashMap<Integer,Integer>();
        
        
        int max=0;
        for(int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i]))
            {
                map.replace(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i],1);
                startIndex.put(arr[i], i);
            }
            endIndex.put(arr[i], i);
            if(max<map.get(arr[i]))
                max=map.get(arr[i]);
        }
        int min=0;
        boolean flag=false;
        
        for (int i=0;i<arr.length;i++)
        {
            if (max == map.get(arr[i]))
            {
                int diff = endIndex.get(arr[i]) - startIndex.get(arr[i]);
                if (flag)
                    min=Integer.min(min, diff);
                else
                {
                    min=diff;
                    flag=true;
                }
            }
        }
        return min+1;
    }
    
    
    
}
