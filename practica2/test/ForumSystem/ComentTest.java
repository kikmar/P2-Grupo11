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
     */ @Test
    public void testGetValorants() {
        Coment coment = new Coment("Cristian","Hola buenos dias",0);
        coment.VoteComent("Cristian", true);
        assertNotNull(coment.getValorants());
    }

    /**
     * Test of setValoration method, of class Coment.
     */
    @Test
    public void testSetValoration() {
        Coment coment = new Coment("Cristian","Hola buenos dias",0);
        coment.setValoration(7);
        assertEquals(coment.getValoration(), 7);
    }

    /**
     * Test of setText method, of class Coment.
     */
    @Test
    public void testSetText() {
       Coment coment = new Coment("Cristian","Hola buenos dias",0);
        coment.setText("Hola buenas noches");
        String checkText ="Hola buenas noches";
        assertEquals(coment.getText(),checkText);
    }

    /**
     * Test of setNick method, of class Coment.
     */
    @Test
    public void testSetNick() {
        Coment coment = new Coment("Cristian","Hola buenos dias",0);
        coment.setNick("crnicu");
        String checkNick = "crnicu";
        assertEquals(coment.getNick(), checkNick);
    }

    /**
     * Test of setValorants method, of class Coment.
    */
    @Test
    public void testSetValorants() {
        
    }
    
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
