/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSystem.Users;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class StudentTest {
    
    public StudentTest() {
    }
    

    @Test
    public void StudentTest(){
        System.out.println("StudentTest");
    }
    

    @Test
    public void testSomeMethod() {
        Student estudiante1 = new Student("Heraldo", "Nicu", "Sroda", "elqueaprueba", "h.nicu@alumnos.urjc.es", "1234", true, 1);
        assertNotNull(estudiante1);
    }
    
}
