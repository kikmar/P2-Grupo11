package UserSystem;

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
public class GuestTest {
    
    public GuestTest() {
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
    public void testGuest(){
        System.out.println("testGuest");
        
    }
    @Test
    public void testGuestgetID(){
        System.out.println("testgetID");
        int ini= 3;
        Guest newGuest = new Guest(ini);
        assertEquals(ini, newGuest.getID());
    }
    @Test
    public void testGuestsetID(){
        System.out.println("testsetID");
        int ini= 6;
        Guest newGuest = new Guest(ini);
        assertNotNull(newGuest.getID());
        
    }
    
}

