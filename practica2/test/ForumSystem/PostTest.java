/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import ForumSystem.PostContent.Content;
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
public class PostTest {
    
    public PostTest() {
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
     * Test of getTittle method, of class Post.
     */
    @Test
    public void testGetTittle() {
        System.out.println("getTittle");
        Post instance = null;
        String expResult = "";
        String result = instance.getTittle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValoration method, of class Post.
     */
    @Test
    public void testGetValoration() {
        System.out.println("getValoration");
        Post instance = null;
        int expResult = 0;
        int result = instance.getValoration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisibility method, of class Post.
     */
    @Test
    public void testIsVisibility() {
        System.out.println("isVisibility");
        Post instance = null;
        boolean expResult = false;
        boolean result = instance.isVisibility();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class Post.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        Post instance = null;
        String expResult = "";
        String result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValid method, of class Post.
     */
    @Test
    public void testGetValid() {
        System.out.println("getValid");
        Post instance = null;
        int expResult = 0;
        int result = instance.getValid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContentList method, of class Post.
     */
    @Test
    public void testGetContentList() {
        System.out.println("getContentList");
        Post instance = null;
        LinkedList<Content> expResult = null;
        LinkedList<Content> result = instance.getContentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorantsList method, of class Post.
     */
    @Test
    public void testGetValorantsList() {
        System.out.println("getValorantsList");
        Post instance = null;
        LinkedList<NickVote> expResult = null;
        LinkedList<NickVote> result = instance.getValorantsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentList method, of class Post.
     */
    @Test
    public void testGetComentList() {
        System.out.println("getComentList");
        Post instance = null;
        LinkedList<Coment> expResult = null;
        LinkedList<Coment> result = instance.getComentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTittle method, of class Post.
     */
    @Test
    public void testSetTittle() {
        System.out.println("setTittle");
        String Tittle = "";
        Post instance = null;
        instance.setTittle(Tittle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValoration method, of class Post.
     */
    @Test
    public void testSetValoration() {
        System.out.println("setValoration");
        int Valoration = 0;
        Post instance = null;
        instance.setValoration(Valoration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisibility method, of class Post.
     */
    @Test
    public void testSetVisibility() {
        System.out.println("setVisibility");
        boolean Visibility = false;
        Post instance = null;
        instance.setVisibility(Visibility);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class Post.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        String Owner = "";
        Post instance = null;
        instance.setOwner(Owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValid method, of class Post.
     */
    @Test
    public void testSetValid() {
        System.out.println("setValid");
        int Valid = 0;
        Post instance = null;
        instance.setValid(Valid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContentList method, of class Post.
     */
    @Test
    public void testSetContentList() {
        System.out.println("setContentList");
        LinkedList<Content> ContentList = null;
        Post instance = null;
        instance.setContentList(ContentList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentList method, of class Post.
     */
    @Test
    public void testSetComentList() {
        System.out.println("setComentList");
        LinkedList<Coment> ComentList = null;
        Post instance = null;
        instance.setComentList(ComentList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorantsList method, of class Post.
     */
    @Test
    public void testSetValorantsList() {
        System.out.println("setValorantsList");
        LinkedList<NickVote> ValorantsList = null;
        Post instance = null;
        instance.setValorantsList(ValorantsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Coment method, of class Post.
     */
    @Test
    public void testComent() throws Exception {
        System.out.println("Coment");
        String Nick = "";
        String Text = "";
        Post instance = null;
        instance.Coment(Nick, Text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VotePost method, of class Post.
     */
    @Test
    public void testVotePost() {
        System.out.println("VotePost");
        String Nick = "";
        boolean Vote = false;
        Post instance = null;
        boolean expResult = false;
        boolean result = instance.VotePost(Nick, Vote);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Share method, of class Post.
     */
    @Test
    public void testShare() {
        System.out.println("Share");
        Post instance = null;
        String expResult = "";
        String result = instance.Share();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar method, of class Post.
     */
    @Test
    public void testMostrar() {
        System.out.println("Mostrar");
        Post instance = null;
        instance.Mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Post.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Post instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
