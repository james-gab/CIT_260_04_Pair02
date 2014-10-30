/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gab
 */
public class HelpMenuViewTest {
    
    public HelpMenuViewTest() {
    }

    /**
     * Test of displayHelpMenu method, of class HelpMenuView.
     */
/*    @Test
    public void testDisplayHelpMenu() {
        System.out.println("displayHelpMenu");
        HelpMenuView instance = new HelpMenuView();
        instance.displayHelpMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInput method, of class HelpMenuView.
     */
/*    @Test
    public void testGetInput() {
        System.out.println("getInput");
        HelpMenuView instance = new HelpMenuView();
        String expResult = "";
        String result = instance.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class HelpMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("HELPdoAction");
        
        System.out.println("\nHELPdoAction Test Case #1");
        
        char choice = ' ';
        HelpMenuView instance = new HelpMenuView();
        instance.doAction(choice);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\n" + choice + " passed");

        
        System.out.println("\nHELPdoAction Test Case #2");
        
         choice = 'g';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\nHELPdoAction Test Case #3");
        
         choice = 'G';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\nHELPdoAction Test Case #4");
        
         choice = 'M';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\nHELPdoAction Test Case #5");
        
         choice = 'l';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\nHELPdoAction Test Case #6");
        
         choice = 'f';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\nHELPdoAction Test Case #7");
        
         choice = 'S';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\nHELPdoAction Test Case #8");
        
         choice = 'z';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
    }
 
        
        
        
        
}
