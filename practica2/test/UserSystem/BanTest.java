/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserSystem;

import java.io.File;
import java.util.Date;
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
public class BanTest {
    
    public BanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNick method, of class Ban.
     */
    @Test
    public void testGetNick() {
        final Ban ban = new Ban("elqueaprueba", true, "01-05-2020", "01-06-2020");
        final String nick = "elqueaprueba";
        assertEquals(nick, ban.getNick());
    }

    /**
     * Test of getIsBanned method, of class Ban.
     */
    @Test
    public void testGetIsBanned() {
        final Ban ban = new Ban("elqueaprueba", true, "01-05-2020", "01-06-2020");
        assertEquals(ban.getIsBanned(), true);
    }

    /**
     * Test of getBeginDate method, of class Ban.
     */
    @Test
    public void testGetBeginDate() {
        final Ban ban = new Ban("elqueaprueba", true, "01-05-2020", "01-06-2020");
        final String beginDate = "01-05-2020";
        assertEquals(ban.getBeginDate(), beginDate);
    }

    /**
     * Test of getEndDate method, of class Ban.
     */
    @Test
    public void testGetEndDate() {
        final Ban ban = new Ban("elqueaprueba", true, "01-05-2020", "01-06-2020");
        final String endDate = "01-06-2020";
        assertEquals(ban.getEndDate(), endDate);
    }

    /**
     * Test of getBans method, of class Ban.
     */
    @Test
    public void testGetBans() {
        File Bans = new File("DataBase/Bans/BansDataBase.obj");
        assertNotNull(Bans);
    }

    /**
     * Test of setNick method, of class Ban.
     */
    @Test
    public void testSetNick() {
        final Ban ban = new Ban();
        ban.setNick("elqueaprueba");
        assertNotNull(ban.getNick());
    }

    /**
     * Test of setIsBanned method, of class Ban.
     */
    @Test
    public void testSetIsBanned() {
        final Ban ban = new Ban();
        ban.setIsBanned(true);
        assertNotNull(ban.getIsBanned());
    }

    /**
     * Test of setBeginDate method, of class Ban.
     */
    @Test
    public void testSetBeginDate() {
        final Ban ban = new Ban();
        ban.setBeginDate("01-05-2020");
        assertNotNull(ban.getBeginDate());
    }

    /**
     * Test of setEndDate method, of class Ban.
     */
    @Test
    public void testSetEndDate() {
        final Ban ban = new Ban();
        ban.setBeginDate("01-06-2020");
        assertNotNull(ban.getEndDate());
    }

    /**
     * Test of setBans method, of class Ban.
     */
    @Test
    public void testSetBans() {
        File Bans = new File("DataBase/Bans/BansDataBase.obj");
        assertNotNull(Bans);
    }

    /**
     * Test of toString method, of class Ban.
     */
    @Test
    public void testToString() {
        final Ban ban = new Ban("elqueaprueba", true, "01-05-2020", "01-06-2020");
        String banData = "Nick: elqueaprueba . BeginDate: 01-05-2020 . endDate: 01-06-2020 . IsBanned= " + isBanned;
        assertEquals(ban.toString(),banData);
    }
    
}
