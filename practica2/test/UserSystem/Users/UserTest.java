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
        System.out.println("getName");
        User instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname1 method, of class User.
     */
    @Test
    public void testGetSurname1() {
        System.out.println("getSurname1");
        User instance = null;
        String expResult = "";
        String result = instance.getSurname1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname2 method, of class User.
     */
    @Test
    public void testGetSurname2() {
        System.out.println("getSurname2");
        User instance = null;
        String expResult = "";
        String result = instance.getSurname2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNick method, of class User.
     */
    @Test
    public void testGetNick() {
        System.out.println("getNick");
        User instance = null;
        String expResult = "";
        String result = instance.getNick();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class User.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        User instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsAdmin method, of class User.
     */
    @Test
    public void testIsIsAdmin() {
        System.out.println("isIsAdmin");
        User instance = null;
        boolean expResult = false;
        boolean result = instance.isIsAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsStudent method, of class User.
     */
    @Test
    public void testIsIsStudent() {
        System.out.println("isIsStudent");
        User instance = null;
        boolean expResult = false;
        boolean result = instance.isIsStudent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsConected method, of class User.
     */
    @Test
    public void testIsIsConected() {
        System.out.println("isIsConected");
        User instance = null;
        boolean expResult = false;
        boolean result = instance.isIsConected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotificationsList method, of class User.
     */
    @Test
    public void testGetNotificationsList() {
        System.out.println("getNotificationsList");
        User instance = null;
        LinkedList<Notification> expResult = null;
        LinkedList<Notification> result = instance.getNotificationsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String Name = "";
        User instance = null;
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname1 method, of class User.
     */
    @Test
    public void testSetSurname1() {
        System.out.println("setSurname1");
        String Surname1 = "";
        User instance = null;
        instance.setSurname1(Surname1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname2 method, of class User.
     */
    @Test
    public void testSetSurname2() {
        System.out.println("setSurname2");
        String Surname2 = "";
        User instance = null;
        instance.setSurname2(Surname2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNick method, of class User.
     */
    @Test
    public void testSetNick() {
        System.out.println("setNick");
        String Nick = "";
        User instance = null;
        instance.setNick(Nick);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class User.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String Email = "";
        User instance = null;
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String Password = "";
        User instance = null;
        instance.setPassword(Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        boolean IsAdmin = false;
        User instance = null;
        instance.setIsAdmin(IsAdmin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsStudent method, of class User.
     */
    @Test
    public void testSetIsStudent() {
        System.out.println("setIsStudent");
        boolean IsStudent = false;
        User instance = null;
        instance.setIsStudent(IsStudent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsConected method, of class User.
     */
    @Test
    public void testSetIsConected() {
        System.out.println("setIsConected");
        boolean IsConected = false;
        User instance = null;
        instance.setIsConected(IsConected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
