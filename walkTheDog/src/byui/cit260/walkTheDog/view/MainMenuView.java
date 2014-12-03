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

    public MainMenuView(
            Player player
    ) {
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
    }
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
    gameMenuHelp.displayHelpMenu(hMR);
        }
    
    private void saveGame(){
        this.console.println("\n*** saveGame function called ***"
                + "in MainMenuView.java     saveGame()");
    }
    


}
