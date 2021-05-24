/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenckwong.ngecryptotrader.tests;

import com.stevenckwong.ngecryptotrader.web.GetNewFeatures;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author steven
 */
public class ProcessRequestTest {
    
    public ProcessRequestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testNewContent() {
        GetNewFeatures nf = new GetNewFeatures();
        String initialString = nf.newContent();
        assertTrue(initialString.contains("<h2>Existing Features</h2>"));
        //assertTrue(initialString.contains("Old Feature"));
    }
}
