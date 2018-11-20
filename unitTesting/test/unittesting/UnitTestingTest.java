/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author siddhiparekh11
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }
    
    

    /**
     * Test of addTwoNumbers method, of class UnitTesting.
     */
    @Test
    public void testAddTwoNumbers() {
        System.out.println("addTwoNumbers");
        UnitTesting instance = new UnitTesting(2,4);
        int expResult = 6;
        int result = instance.addTwoNumbers();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class UnitTesting.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UnitTesting.main(args);
        
    }
    
}
