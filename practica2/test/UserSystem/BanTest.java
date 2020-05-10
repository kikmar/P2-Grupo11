
package UserSystem;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
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
    public void tesgetNick() throws IOException, ClassNotFoundException, ParseException{
        System.out.println("testgetNick");
        Ban forbid = new Ban("Alberto",true,"04/05/2020","06/05/2020");
        String name = forbid.getNick();
        assertEquals(name,forbid.getNick());
    }
    
    @Test
    public void testgetIsBanned(){
        System.out.println("tesgetIsBanned");
        
    }
    
    @Test
    public void testgetBeginDate(){
        System.out.println("testgetBeginDate");
        
    }
    
    @Test
    public void testgetEndDate(){
        System.out.println("tesgetEndDate");
        
    }
    
    @Test
    public void testgetBans(){
        System.out.println("testgetBans");
        
    }
    
    @Test
    public void testsetNick(){
        System.out.println("tesgetNick");
        
    }
    
    @Test
    public void testsetIsBanned(){
        System.out.println("tesgetIsBanned");
        
    }
    
    @Test
    public void testsetBeginDate(){
        System.out.println("testgetBeginDate");
        
    }
    
    @Test
    public void tessetEndDate(){
        System.out.println("tesgetEndDate");
        
    }
    
    @Test
    public void testsetBans(){
        System.out.println("testgetBans");
        
    }
    
    @Test
    public void testToString() {
        System.out.println("toString");
        Ban instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}



