
package coinwaysdp;


public class Coinwaysdp {

    
    public static void main(String[] args) {
        
        int[] coins = {2,3,4,5};
        int val = 7;        
        int res = getWays(val,coins,0);
        System.out.println(res);
    }
    
    public static int getWays(int val, int[] coins,int sind)
    {
        
        if(val==0)
            return 1;
        if(val < 0)
            return 0;        
        if(sind >= coins.length)
            return 0;
        
        return getWays(val-coins[sind],coins,sind) + getWays(val,coins,++sind);
        
        
        
       
        
        
         
         
    }
    
}
