/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import google1.Google1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author siddhiparekh11
 */
public class NewEmptyJUnitTest {
  
  public NewEmptyJUnitTest() {
  }
  
 

  @Test
  public void testrecurMaxCont(){
    char[][] mat ={{'B','B','B'},{'*','*','B'},{'*','*','*'}};
    int exp = 4;
    int act = Google1.recurMaxCont(mat,0,0,0);
    assertEquals(exp, act);
    
  }
}
