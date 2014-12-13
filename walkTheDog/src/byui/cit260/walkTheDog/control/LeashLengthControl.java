/*
 * Project author: gab James.
 */

package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.view.ErrorView;
import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab
 */



public class LeashLengthControl {
    
    protected final BufferedReader keyboard = WalkTheDog.getInFile();
    protected final PrintWriter console = WalkTheDog.getOutFile();
    
    
    
        public int displayLeashLengthInput(){
        
        this.console.println("\nPlease enter a leash lenght for Fido");
        
        int userLL = -2; //-2 so that it enters the do while statement
        do{

 	String input = this.getLLInput(); // get first charecter of string
        userLL = Integer.parseInt(input);
        
        if (userLL < 0 || userLL > 15){
            ErrorView.display(this.getClass().getName(),"\nInvalid Leash Length! Try again!");
            }
        } while (userLL < 0 || userLL > 15); // a selection is not "valid"
    return userLL;
    }
    
    public String getLLInput() {
       boolean valid = false;
       String playersInput = null;

       try{
        while(!valid){
            
//            Scanner keyboards = new Scanner(System.in);
            this.console.println("\nPlease enter a number between 0 and 15: ");

            playersInput = this.keyboard.readLine();
            playersInput = playersInput.trim();
            int givenNumber = parseInt(playersInput);

            if (playersInput.length() < 1){    
                ErrorView.display(this.getClass().getName(),"\nInvalid entry - space is not an option");
                continue;
            }
            
            if ((givenNumber < 0 || givenNumber > 15)){
                 ErrorView.display(this.getClass().getName(),"\nInvalid entry - letter is not an option");
       	         continue;
            }
            break;
        }
        } catch (Exception e) {            
            ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection * Try again");
                 }
        return playersInput;
    }
    
}
