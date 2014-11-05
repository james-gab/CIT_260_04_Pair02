/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.ProgramControl;
import byui.cit260.walkTheDog.model.Player;
import java.util.Scanner;


/**
 *
 * @author Idel
 */
public class StartProgramView {
   
    public StartProgramView() {
    }    
    
    public void startProgram() {
        
        // Display the banner screen
        this.displayBanner();
              
 	// Prompt the Player for their name Retrieve the name of the player
           String playersName = this.getPlayersName();
 	// Create and save the player object
           Player player = ProgramControl.createPlayer(playersName);
 	// Display a personalized welcome message using the player name
           this.displayWelcomeMessage(player);
 	// Display the main menu
           MainMenuView mainMenu = new MainMenuView();
           mainMenu.display();
        
 	
    }
    
    private void displayBanner() {
                System.out.println("\n\n***********************************************************");
        
        System.out.println( "*                                                          *"
                +           "\n* Walk the Dog a fun text-based game that allows you the   *"
                +           "\n* experience of walking your dog in the park as you        *"
                +           "\n* retract or extend your Dog’s leash to avoid incidents     *");
                    
        System.out.println("*********************************************************** ");
    }

    public String getPlayersName() {
       boolean valid = false;
       String playersName = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){

            System.out.println("Enter the player's name below:");

            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 1){
                System.out.println("Invalid name - the name must not be blank");
                continue;
            }
            break;
        }
        return playersName;
    }
//N - New Game
//R - Resume saved game 
//H - Help Menu
//S - Save game 
//E - Exit 

   
    private void displayWelcomeMessage(Player player) {
        
        System.out.println("\n\n==========================");
        System.out.println("Welcome to the game " + player.getName());
        System.out.println("Have fun walking your dog in the park!");
        System.out.println("\n==========================\n");
    }

  
    
}
