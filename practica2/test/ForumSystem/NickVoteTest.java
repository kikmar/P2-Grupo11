package ForumSystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class NickVoteTest {

    public NickVoteTest() {
    }


    @Before
    public void setUpClass() {
        System.out.println("Entrando al metodo");
    }
    @After
    public void afterUpClass() {
        System.out.println("Saliendo del metodo");
    }

    @Test
    public void testToString() {
        System.out.println("testToString");
        NickVote result = new NickVote("Alberto",true);
        String expected = "Nick: Alberto Vote: true";
        assertEquals(expected, result.toString());
    }

}