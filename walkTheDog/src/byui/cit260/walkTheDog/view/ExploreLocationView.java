/* 
 * This class in under development 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.ExporingControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Idel
 */
public class ExploreLocationView {


   
    public void  display(){
//    private final String OPTION = ' ';
        char selection = ' ';
        do{
        System.out.println("\nDo you wish to explore a new area of the map (y/n)?");
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doGameAction(selection);

        } while (selection != 'N' || selection != 'n'); // a selection is not "Exit"

    if (selection == 'N' |selection == 'n' ){
        System.out.println("not exploring function called.");
        
        /* Instructor: 
         * Create and call a stub function 
         * Control Layer class for this action. The Control Layer
         * is responsible for performaing all actions of the game.
         */
//            if (
        
        //under development:
        //Random randomGenerator = new Random();
        //int randomeEvent = randomGenerator.nextInt(100);
        //if (randomeEvent <= 50){
         //   this.exploreLocation();
        }
       
    }
    
    /**
     *
     * @return
     */
    public  String getInput(){
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
    
    public void doGameAction(char choice) {
        
        switch (choice){
            
            /* Instructor: 
             * It does not make any sense to use a switch statement when there
             * really is only one choice or action. It would have been better
             * to use and if-else selection statement here, or even better move
             * the "No" option to a switch statement here and then call the 
             * control layer stub function for each action. The control layer is
             * responsible for performing the actions. The Model Layer only
             * gets the input from the user and displays the output to the user.
             */
            
            case 'y': 
                this.exploreLocation();
                break;
            case 'Y': 
                this.exploreLocation();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }

    private void exploreLocation() {
        System.out.println("exploreLocation function called.");
        
        /* Instructor: 
         * Create and call a stub function in the appropriate
         * Control Layer class for this action. The Control Layer
         * is responsible for performaing all actions of the game.
         */
        
       // Random randomGenerator = new Random();
       // int randomeEvent = randomGenerator.nextInt(100);
        
       // if (randomeEvent >= 0 && randomeEvent <= 25){
        
        // this part is under development:
        //int leashLength = 4;            // will be replaced with function that calls user entered leash length
        
        //EventControl randNumForILL = new ExporingControl();
        //int idealLeashLength = randNumForILL.randomNumberGenerator16_0to15 ();  // function that calls idealLeashLength generator

        //EventControl userEventOnExplore = new ExporingControl();
        //userEventOnExplore.eventOnExplore(leashLength,idealLeashLength);
        
    }
}
