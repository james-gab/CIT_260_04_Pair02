/*
 * Project author: gab James.
 * 
 * 
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.MapControl;
import byui.cit260.walkTheDog.control.EventControl;
import byui.cit260.walkTheDog.control.NewGameMenuControl;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab James 
 */
public class GameMenuView extends View {

public String hMR = "gMV";
public int playerSatisfaction;
public int playerLeashLenght;
public int gameIdealLeashLength;
public int gameNumberOfTurns;
public int gameFidoMood;
public int gameUserExploreCounter;
public char gameDidUserExplore;
public int playerCurrentScore;   
           
 
            
    public GameMenuView(
                        int playerSatisfaction,
                        int playerLeashLenght,
                        int gameIdealLeashLength,
                        int gameNumberOfTurns,
                        int gameFidoMood,
                        int gameUserExploreCounter,
                        char gameDidUserExplore,
                        int playerCurrentScore
                                                ) {

        
        super("\n"
            + "\n________________________________"
            + "\n"
            + "\nGame Menu"
            + "\n________________________________"
            + "\n"
            + "\n  M   - Move to new location" 
            + "\n  E   - Explore location" 
            + "\n  L   - Estimate leash length"
            + "\n  T   - Game Statistics"
            + "\n  H   - Help Menu "
            + "\n  S   - Save game " 
            + "\n  Q   - Quit Game without saving"
            + "\n________________________________\n");
        this.playerCurrentScore = playerCurrentScore;
        this.gameDidUserExplore = gameDidUserExplore;
        this.gameUserExploreCounter = gameUserExploreCounter;
        this.gameFidoMood = gameFidoMood;
        this.gameNumberOfTurns = gameNumberOfTurns;
        this.gameIdealLeashLength = gameIdealLeashLength;
        this.playerLeashLenght = playerLeashLenght;
        this.playerSatisfaction = playerSatisfaction;

        System.out.println("\n\nYour current statistics:\n"
                + "for testing only\n"
                + playerCurrentScore + "  =  playerCurrentScore\n"
                + gameDidUserExplore + "  =  gameDidUserExplore\n"
                + gameUserExploreCounter + "  =  gameUserExploreCounter\n"
                + gameFidoMood + "  =  gameFidoMood\n"
                + gameNumberOfTurns + "  =  gameNumberOfTurns\n"
                + gameIdealLeashLength + "  =  gameIdealLeashLength\n"
                + playerLeashLenght + "  =  playerLeashLenght\n"
                + playerSatisfaction + "  =  playerSatisfaction\n");
        
        
        
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
            case 'M': // User moves to location 1
                this.visitSceanL();
                break;
/*
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
*/
            
            case 'E': // User chooses to Explore
                this.userExplore();
                break;
//            case 'e': // User chooses to Explore
//                this.userExplore();
//                break;
            case 'L': // User Estimates Leash Length needed
                this.userLeashLength();
                break;
//            case 'l': // User Estimates Leash Length needed
//                this.userLeashLength();
//                break;
            case 'T': // User views userStatistics
                this.userStatistics();
                break;
//            case 't': // User views userStatistics
//                this.userStatistics();
//                break;
            case 'H': // display the Help Menu
                this.displayHelpMenu();
                break;
//            case 'h': // display the Help Menu
//                this.displayHelpMenu();
//                break;
            case 'S': // save the current Game
                this.saveGame();
                break;
//            case 's': // save the current Game
//                this.saveGame();
//                break;
            case 'Q': // Exit the game (no save)
                this.quitGame();
//            case 'q': // Exit the game (no save)
//                this.quitGame();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void visitSceanL(){

        if (gameDidUserExplore=='n'){
            EventControl number = new EventControl();                              // calls random number generator
            EventControl eventOnNoExplore = new EventControl();                       // determin if an event happened during a ramdom initiated explore
            int eONE = eventOnNoExplore.eventOnNoExplore(gameUserExploreCounter, gameIdealLeashLength, number.randomNumberGenerator16_0to15());
            if (eONE < 0){
            System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java in ***"
                    + "\n   visitSceanL() if(gameUserExplore<0)***");
// develop code that restarts the game from this spot                
            }
            else if (eONE > 0)  {
                gameDidUserExplore = 'r';                                       // change char gameDidUserExplore to random event posible
                gameUserExploreCounter = 0;                                     // Set gameUserExploreCounter to ZERO after ramdom event is generated 
            System.out.println("/nA random event occured when you did not Explore the area./n");
                EventControl idealLeashLength = new EventControl();             // set playerLeashLenght to a ramdom generated number and send player to explore
                playerLeashLenght = idealLeashLength.idealLeashLength(number.randomNumberGenerator16_0to15()); // passes a random generated playerLeashLenght to a variable
                this.userExplore();                                             // sends player to explore
            }
        }
        
        gameDidUserExplore = 'n';                                               // change char gameDidUserExplore back to NO
        
