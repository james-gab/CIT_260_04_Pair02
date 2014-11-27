/*
 * Project author: gab James.
 */
package byui.cit260.walkTheDog.view;
import byui.cit260.walkTheDog.control.MapControl;
import byui.cit260.walkTheDog.model.Player;


/*
 * @author gab
 */
public class LocationView extends ViewForLocation{
    public String hMR = "LV";
    private Player player;

    
    
    
    public LocationView (Player player) {


        super("\n"
            + "\nWhich area of the Park would you"
            + "\nlike to go to next?"
            + "\n--------------------------------"
            + "\nLocation Menu"
            + "\n--------------------------------"
            + "\n"
            + "\n  1   - PLACE location description here" 
            + "\n  2   - PLACE location description here" 
            + "\n  3   - PLACE location description here" 
            + "\n  4   - PLACE location description here" 
//            + "\n  5   - PLACE location description here" 
//            + "\n  6   - PLACE location description here"
            + "\n  H   - Help Menu" 
            + "\n  Q   - Return to Game menu"
            + "\n________________________________\n");

        this.player=player;
    }
    
    
    
    
    
    
    @Override
    public void doAction(char choice) {
        
    switch(choice){
            case '1': // User moves to location 2
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
            case 'H': // display the Help Menu
                this.displayHelpMenu();
                break;
            case 'Q': // Exit the Location View
                this.quitGame();
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***"
                        + "in doAction Overide Switch case");
                break;
    }      
    }

    
    
    
    
    private void displayHelpMenu(){
        HelpMenuView gameMenuHelp = new HelpMenuView();
        gameMenuHelp.displayHelpMenu(hMR);
    }
    
    private void quitGame(){
        System.out.println("*** quit Location function called ***"
                + "\nSending player back to Game Menu");
        GameMenuView quittingGame = new GameMenuView(player);
        quittingGame.display(hMR);
    }
    
    
    private void visitSceanL(char choice){

         int a = 1, b = 2;  // a == int fido, b == int scean1 THIS will be added when I decide what to do with the MapControl section.
        
        if      (choice == '1'){
            MapControl visitSceanL1 = new MapControl();
            visitSceanL1.visitSceanL1(a,b);
        }
        else if (choice == '2'){
            MapControl visitSceanL2 = new MapControl();
            visitSceanL2.visitSceanL2(a,b);
        }
        else if (choice == '3'){
            MapControl visitSceanL3 = new MapControl();
            visitSceanL3.visitSceanL3(a,b);
        }
        else if (choice == '4'){
            MapControl visitSceanL4 = new MapControl();
            visitSceanL4.visitSceanL4(a,b);
        }
        
/*        
        else if (choice == 5){
            MapControl visitSceanL5 = new MapControl();
            visitSceanL5.visitSceanL5(a,b);
        }
        else if (choice == 6){
            MapControl visitSceanL6 = new MapControl();
            visitSceanL6.visitSceanL6(a,b);
        }
        else if (choice == 7){
            MapControl visitSceanL7 = new MapControl();
            visitSceanL7.visitSceanL7(a,b);
        }
        else if (choice == 8){
            MapControl visitSceanL8 = new MapControl();
            visitSceanL8.visitSceanL8(a,b);
        }
        else if (choice == 9){
            MapControl visitSceanL9 = new MapControl();
            visitSceanL9.visitSceanL9(a,b);
        }
*/
        else {
                System.out.println("\n*** Invalid Selection in visitSceanL *** Try Again ***");
        }
    }
    

    
    
}
