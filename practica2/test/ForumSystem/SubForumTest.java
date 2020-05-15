package ForumSystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class SubForumTest implements Serializable{

    SubForum subforum = new SubForum("A");

    public SubForumTest() {
    }
//Antes y después de entrar a los metodos
   @Before
    public void setUpClass() {
        System.out.println("Entrando al metodo");
    }
    @After
    public void afterUpClass() {
        System.out.println("Saliendo del metodo");
    }

    @Test
    public void testSuscribe() {
    subforum.Suscribe("Cr");
    assertTrue(subforum.Suscribe("Cr"));
    }

    @Test
    public void testUnsubscribe() { 
     subforum.Suscribe("Cr");
     assertTrue(subforum.Unsubscribe("Cr"));
    }

    @Test
    public void testCreatePost() throws IOException, FileNotFoundException, ClassNotFoundException { 
     assertTrue (subforum.CreatePost("postprueba", "Cr", 1, "hola"));
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        SubForum forum = new SubForum("Ejemplo de nombre de subforo");
        String expResult = "SubForumName: Ejemplo de nombre de subforo";
        assertEquals(expResult, forum.toString());

    }

}