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
public class UserExperienceViewTest {
    
    public UserExperienceViewTest() {
    }

    /**
     * Test of userExperienceInput method, of class UserExperienceView.
     */
    @Test
    public void testUserExperienceInput() {
        System.out.println("userExperienceInput");
        int playerSatisfaction = 0;
        char userExperienceInput = 'y';
        UserExperienceView instance = new UserExperienceView();
        int expResult = 0;
        int result = instance.userExperienceInput(playerSatisfaction);
        assertEquals(expResult, result);

//THIS TEST fails each time due to no keyboard input from user during test
//The method to enter keyboard entry was not discussed in any of the lesson material
    
    
    }

    
}
