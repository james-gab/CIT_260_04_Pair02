/*
 * Project author: gab James.
 */

package byui.cit260.walkTheDog.control;

import java.util.Scanner;

/**
 *
 * @author gab
 */



public class LeashLengthControl {
    
    
        public int displayLeashLengthInput(){
        
        System.out.println("Please enter a leash lenght for Fido");
        
//        char selection = ' ';
        int userLL = -2; //-2 so that it enters the do while statement
        do{

 	//System.out.println("");
 	String input = this.getLLInput(); // get first charecter of string
//        System.out.println("input = "+input);
        userLL = Integer.parseInt(input);
//        System.out.println("userLL = "+userLL);
        
        if (userLL < 0 || userLL > 15){
            System.out.println("Invalid Leash Length! Try again!");
            }
        } while (userLL < 0 || userLL > 15); // a selection is not "valid"
    return userLL;
    }
    
    public String getLLInput() {
       boolean valid = false;
       String playersInput = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){
            

            System.out.println("\nPlease enter a number between 0 and 15: ");

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
    
}
