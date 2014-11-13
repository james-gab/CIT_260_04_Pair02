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
        
        /************************
        * Test Case #1
        */
        System.out.println("\tTest case #1");
        int leashLength = 12;
        int idealLeashLength = 5;
        EventControl instance = new EventControl();
        int expResult = 1;
        int result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        /************************
        * Test Case #2
        */
        System.out.println("\tTest case #2");
        leashLength = 4;
        idealLeashLength = 15;
        expResult = 0;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        /************************
        * Test Case #3
        */
        System.out.println("\tTest case #3");
        leashLength = -7;
        idealLeashLength = 8;
        expResult = -1;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        /************************
        * Test Case #4
        */
        System.out.println("\tTest case #4");
        leashLength = 5;
        idealLeashLength = 20;
        expResult = -1;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        /************************
        * Test Case #5
        */
        System.out.println("\tTest case #5");
        leashLength = 16;
        idealLeashLength = 11;
        expResult = -1;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        /************************
        * Test Case #6
        */
        System.out.println("\tTest case #6");
        leashLength = 15;
        idealLeashLength = 4;
        expResult = 1;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        /************************
        * Test Case #7
        */
        System.out.println("\tTest case #7");
        leashLength = 4;
        idealLeashLength = 4;
        expResult = 1;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
        
        
        /************************
        * Test Case #8
        */
        System.out.println("\tTest case #8");
        leashLength = 15;
        idealLeashLength = 15;
        expResult = 1;
        result = instance.eventOnExplore(leashLength, idealLeashLength);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of eventOnNoExplore method, of class EventControl.
     */
    @Test
    public void testEventOnNoExplore() {
        System.out.println("eventOnNoExplore");

        /************************
        * Test Case #1
        */
        System.out.println("\tTest case #1");
        int noExploreCounter = 5;
        int idealLeashLength = 7;
        int userDefinedNumber = 7;
        EventControl instance = new EventControl();
        int expResult = 1;
        int result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #2
        */
        System.out.println("\tTest case #2");
        noExploreCounter = 1;
        idealLeashLength = -6;
        userDefinedNumber = 5;
        expResult = -1;
        result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #3
        */
        System.out.println("\tTest case #3");
        noExploreCounter = 2;
        idealLeashLength = 7;
        userDefinedNumber = 19;
        expResult = 1;
        result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #4
        */
        System.out.println("\tTest case #4");
        noExploreCounter = 0;
        idealLeashLength = 4;
        userDefinedNumber = 19;
        expResult = 1;
        result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #5
        */
        System.out.println("\tTest case #5");
        noExploreCounter = 10;
        idealLeashLength = 15;
        userDefinedNumber = 19;
        expResult = 1;
        result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #6
        */
        System.out.println("\tTest case #6");
        noExploreCounter = 1;
        idealLeashLength = 4;
        userDefinedNumber = 15;
        expResult = 1;
        result = instance.eventOnNoExplore(noExploreCounter, idealLeashLength, userDefinedNumber);
        assertEquals(expResult, result);

    }

    /**
     * Test of generateFidoMood method, of class EventControl.
     */
    @Test
    public void testGenerateFidoMood() {
        
        System.out.println("generateFidoMood");
         /************************
        * Test Case #1
        */
        System.out.println("\tTest case #1");
        int numberOfTurns = 4;
        int leashLength = 5;
        int mood = 5;
        EventControl instance = new EventControl();
        int expResult = 6;
        int result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #2
        */
        System.out.println("\tTest case #2");
        numberOfTurns = 0;
        leashLength = 13;
        mood = 8;
        expResult = 9;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
         /************************
        * Test Case #3
        */
        System.out.println("\tTest case #3");
        numberOfTurns = 10;
        leashLength = 5;
        mood = 3;
        expResult = 4;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #4
        */
        System.out.println("\tTest case #4");
        numberOfTurns = 2;
        leashLength = 4;
        mood = 2;
        expResult = 0;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #5
        */
        System.out.println("\tTest case #5");
        numberOfTurns = 1;
        leashLength = 3;
        mood = 5;
        expResult = 3;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #6
        */
        System.out.println("\tTest case #6");
        numberOfTurns = 4;
        leashLength = 2;
        mood = 9;
        expResult = 7;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #7
        */
        System.out.println("\tTest case #7");
        numberOfTurns = 0;
        leashLength = 16;
        mood = 5;
        expResult = -1;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        /************************
        * Test Case #8
        */
        System.out.println("\tTest case #8");
        numberOfTurns = -1;
        leashLength = 2;
        mood = 5;
        expResult = -1;
        result = instance.generateFidoMood(numberOfTurns, leashLength, mood);
        assertEquals(expResult, result);
        
        
    }
    
}
