
package UserSystem.Users;

import org.junit.Test;
import static org.junit.Assert.*;


public class TeacherTest {

    public TeacherTest() {
    }

    @Test
    public void testSomeMethod() {
        Teacher profesor1 = new Teacher("Antonio", "Garcia", "Pardo", "gpardo", "ag.pardo@urjc.es", "5678", false, 143);
        assertNotNull(profesor1);
    }

}