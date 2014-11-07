/*
 * Project author: gab James.
 * 
 * 
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.MapControl;
import byui.cit260.walkTheDog.control.EventControl;
import byui.cit260.walkTheDog.control.GameMenuControl;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab James
 */
public class GameMenuView extends View {
    
public int playerSatisfaction = 0;
public int playerLeashLenght = 4;
public int gameIdealLeashLength = 0;
public int gameNumberOfTurns = 0;
public int gameFidoMood = 5;

// starts player at a randomly generated starting score between 0 and 15
EventControl randNum = new EventControl();                                      // calls random number generator
public int playerCurrentScore =  randNum.randomNumberGenerator16_0to15();       // passes a random generated number to a variable




    //private final String GAMEMENU = 
            
    public GameMenuView() {
        super("\n"
            + "\n________________________________"
            + "\nMain Menu"
            + "\n________________________________"
            + "\n[1-9] - Move to new location" 
            + "\n  E   - Explore location" 
            + "\n  L   - Estimate leash length"
            + "\n  H   - Help Menu "
            + "\n  S   - Save game " 
            + "\n  Q   - Quit Game without saving"
            + "\n________________________________");
    }
    
//[1-9] - Move to new location
//E - Explore location 
//L - Estimate the leash length allowed in their current location
//H - Help Menu - Done
//S - Save Game
//Q - Quit Game

   
//USED to satisfy Lesson 06 Individual assignment
//  RUBIC
//      Used the Java switch, and do-while statements  
//      to implemented the view for one end user story 
//      that contains a menu.
//    
//      This impliments the do-while statment 
//      see lines 108-170 for rest of requirement
/*    public void displayGameMenu(){
        
        char selection = ' ';
        do{

 	System.out.println(GAMEMENU); // display the main menu
 	 
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doGameAction(selection);

        } while (selection != 'Q' || selection != 'q'); // a selection is not "Exit"

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
*/
//[1-9] - Move to new location
//E - Explore location 
//L - Estimate the leash length allowed in their current location
//H - Help Menu - Done
//S - Save Game
//Q - Quit Game

    
    
//USED to satisfy Lesson 06 Individual assignment
//  RUBIC
//      Used the Java switch, and do-while statements  
//      to implemented the view for one end user story 
//      that contains a menu.
//    
//      Lines 108-170 impliments the Java switch 
//      see lines 50-63 for rest of requirement
    

@Override
    public void doAction(char choice) {
        
        if(playerCurrentScore <= 0){
        System.out.println("Your Score is Zero, you loose");
            choice = 'Q';
        }
        
        switch (choice){
            case '1': // User moves to location 1
                this.visitSceanL(choice);
                break;
            case '2': // User moves to location 2
                this.visitSceanL(choice);
                break;
            case '3': // User moves to location 3
                this.visitSceanL(choice);
                break;
            case '4': // User moves to location 4
                this.visitSceanL(choice);
                break;
            case '5': // User moves to location 5
                this.visitSceanL(choice);
                break;
            case '6': // User moves to location 6
                this.visitSceanL(choice);
                break;
            case '7': // User moves to location 7
                this.visitSceanL(choice);
                break;
            case '8': // User moves to location 8
                this.visitSceanL(choice);
                break;
            case '9': // User moves to location 9
                this.visitSceanL(choice);
                break;
            case 'E': // User chooses to Explore
                this.userExplore();
                break;
            case 'e': // User chooses to Explore
                this.userExplore();
                break;
            case 'L': // User Estimates Leash Length needed
                this.userLeashLength();
                break;
            case 'l': // User Estimates Leash Length needed
                this.userLeashLength();
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
            case 'Q': // Exit the game (no save)
                this.quitGame();
            case 'q': // Exit the game (no save)
                this.quitGame();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void visitSceanL(char choice){
        int  i = (int) choice; // cast from a char to an int

        
        System.out.println("*** startExistingGame function called ***");
        System.out.println("The location choice was:   " + i );

        int a = 1, b = 2;  // a == int fido, b == int scean1 THIS will be added when I understand how ot pass Global variables.
        
        if (playerLeashLenght<4){
        EventControl fidoMood = new EventControl();                              // calls random number generator
        int getFidoMood = fidoMood.generateFidoMood(gameNumberOfTurns, playerLeashLenght, gameFidoMood);             // passes a random generated number to a variable
            if (getFidoMood == 0){
                System.out.println("Fido does not like a short leash"
                        + "\nand has been a bad dog, you loose 3 points");
                playerCurrentScore -=3;
                gameNumberOfTurns =0;
            }
            else if (getFidoMood < gameFidoMood){
                System.out.println("Fido does not like a short leash"
                        + "\nand is starting to get unhappy");
                gameFidoMood = getFidoMood;
            }
            else if (getFidoMood == gameFidoMood){
                System.out.println(" Fido fido does not like a short leash "
                        + "\nlucily Fido is not that mad yet."
                        + "\nConsider keeping the leash longer than 3.");
            }
            else {
                System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java in visitSceanL() ***");
// develop code that restarts the game for this spot
            }
        }
        else if (i == 1){
            MapControl visitSceanL1 = new MapControl();
            visitSceanL1.visitSceanL1(a,b);
        }
        else if (i == 2){
            MapControl visitSceanL2 = new MapControl();
            visitSceanL2.visitSceanL2(a,b);
        }
        else if (i == 3){
            MapControl visitSceanL3 = new MapControl();
            visitSceanL3.visitSceanL3(a,b);
        }
        else if (i == 4){
            MapControl visitSceanL4 = new MapControl();
            visitSceanL4.visitSceanL4(a,b);
        }
        else if (i == 5){
            MapControl visitSceanL5 = new MapControl();
            visitSceanL5.visitSceanL5(a,b);
        }
        else if (i == 6){
            MapControl visitSceanL6 = new MapControl();
            visitSceanL6.visitSceanL6(a,b);
        }
        else if (i == 7){
            MapControl visitSceanL7 = new MapControl();
            visitSceanL7.visitSceanL7(a,b);
        }
        else if (i == 8){
            MapControl visitSceanL8 = new MapControl();
            visitSceanL8.visitSceanL8(a,b);
        }
        else if (i == 9){
            MapControl visitSceanL9 = new MapControl();
            visitSceanL9.visitSceanL9(a,b);
        }
        else {
                System.out.println("\n*** Invalid Selection *** Try Again ***");
        }
    }
    
    
    
    /* Instructor: 
     * Each of these functions should be calling some Control Layer function to 
     * perform some task. Create and call stub functions in the appropriate 
     * Control Layer class for now. 
     */
    private void userExplore(){
        System.out.println("*** userEventOnExplore function called ***");

        
        EventControl number = new EventControl();                              // calls random number generator
        int randomNumber = number.randomNumberGenerator16_0to15();             // passes a random generated number to a variable
 
        System.out.println("*** Random number generated  " + randomNumber + " ***");

        EventControl idealLeashLength = new EventControl();                     // generates a random ideal leash length
        gameIdealLeashLength = idealLeashLength.idealLeashLength(randomNumber); // passes a random generated idealLeashLength to a variable
        
        EventControl eventOnExplore = new EventControl();                       // determin if an event happened during a user initiated explore
        int eOE = eventOnExplore.eventOnExplore(playerLeashLenght, gameIdealLeashLength);
        
        if (eOE > 0){
            System.out.println("Fido found a friend in this area");
// develop code that determins what happend to FIDO game for this spot
// this should be the good or bad experience section of the game
// int playerCurrentScore could go either up or down by 1
        }
        else if (eOE == 0){
            // player chose a good leash length, 
            //no event happened 
            //int playerCurrentScore increased by 1
            System.out.println("Fido Leash Length: " + playerLeashLenght 
                    + "\nClosest object: " + gameIdealLeashLength
                    + "\n*** Fido was not interested in "
                    + "\nanything in the area it could reach ");
            playerCurrentScore +=1;
            gameFidoMood += 1;
        }
        else {
            System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java in userExplore() ***");
// develop code that restarts the game for this spot
        }
        
    }

    
         
    private void userLeashLength(){         //This Function is in development by my Team member at the time of writing this code
        System.out.println("*** userLeashLength function called ***");
        
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
        gameMenuHelp.displayHelpMenu();
    }
    
    private void saveGame(){
        System.out.println("*** saveGame function called ***");
    }

    private void quitGame(){
        System.out.println("*** quitGame function called ***"
                + "\nSending player back to Main Menu");
        MainMenuView quittingGame = new MainMenuView();
        quittingGame.display();
    }
    
    
 

}
