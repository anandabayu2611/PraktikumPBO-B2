/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package LatihanMedium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nanda
 */
public class KontrolSenjataTest {
    
    public KontrolSenjataTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdaPeluru method, of class KontrolSenjata.
     */
    @Test
    public void testIsAdaPeluru() {
        System.out.println("isAdaPeluru");
        KontrolSenjata instance = null;
        boolean expResult = false;
        boolean result = instance.isAdaPeluru();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isiPeluru method, of class KontrolSenjata.
     */
    @Test
    public void testIsiPeluru() {
        System.out.println("isiPeluru");
        int jumPeluru = 0;
        KontrolSenjata instance = null;
        instance.isiPeluru(jumPeluru);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menembak method, of class KontrolSenjata.
     */
    @Test
    public void testMenembak() {
        System.out.println("menembak");
        int jumlah = 0;
        KontrolSenjata instance = null;
        instance.menembak(jumlah);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pasangBayonet method, of class KontrolSenjata.
     */
    @Test
    public void testPasangBayonet() {
        System.out.println("pasangBayonet");
        KontrolSenjata instance = null;
        instance.pasangBayonet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menusuk method, of class KontrolSenjata.
     */
    @Test
    public void testMenusuk() {
        System.out.println("menusuk");
        KontrolSenjata instance = null;
        String expResult = "";
        String result = instance.menusuk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
