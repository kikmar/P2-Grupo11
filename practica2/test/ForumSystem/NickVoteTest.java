/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

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
public class NickVoteTest {
    
    public NickVoteTest() {
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
     * Test of getNick method, of class NickVote.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        NickVote instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVote method, of class NickVote.
     */
    @Test
    public void testIsVote() {
        System.out.println("isVote");
        NickVote instance = null;
        boolean expResult = false;
        boolean result = instance.isVote();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class NickVote.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String Nick = "";
        NickVote instance = null;
        instance.setNick(Nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVote method, of class NickVote.
     */
    @Test
    public void testSetVote() {
        System.out.println("setVote");
        boolean Vote = false;
        NickVote instance = null;
        instance.setVote(Vote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class NickVote.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        NickVote instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
