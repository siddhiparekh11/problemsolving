/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author siddhiparekh11
 */
public class SimpleTestingTest {
    
    public SimpleTestingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class SimpleTesting.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SimpleTesting.main(args);
        
    }

    /**
     * Test of add method, of class SimpleTesting.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 4;
        int b = 5;
        int expResult = 9;
        int result = SimpleTesting.add(a, b);
        assertEquals(expResult, result);
       
    }
    
}
