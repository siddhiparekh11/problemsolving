
package staticblocks;

import static java.lang.Math.PI;


public class StaticBlocks {
    
    
    private int[] instancearr;
    
    private static int n;
    
    
    
    
    static {
        
        n=1; // you can do error handling and for loop constructs in such block
        
    }
    
    {
        instancearr = new int[5*n];
        
        for(int i=0;i<5*n;i++)
            instancearr[i]=i+1;
        n++;
    }

  
    public static void main(String[] args) {
        
        StaticBlocks ins1 = new StaticBlocks();
        
        System.out.println(PI);
        
        System.out.println("First Block");
        for(int i=0;i<ins1.instancearr.length;i++)
            System.out.println(ins1.instancearr[i]);
        
        StaticBlocks ins2 = new StaticBlocks();
        
        System.out.println("Second Block");
        for(int i=0;i<ins2.instancearr.length;i++)
            System.out.println(ins2.instancearr[i]);
        
        assert assertTest(2) == "two";
        
        
        
        
    }
    
    public static String assertTest(int i)
    {
        switch(i)
        {
            case 1:
                return "one";
            case 2:
                return "two";
            default:
                return "zero";
        }
    }
    
}
