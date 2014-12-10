/*
 * Project author: gab James.
 */

package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.view.ErrorView;
import java.io.*;
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
        
        this.console.println("Please enter a leash lenght for Fido");
        
//        char selection = ' ';
        int userLL = -2; //-2 so that it enters the do while statement
        do{

 	//this.console.println("");
 	String input = this.getLLInput(); // get first charecter of string
//        this.console.println("input = "+input);
        userLL = Integer.parseInt(input);
//        this.console.println("userLL = "+userLL);
        
        if (userLL < 0 || userLL > 15){
            ErrorView.display(this.getClass().getName(),"Invalid Leash Length! Try again!");
            }
        } while (userLL < 0 || userLL > 15); // a selection is not "valid"
    return userLL;
    }
    
    public String getLLInput() {
       boolean valid = false;
       String playersInput = null;
//       Scanner keyboard = new Scanner(System.in);

       try{
        while(!valid){
            
            Scanner keyboard = new Scanner(System.in);
            this.console.println("\nPlease enter a number between 0 and 15: ");

//            playersInput = keyboard.nextLine();
            playersInput = this.keyboard.readLine();
            playersInput = playersInput.trim();

            if (playersInput.length() < 1){    
                ErrorView.display(this.getClass().getName(),"Invalid entry - space is not an option");
                continue;
            }
            
             if (!keyboard.hasNextInt()){
                 ErrorView.display(this.getClass().getName(),"Invalid entry - letter is not an option");
       	         
            }
            break;
        }
        } catch (Exception e) {            
            ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection * Try again");
                 }
        return playersInput;
    }
    
}
