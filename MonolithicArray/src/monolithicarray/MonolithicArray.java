
package monolithicarray;


public class MonolithicArray {

  public static void main(String[] args) {
    
   // int[] arr = {1,2,2,3};
  // int[] arr ={6,5,4,3,0};
  
  //int[] arr ={1};
  int[] arr = {1,1,0};
    System.out.println(mono(arr));
    
  }
  
  public static boolean mono(int[] A){
    boolean flag1,flag2;
        flag1=flag2=false;
        
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1])
                continue;
            if(A[i]<A[i+1])
                flag1=true;
            if(A[i]>A[i+1])
                flag2=true;      
            
        }
        
        if(flag1 && flag2)
                return false;
        
        if(flag1 && !flag2)
            return true;
        
        if(flag2 && !flag1)
           return true;
        
        return true;
        
       

  }
  
}
