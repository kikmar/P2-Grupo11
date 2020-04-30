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
public class ForumTest {
    
    public ForumTest() {
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
     * Test of CreateSubForum method, of class Forum.
     */
    @Test
    public void testCreateSubForum() throws Exception {
        System.out.println("CreateSubForum");
        String Nick = "";
        String SubForumName = "";
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.CreateSubForum(Nick, SubForumName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreatePost method, of class Forum.
     */
    @Test
    public void testCreatePost() throws Exception {
        System.out.println("CreatePost");
        String SubForumName = "";
        String Tittle = "";
        String Owner = "";
        int TypeOfContent = 0;
        String PostContent = "";
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.CreatePost(SubForumName, Tittle, Owner, TypeOfContent, PostContent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VotePost method, of class Forum.
     */
    @Test
    public void testVotePost() throws Exception {
        System.out.println("VotePost");
        String SubForumName = "";
        String Tittle = "";
        String Nick = "";
        boolean Vote = false;
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.VotePost(SubForumName, Tittle, Nick, Vote);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewVotesOfAPost method, of class Forum.
     */
    @Test
    public void testViewVotesOfAPost() throws Exception {
        System.out.println("ViewVotesOfAPost");
        String SubForumName = "";
        String Tittle = "";
        Forum instance = new Forum();
        instance.ViewVotesOfAPost(SubForumName, Tittle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SharePost method, of class Forum.
     */
    @Test
    public void testSharePost() throws Exception {
        System.out.println("SharePost");
        String SubForumName = "";
        String Tittle = "";
        Forum instance = new Forum();
        String expResult = "";
        String result = instance.SharePost(SubForumName, Tittle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ComentPost method, of class Forum.
     */
    @Test
    public void testComentPost() throws Exception {
        System.out.println("ComentPost");
        String SubForumName = "";
        String Tittle = "";
        String Nick = "";
        String Text = "";
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.ComentPost(SubForumName, Tittle, Nick, Text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VoteComent method, of class Forum.
     */
    @Test
    public void testVoteComent() throws Exception {
        System.out.println("VoteComent");
        String SubForumName = "";
        String Tittle = "";
        String NickVoter = "";
        String NickCreator = "";
        String Text = "";
        boolean Vote = false;
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.VoteComent(SubForumName, Tittle, NickVoter, NickCreator, Text, Vote);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewPostComents method, of class Forum.
     */
    @Test
    public void testViewPostComents() throws Exception {
        System.out.println("ViewPostComents");
        String SubForumName = "";
        String Tittle = "";
        Forum instance = new Forum();
        instance.ViewPostComents(SubForumName, Tittle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetAdmin method, of class Forum.
     */
    @Test
    public void testSetAdmin() throws Exception {
        System.out.println("SetAdmin");
        String Nick = "";
        boolean Admin = false;
        Forum instance = new Forum();
        instance.SetAdmin(Nick, Admin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChangueVisibility method, of class Forum.
     */
    @Test
    public void testChangueVisibility() throws Exception {
        System.out.println("ChangueVisibility");
        String Nick = "";
        String SubForumName = "";
        String Tittle = "";
        boolean Visibility = false;
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.ChangueVisibility(Nick, SubForumName, Tittle, Visibility);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BanUser method, of class Forum.
     */
    @Test
    public void testBanUser() throws Exception {
        System.out.println("BanUser");
        String Admin = "";
        String BannedUser = "";
        String beginDate = "";
        String endDate = "";
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.BanUser(Admin, BannedUser, beginDate, endDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteBan method, of class Forum.
     */
    @Test
    public void testDeleteBan() throws Exception {
        System.out.println("DeleteBan");
        String Admin = "";
        String Nick = "";
        Forum instance = new Forum();
        boolean expResult = false;
        boolean result = instance.DeleteBan(Admin, Nick);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of UpdateChangues method, of class Forum.
     */
    @Test
    public void testUpdateChangues() throws Exception {
        System.out.println("UpdateChangues");
        String URL = "";
        LinkedList List = null;
        Forum instance = new Forum();
        instance.UpdateChangues(URL, List);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Mostrar method, of class Forum.
     */
    @Test
    public void testMostrar() throws Exception {
        System.out.println("Mostrar");
        Forum instance = new Forum();
        instance.Mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
