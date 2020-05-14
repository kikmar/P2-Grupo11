package UserSystem;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class BanTest {

    public BanTest() {
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
    public void testWriteToDataBase() throws IOException, ClassNotFoundException, ParseException{
        System.out.println("testWriteToDataBase");
        Ban forbidden = new Ban("Alberto",true,"05-04-2020","05-06-2020");
    }


    @Test
    public void testToString() throws IOException, ParseException, ClassNotFoundException{
        System.out.println("testToString");
        Ban forbid = new Ban("Alberto",true,"05-04-2020","05-06-2020");
        String expected = "Nick: Alberto . BeginDate: 2020/04/05 . endDate: 2020/06/05 . IsBanned= true";
        assertEquals(expected, forbid.toString());

    }

}