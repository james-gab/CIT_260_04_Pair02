/* 
 * This class in under development 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.EventControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Idel
 */
public class ExploreLocationView {
   
    public void  display(){
//    private final String OPTION = ' ';
    
    System.out.println("\nDo you wish to explore a new area of the map (y/n)?");
        char selection = ' ';
        
        do{

 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doGameAction(selection);

        } while (selection != 'N' || selection != 'n'); // a selection is not "Exit"

    if (selection == 'N' |selection == 'n' ){
        Random randomGenerator = new Random();
        int randomeEvent = randomGenerator.nextInt(100);
        if (randomeEvent <= 50){
                this.exploreLocation();
        }
       
    }
    
        
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

   

    public void doGameAction(char choice) {
        
        switch (choice){
            case 'y': // User moves to location 1
                this.exploreLocation(choice);
                break;
            case 'Y': // User moves to location 1
                this.exploreLocation(choice);
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }

    private void exploreLocation(char choice) {
        
       // Random randomGenerator = new Random();
       // int randomeEvent = randomGenerator.nextInt(100);
        
       // if (randomeEvent >= 0 && randomeEvent <= 25){
        int leashLength = 4;            // will be replaced with function that calls user entered leash length
        
        EventControl randNumForILL = new EventControl();
        int idealLeashLength = randNumForILL.randomNumberGenerator16_0to15 ();  // function that calls idealLeashLength generator

        EventControl userEventOnExplore = new EventControl();
        userEventOnExplore.eventOnExplore(leashLength,idealLeashLength);
        
    }

    private void moveOn(char choice) {
        Random randomGenerator = new Random();
        int randomeEvent = randomGenerator.nextInt(100);
        
        if (randomeEvent >= 0 && randomeEvent <= 50){
        
        }
    }
}
