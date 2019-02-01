/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplevisa;

/**
 *
 * @author siddhiparekh11
 */
public class Samplevisa {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    int x = 2437;
    int y = 875;
    
    while(true){
      if(x==y)
        break;
      if(x>y)
        x= x-y;
      else
        y=y-x;
    }
    
    System.out.println(x+ " " + y);
  }
  
}
