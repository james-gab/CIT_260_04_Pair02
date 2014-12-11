package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.GameControl;
import byui.cit260.walkTheDog.model.Player;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel and gab James
 */
public class MainMenuView extends View {

    public String hMR = "mMV";
    public Player player;

    public MainMenuView(Player player) {
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
            
        this.player = player;
    }
    
    @Override
    public void doAction(char choice) {
        
        switch (choice){
            case 'N': // create and Start a new Game
                this.startNewGame();
                break;
            case 'R': // resume saved game
                this.startExistingGame();
                break;
            case 'H': // display the Help Menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current Game
                this.saveGame();
                break;
            case 'Q': // Exit the program
                return;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void startNewGame(){
//        this.console.println("\n*** startNewGame function called ***"
//                + "in MainMenuView.java     startNewGame()");
        
        GameControl.createNewGame(WalkTheDog.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView(player);
        gameMenu.display(hMR);
    }   
     
    private void startExistingGame(){
        this.console.println("\n*** startExistingGame function called ***"
                + "in MainMenuView.java     startExistingGame()");
        // prompt for and get the nameof the file to save the game
        this.console.println("\n\nEnter the file path for file th saved game.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
            
        } catch (Exception ex) {
            ErrorView.display("mainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView(player);
        gameMenu.display(hMR);
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
    gameMenuHelp.displayHelpMenu(hMR);
        }
    
    public void saveGame(){
         this.console.println("*** saveGame function called ***");
        System.out.println("\n\nEnter the file path for file where the game "
         + "is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //save the game to the speciried file
            GameControl.saveGame(WalkTheDog.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenView", ex.getMessage());
            
        }
        
    }
    


}
