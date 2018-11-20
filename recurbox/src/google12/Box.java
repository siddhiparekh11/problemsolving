
package google12;


public class Box {
  
  int w;
  int h;
  int l;
  
  Box(int l,int w,int h){
    this.w = w;
    this.l = l;
    this.h = h;
  }
  
  //this can be any valid calculation
  public boolean canBeAbove(Box b){
    if((this.w <= b.w) && (this.l <= b.l) && (this.h <= b.h))
      return true;
    return false;
  }
  
}
