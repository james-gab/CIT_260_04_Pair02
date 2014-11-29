/*
 * Project author: gab James.
 * 
 * 
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.MapControl;
import byui.cit260.walkTheDog.control.ExploringControl;
import byui.cit260.walkTheDog.control.EventsControl;
import byui.cit260.walkTheDog.control.MiniGameControl;
import byui.cit260.walkTheDog.exceptions.EventsControlException;
import byui.cit260.walkTheDog.exceptions.ExploringControlException;
import byui.cit260.walkTheDog.exceptions.MiniGameControlException;
import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.EventsType;
import byui.cit260.walkTheDog.model.Player;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab James 
 */
public class GameMenuView extends View {

public String hMR = "gMV";
public Player player;
 
            
    public GameMenuView(Player players) {

        super("\n"
            + "\n________________________________"
            + "\n"
            + "\nGame Menu"
            + "\n________________________________"
            + "\n"
            + "\n  M   - Move to new location" 
            + "\n  E   - Explore location" 
            + "\n  L   - Estimate leash length"
            + "\n  P   - Play Mini Game"
            + "\n  D   - Display Map"
            + "\n  T   - Game Statistics"
            + "\n  A   - Things in the Park"
            + "\n  H   - Help Menu "
            + "\n  S   - Save game " 
            + "\n  Q   - Quit Game without saving"
            + "\n________________________________\n");

        this.player = players;

        System.out.println("\n\nYour current statistics:\nfor testing only\n"
                + player + "\n"
                + "\n"
                + player.getPlayerCurrentScore() + "  =  playerCurrentScore\n"
                + player.getGameDidUserExplore() + "  =  gameDidUserExplore\n"
                + player.getGameUserExploreCounter() + "  =  gameUserExploreCounter\n"
                + player.getGameFidoMood() + "  =  gameFidoMood\n"
                + player.getGameNumberOfTurns() + "  =  gameNumberOfTurns\n"
                + player.getGameIdealLeashLength() + "  =  gameIdealLeashLength\n"
                + player.getPlayerLeashLenght() + "  =  playerLeashLenght\n"
                + player.getPlayerSatisfaction() + "  =  playerSatisfaction\n"
        );
        
       
        
    }

    
@Override
    public void doAction(char choice) {
        
        if(player.playerCurrentScore <= 0){
        System.out.println("Your Score is Zero, you loose");
            choice = 'Q';
        }
        
                
        switch (choice){
            case 'M': {
            try {
                // User moves to location 1
                //    this.displayMap();
                this.visitSceanL();
            } catch (ExploringControlException ex) {
                System.out.println(ex.getMessage());
            }
        }
                break;
            case 'D': // User Displays Map
                this.displayMap();
                break;
            case 'E': {
            try {
                // User chooses to Explore
                this.userExplore();
            } catch (ExploringControlException ex) {
                System.out.println(ex.getMessage());
                    }
                }
                break;
            case 'L': // User Estimates Leash Length needed
                this.userLeashLength();
                break;
            case 'P': // User plays Mini game
                this.createMiniGame(player);   //this needs to be fixed
                break;
            case 'T': // User views userStatistics
                this.userStatistics();
                break;
            case 'A': // User views userStatistics
                this.displayActors();
                break;
            case 'H': // display the Help Menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current Game
                this.saveGame();
                break;
            case 'Q': // Exit the game (no save)
                this.quitGame();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void visitSceanL() throws ExploringControlException{
        System.out.println("*** Move Location function called ***"
                + "\n Location Menu will be called");
        
        ExploringControl check = new ExploringControl();
        check.didUserExplore(player);
        check.shortLeash(player);

        player.setGameDidUserExplore('n');                                        // change char gameDidUserExplore back to NO
        
        UserExperienceView question = new UserExperienceView(player);
        question.display(hMR);                                                // does not fully work yet, will not retun player to this point in game

//        LocationView changeLocations = new LocationView(player);                // send user to Location view menu
//        changeLocations.display(hMR);
        }
    
        
    
    
    public void userExplore() throws ExploringControlException{
//        System.out.println("*** GameMenuView.java     public void userExplore() function called ***");

//        player.playerLeashLenght = 15;                                          // for testing only
//        int eOE = 1;                                                            // for testing only
//        player.gameDidUserExplore='r';                                          // for testing only

        ExploringControl explore = new ExploringControl();                         // calls random number generator
        EventsType[][] eventTypes = WalkTheDog.getCurrentGame().getEvents().getEventTypes();
        Player variable = new Player();
        
        variable.setGameIdealLeashLength(explore.idealLeashLength(explore.randomIdealLeashGenerator())); // passes a random generated idealLeashLength to a variable
        
        if (explore.shortLeash(player) > 0 && player.gameDidUserExplore=='n'){  // check if user had leash too short for too long and Fido was bad - no points for bad fido
//            if (explore.eventOnExplore(player.playerLeashLenght, player.gameIdealLeashLength) > 0 && player.gameDidUserExplore=='r'){
            if (explore.eventOnExplore(variable.getPlayerLeashLenght(), variable.getGameIdealLeashLength()) > 0 && variable.getGameDidUserExplore()=='r'){
                variable.setGameDidUserExplore('y');
                System.out.println("*** Fido found something in this area");
                System.out.println("*** " + eventTypes[explore.randomNumberGenerator(8)][1].getEventScene().getEventsSymbol());
                variable.playerCurrentScore -=1;
                if(variable.getGameFidoMood() < 9 && variable.getGameFidoMood() > 1){
                            variable.gameFidoMood -= 1;
                }           
                System.out.println("Fido Leash Length: " + variable.getPlayerLeashLenght()
                        + "\nClosest object: " + variable.getGameIdealLeashLength()
                        + "\n*** Players Current Score decreases by 1 to " + variable.getPlayerCurrentScore()
                        + "\nFido's Mood is now: " + variable.getGameFidoMood());
            }
            else if (explore.eventOnExplore(player.playerLeashLenght, player.gameIdealLeashLength) > 0){
                player.gameDidUserExplore='y';
                System.out.println("*** Fido found a friend in this area");
                System.out.println("*** " + eventTypes[explore.randomNumberGenerator(8)][0].getEventScene().getEventsSymbol());
                player.playerCurrentScore +=1;
                if(player.gameFidoMood < 9){
                    player.gameFidoMood += 1;
                    }           
                System.out.println("Fido Leash Length: " + player.playerLeashLenght 
                        + "\nClosest object: " + player.gameIdealLeashLength
                        + "\n*** Players Current Score increases by 1 to " + player.playerCurrentScore
                        + "\nFido's Mood is now: " + player.gameFidoMood);
            }
            else {
//            else if (explore.eventOnExplore(player.playerLeashLenght, player.gameIdealLeashLength) == 0){
                player.playerCurrentScore +=1;
                player.gameDidUserExplore='y';
                if(player.gameFidoMood < 9){
                    player.gameFidoMood += 1;
                }           
                System.out.println("Fido Leash Length: " + player.playerLeashLenght 
                        + "\nClosest object: " + player.gameIdealLeashLength
                        + "\n*** Players Current Score increases by 1 to " + player.playerCurrentScore
                        + "\nFido's Mood is now: " + player.gameFidoMood
                        + "\n*** Fido was not interested in "
                        + "anything in the area it could reach ");
                }
//            else {
//                player.gameDidUserExplore='y';
//                System.out.println("*** Our appologies, something went wrong. ***"
//                    + "\n*** ERROR in GameMenuView.java in ***"
//                    + "\n   userExplore() if(eOE>0)***");
// develop code that restarts the game from this spot
//                }
        }   // END          if (badDog > 0){
        else{
            System.out.println("You have already explored this Area.\nPlease try another Area.");
        }
        
    }

    
         
    private void userLeashLength(){         //This Function is in development by my Team member at the time of writing this code
        System.out.println("*** userLeashLength function called ***");
        
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
        gameMenuHelp.displayHelpMenu(hMR);
    }
    
    private void userStatistics(){
        StatisticsMenuView gameStatistics = new StatisticsMenuView(player);
        gameStatistics.display(hMR);
    }

    private void displayActors(){
        EventsControl gameEvents = new EventsControl();
    try {
        gameEvents.displayEvents();
    } catch (EventsControlException ex) {
                System.out.println(ex.getMessage());
        }
    }

    private void saveGame(){                                              
        System.out.println("*** saveGame function called ***");
    }

    private void quitGame(){
        System.out.println("*** quitGame function called ***"
                + "\nSending player back to Main Menu");
        MainMenuView quittingGame = new MainMenuView(player);
        quittingGame.display(hMR);
    }

    private void displayMap() {
        System.out.println("***This is a stub function****  GameMenuView.java   displayMap()");
        MapControl seeMap = new MapControl();
        seeMap.displayMap();
    }

    private void createMiniGame(Player player) {
        System.out.println("***This is a stub function**** MiniCameControl.java createMiniGame()");
        MiniGameControl miniGame = new MiniGameControl();
    try {
        miniGame.createMiniGame(player);   //this needs to be fixed
    } catch (MiniGameControlException ex) {
                System.out.println(ex.getMessage());
        }
    }
    
    
 

}
