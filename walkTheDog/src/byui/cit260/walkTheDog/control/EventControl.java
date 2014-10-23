/*
 * Project author: Ideal Pagen and gab James.
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
 * Idel - generateFidoMood()
 * 
 */
public class EventControl {
    
    public int eventOnExplore(int leashLength, int idealLeashLength){
        
        if (leashLength < 0 || leashLength > 15){      // test for good leashlenght
            return -1;
            }
        
        if (idealLeashLength < 4 || idealLeashLength > 15){      // test for good idealLeashLength
            return -1;
            }
        
        
        if(leashLength>=idealLeashLength){
            return 1;                                 // return 1 for yes overlap
            }
        
        return 0;                                    // return 0 for no overlap
 
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
        
        if (noExploreCounter == 0){                             // test noExploreCounter not zero if zero add 1
            noExploreCounter = 1;
        }
        
        double fidoLeashOverlap = minLeashLenght + .1 * noExploreCounter * userDefinedNumber;
        
        if(fidoLeashOverlap<idealLeashLength){      // test for overlap
            return 0;
            }
        
        return 1;                                    // return 1 for yes overlap

        }
    
    public int generateFidoMood(int numberOfTurns, int leashLength, int mood){
        
        if (leashLength < 0 || leashLength > 15){
            return -1; // testing for valid leash length
            }
    
        if (mood < 1 || mood > 9){   // checks if mood is valid
            return -1;
            }
    
        if (numberOfTurns < 0){
            return -1;
            }
    
        if (leashLength <= 4 && numberOfTurns > 1){ //testing leash length is less than four and more than one turn
            if (mood <= 2){ 
                mood = 0;
               return mood;
                } 
           
            return mood -= 2; // fido is mad                 less freedom for fido (he gets mad)  
        }                                        
    
        if (mood < 9){   
            return mood+= 1;
            }
       
        
        return mood; //fido is happy
    
        }
 
    
    
    
    
}
