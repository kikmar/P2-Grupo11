
package ForumSystem.PostContent;

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
        System.out.println("testSetPostContent");
        String ini= "Its a proof";
        Content newContent = new Content(ini);
        assertNotNull(newContent.getPostContent());
    }

    /**
     * Test of getPostContent method, of class Content.
     */
    @Test
    public void testGetPostContent() {
        System.out.println("testGetPostContent");
        String ini= "its a proof";
        Content newContent = new Content(ini);
        assertEquals(ini, newContent.getPostContent());
    }

}