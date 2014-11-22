/*
 * Project author: gab James.
 * 
 * 
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.MapControl;
import byui.cit260.walkTheDog.control.ExporingControl;
import byui.cit260.walkTheDog.control.EventsControl;
import byui.cit260.walkTheDog.control.MiniGameControl;
import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.Player;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab James 
 */
public class GameMenuView extends View {

public String hMR = "gMV";
public Player player;
 
            
    public GameMenuView(Player player) {

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

        this.player = player;

        System.out.println("\n\nYour current statistics:\nfor testing only\n"
                + player + "\n"
                + "\n"
                + player.playerCurrentScore + "  =  playerCurrentScore\n"
                + player.gameDidUserExplore + "  =  gameDidUserExplore\n"
                + player.gameUserExploreCounter + "  =  gameUserExploreCounter\n"
                + player.gameFidoMood + "  =  gameFidoMood\n"
                + player.gameNumberOfTurns + "  =  gameNumberOfTurns\n"
                + player.gameIdealLeashLength + "  =  gameIdealLeashLength\n"
                + player.playerLeashLenght + "  =  playerLeashLenght\n"
                + player.playerSatisfaction + "  =  playerSatisfaction\n"
        );
        
        
        
    }
    
@Override
    public void doAction(char choice) {
        
        if(player.playerCurrentScore <= 0){
        System.out.println("Your Score is Zero, you loose");
            choice = 'Q';
        }
        
                
        switch (choice){
            case 'M': // User moves to location 1
            //    this.displayMap();
                this.visitSceanL();
                break;
            case 'D': // User Displays Map
                this.displayMap();
                break;
            case 'E': // User chooses to Explore
                this.userExplore();
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
    
   

    
    private void visitSceanL(){
        
        ExporingControl check = new ExporingControl();

        check.didUserExplore(player);
        check.shortLeash(player);
        player.gameDidUserExplore = 'n';                                               // change char gameDidUserExplore back to NO
        
        System.out.println("*** Move Location function called ***"
                + "\n Location Menu will be called");

        int a = 1, b = 2;  // a == int fido, b == int scean1 THIS will be added when I decide what to do with the MapControl section.
        
        LocationView changeLocations = new LocationView(player);                         // send user to Location view menu
        changeLocations.display(hMR);
        }
    
        
    
    
    public void userExplore(){
        System.out.println("*** userEventOnExplore function called ***");

        ExporingControl number = new ExporingControl();                              // calls random number generator
        ExporingControl idealLeashLength = new ExporingControl();                     // generates a random ideal leash length
        player.gameIdealLeashLength = idealLeashLength.idealLeashLength(number.randomNumberGenerator16_0to15()); // passes a random generated idealLeashLength to a variable
        
        ExporingControl check = new ExporingControl();
        check.shortLeash(player);

        ExporingControl eventOnExplore = new ExporingControl();                       // determin if an event happened during a user initiated explore
        int eOE = eventOnExplore.eventOnExplore(player.playerLeashLenght, player.gameIdealLeashLength);
        
        if (eOE > 0 && player.gameDidUserExplore=='r'){
                    player.gameDidUserExplore='y';
                    System.out.println("Fido found something in this area");
// develop Control layer code that determins what happend to FIDO game for this spot
// this should be the good or bad experience section of the game
// int playerCurrentScore could go either up or down by 1
// REMEMBER to add somethiing to determin if this random generated explore is bad            
        }
        else if (eOE > 0){
                    player.gameDidUserExplore='y';
                    System.out.println("Fido found a friend in this area");
// develop Control layer code that determins what happend to FIDO game for this spot
// this should be the good or bad experience section of the game
// int playerCurrentScore could go either up or down by 1
        }
        else if (eOE == 0){
            player.playerCurrentScore +=1;
            player.gameDidUserExplore='y';
                    if(player.gameFidoMood < 9){
                player.gameFidoMood += 1;
            }           
/*          // player chose a good leash length, 
            //no event happened 
            //int playerCurrentScore increased by 1
*/
            System.out.println("Fido Leash Length: " + player.playerLeashLenght 
                    + "\nClosest object: " + player.gameIdealLeashLength
                    + "\nPLayers Current Score increases by 1 to " + player.playerCurrentScore
                    + "\nFido's Mood is now: " + player.gameFidoMood
                    + "\n*** Fido was not interested in "
                    + "\nanything in the area it could reach ");
        }
        else {
                    player.gameDidUserExplore='y';
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
        gameMenuHelp.displayHelpMenu(hMR);
    }
    
    private void userStatistics(){
        StatisticsMenuView gameStatistics = new StatisticsMenuView(player);
        gameStatistics.display(hMR);
    }

    private void displayActors(){
        EventsControl gameEvents = new EventsControl();
        gameEvents.displayEvents();
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
        miniGame.createMiniGame(player);   //this needs to be fixed
    }
    
    
 

}
