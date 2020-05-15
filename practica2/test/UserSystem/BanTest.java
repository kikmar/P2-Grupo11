package UserSystem;

import java.io.IOException;
import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class BanTest {

    public BanTest() {
    }




    @Test
    public void testToString() throws IOException, ParseException, ClassNotFoundException{
        System.out.println("testToString");
        Ban forbid = new Ban("Alberto",true,"05-04-2020","05-06-2020");
        String expected = "Nick: Alberto . BeginDate: 2020/04/05 . endDate: 2020/06/05 . IsBanned= true";
        assertEquals(expected, forbid.toString());

    }

}