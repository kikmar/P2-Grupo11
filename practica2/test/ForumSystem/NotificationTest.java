/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForumSystem;

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
public class NotificationTest {
   
   @Test
   public void NotificationTest() {
        Notification notification = new Notification("Nueva entrada en el foro de MP", false);
        assertNotNull(notification);
    }

    
}
