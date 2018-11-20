

import google2.Google2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Google2UnitTest {
  
  public Google2UnitTest() {
  }
  
  

  @Test
  public void testrecurMul(){
    
    int expres = 15;
    int actres = Google2.recurMul(5,3);
    assertEquals(expres, actres);
    
  }
}