         //FIX THIS - ADD A FUNCTION TO DETERMIN IF THE PLAYER EXPLORED BEFORE LEAVING THEN CHANGE COUNTER TO ZERO. 
                                //ZERO IS NO EXPLORE   1 IS EXPLORE. COUNTER MUST BE RETURNED TO ZERO BEFORE MOVING TO NEXT SCEAN
        
        System.out.println("*** Move Location function called ***"
                + "\n Location Menu will be called");
//        System.out.println("The location choice was:   " + i );

        int a = 1, b = 2;  // a == int fido, b == int scean1 THIS will be added when I decide what to do with the MapControl section.
        
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
                gameNumberOfTurns +=1;
            }
            else if (getFidoMood == gameFidoMood){
                System.out.println(" Fido fido does not like a short leash "
                        + "\nlucily Fido is not that mad yet."
                        + "\nConsider keeping the leash longer than 3.");
                gameNumberOfTurns +=1;
            }
            else {
                System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                        + "\nin       visitSceanL() if(playerLeashLength<4)");
// develop code that restarts the game from this spot
            }
        }

        LocationView changeLocations = new LocationView(playerSatisfaction, playerLeashLenght, gameIdealLeashLength, gameNumberOfTurns, gameFidoMood, gameUserExploreCounter, gameDidUserExplore, playerCurrentScore);                         // send user to Location view menu
        changeLocations.display(hMR);
        
        
        }
    
        
    
    /* Instructor: 
     * Each of these functions should be calling some Control Layer function to 
     * perform some task. Create and call stub functions in the appropriate 
     * Control Layer class for now. 
     */
    
    /* ***************  Please advise  *****************
     * gab Response:
     * I added a lot of code to
     *                             private void userExplore()
     * but am unsure if some of this should 
     * be transfered to a control layer function
     * ***************  Please advise  *****************
     */
    
    private void userExplore(){
        System.out.println("*** userEventOnExplore function called ***");

        EventControl number = new EventControl();                              // calls random number generator
        EventControl idealLeashLength = new EventControl();                     // generates a random ideal leash length
        gameIdealLeashLength = idealLeashLength.idealLeashLength(number.randomNumberGenerator16_0to15()); // passes a random generated idealLeashLength to a variable
        
        EventControl eventOnExplore = new EventControl();                       // determin if an event happened during a user initiated explore
        int eOE = eventOnExplore.eventOnExplore(playerLeashLenght, gameIdealLeashLength);
        
        if (eOE > 0 && gameDidUserExplore=='r'){
                    gameDidUserExplore='y';
                    System.out.println("Fido found something in this area");
// develop Control layer code that determins what happend to FIDO game for this spot
// this should be the good or bad experience section of the game
// int playerCurrentScore could go either up or down by 1
// REMEMBER to add somethiing to determin if this random generated explore is bad            
        }
        else if (eOE > 0){
                    gameDidUserExplore='y';
                    System.out.println("Fido found a friend in this area");
// develop Control layer code that determins what happend to FIDO game for this spot
// this should be the good or bad experience section of the game
// int playerCurrentScore could go either up or down by 1
        }
        else if (eOE == 0){
            playerCurrentScore +=1;
            gameDidUserExplore='y';
                    if(gameFidoMood < 9){
                gameFidoMood += 1;
            }           
/*          // player chose a good leash length, 
            //no event happened 
            //int playerCurrentScore increased by 1
*/
            System.out.println("Fido Leash Length: " + playerLeashLenght 
                    + "\nClosest object: " + gameIdealLeashLength
                    + "\nPLayers Current Score increases by 1 to " + playerCurrentScore
                    + "\nFido's Mood is now: " + gameFidoMood
                    + "\n*** Fido was not interested in "
                    + "\nanything in the area it could reach ");
        }
        else {
                    gameDidUserExplore='y';
                    System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java in ***"
                    + "\n   userExplore() if(eOE>0)***");
// develop code that restarts the game from this spot
        }
        
    }

    
         
    private void userLeashLength(){         //This Function is in development by my Team member at the time of writing this code
        System.out.println("*** userLeashLength function called ***");
        
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
        gameMenuHelp.displayHelpMenu(hMR,playerSatisfaction, playerLeashLenght, gameIdealLeashLength, gameNumberOfTurns, gameFidoMood, gameUserExploreCounter, gameDidUserExplore, playerCurrentScore);
    }
    
    private void userStatistics(){
        StatisticsMenuView gameStatistics = new StatisticsMenuView(playerSatisfaction, playerLeashLenght, gameIdealLeashLength, gameNumberOfTurns, gameFidoMood, gameUserExploreCounter, gameDidUserExplore, playerCurrentScore);
        gameStatistics.display(hMR);
    }

    private void saveGame(){                                                    // 
        System.out.println("*** saveGame function called ***");
    }

    private void quitGame(){
        System.out.println("*** quitGame function called ***"
                + "\nSending player back to Main Menu");
        MainMenuView quittingGame = new MainMenuView();
        quittingGame.display(hMR);
    }
    
    
 

}
