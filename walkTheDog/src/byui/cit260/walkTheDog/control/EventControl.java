/*
 * Project author: Ideal Pagen and gab James.
 * 
 */
package byui.cit260.walkTheDog.control;
import java.util.Random;
/**
 *
 * @author gab & Idel 
 * 
 * Team Effort: eventOnExplore()
 * 
 * individual: 
 * gab - eventOnNoExplore()
 * gab - generateIdealLeashLength()
 * gab - randomNumberGenerator()
 * 
 * Idel - generateFidoMood()
 * 
 */
public class EventControl {
    
    
    // Generate event on an explore
    public int eventOnExplore(int leashLength, int idealLeashLength){
        
        if (leashLength < 0 || leashLength > 15){      // test for good leashlenght
            return -1;
            }
        
        if (idealLeashLength < 4 || idealLeashLength > 15){      // test for good idealLeashLength
            return -1;
            }
        
        double upperBase = 10;          //define an upperBase integer
	double lowerBase = 0.1 ;          //define an lowerBase integer	
	double idealLeashLengthD = idealLeashLength;      //change int to double
        
        idealLeashLengthD = leashLength * lowerBase * idealLeashLengthD / leashLength * upperBase;	
        
        if(leashLength>=idealLeashLengthD){
            return 1;                                 // return 1 for yes overlap
            }
        
        return 0;                                    // return 0 for no overlap
 
    }
    
    // Generate event on No Explore
    public int eventOnNoExplore(double noExploreCounter, int idealLeashLength, int userDefinedNumber){
        
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
        
        double userDefinedNumberD = userDefinedNumber;          // cast int to double
        
        double fidoLeashOverlap = minLeashLenght + .1 * noExploreCounter * userDefinedNumberD;
        
        if(fidoLeashOverlap<idealLeashLength){      // test for overlap
            return 0;
            }
        
        return 1;                                    // return 1 for yes overlap

        }
    
    // Determin Fido Mood
    public int generateFidoMood(int numberOfTurns, int leashLength, int mood){
        
        if (leashLength < 0 || leashLength > 15){
            return -1; // testing for valid leash length
            }
    
        if (mood < 0 || mood > 9){   // checks if mood is valid
            return -1;
            }
    
        if (numberOfTurns < 0){
            return -1;
            }
       	double low = 0.0;
        double high = 1.0;
        double numberOfTurnTotal;
        
        numberOfTurnTotal = ((((double)mood / (double)leashLength)) * low) + high;
        
        numberOfTurns = (int) (numberOfTurns * numberOfTurnTotal);
        
        if (leashLength <= 4 && numberOfTurns == 0){
            return mood;
        }
        
        if (leashLength <= 4 && numberOfTurns > 0){ //testing leash length is less than four and more than one turn
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
 
    //create Ideal LeashLenght for actor
    public int generateIdealLeashLength(int randomNumber){     //create Ideal LeashLenght for actor
        
        if (randomNumber < 0 || randomNumber > 15){
            return -1;
        }
        
        double newNumber = 0.0;
        double minimumLength = 4.0;
        double randomNumberD = (double) randomNumber;
        
        if (randomNumberD < minimumLength){
            return (int) randomNumberD + (int) minimumLength + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        }
        
        return (int) randomNumberD + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        
    }
    
    //create Ideal LeashLenght for actor
    public int userLeashLength(int randomNumber){     //create userLeashLenght for actor
        
        if (randomNumber < 0 || randomNumber > 15){
            return -1;
        }
        
        double newNumber = 0.0;
        double minimumLength = 4.0;
        double randomNumberD = (double) randomNumber;
        
        if (randomNumberD < minimumLength){
            return (int) randomNumberD + (int) minimumLength + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        }
        
        return (int) randomNumberD + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        
    }
    //Generate a random number
    public int randomNumberGenerator16_0to15 (){
        Random rand = new Random();  
//        int randomMultiplyer = rand.nextInt(16);
//        return randomMultiplyer;
        return (int) rand.nextInt(16);
    }
    
}
