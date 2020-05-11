
package ForumSystem.PostContent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ContentTest {

    public ContentTest() {
    }

    @Before
    public void setUpClass() {
        System.out.println("Entrando al metodo");
    }
    @After
    public void afterUpClass() {
        System.out.println("Saliendo del metodo");
    }

    /**
     * Test of setPostContent method, of class Content.
     */
    @Test
    public void testSetPostContent() {
        Content content = new Content("Esto es la prueba de Content");
        String newPostContent = "Esto es la prueba del método setPostContent de la clase Content";
        content.setPostContent(newPostContent);
        assertEquals(content.getPostContent(),newPostContent);
    }

    /**
     * Test of getPostContent method, of class Content.
     */
    @Test
    public void testGetPostContent() {
        Content content = new Content("Esto es la prueba del metodo getPostContent");
        String checkContent = "Esto es la prueba del metodo getPostContent";
        assertEquals(content.getPostContent(),checkContent);
        

    }

}