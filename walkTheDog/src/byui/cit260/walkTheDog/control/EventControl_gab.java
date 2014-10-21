/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

/**
 *
 * @author gab & Idel 
 * Team Effort: eventOnExplore()
 * 
 * individual: 
 * gab - eventOnNoExplore()
 * 
 * Idel - 
 * 
 */
public class EventControl_gab {
    
    public int eventOnExplore(int leashLength, int idealLeashLength){
        
        if (leashLength < 0 || leashLength > 15){      // test for good leashlenght
            return -1;
        }
        
        if (leashLength <= idealLeashLength){
            return 0;                                 // return 0 for no overlap
        }
        
        return 1;                                    // return 1 for yes overlap
    }
    
    public int eventOnNoExplore(double noExploreCounter, int idealLeashLength, double userDefinedNumber){
        
        double minLeashLenght = 4;
        
        if (noExploreCounter < 0 || noExploreCounter > 10){      // test for good leashlenght
            return -1;
            }
        
        if (idealLeashLength < 4 || idealLeashLength > 15){
            return -1;                                          // test for good idealLeashlenght
            }

        if (userDefinedNumber < 4 || userDefinedNumber > 19){
            return -1;                                          // test for good userDefinedNumber
            }
        
        double fidoLeashOverlap = minLeashLenght + .1 * noExploreCounter * userDefinedNumber;
        
        if(fidoLeashOverlap>=idealLeashLength){
            return 0;
            }
        
        return 1;                                    // return 1 for yes overlap
    }
    
    
    
    
    
    
}
