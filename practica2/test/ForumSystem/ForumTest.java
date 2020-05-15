/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;


public class ForumTest  {
    
 
    Forum forum = new Forum();
    
    public ForumTest()  throws IOException, ClassNotFoundException{
    }
    


    /**
     * Test of CreateSubForum method, of class Forum.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreateSubForum() throws Exception {
        assertTrue (forum.CreateSubForum("Cr", "prueba18"));
    }

    /**
     * Test of CreatePost method, of class Forum.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreatePost() throws Exception {
       assertTrue (forum.CreatePost("A","post8", "Cr", 1, "hola"));
    }

    /**
     * Test of VotePost method, of class Forum.
     */
    @Test
    public void testVotePost() throws Exception {
       assertTrue (forum.VotePost("A", "Apost", "At", true));
    }

    /**
     * Test of SharePost method, of class Forum.
     */
    @Test
    public void testSharePost() throws Exception {
       assertEquals(forum.SharePost("A", "Apost"), "https://uredditjc.es/Apost");
    }

    /**
     * Test of ComentPost method, of class Forum.
     */
    @Test
    public void testComentPost() throws Exception {
       assertTrue (forum.ComentPost("A", "Apost", "Cr", "Hola"));
    }

    /**
     * Test of VoteComent method, of class Forum.
     */
    @Test
    public void testVoteComent() throws Exception {
       assertTrue (forum.VoteComent("A", "Apost", "At", "Cr", "This is my coment", true));
    }

    /**
     * Test of ChangueVisibility method, of class Forum.
     */
    @Test
    public void testChangueVisibility() throws Exception {
        assertTrue(forum.ChangueVisibility("Admin", "A", "Apost", true));
    }

    /**
     * Test of BanUser method, of class Forum.
     */
    @Test
    public void testBanUser() throws Exception {
        assertTrue(forum.BanUser("Admin", "At", "29-03-2020", "29-05-2020"));
    }

    /**
     * Test of DeleteBan method, of class Forum.
     */
    @Test
    public void testDeleteBan() throws Exception {
        assertTrue (forum.DeleteBan("Admin", "At"));
    }   

    /**
     * Test of Mostrar method, of class Forum.
     */
    @Test
    public void testMostrar() throws Exception {
        assertTrue(forum.Mostrar());
    }
    
}
