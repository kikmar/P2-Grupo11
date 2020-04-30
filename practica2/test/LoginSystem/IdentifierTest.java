/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSystem;

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
public class IdentifierTest {
    
    public IdentifierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Register method, of class Identifier.
     */
    @Test
    public void testRegister() throws Exception {
        System.out.println("Register");
        String Name = "";
        String Surname1 = "";
        String Surname2 = "";
        String Nick = "";
        String Email = "";
        String Password = "";
        Identifier instance = null;
        boolean expResult = false;
        boolean result = instance.Register(Name, Surname1, Surname2, Nick, Email, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class Identifier.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("Login");
        String Email = "";
        String Password = "";
        Identifier instance = null;
        boolean expResult = false;
        boolean result = instance.Login(Email, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Logout method, of class Identifier.
     */
    @Test
    public void testLogout() throws Exception {
        System.out.println("Logout");
        String Email = "";
        String Password = "";
        Identifier instance = null;
        boolean expResult = false;
        boolean result = instance.Logout(Email, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
