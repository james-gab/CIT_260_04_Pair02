/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.EventControl;
import java.util.Scanner;

/**
 *
 * @author Idel
 */
 
public class LeashLengthView {
    


  
    
    

   
//USED to satisfy Lesson 06 Individual assignment
//  RUBIC
//      Used the Java switch, and do-while statements  
//      to implemented the view for one end user story 
//      that contains a menu.
//    
//      This impliments the do-while statment 
//      see lines 108-170 for rest of requirement
    public void displayLeashLengthInput(){
        
        char selection = ' ';
        int userLL = -2;
        do{

 	System.out.println("Please enter a leash length between 0 and 15: "); // display the main menu
 	 
 	String input = this.getLLInput(); // get first charecter of string
        selection = input.charAt(0);
 	//this.eventcontrol(selection);
        EventControl userEventOnExplore = new EventControl();
        userEventOnExplore.eventOnExplore(leashLength,idealLeashLength);
        } while (selection != false); // a selection is not "valid"

    }

    
    public String getLLInput() {
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
