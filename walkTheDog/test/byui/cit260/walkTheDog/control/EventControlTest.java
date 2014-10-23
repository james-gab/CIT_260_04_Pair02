/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Idel
 */
public class EventControlTest {
    
    public EventControlTest() {
    }

    /**
     * Test of eventOnExplore method, of class EventControl.
     */
    @Test
    public void testEventOnExplore() {
        System.out.println("eventOnExplore");
        int leashLength = 12;
        int idealLeashLength = 5;
        EventControl instance = new EventControl();
        int expResult = 1;
        int result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eventOnNoExplore method, of class EventControl.
     */
    @Test
    public void testEventOnNoExplore() {
        System.out.println("eventOnNoExplore");
        double noExploreCounter = 0.0;
        int idealLeashLength = 0;
        double userDefinedNumber = 0.0;
        EventControl instance = new EventControl();
        int expResult = 0;
        int result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateFidoMood method, of class EventControl.
     */
    @Test
    public void testGenerateFidoMood() {
        System.out.println("generateFidoMood");
        int numberOfTurns = 0;
        int leashLength = 0;
        int mood = 0;
        EventControl instance = new EventControl();
        int expResult = 0;
        int result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
