
package google1;


public class Google1 {

  static int[][] visited = new int[3][3];
  static final int ROW=3;
  static final int COL=3;
  
  public static void main(String[] args) {
    
    char[][] mat = { {'B','*','*'},{'*','B','*'},{'*','*','B'}};
    
    for(int i=0;i<ROW;i++){
      for(int j=0;j<COL;j++){
        visited[i][j]=0;
      }
    }
    
    int max=0;
    System.out.println(recurMaxCont(mat,1,1,max));
  }
  
  public static boolean isCellValid(int row,int col){
    if((row > ROW -1) || (row < 0))
      return false;
    if((col > COL-1) || (col<0))
      return false;
    return true;
  }
  
  public static boolean isCellVisited(int row,int col){
    if(visited[row][col]==1)
      return true;
    return false;
  }
  
  public static int recurMaxCont(char[][] mat,int row,int col,int max){
    //System.out.println("Row " + row + " Column " + col);
    int count = 0;
    if(!isCellValid(row,col))
      return 0;
    if(isCellVisited(row,col))
       return 0;
    
    visited[row][col]=1;
    if(mat[row][col]=='*')
      return 0;
      count+=1;
    count+=recurMaxCont(mat,row+1,col,max);
    count+=recurMaxCont(mat,row-1,col,max);
    count+=recurMaxCont(mat,row,col+1,max);
    count+=recurMaxCont(mat,row,col-1,max);
    
    max=(count >= max)?count:max;
    return max;
  }
  
  
  
  
}
