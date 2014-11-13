/*
 * Project author: gab James.
 */
package byui.cit260.walkTheDog.view;

import java.util.Scanner;

/*
 * @author gab
 */
public abstract class ViewL implements ViewLocationInterface {
    
    private final String promtMessage;
    
    public ViewL(String promtMessage){
        this.promtMessage = promtMessage;
    }
            
    
    @Override
    public void display(String hMR){
        String value;
        char selection = ' ';
        
        do{
            System.out.println(this.promtMessage);                              //display promt message
            value = this.getInput();                                            // get the user selection
            value = value.toUpperCase();
            selection = value.charAt(0);                                        // converts getInput to char
            
            this.doAction(selection);
                
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
            
            // get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
            
            if(selection.length() < 1 ){                                        //check for blank value entered returns error message
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
                
            }
            break;
        }
        
        return selection;                                                       // return the name
        
    }
    
    @Override
    public void doAction(char selection){
        
    }

//    @Override
//    public void doAction(String value){
//        
//    }
    
   
}