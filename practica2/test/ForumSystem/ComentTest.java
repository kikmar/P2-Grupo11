/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import UserSystem.Users.User;

/**
 *
 * @author Usuario
 */
public class ComentTest {
    
    public ComentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Entrando al test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Saliendo del test");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValoration method, of class Coment.
     */
    @Test
    public void testGetValoration() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        int valor = 0;
        assertEquals(valor,comentario.getValoration());
    }

    /**
     * Test of getText method, of class Coment.
     */
    @Test
    public void testGetText() {
       Coment comentario = new Coment("Cristian","Hola buenos dias",0);
       String texto = "Hola buenos dias";
       assertEquals(texto,comentario.getText());
    }

    /**
     * Test of getNick method, of class Coment.
     */
    @Test
    public void testGetNick() {
      Coment comentario = new Coment("Cristian","Hola buenos dias",0);
      String name = "Cristian";
      assertEquals(name,comentario.getNick());
    }

    /**
     * Test of getValorants method, of class Coment.
     */
    /**
     * Aqui no se como iría para obtener la lista esa.
     * @Test
    public void testGetValorants() {
        System.out.println("getValorants");
        Coment instance = null;
        LinkedList<NickVote> expResult = null;
        LinkedList<NickVote> result = instance.getValorants();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of setValoration method, of class Coment.
     */
    @Test
    public void testSetValoration() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        comentario.setValoration(0);
        assertNotNull(comentario.getValoration());
    }

    /**
     * Test of setText method, of class Coment.
     */
    @Test
    public void testSetText() {
       Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        comentario.setText("Hola buenos dias");
        assertNotNull(comentario.getText());
    }

    /**
     * Test of setNick method, of class Coment.
     */
    @Test
    public void testSetNick() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        comentario.setNick("Cristian");
        assertNotNull(comentario.getNick());
    }

    /**
     * Test of setValorants method, of class Coment.
     
    @Test
    public void testSetValorants() {
        LinkedList<NickVote> Valorants = null;
        Coment instance = null;
        instance.setValorants(Valorants);
        assertNotNull(instance.getValorants());
    }
    * */
    /**
     * Test of VoteComent method, of class Coment.
     */
    @Test
    public void testVoteComent() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        comentario.VoteComent("Cristian", true);
        assertNotNull(comentario.VoteComent("Cristian",true));            
    }

    /**
     * Test of toString method, of class Coment.
     */
    @Test
    public void testToString() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        String dataUser = "Nick: "+comentario.getNick()+"Text: "+comentario.getText()+
                "Valoration: "+comentario.getValoration();
        String prueba = "Nick: Cristian  Text: Hola buenos dias  Valoration: 0";
        assertEquals(dataUser,prueba);
                
    }
    
}
