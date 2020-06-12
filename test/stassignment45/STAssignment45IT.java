/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stassignment45;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USMAN
 */
public class STAssignment45IT {
    
    public STAssignment45IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
     STAssignment45 st;
    @Before
    public void setUp() {
       st= new STAssignment45();
         System.out.println("Function are being tested.");
    }
    
    @After
    public void tearDown() {
         System.out.println("Function are being Sucessfull tested.");
    }

    /**
     * Test of  method, of class STAssignment45.
     */
    @Test
    public void testLicence() {
      String expresult1 = "You have passed the TEST";
        String expresult2 = "TestFailed"; 
        String result1 = st.Licence(18,85,90,80,81,10);
        assertEquals(expresult1, result1);
         String result2 = st.Licence(19,85,20,85,70,20);
        assertEquals(expresult2, result2);
         String result3 = st.Licence(20,70,91,90,85,8);
        assertEquals(expresult2, result3);
         String result4 = st.Licence(20,70,50,90,70,30);
        assertEquals(expresult2, result4);
         String result5 = st.Licence(10,90,95,70,90,2);
        assertEquals(expresult2, result5);
         String result6 = st.Licence(10,90,40,60,40,40);
        assertEquals(expresult2, result6);
         String result7 = st.Licence(15,60,95,50,90,5);
        assertEquals(expresult2, result7);
         String result8 = st.Licence(14,60,76,40,20,80);
        assertEquals(expresult2, result8);
    }
    
}
