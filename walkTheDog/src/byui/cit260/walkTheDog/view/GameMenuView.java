/*
 * Project author: gab James.
 * 
 * 
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.MapControl;
import byui.cit260.walkTheDog.control.EventControl;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab James
 */
public class GameMenuView {
    
public int playerSatisfaction = 0;

    private final String GAMEMENU = "\n"
            + "\n________________________________"
            + "\nMain Menu"
            + "\n________________________________"
            + "\n[1-9] - Move to new location" 
            + "\n  E   - Explore location" 
            + "\n  L   - Estimate leash length"
            + "\n  H   - Help Menu "
            + "\n  S   - Save game " 
            + "\n  Q   - Quit Game without saving"
            + "\n________________________________";
    
    
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
    public void displayGameMenu(){
        
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
    

    public void doGameAction(char choice) {
        
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
                this.userEventOnExplore();
                break;
            case 'e': // User chooses to Explore
                this.userEventOnExplore();
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
                return;
            case 'q': // Exit the game (no save)
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void visitSceanL(char choice){
        int  i = (int) choice; // cast from a char to an int
        System.out.println("*** startExistingGame function called ***");
        System.out.println("The location choice was:   " + i );
        
//      User input question Did you enjoy your experience in this location Y/N?
//USED to satisfy Lesson 06 Individual assignment
//  RUBIC
//        Lines 190-211
//        Used either the Java if-else or if-else-if ladder statements  
//        and the while statements to implement the view for one end user  
//        story that prompts for and retrieves input from the end user  
//        for one or more non-menu related items.
        
        
        char userExperienceInput = ' ';
        boolean experienceValidCheck = false;
        
        while (!experienceValidCheck){
        
            System.out.println("Before you leave , did you enjoy your\nexperience in this location Y/N?");
            String input = this.getInput(); // get first charecter of string
            userExperienceInput = input.charAt(0);
        
            if (userExperienceInput == 'Y' || userExperienceInput == 'y'){
                playerSatisfaction += 1;
                break;
            }
            else if (userExperienceInput == 'N' || userExperienceInput == 'n'){
                playerSatisfaction -= 1;
                break;
            }
            else {
                System.out.println("Invalid entry - please try again");
//                continue;          // NetBeans indicates this 'continue' is not needed
            }
        }
        
        
// END of Lesson 06 Individual assignment     
        
        
        
        
        int a = 1, b = 2;
        
        if (i == 1){
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
        
    private void userEventOnExplore(){
        System.out.println("*** userEventOnExplore function called ***");

        int leashLength = 4;            // will be replaced with function that calls user entered leash length
        
        EventControl randNumForILL = new EventControl();
        int idealLeashLength = randNumForILL.randomNumberGenerator16_0to15 ();  // function that calls idealLeashLength generator

        EventControl userEventOnExplore = new EventControl();
        userEventOnExplore.eventOnExplore(leashLength,idealLeashLength);
    }
         
    private void userLeashLength(){         //This Function is in development by my Team member at the time of writing this code
        System.out.println("*** userLeashLength function called ***");
        
//        userLeashLength userLeashLength = new userLeashLength();
//        userLeashLength.userLeashLength();
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
        gameMenuHelp.displayHelpMenu();
    }
    
    private void saveGame(){
        System.out.println("*** saveGame function called ***");
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
//    These are un used in this menu
    
/*    
    private void startNewGame(){
        System.out.println("*** startNewGame function called ***");
        GameControl.createNewGame(WalkTheDog.getPlayer());
        
        //display the game menu
        GameMenuControl gameMenu = new GameMenuControl();
        gameMenu.displayMenu();
    }   
     
    private void startExistingGame(){
        System.out.println("*** startExistingGame function called ***");
    }
    
*/


}
