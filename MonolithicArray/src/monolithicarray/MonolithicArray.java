
package monolithicarray;


public class MonolithicArray {

  public static void main(String[] args) {
    
   // int[] arr = {1,2,2,3};
  // int[] arr ={6,5,4,3,0};
  
  //int[] arr ={1};
  int[] arr = {1,2,2,-1,0,32};
    System.out.println(mono(arr));
    
  }
  
  public static boolean mono(int[] A){
    if(A.length==0)
            return false;
        if(A.length==1)
            return true;
        
        int flag=-1;
        
        for(int i=0;i<A.length-1;i++){
            if(A[i]<=A[i+1] && flag==0){
                flag=0;
                continue;               
            }else if(A[i]>=A[i+1] && flag==1){
                flag=1;
                continue;
            }else if(A[i]<=A[i+1] && flag==-1){
                flag=0;
                continue;                
            }else if(A[i]>=A[i+1] && flag==-1){
                flag=1;
                continue;                
            }else{
                return false;
            }
        }
        
        return true;

  }
  
}
