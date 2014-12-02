/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.interfaces.ViewInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import walkthedog.WalkTheDog;
import java.io.BufferedReader;

/**
 *
 * @author gab
 */
public abstract class View implements ViewInterface {
    
    private final String promtMessage;
    protected final BufferedReader keyboard = WalkTheDog.getInFile();
    protected final PrintWriter console = WalkTheDog.getOutFile();
    
    public View(String promtMessage){
        this.promtMessage = promtMessage;
    }
            
    
    @Override
    public void display(String hMR){
        String value;
        char selection = ' ';
        
        do{

            System.out.println(this.promtMessage);  //display promt message
            value = this.getInput();        // get the user selection
            value = value.trim();
            value = value.toUpperCase();
            selection = value.charAt(0);
            this.doAction(selection);
                
        }while (!value.equals("Q"));
            
        
    }

    @Override
    public String getInput(){
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrived
        while (!valid){
            
            //promt for players name
            System.out.println("\t\nEnter your selection below: ");
            
            try {
                // get the value entered from the keyboard
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                System.out.println(ex);
            }
            //selection = keyboard.nextLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
            
            if(selection.length() < 1 ){ //blank value entered
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
                
            }
            break;
        }
        
        return selection;  // return the name
        
    }
    
    @Override
    public void doAction(char selection){
        
    }
    
   
}
