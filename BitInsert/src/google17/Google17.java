
package google17;

//cci bitwise 1
public class Google17 {

  
  public static void main(String[] args) {
    
    int result = bitInsertion(0,92,12,4);
    System.out.println(result);
    
  }
  
  public static int bitInsertion(int n,int m,int j,int i){
   
    //clear the bits from i through j in n
    int allOne = ~0;
    //clear all bits till j
    int left = allOne << (j+1);
    //set all bits after i to 1 ..remember u need to clear only bit from j to i
    int right = (1<<i) - 1;
    
    int mask = left | right;
    
    int n_cleared = n & mask; //you have cleared bits j through i in n
    System.out.println(n_cleared);
    int m_shifted = m << i; //move m into correct position
    
    return n_cleared | m_shifted;
    
  }
  
}
