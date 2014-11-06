/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import java.util.Scanner;

/**
 *
 * @author gab
 */
public class UserExperienceView {
    
    public int userExperienceInput( int playerSatisfaction){
    
        
//      User input question Did you enjoy your experience in this location Y/N?
//      USED to satisfy Lesson 06 Individual assignment
//  RUBIC
//        Used either the Java if-else or if-else-if ladder statements  
//        and the while statements to implement the view for one end user  
//        story that prompts for and retrieves input from the end user  
//        for one or more non-menu related items.
        
        
        char userExperienceInput = ' ';
        boolean experienceValidCheck = false;
        
        while (!experienceValidCheck){
        
            System.out.println("Before you leave , did you enjoy your\nexperience in this location Y/N?");
            String input = this.getInput(); // get first charecter of string
            userExperienceInput = input.charAt(0);
            
            /* Instructor: 
             * Create and call a stub function in the appropriate 
             * Control Layer class for now for each of these actions. You will
             * need to record the playerSatisfaction in some Model Lager object
             * (e.g., the ProgramContro). Creating, updating and deleting Model
             * Layer objects is a function of the Control Layer.
             */
            if (userExperienceInput == 'Y' || userExperienceInput == 'y'){
                playerSatisfaction += 1;
                break;
            }
            else if (userExperienceInput == 'N' || userExperienceInput == 'n'){
                playerSatisfaction -= 1;
                break;
            }
            else {
                System.out.println("Invalid entry - please try again");
            }
            
       
        }
         return playerSatisfaction;
    }

    
    
    
    public String getInput() {
       boolean valid = false;
       String playersInput = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){
            

            System.out.println("Enter a choice below:");

            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();


            if (playersInput.length() < 1){    
                System.out.println("Invalid entry - space is not an option");
                continue;
            }
            break;
        }
        return playersInput;
    }
        
        
        
        
        
        
    
}
