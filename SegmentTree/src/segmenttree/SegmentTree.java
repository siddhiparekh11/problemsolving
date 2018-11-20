
package segmenttree;

public class SegmentTree {

  public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6};
    int len = arr.length;
    int[] tree = new int[(2*len)+2];
    buildTree(arr,0,5,1,tree);
  /*  for(int i=0;i<tree.length;i++)
      System.out.print(tree[i] + " ");*/
    
    int res = querysum(tree,1,0,len-1,1,5);
    System.out.println(res);
    
  }
  
  public static int querysum(int[] tree,int ti,int low,int high,int ql,int qh){
    if(ti>=tree.length)
      return 0;
    if((high<ql) ||(qh<low)){
      return 0; //query range completely outside
    }
    if((ql<=low) && (qh>=high)){
      return tree[ti]; //query range completely inside
    }
    int mid = (low + high)/2;
    int ls = querysum(tree,ti*2,low,mid,ql,qh);
    int rs = querysum(tree,ti*2+1,mid+1,high,ql,qh);
    return ls + rs;
  }
  public static void buildTree(int[] arr,int si,int ei,int ti,int[] tree){
    
    int mid;
    if(si==ei)
    {
      tree[ti] = arr[si];
      return;
    }
    mid = (si + ei)/2;
    buildTree(arr,si,mid,ti*2,tree);
    buildTree(arr,mid+1,ei,ti*2+1,tree);
    
    tree[ti] = tree[ti*2] + tree[ti*2+1];
    
    
  }
  
}
