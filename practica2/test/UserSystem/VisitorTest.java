
package UserSystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class VisitorTest {
    
    public VisitorTest() {
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
    public void testVisitor(){
        System.out.println("testVisitor");
        
    }
    @Test
    public void testgetID(){
        System.out.println("testgetID");
        int ini= 3;
        Visitor newID = new Visitor(ini);
        assertEquals(ini, newID.getID());
    }
    @Test
    public void testsetID(){
        System.out.println("testsetID");
        int ini= 3;
        Visitor newID = new Visitor(ini);
        assertNotNull(newID.getID());
        
    }
    
    
}
