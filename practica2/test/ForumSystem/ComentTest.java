/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import java.util.LinkedList;
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
public class ComentTest {
    
    public ComentTest() {
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
     * Test of getValoration method, of class Coment.
     */
    @Test
    public void testGetValoration() {
        System.out.println("getValoration");
        Coment instance = null;
        int expResult = 0;
        int result = instance.getValoration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getText method, of class Coment.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Coment instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNick method, of class Coment.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        Coment instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorants method, of class Coment.
     */
    @Test
    public void testGetValorants() {
        System.out.println("getValorants");
        Coment instance = null;
        LinkedList<NickVote> expResult = null;
        LinkedList<NickVote> result = instance.getValorants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValoration method, of class Coment.
     */
    @Test
    public void testSetValoration() {
        System.out.println("setValoration");
        int valoration = 0;
        Coment instance = null;
        instance.setValoration(valoration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setText method, of class Coment.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String Text = "";
        Coment instance = null;
        instance.setText(Text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class Coment.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String Nick = "";
        Coment instance = null;
        instance.setNick(Nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorants method, of class Coment.
     */
    @Test
    public void testSetValorants() {
        System.out.println("setValorants");
        LinkedList<NickVote> Valorants = null;
        Coment instance = null;
        instance.setValorants(Valorants);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VoteComent method, of class Coment.
     */
    @Test
    public void testVoteComent() {
        System.out.println("VoteComent");
        String Nick = "";
        boolean Vote = false;
        Coment instance = null;
        boolean expResult = false;
        boolean result = instance.VoteComent(Nick, Vote);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Coment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Coment instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
