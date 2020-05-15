package ForumSystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class PostTest {
    
    public PostTest() throws IOException, ClassNotFoundException {
    }
    
    Post post = new Post("JavaDevelopment", "a.gpardo", 1, "Esta es una prueba con JUnit");

    
    
   
    @Test
    public void testComent() throws Exception {
        
        post.Coment("e.mertin", "Muy bueno");
        assertNotNull(post.getComentList());

    }

    /**
     * Test of VotePost method, of class Post.
     */
    @Test
    public void testVotePost() throws IOException, FileNotFoundException, ClassNotFoundException {
        assertTrue(post.VotePost("a.garcia", true));

    }

    /**
     * Test of Share method, of class Post.
     */
    @Test
    public void testShare() throws IOException, FileNotFoundException, ClassNotFoundException { 
        String checkShare = "https://uredditjc.es/null";
        assertEquals(post.Share(), checkShare);

    }

    /**
     * Test of Mostrar method, of class Post.
     */
    @Test
    public void testMostrar() {
        assertEquals (post.Mostrar(), 0);   // Ya qque el objeto creado no tiene ningun contenido
    }

    /**
     * Test of toString method, of class Post.
     */
    @Test
    public void testToString() throws IOException, FileNotFoundException, ClassNotFoundException {
        String check = "Tittle: null";
        assertEquals(post.toString(), check);

    }
    
}