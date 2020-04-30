/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSystem;

import java.io.File;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class BanTest {
    
    public BanTest() {
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

    /**
     * Test of getNick method, of class Ban.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        Ban instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsBanned method, of class Ban.
     */
    @Test
    public void testGetIsBanned() {
        System.out.println("getIsBanned");
        Ban instance = null;
        boolean expResult = false;
        boolean result = instance.getIsBanned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBeginDate method, of class Ban.
     */
    @Test
    public void testGetBeginDate() {
        System.out.println("getBeginDate");
        Ban instance = null;
        Date expResult = null;
        Date result = instance.getBeginDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Ban.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Ban instance = null;
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBans method, of class Ban.
     */
    @Test
    public void testGetBans() {
        System.out.println("getBans");
        Ban instance = null;
        File expResult = null;
        File result = instance.getBans();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class Ban.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String Nick = "";
        Ban instance = null;
        instance.setNick(Nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsBanned method, of class Ban.
     */
    @Test
    public void testSetIsBanned() {
        System.out.println("setIsBanned");
        boolean isBanned = false;
        Ban instance = null;
        instance.setIsBanned(isBanned);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBeginDate method, of class Ban.
     */
    @Test
    public void testSetBeginDate() {
        System.out.println("setBeginDate");
        Date beginDate = null;
        Ban instance = null;
        instance.setBeginDate(beginDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Ban.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        Date endDate = null;
        Ban instance = null;
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBans method, of class Ban.
     */
    @Test
    public void testSetBans() {
        System.out.println("setBans");
        File Bans = null;
        Ban instance = null;
        instance.setBans(Bans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ban.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ban instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
