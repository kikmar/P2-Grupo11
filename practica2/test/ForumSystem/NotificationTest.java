package ForumSystem;

import org.junit.Test;
import static org.junit.Assert.*;

public class NotificationTest {
   
   @Test
   public void NotificationTest() {
        Notification notification = new Notification("Nueva entrada en el foro de MP", false);
        assertNotNull(notification);
    }

    
}
