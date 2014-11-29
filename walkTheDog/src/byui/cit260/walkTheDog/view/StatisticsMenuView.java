/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.ExploringControl;
import byui.cit260.walkTheDog.control.ProgramControl;
import byui.cit260.walkTheDog.exceptions.ExploringControlException;
import byui.cit260.walkTheDog.exceptions.ProgramControlException;
import byui.cit260.walkTheDog.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Idel
 */
public class StatisticsMenuView extends View {
    public String hMR = "sMV";
    public Player player;


//    private final String MENU = "\n"
//            + "\n________________________________"
//            + "\nStatistics Menu"
//            + "\n________________________________"
//            + "\n  L - Life Points" 
//            + "\n  M - Fido's Mood"
//            + "\n  Q - Quit (Go Back) "  // modified to Q so that it could be inherited 
//            + "\n________________________________";
//    
//    public void displayStatisticsMenu(){             //this part is inherited
//        
//        char selection = ' ';
//        do{
//
// 	System.out.println(MENU); //display the statistic menu
// 	String input = this.getInput(); // get first charecter of string
//        selection = input.charAt(0);
// 	this.doAction(selection);
//
//        } while (selection != 'B' || selection != 'b'); // a selection is not "Exit"
//
//    }



    public StatisticsMenuView (Player player) {
        
        
        super("\n"
            + "\n________________________________"
            + "\nStatistics Menu"
            + "\n________________________________"
            + "\n  L - Life Points" 
            + "\n  M - Fido's Mood"
            + "\n  Q - Quit (Go Back) "  // modified to Q so that it could be inherited 
            + "\n________________________________");

    
        this.player = player;
    
    }


    
//    public String getInput() {
//       boolean valid = false;
//       String playersInput = null;
//       Scanner keyboard = new Scanner(System.in);
//
//        while(!valid){
//            
//
//            System.out.println("Enter a choice:");
//
//            playersInput = keyboard.nextLine();
//            playersInput = playersInput.trim();
//
//
//            if (playersInput.length() < 1){    
//                System.out.println("Invalid entry - space is not an option");
//                continue;
//            }
//            break;
//        }
//        return playersInput;
//    }


    @Override
    public void doAction(char choice) {
        
        switch (choice){
            
            /* Instructor: 
             * A better solution is to use the String uppercase() function to
             * always convert the choice into an upper case letter. That way
             * you do not need to check for both upper and lower case letters.
             */
            
            /* Idel:
            *  Will do this! Thank you. 
            */
            
            case 'L': // User chooses to display Life points
                this.lifePoint(player);
                break;
            case 'l': // User chooses to display Life points
                this.lifePoint(player);
                break;
            case 'M': {
            try {
                // user chooses to display fido's mood
                this.generateFidoMood(player);
            } catch (ExploringControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'm': {
            try {
                // user chooses to display fido's mood
                this.generateFidoMood(player);
            } catch (ExploringControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'Q': // modified to Q so that it can be inherited
                this.back();
                break;
            case 'q': // modified to q so that it can be inherited
                this.back();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
    
    /* Instructor: 
         * Create and call a stub functions in the appropriate 
         * Control Layer class for the action associated with each of these 
         * functions. The Control Layer is responsible for performaing all 
         * actions of the game.
         */
    
    /*Idel:
    * Will do thanks!
    */
    /*
    private void lifePoint(){     //display the player's Life Points
        ProgramControl display = new ProgramControl();
        int lifePoints = display.playerLifePoints();
        System.out.println("Your life point is: " + lifePoints);   
    }
    */
    
    private void lifePoint(Player player){     //display the player's Life Points
        ProgramControl display = new ProgramControl();
        try {   
            System.out.println("Your life point is: " + display.playerLifePoints(player));
        } catch (ProgramControlException ex) {
                System.out.println(ex.getMessage());
        }
    }


/*    
    private void generateFidoMood() throws ExploringControlException{
    int numOfTurns = 0;    //these are put here so that it takes away my errors. 
    int length = 5;
    int dogMood = 5;
    ExploringControl display = new ExploringControl();
    int fidoMood = display.generateFidoMood(numOfTurns, length, dogMood);
            
    System.out.println("Fido mood is " + fidoMood);
    }
*/
    
    
    // fixed to return from Player player
    private void generateFidoMood(Player player) throws ExploringControlException{
    ProgramControl display = new ProgramControl();
            
        try {
            System.out.println("Fido mood is " + display.fidoMood(player));
        } catch (ProgramControlException ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    private void back(){
       System.out.println("*** quitGame function called ***"
                + "\nSending player back to Main Menu");
        GameMenuView quittingGame = new GameMenuView(player);
        quittingGame.display(hMR);//program will go back to the previous menu 
    }
    
}
