/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author Idel
 */
public class StatisticsMenuView {
    
    private final String MENU = "\n"
            + "\n________________________________"
            + "\nStatistics Menu"
            + "\n________________________________"
            + "\n  L - Life Points" 
            + "\n  M - Fido's Mood"
            + "\n  B - Go Back "  
            + "\n________________________________";
    
    public void displayStatisticsMenu(){
        
        char selection = ' ';
        do{

 	System.out.println(MENU); // display the main menu
 	 
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doAction(selection);

        } while (selection != 'B' || selection != 'b'); // a selection is not "Exit"

    }

    
    public String getInput() {
       boolean valid = false;
       String playersInput = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){
            

            System.out.println("Enter a choice:");

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


    public void doAction(char choice) {
        
        switch (choice){
            
            case 'L': // User chooses to Explore
                this.lifePoint();
                break;
            case 'l': // User chooses to Explore
                this.lifePoint();
                break;
            case 'M': // User Estimates Leash Length needed
                this.generateFidoMood();
                break;
            case 'm': // User Estimates Leash Length needed
                this.generateFidoMood();
                break;
            case 'B': // display the Help Menu
                this.back();
                break;
            case 'b': // display the Help Menu
                this.back();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
         
    private void lifePoint(){     //display the player's Life Points
        System.out.println("*** lifePoint function called ***");
        
    }
    
    private void generateFidoMood(){     //Fido's mood function called
        System.out.println("*** generateFidoMood function called ***");
    }
    
    private void back(){
        System.out.println("*** back function called ***");
    }
    
}
