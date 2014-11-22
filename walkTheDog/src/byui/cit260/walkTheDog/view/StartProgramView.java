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
    public String hMR = "sPV";

   
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
           MainMenuView mainMenu = new MainMenuView(player);
           mainMenu.display(hMR);
        
 	
    }
    
    private void displayBanner() {
                System.out.println("\n\n***********************************************************");
        
        System.out.println( "*                                                          *"
                +           "\n*  Walk the Dog a fun text-based game that allows you the  *"
                +           "\n*  experience of walking your dog in the park as you       *"
                +           "\n*  retract or extend your Dogs leash to avoid incidents    *"
                +           "\n*                                                          *");
                    
        System.out.println("*********************************************************** ");
    }

    public String getPlayersName() {
       boolean valid = false;
       String playersName = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){

            System.out.println("\nPlayer, please enter your name below:\n");

            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            if (playersName.length() < 1){
                System.out.println("\nInvalid name - the name must not be blank\n");
                continue;
            }
            break;
        }
        return playersName;
    }

   
    private void displayWelcomeMessage(Player player) {

        System.out.println("\n=========================="           // 26 
                + "\n   Welcome to the game"
                + "\n\n  "
                +   player.getName()
                + "\n  "
                + "\n  Have fun walking your"
                + "\n     dog in the park!"
                + "\n==========================");                        
        
        
        
    }

  
    
}
