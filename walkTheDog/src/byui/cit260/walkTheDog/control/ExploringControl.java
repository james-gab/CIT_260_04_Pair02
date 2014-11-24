/*
 * Project author: Ideal Pagen and gab James.
 * 
 */
package byui.cit260.walkTheDog.control;
import byui.cit260.walkTheDog.exceptions.ExploringControlException;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.GameMenuView;
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
public class ExploringControl {
    
    
    // Generate event on an explore
    public int eventOnExplore(int leashLength, int idealLeashLength) throws ExploringControlException{
        
        if (leashLength < 0 || leashLength > 15){      // test for good leashlenght
            throw new ExploringControlException("Can not set Leash Lenght to " + leashLength
                    + " becasue the length is outside of the bounds of the leash.");
            }
        
        if (idealLeashLength < 4 || idealLeashLength > 15){      // test for good idealLeashLength
            throw new ExploringControlException("Can not set Ideal Leash Lenght to " + idealLeashLength
                    + " becasue the length is outside of the bounds of the leash.");
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
    public int eventOnNoExplore(int noExploreCounter, int idealLeashLength, int randomNumber){
        
        double noExploreCounterD = (double)noExploreCounter;
        double minLeashLenght = 4;
        
        if (noExploreCounter < 0 || noExploreCounter > 10){      // test for good leashlenght
            return -1;
            }
        
        if (idealLeashLength < 4 || idealLeashLength > 15){
            return -1;                                          // test for good idealLeashlenght
            }

        if (randomNumber < 4 || randomNumber > 19){
            return -1;                                          // test for good userDefinedNumber
            }
        
        if (noExploreCounter == 0){                             // test noExploreCounter not zero if zero add 1
            noExploreCounterD = 1.0;
        }
        
        double randomNumberD = randomNumber;          // cast int to double
        
        double fidoLeashOverlap = minLeashLenght + .1 * noExploreCounterD * randomNumberD;
        
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
        
        if (randomNumber == 0){
            randomNumber = 1;
        }
        
        double newNumber = 0.0;
        double minimumLength = 4.0;
        double randomNumberD = (double) randomNumber;
        
        if (randomNumberD < minimumLength){
            return (int) randomNumberD + (int) minimumLength;// + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        }
        
        return (int) randomNumberD; // + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        
    }
    
    //create Ideal LeashLenght for actor
    public int idealLeashLength(int randomNumber){     //create userLeashLenght for actor
        
        if (randomNumber < 0 || randomNumber > 15){
            return -1;
        }
        
        if (randomNumber == 0){
            randomNumber = 1;
        }
        double newNumber = 0.0;
        double minimumLength = 4.0;
        double randomNumberD = (double) randomNumber;
        
        if (randomNumberD < minimumLength){
            return (int) randomNumberD + (int) minimumLength; // + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        }
        
        return (int) randomNumberD; // + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        
    }
    
    
    
    //Generate a random number
    public int randomNumberGenerator16_0to15 (){
        Random rand = new Random();  
        return (int) rand.nextInt(16);
    }
    

    //Generate a random number
    public int randomNumberGenerator (int num){
        Random rand = new Random();  
        return (int) rand.nextInt(num);
    }
    
    
    
    
    public int shortLeash(Player player){
        
                if (player.playerLeashLenght<4){
        int getFidoMood = this.generateFidoMood(player.gameNumberOfTurns, player.playerLeashLenght, player.gameFidoMood);             // passes a random generated number to a variable
            if (getFidoMood == 0){
                System.out.println("Fido does not like a short leash"
                        + "\nand has been a bad dog, you loose 3 points");
                player.playerCurrentScore -=3;
                player.gameNumberOfTurns =0;
                return 0;
            }
            else if (getFidoMood < player.gameFidoMood){
                System.out.println("Fido does not like a short leash"
                        + "\nand is starting to get unhappy");
                player.gameFidoMood = getFidoMood;
                player.gameNumberOfTurns +=1;
            }
            else if (getFidoMood == player.gameFidoMood){
                System.out.println(" Fido fido does not like a short leash "
                        + "\nlucily Fido is not that mad yet."
                        + "\nConsider keeping the leash longer than 3.");
                player.gameNumberOfTurns +=1;
            }
            else {
                System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                        + "\nin       visitSceanL() if(playerLeashLength<4)");
// develop code that restarts the game from this spot
            }
        }
        return 1;
    }
    
    public int didUserExplore(Player player) throws ExploringControlException{
        
                if (player.gameDidUserExplore=='n'){
            int eONE = this.eventOnNoExplore(player.gameUserExploreCounter, player.gameIdealLeashLength, this.randomNumberGenerator16_0to15());
            if (eONE < 0){
            System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java in ***"
                    + "\n   visitSceanL() if(gameUserExplore<0)***");
// develop code that restarts the game from this spot                
            }
            else if (eONE > 0)  {
                player.gameDidUserExplore = 'r';                                       // change char gameDidUserExplore to random event posible
                player.gameUserExploreCounter = 0;                                     // Set gameUserExploreCounter to ZERO after ramdom event is generated 
            System.out.println("/nA random event occured when you did not Explore the area./n");
                player.playerLeashLenght = this.idealLeashLength(this.randomNumberGenerator16_0to15()); // passes a random generated playerLeashLenght to a variable
                GameMenuView checkExplore = new GameMenuView(player);
                checkExplore.userExplore();                                             // sends player to explore
            }
        }
        return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


    