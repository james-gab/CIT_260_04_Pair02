/*
 * Project author: gab James.
 */
package byui.cit260.walkTheDog.control;

import static byui.cit260.walkTheDog.control.MapControl.columCount;
import static byui.cit260.walkTheDog.control.MapControl.rowCount;
import byui.cit260.walkTheDog.exceptions.PrintControlException;
import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.view.ErrorView;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import java.io.PrintWriter;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab
 */
public class PrintControl {
    
    protected final BufferedReader keyboard = WalkTheDog.getInFile();
    protected final PrintWriter console = WalkTheDog.getOutFile();
    
    
    public void printMap() throws PrintControlException {

                Location[][] locations = WalkTheDog.getCurrentGame().getMap().getLocations();
                
                this.console.println("\nPlease enter the file path where the file will be saved.");
                
                String filePath = this.getInput();
                
                try(FileOutputStream filePathOut = new FileOutputStream(filePath)){
                    ObjectOutputStream output = new ObjectOutputStream(filePathOut);
                    output.writeObject(locations);
                }catch(IOException ex) {
                        ErrorView.display(this.getClass().getName(),ex.getMessage());
                    }
                
                this.console.println("     The Park\n");
                this.console.print("          ");
            
                for (int column = 0; column < columCount; column++){
                    this.console.print("     "+column+"     | ");
                    }
            
                for (int row = 0; row < rowCount; row++){
                    this.console.print("\n      "+row);
                        for (int column = 0; column < columCount; column++){
                            this.console.print(" | ");
                            Location location = locations [row][column];
                            if(!location.equals("")){
                                this.console.print(locations[row][column].getScene().getMapSymbol());
                                }
                            else{
                                this.console.print("   x      ");                           // place map symbol here
                                }
                            }
                        this.console.print(" |");
                        }
    }
            
    public String getInput(){
       //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
         try {
        //while a valid name has not been retrived
        while (!valid){
            
            //promt for players name
            this.console.println("\t\nEnter your selection below: ");
            
            selection = this.keyboard.readLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
            
            if(selection.length() < 1 ){                                        //check for blank value entered returns error message
                ErrorView.display(this.getClass().getName(),"\n*** Invalid Selection *** Try again");
                continue;
                }
                break;
            }
        } catch (Exception e) {  
                   ErrorView.display(this.getClass().getName(),"Error reading inputL " + e.getMessage()); 
                 }
        return selection;                                                       // return the name
        
    }            

    
}
