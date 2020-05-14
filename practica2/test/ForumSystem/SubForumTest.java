/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 /
package ForumSystem;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.;

/**
 *
 * @author Usuario
 */
public class SubForumTest {

    public SubForumTest() {
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
    public void Suscribe() {
     SubForum subforum = new SubForum("Nombre"); 
     assertTrue(subforum.Suscribe());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        SubForum forum = new SubForum("Ejemplo de nombre de subforo");
        String expResult = "SubForumName: Ejemplo de nombre de subforo";
        assertEquals(expResult, forum.toString());

    }

}