/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import java.util.Scanner;

/**
 *
 * @author Idel
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n___________________________"
            + "\nMain Menu"
            + "\n___________________________"
            + "\nN - New Game" 
            + "\nR - Resume saved game" 
            + "\nH - Help Menu"
            + "\nS - Save game " 
            + "\nE - Exit "
            + "\n___________________________";
    
    public void displayMenu(){
        
        char selection = ' ';
        do{

 	System.out.println(MENU); // display the main menu
 	 
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doAction(selection);

        } while (selection != 'E'); // a selection is not "Exit"

    }

    public String getInput() {
       boolean valid = false;
       String playersInput = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){
            

            System.out.println("Enter a Menu choice below:");

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



    public void doAction(char choice) {
        
        switch (choice){
            case 'N': // create and Start a new Game
                this.startNewGame();
                break;
            case 'n': // create and Start a new Game
                this.startNewGame();
                break;
            case 'G': // get and Start a new Game
                this.startExistingGame();
                break;
            case 'g': // get and Start a new Game
                this.startExistingGame();
                break;
            case 'H': // display the Help Menu
                this.displayHelpMenu();
                break;
            case 'h': // display the Help Menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current Game
                this.saveGame();
                break;
            case 's': // save the current Game
                this.saveGame();
                break;
            case 'E': // Exit the program
                return;
            case 'e': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void startNewGame(){
        System.out.println("*** startNewGame function called ***");
    }
    
    private void startExistingGame(){
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu(){
        System.out.println("*** displayHelpMenu function called ***");
    }
    
    private void saveGame(){
        System.out.println("*** saveGame function called ***");
    }
    


}
