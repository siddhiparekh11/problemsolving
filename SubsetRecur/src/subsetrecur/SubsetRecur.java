
package subsetrecur;


public class SubsetRecur {

 
  public static void main(String[] args) {
     int[] arr = {1,2,3,4};
     String result = "";
     int currInd = 0;
     recurSubset(arr,currInd,result);
  }
  
  public static void recurSubset(int[] arr,int currInd,String result){
    if(currInd == arr.length){
      System.out.println(result);
      return;
    }
    recurSubset(arr,currInd+1,result);
    recurSubset(arr,currInd+1,result+arr[currInd]);
  }
    
  
}
