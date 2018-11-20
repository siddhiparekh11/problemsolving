
package simpledp;


public class SimpleDp {

    
    public static void main(String[] args) {
       
        int[] in={1,2,3,4,5};
        int [] out=new int[in.length];
        
        out[0]=1;
        System.out.println(out[0]);
        for(int i=1;i<in.length;i++)
        {
            out[i]=in[i]+out[i-1];
            System.out.println(out[i]);
        }
        
    }
    
}
