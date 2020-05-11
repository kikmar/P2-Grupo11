/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginSystem;

import UserSystem.Users.User;
import LoginSystem.Identifier;
import java.io.File;
import java.io.IOException;
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
        File Users = null;
        File Bans = null;
        Identifier identifier = new Identifier(Users, Bans);
        User user = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, 98);
        assertFalse(identifier.Register(user.getName(), user.getSurname1(), user.getSurname2(), user.getNick(), user.getEmail(), user.getPassword()));
        /*
        hago el assertFalse porque los archivos Users y Bans han sido creados nuevos
        con el constructor de Identifier y es evidente que el usuario no va 
        aparecer en el archivo de usuarios registrados
        */
    }

    /**
     * Test of Login method, of class Identifier.
     */
    @Test
    public void testLogin() throws Exception {
        File Users = null;
        File Bans = null;
        Identifier identifier = new Identifier(Users, Bans);
        User user = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, 98);
        assertFalse(identifier.Login(user.getEmail(), user.getPassword()));
        
    }

    /**
     * Test of Logout method, of class Identifier.
     */
    @Test
    public void testLogout() throws Exception {
        File Users = null;
        File Bans = null;
        Identifier identifier = new Identifier(Users, Bans);
        User user = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, 98);
        assertFalse(identifier.Login(user.getEmail(), user.getPassword()));
        /*
        hago el assertFalse porque los archivos Users y Bans han sido creados nuevos
        con el constructor de Identifier y es evidente que el usuario no va 
        aparecer en el archivo de usuarios registrados
        */
    }
        
}
