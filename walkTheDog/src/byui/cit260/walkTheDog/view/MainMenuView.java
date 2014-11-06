package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.GameMenuControl;
import byui.cit260.walkTheDog.control.GameControl;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel and gab James
 */
public class MainMenuView extends View {

    //private final String MENU =
    public MainMenuView() {
        super("\n"
            + "\n___________________________"
            + "\nMain Menu"
            + "\n___________________________"
            + "\nN - New Game" 
            + "\nR - Resume saved game" 
            + "\nH - Help Menu"
            + "\nS - Save game " 
            + "\nQ - Exit "
            + "\n___________________________");
            
    }
    
/*    public void displayMenu(){
        
        char selection = ' ';
        do{

 	System.out.println(MENU); // display the main menu
 	 
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doAction(selection);

        } while (selection != 'E' || selection != 'e'); // a selection is not "Exit"

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
*/


    public void doAction(char choice) {
        
        switch (choice){
            case 'N': // create and Start a new Game
                this.startNewGame();
                break;
            case 'n': // create and Start a new Game
                this.startNewGame();
                break;
            case 'R': // resume saved game
                this.startExistingGame();
                break;
            case 'r': // resume saved game
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
            case 'Q': // Exit the program
                return;
            case 'q': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void startNewGame(){
        System.out.println("*** startNewGame function called ***");
    //    GameControl.createNewGame(WalkTheDog.getPlayer());
        
        //display the game menu
        GameMenuControl gameMenu = new GameMenuControl();
        gameMenu.displayNewGameMenu();
    }   
     
    private void startExistingGame(){
        System.out.println("*** startExistingGame function called ***");
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
        gameMenuHelp.displayHelpMenu();
    }
    
    private void saveGame(){
        System.out.println("*** saveGame function called ***");
    }
    


}
