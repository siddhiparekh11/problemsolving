
package minnocoinsdp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class MinNoCoinsDP {

    
    public static void main(String[] args) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] coins={9,6,5,1};
        int n=11; // total required sum
        
        Arrays.sort(coins);
        int sum=0;
        int min=0;
        
        for(int i=0;i<=n;i++)
        {
            map.put(i,0);
        }
        
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            int i=e.getKey();
            for(int j=0;j<coins.length;j++)
            {
                sum=0;
               if(coins[j]<=i)
               {
                    if((map.containsKey(i-coins[j])) && (i==coins[j]+(i-coins[j])))
                    {
                        sum = 1 + map.get(i-coins[j]);
                    }
                    if(min==0)
                        min=sum;
                    else if(sum<=min)
                        min=sum;
                        
               }
               else
               {
                   
               }
            }
            
            map.put(i,min);
            min=0;
            
        }
        
        System.out.println(map.get(11));
        
    }
    
}
