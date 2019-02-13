
package minesweeper;

public class MineSweeper {

  private static int m = 3;
  public static void main(String[] args) {
    
    int[][] board = {{0,-1,0},{0,0,-1},{0,0,0}};
    int[][] dir ={{-1,0},{-1,-1},{-1,1},{0,-1},{1,0},{1,-1},{1,1},{0,1}};
    
    for(int i=0;i<m;i++){
      for(int j=0;j<m;j++){
        if(board[i][j]==-1)
          popAjc(board,dir,i,j);
      }
    }
    
    printBoard(board);
    
  }
  
  public static void printBoard(int[][]board){
    for(int i=0;i<m;i++){
      for(int j=0;j<m;j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  public static void popAjc(int[][]board,int[][] directions,int r,int c){
    
    for(int[] arr: directions){
      int nr= r + arr[0];
      int nc=c + arr[1];
      if((checkBounds(board,nr,nc))){
        board[nr][nc]+=1;
      }
    }
  }
  
  public static boolean checkBounds(int[][] board,int r,int c){
    if(r>2 || r<0)
      return false;
    if(c>2 || c<0)
      return false;
    if(board[r][c]==-1)
      return false;
    return true;
  }
  
}
