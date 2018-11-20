
package google23;

import java.util.ArrayList;
import java.util.Iterator;

//cci bitwise 3

public class Google23 {

 
  public static void main(String[] args) {
    
    //longestSeq(1775);
    System.out.println(optimalSolLongSeq(23));
  }
  
  public static int longestSeq(int n){
    if(n==-1)
      return Integer.BYTES * 8;
    System.out.println(Integer.toBinaryString(n));
    ArrayList<Integer> sequences = getAlternatingSeq(n);
    Iterator i = sequences.iterator();
    //Alternating sequences 1 and 0 and their count
    while(i.hasNext()){
      System.out.println(i.next());
    }
    System.out.println(findLongestSeq(sequences));
    
    return -1;
  }
  
  public static ArrayList<Integer> getAlternatingSeq(int n){
    
    ArrayList<Integer> sequences = new ArrayList<>();
    
    int searchFor = 0;
    int counter = 0;
    
    for(int i=0;i<Integer.BYTES*8;i++){
      if((n & 1)!=searchFor){
        sequences.add(counter);
        searchFor = n & 1;
        counter = 0;
      }
      counter++;
      n >>>= 1;
    }
    sequences.add(counter);
    return sequences;
 }
  
 public static int findLongestSeq(ArrayList<Integer> sequences){
   int max = 1;
   int len = sequences.size();
   //i+=2 because we are only looking at sequences that are zero's sequences
   for(int i=0;i<len;i+=2){
     int zeroSeq = sequences.get(i);
     int oneLeftSeq = (i+1)<len?sequences.get(i+1):0;
     int oneRightSeq = (i-1)>=0?sequences.get(i-1):0;
     int thisSeq = 0;
     
     //merging
     if(zeroSeq==1){
       thisSeq = 1 + oneLeftSeq + oneRightSeq;
     }else if(zeroSeq>1){
       thisSeq = 1 + Math.max(oneLeftSeq, oneRightSeq);
     }else if(zeroSeq==0){
       thisSeq = Math.max(oneLeftSeq, oneRightSeq);
     }
     max = Math.max(thisSeq,max);
   }
   
   return max;
 } 
 
 public static int optimalSolLongSeq(int n){
   
   if((~n)==0)
     return Integer.BYTES * 8;
   int prevL=0;
   int currL=0;
   int max = 1; //you need to flip a zero bit to 1
   
   while(n!=0){
     if((n&1)!=0) //counting 1 sequence
       currL++;
     else if((n&1)==0){
       prevL=(n&2)==0?0:currL; //checking if the next bit to 0 is zero
       currL=0;
     }
     max = Math.max(prevL+currL+1,max);
     n>>>=1;
   }
   
   return max;
   
 }
    
  }
  

