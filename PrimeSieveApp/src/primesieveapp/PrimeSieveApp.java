
package primesieveapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeSieveApp {

  public static void main(String[] args) {
   
    System.out.println(generatePrimes(20));
    
  }
  
  public static List<Integer> generatePrimes(int n){
    
    if(n<2){
      return Collections.EMPTY_LIST;
    }    
    List<Integer> primes = new ArrayList<>();
    List<Boolean> isPrime= new ArrayList<>(Collections.nCopies(n+1,Boolean.TRUE));
    isPrime.set(0, Boolean.FALSE);
    isPrime.set(1,Boolean.FALSE);    
    for(int p=2;p<=n;p++){
      if(isPrime.get(p)){
        primes.add(p);
        //Sieve p's multiples
        for(int i=p*2;i<=n;i+=2){
          isPrime.set(i,Boolean.FALSE);
        }
      }
    }    
    return primes;    
  }  
}
