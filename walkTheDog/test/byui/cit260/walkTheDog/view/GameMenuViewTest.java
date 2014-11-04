/*
 * Project author: gab James.
 */


package byui.cit260.walkTheDog.view;

import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author gab
 */
public class GameMenuViewTest {
    

//[1-9] - Move to new location
//E - Explore location 
//L - Estimate the leash length allowed in their current location
//H - Help Menu - Done
//S - Save Game
//Q - Quit Game

    
    
    
    
    public GameMenuViewTest() {
    }

    /**
     * Test of doGameAction method, of class GameMenuView.
     */
    @Test
    public void testDoGameAction() {
        System.out.println("doGameAction");

// Test Case #1
        char choice = ' ';
        GameMenuView instance = new GameMenuView();
        instance.doGameAction(choice);
        System.out.println("\n" + choice + " passed");

// Test Case #2
        System.out.println("\ndoGameAction Test Case #2");
        
         choice = '1';
        instance.doGameAction(choice);
        
        System.out.println("\n" + choice + " passed");

// Test Case #3
        System.out.println("\ndoGameAction Test Case #3");
        
         choice = 'L';
        instance.doGameAction(choice);
        
        System.out.println("\n" + choice + " passed");

// Test Case #4
        System.out.println("\ndoGameAction Test Case #4");
        
         choice = 'Z';
        instance.doGameAction(choice);
        
        System.out.println("\n" + choice + " passed");


}    

}
