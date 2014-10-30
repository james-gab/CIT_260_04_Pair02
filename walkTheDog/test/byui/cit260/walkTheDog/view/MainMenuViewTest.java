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
public class MainMenuViewTest {
    
    public MainMenuViewTest() {
    }

    /**
     * Test of displayMenu method, of class MainMenuView.
     */
/*    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        MainMenuView instance = new MainMenuView();
        instance.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInput method, of class MainMenuView.
     */
/*    @Test
    public void testGetInput() {
        System.out.println("getInput");
        MainMenuView instance = new MainMenuView();
        String expResult = "";
        String result = instance.getInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAction method, of class MainMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        
        System.out.println("\ndoAction Test Case #1");
        
        char choice = ' ';
        MainMenuView instance = new MainMenuView();
        instance.doAction(choice);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("\n" + choice + " passed");

        
        System.out.println("\ndoAction Test Case #2");
        
         choice = 'e';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\ndoAction Test Case #3");
        
         choice = 'R';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\ndoAction Test Case #4");
        
         choice = 'S';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\ndoAction Test Case #5");
        
         choice = 'h';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\ndoAction Test Case #6");
        
         choice = 'H';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\ndoAction Test Case #7");
        
         choice = 'n';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
        
        System.out.println("\ndoAction Test Case #8");
        
         choice = 'z';
        instance.doAction(choice);
        
        System.out.println("\n" + choice + " passed");
        
// TODO review the generated test code and remove the default call to fail.

        
        
    }
    
}
