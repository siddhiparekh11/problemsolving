
package permuteelementarray;

public class PermuteElementArray {

  public static void main(String[] args) {
   
     /* char[] arr ={'a','b','c','d'};
      int[] p = {2,0,1,3};*/
     
     char[] arr ={'c','a','b'};
      int[] p = {2,0,1};
      int i=0;
      
      int j=0;
      while(i<p.length){
        if(p[i]!=i){
         char c = arr[p[i]];
         arr[p[i]] = arr[j];
         arr[j] = c;        
         int temp = p[p[i]];
         p[p[i]] = p[i];
         p[i]=temp;           
        }
        if(p[i]==i){
          i++;
          j++;
        }
      }
      
      System.out.println(arr);
      for(int k=0;k<p.length;k++)
        System.out.print(p[k]);
      
      
      
  }
  
}
