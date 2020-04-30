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
public class SubForumTest {
    
    public SubForumTest() {
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
     * Test of getSubForumName method, of class SubForum.
     */
    @Test
    public void testGetSubForumName() {
        System.out.println("getSubForumName");
        SubForum instance = null;
        String expResult = "";
        String result = instance.getSubForumName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPostsList method, of class SubForum.
     */
    @Test
    public void testGetPostsList() {
        System.out.println("getPostsList");
        SubForum instance = null;
        LinkedList<Post> expResult = null;
        LinkedList<Post> result = instance.getPostsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubscribersList method, of class SubForum.
     */
    @Test
    public void testGetSubscribersList() {
        System.out.println("getSubscribersList");
        SubForum instance = null;
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getSubscribersList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubForumName method, of class SubForum.
     */
    @Test
    public void testSetSubForumName() {
        System.out.println("setSubForumName");
        String SubForumName = "";
        SubForum instance = null;
        instance.setSubForumName(SubForumName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubscribersList method, of class SubForum.
     */
    @Test
    public void testSetSubscribersList() {
        System.out.println("setSubscribersList");
        LinkedList<String> SubscribersList = null;
        SubForum instance = null;
        instance.setSubscribersList(SubscribersList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPostsList method, of class SubForum.
     */
    @Test
    public void testSetPostsList() {
        System.out.println("setPostsList");
        LinkedList<Post> PostsList = null;
        SubForum instance = null;
        instance.setPostsList(PostsList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Suscribe method, of class SubForum.
     */
    @Test
    public void testSuscribe() {
        System.out.println("Suscribe");
        String Nick = "";
        SubForum instance = null;
        instance.Suscribe(Nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Unsubscribe method, of class SubForum.
     */
    @Test
    public void testUnsubscribe() {
        System.out.println("Unsubscribe");
        String Nick = "";
        SubForum instance = null;
        instance.Unsubscribe(Nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreatePost method, of class SubForum.
     */
    @Test
    public void testCreatePost() throws Exception {
        System.out.println("CreatePost");
        String Tittle = "";
        String Owner = "";
        int TypeOfContent = 0;
        String PostContent = "";
        SubForum instance = null;
        boolean expResult = false;
        boolean result = instance.CreatePost(Tittle, Owner, TypeOfContent, PostContent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SubForum.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SubForum instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
