
package replaceandremove;

public class ReplaceAndRemove {

  public static void main(String[] args) {
    
    char[] arr = new char[7];
    arr[0]='a';
    arr[1]='c';
    arr[2]='a';
    arr[3]='a';
    
    System.out.println(replaceRemove(4,arr));
    System.out.println(String.valueOf(arr));
   
  }
  
  public static int replaceRemove(int size,char[] arr){
    //size = no. of entries in arr on which operations need to be performed
    //forward iteration remove 'b' and count the occurences of 'a'
    int writeInd=0;
    int aCount=0;
    
    //a,c,d,b,b,c,a -> a,c,d,c,a
    for(int i=0;i<size;i++){
      if(arr[i]!='b')
        arr[writeInd++]=arr[i];
      if(arr[i]=='a')
        aCount++;
    }
    
    //backward iteration replaces 'a' with 'dd'
    int curInd = writeInd -1;
    writeInd = writeInd+aCount-1;
    final int finalSize = writeInd+1;
    while(curInd>=0){
      if(arr[curInd]=='a'){
        arr[writeInd--]='d';
        arr[writeInd--]='d';
      }else{
        arr[writeInd--]=arr[curInd];
      }
      curInd--;
    }
    
    return finalSize;
    
  }
  
}
