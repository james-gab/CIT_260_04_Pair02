/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.ExploringControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel
 */
 
public class LeashLengthView {
    
    protected final BufferedReader keyboard = WalkTheDog.getInFile();
    protected final PrintWriter console = WalkTheDog.getOutFile();
    

    public LeashLengthView() {
    }
    
    
   
//USED to satisfy Lesson 06 Individual assignment
//  RUBIC
//      Used the Java switch, and do-while statements  
//      to implemented the view for one end user story 
//      that contains a menu.
//    
//      This impliments the do-while statment 
//      see lines 108-170 for rest of requirement
    public int displayLeashLengthInput(){
        
        this.console.println("Please enter a leash lenght for Fido"
                + "\nbefore moving forward.");
        
        char selection = ' ';
        int userLL = -2; //-2 so that it enters the do while statement
        do{

 	//this.console.println("");
 	String input = this.getLLInput(); // get first charecter of string
        selection = input.charAt(0);
        userLL = (int) selection;
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
            

            this.console.println("\nPlease enter a leash length between 0 and 15: ");

//            playersInput = keyboard.nextLine();
            playersInput = this.keyboard.readLine();
            playersInput = playersInput.trim();


            if (playersInput.length() < 1){    
                ErrorView.display(this.getClass().getName(),"Invalid entry - space is not an option");
                continue;
            }
            break;
        }
        } catch (Exception e) {  
                   ErrorView.display(this.getClass().getName(),"Error reading inputL " + e.getMessage()); 
                 }
        return playersInput;
    }
}