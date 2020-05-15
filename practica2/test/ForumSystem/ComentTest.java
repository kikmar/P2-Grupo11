/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class ComentTest {
    
    public ComentTest() {
    }
    

    @Test
    public void testVoteComent() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        comentario.VoteComent("Cristian", true);
        assertFalse(comentario.VoteComent("Cristian",true));            
    }

    /**
     * Test of toString method, of class Coment.
     */
  @Test
    public void testToString() {
        Coment comentario = new Coment("Cristian","Hola buenos dias",0);
        String dataUser = "Nick: "+comentario.getNick()+" Text: "+comentario.getText()+" Valoration: "+comentario.getValoration();
        String prueba = "Nick: Cristian Text: Hola buenos dias Valoration: 0";
        assertEquals(dataUser,prueba);

    }
    
}
