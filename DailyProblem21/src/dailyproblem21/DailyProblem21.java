
package dailyproblem21;


//product of array puzzle
public class DailyProblem21 {

   
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        int len = arr.length;
        int[] newarr = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];
        
        //initialize the result array with 1
        for(int i=0;i<len;i++)
            newarr[i]=1;
        
        //populating left arr
        for(int i=0;i<len;i++)
        {
            if(i==0)
                left[i]=1;
            else
                left[i]=left[i-1]*arr[i-1];
            
            
        }
        
        //populating the right array
        for(int i=len-1;i>=0;i--)
        {
            if(i==len-1)
                right[i]=1;
            else
                right[i]=right[i+1] * arr[i+1];
        }
        
        //final product array
        for(int i=0;i<len;i++)
        {
            newarr[i]=left[i]*right[i];
            System.out.println(newarr[i]);
        }
      
    
    }
    
}
