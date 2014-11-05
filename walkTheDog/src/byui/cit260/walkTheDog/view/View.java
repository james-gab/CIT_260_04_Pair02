/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import java.util.Scanner;

/**
 *
 * @author gab
 */
public abstract class View implements ViewInterface {
    
    private String promtMessage;
    
    public View(String promtMessage){
        this.promtMessage = promtMessage;
    }
            
    
    @Override
    public void display(){
        String value;
        
        do{
            System.out.println(this.promtMessage);  //display promt message
            value = this.getInput();        // get the user selection
            this.doAction(value);           // do action based on selection
                
        }while (!value.equals("Q")||!value.equals("q"));
            
    }

    @Override
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrived
        while (!valid){
            
            //promt for players name
            System.out.println("\t\nEnter your selection below: ");
            
            // get the value entered form the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if(selection.length() < 1 ){ //blank value entered
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
                
            }
            break;
        }
        
        return selection;  // return the name
        
    }
    public void doAction(String value){
        
    }
    
   
}
