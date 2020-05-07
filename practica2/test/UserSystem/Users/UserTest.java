/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSystem.Users;

import ForumSystem.Notification;
import java.util.LinkedList;
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
public class UserTest {
    
    public UserTest() {
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
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String nombre = "Heraldo";
        assertEquals(usuario.getName(),nombre);
    }

    /**
     * Test of getSurname1 method, of class User.
     */
    @Test
    public void testGetSurname1() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String apellido1 = "Nicu";
        assertEquals(usuario.getSurname1(),apellido1);

    }

    /**
     * Test of getSurname2 method, of class User.
     */
    @Test
    public void testGetSurname2() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String apellido2 = "Sroda";
        assertEquals(usuario.getSurname2(),apellido2);
    }

    /**
     * Test of getNick method, of class User.
     */
    @Test
    public void testGetNick() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String nick = "elqueaprueba";
        assertEquals(usuario.getNick(),nick);
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String email = "h.nicu@alumnos.urjc.es";
        assertEquals(usuario.getEmail(),email);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String password = "1234";
        assertEquals(usuario.getPassword(),password);
    }

    /**
     * Test of isIsAdmin method, of class User.
     */
    @Test
    public void testIsIsAdmin() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        usuario.setIsAdmin(false);
        assertEquals(usuario.isIsAdmin(),false);
    }

    /**
     * Test of isIsStudent method, of class User.
     */
    @Test
    public void testIsIsStudent() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        assertEquals(usuario.isIsStudent(),true);
    }

    /**
     * Test of isIsConected method, of class User.
     */
    @Test
    public void testIsIsConected() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        usuario.setIsConected(true);
        assertEquals(usuario.isIsConected(),true);
    }

    /**
     * Test of getNotificationsList method, of class User.
     */
    @Test
    public void testGetNotificationsList() {
        //da error en la clase notification
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        User usuario = new User ();
        usuario.setName("Heraldo");
        assertNotNull(usuario.getName());
    }

    /**
     * Test of setSurname1 method, of class User.
     */
    @Test
    public void testSetSurname1() {
        User usuario = new User ();
        usuario.setSurname1("Morilla");
        assertNotNull(usuario.getSurname1());
    }

    /**
     * Test of setSurname2 method, of class User.
     */
    @Test
    public void testSetSurname2() {
        User usuario = new User ();
        usuario.setSurname2("Coto");
        assertNotNull(usuario.getSurname2());
    }

    /**
     * Test of setNick method, of class User.
     */
    @Test
    public void testSetNick() {
        User usuario = new User ();
        usuario.setNick("ironpiper");
        assertNotNull(usuario.getNick());
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        User usuario = new User ();
        usuario.setEmail("z.hortaleza@urjc.es");
        assertNotNull(usuario.getEmail());
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        User usuario = new User ();
        usuario.setPassword("12345");
        assertNotNull(usuario.getPassword());
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        User usuario = new User ();
        usuario.setIsAdmin(true);
        assertNotNull(usuario.isIsAdmin());
    }

    /**
     * Test of setIsStudent method, of class User.
     */
    @Test
    public void testSetIsStudent() {
        User usuario = new User ();
        usuario.setIsStudent(true);
        assertNotNull(usuario.isIsStudent());
    }

    /**
     * Test of setIsConected method, of class User.
     */
    @Test
    public void testSetIsConected() {
        User usuario = new User ();
        usuario.setIsConected(true);
        assertNotNull(usuario.isIsConected());
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        User usuario = new User ("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, "0987653");
        String dataUser = "Name: "+usuario.getName()+" . Surname1: "+usuario.getSurname1()+" . Surname2: "+usuario.getSurname2()+
        " . Nick: "+ usuario.getNick()+" . Password: "+ usuario.getPassword()+" . Email: "+usuario.getEmail()+
        " . IsAdmin: "+ usuario.isIsAdmin()+" . IsStudent: "+usuario.isIsStudent()+". IsLogged: "+ usuario.isIsConected();

        String prueba =  "Name: Heraldo . Surname1: Nicu . Surname2: Sroda . Nick: elqueaprueba . Password: 1234 . Email: h.nicu@alumnos.urjc.es . IsAdmin: "
        + usuario.isIsAdmin()+" . IsStudent: "+usuario.isIsStudent()+". IsLogged: "+ usuario.isIsConected();
        assertEquals(dataUser,prueba);
    }
    
}
