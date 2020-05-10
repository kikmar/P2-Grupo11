/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSystem.Users;

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
public class TeacherTest {
    
    public TeacherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrando al metodo");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Saliendo del metodo");
    }
    
    @Test
    public void TeacherTest(){
        System.out.println("TeacherTest");
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        Teacher profesor1 = new Teacher("Antonio", "Garcia", "Pardo", "gpardo", "ag.pardo@urjc.es", "5678", false, 143);
        assertNotNull(profesor1);
    }
    
}
