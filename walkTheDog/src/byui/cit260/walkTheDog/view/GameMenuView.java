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
public class GameMenuView  extends View {
    
public int playerSatisfaction = 0;
public int playerLeashLenght = 0;


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
    

    public void doAction(char choice) {
        
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

        int a = 1, b = 2;  // a == int fido, b == int scean1 THIS will be added when I understand how ot pass Global variables.
        
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
    
    
    
    /* Instructor: 
     * Each of these functions should be calling some Control Layer function to 
     * perform some task. Create and call stub functions in the appropriate 
     * Control Layer class for now. 
     */
    private void userExplore(){
        System.out.println("*** userEventOnExplore function called ***");

        int leashLength = 4;                        // Will update when calling GLOBAL integers is discussed
//        int idealLeashLength = 15;                  // Will update when calling GLOBAL integers is discussed
        
        EventControl randNum = new EventControl();
        randNum.randomNumberGenerator16_0to15();
        
//        int randomNumber = (int) randNum;
//        
        System.out.println("*** Random number generated  " + randNum + " ***");
//
//        EventControl idealLeashLength = new EventControl();
//        idealLeashLength.idealLeashLength(randomNumber);
//        
//        int iLL = (int) idealLeashLength;
//        
//        EventControl eventOnExplore = new EventControl();
//        eventOnExplore.eventOnExplore(leashLength, iLL);
//        
        
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

    
    
 

}
