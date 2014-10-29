/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

/**
 *
 * @author Idel
 */
public class MainMenuView {

    private final String MENU = "\n"
            + "\n___________________________"
            + "\nMain Menu"
            + "\n___________________________"
            + "\nN - New Game\n" 
            + "R - Resume saved game" 
            + "H - Help Menu\n"
            + "S - Save game \n" 
            + "E - Exit "
            + "\n____________________________";
    
    public void displayMenu(){
        char selection = ' ';
        do{

 	System.out.println(MENU); // display the main menu
 	 
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doAction(selection);

        } while (selection != 'E'); // a selection is not "Exit"

}


}
