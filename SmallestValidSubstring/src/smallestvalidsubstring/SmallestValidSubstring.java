
package smallestvalidsubstring;

import java.io.*;
import java.util.*;
public class SmallestValidSubstring {
// xyyzyzyx


  static String getShortestUniqueSubstring(char[] arr, String str) {
    /* keep track of characters of array present in the string,
    keep track of the starting index and ending index of the substring,
    once the substring containing all the array characters found check its lenght, 
    if the min length is equal to the length of the array then return the string else repeat the steps
    keep a condition for characters not present */
    
    int hindex,tindex,uniArrCount;
    hindex=tindex=uniArrCount=0;
    String result="";
    
    
    //maintain a hashmap for the count of unique array characters in the string
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    int arrLen=arr.length;
    
    //initialize the hashmap
    for(int i=0;i<arrLen;i++)
    {
     
        map.put(arr[i],0);
    }
    
    String subStr;
    //find the minimum substring
    for(int i=0;i<str.length();i++)
    {
      tindex=i;
      char tchar=str.charAt(tindex);
      if(!map.containsKey(tchar))
         continue;
      if(map.get(tchar)==0 && uniArrCount!=arrLen)
         uniArrCount=uniArrCount+1;
      map.put(tchar,map.get(tchar)+1);
      
      //check if current substring contains all the array characters
      while(uniArrCount==arrLen)
      {
        int temLen = tindex - hindex + 1;
        //minimum length cannot be less than array length
        if(temLen==arrLen)
          return str.substring(hindex,tindex+1);
        if(result.equals("")||temLen>arrLen)
          result=str.substring(hindex,tindex+1);
        
       // System.out.println(result);
        
       
        
        char hchar=str.charAt(hindex);
        int hCount=0;
        if(map.containsKey(hchar))
            hCount=map.get(hchar);
        
        if(hCount-1==0)
          uniArrCount=uniArrCount-1; //this will break the inner loop
        
        if(map.containsKey(hchar))    
            map.put(hchar,hCount-1);
        hindex = hindex +1;
        
        
      }
    }
    
    return result;
    
    
    
  }

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    //enter the length of the array
    int n=sc.nextInt();
    char[] arr=new char[n];
    //fill the character array
    for(int i=0;i<n;i++)
    {
       arr[i]=sc.next().charAt(0);
    }
    //get the string
    String str;
    str=sc.next();
    //pass the character array and string to the function
    String res = getShortestUniqueSubstring(arr,str);
    System.out.println(res);

  }

}
    

