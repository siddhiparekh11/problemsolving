package google2;


public class Google2 {

 
  public static void main(String[] args) {
    
    System.out.println(recurMul(9,3));
    
  }
  
 public static int recurMul(int smaller,int bigger){

	
   if(smaller==0)
 		return 0;
  if(smaller==1)
 		return bigger;

  int newsmall = smaller/2;
  int res1 = changeBigSmall(newsmall,bigger);
  int res2=0;
  if(smaller%2==0){
  	res2 = res1;
  }else{
  	res2 = res1 + bigger;
  }
  return res1 + res2;
}

//you do 4 * 3 or 3 * 4 it doesn’t matter … in fact 3 * 4 will be faster
public static int changeBigSmall(int smaller,int bigger){

    int s = smaller < bigger ? smaller : bigger;
    int b = smaller > bigger ? smaller : bigger;

   return recurMul(s,b);

}

  
}
