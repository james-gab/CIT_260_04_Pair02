/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.ExploringEvents;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab
 */
public class ExploringEventsControl {
    private int noOfRows;
    private int noOfColums;
    public ExploringEvents[][] exploringEvents;

    
    
    
    
    
    


    public ExploringEventsControl() {
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    //+++++++++++++++++++++++++++++++Lesson 08 Individual assignment+++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++          Gabriel James        +++++++++++++++++++++++++++++++++
    
    
       public ExploringEventsControl(int noOfRows, int noOfColums) {
        
        if (noOfRows<1 || noOfColums<1){
            System.out.println("The Location Number must be greater than zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColums = noOfColums;
        
        this.exploringEvents = new ExploringEvents [noOfRows][noOfColums];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColums; column++){
                // create and initilize the location objects instance
                ExploringEvents explore = new ExploringEvents();
                explore.setColumn(column);
                explore.setRow(row);
                explore.setVisited(false);
                
                //assign the Location object to the current position in array
                        exploringEvents[row][column] = explore;
            }
        }
        
        
    }
       
    
        public void displayMap() {
        
            ExploringEvents[][] explore = WalkTheDog.getCurrentGame().getEvent();
            
            System.out.println("     The Park\n");
            System.out.print("          ");
            
            for (int column = 0; column < noOfColums; column++){
                System.out.print("     "+column+"     | ");
                }
            
            for (int row = 0; row < noOfRows; row++){
                System.out.print("\n      "+row);
                    for (int column = 0; column < noOfColums; column++){
                        System.out.print(" | ");
                        ExploringEvents explore = exploringEvents [row][column];
                        if(!explore.equals("")){
                            System.out.print(explore[row][column].getScene().getMapSymbol());
                            }
                        else{
                            System.out.print("   x      ");                           // place map symbol here
                            }
                        }
                    
                    System.out.print(" |");
                    }
            }   // END of public void displayMap()



       
}
