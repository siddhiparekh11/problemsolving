/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import google3.Google3;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author siddhiparekh11
 */
public class Google3UnitTest {
  
  public Google3UnitTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }

  @Test
  public void testmagicIndex(){
    int[] arr={-2,-1,22,41,45};
    int exp=0;
    int act=Google3.magicIndex(arr,0,arr.length-1);
    assertEquals(exp, act);
  }
}
