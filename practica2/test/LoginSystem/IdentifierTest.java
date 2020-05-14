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
import java.util.Properties;
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
    public File Users= new File ("DataBase\\Users\\UsersDataBase.obj");
    public File Bans= new File ("DataBase\\Bans\\BansDataBase.obj");
    
    
   
    @Test
    public void testRegister() throws Exception {
        Identifier identifier = new Identifier(Users, Bans);
        assertTrue(identifier.Register("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234"));
      
    }

    /**
     * Test of Login method, of class Identifier.
     */
    @Test
    public void testLogin() throws Exception {
        Identifier identifier = new Identifier(Users, Bans);
        identifier.Register("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu.19@alumnos.urjc.es", "1234");
        assertTrue(identifier.Login("h.nicu.19@alumnos.urjc.es", "1234"));
        
    }

    /**
     * Test of Logout method, of class Identifier.
     */
    @Test
    public void testLogout() throws Exception {
        Identifier identifier = new Identifier(Users, Bans); 
        identifier.Register("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu.20@alumnos.urjc.es", "1234");
        identifier.Login("h.nicu.20@alumnos.urjc.es", "1234");
        assertTrue(identifier.Logout("h.nicu.20@alumnos.urjc.es", "1234"));
        /*
        hago el assertFalse porque los archivos Users y Bans han sido creados nuevos
        con el constructor de Identifier y es evidente que el usuario no va 
        aparecer en el archivo de usuarios registrados
        */
    }
        
}
