/*
 * Project author: Ideal Pagen and gab    James.
 * 
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.exceptions.ExploringControlException;
import byui.cit260.walkTheDog.model.EventsType;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.GameMenuView;
import java.io.PrintWriter;
import java.util.Random;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab & Idel
 *
 * Team Effort: eventOnExplore()
 *
 * individual: gab - eventOnNoExplore() gab - generateIdealLeashLength() gab -
 * randomNumberGenerator()
 *
 * Idel - generateFidoMood()
 *
 */
public class ExploringControl {

    protected final PrintWriter console = WalkTheDog.getOutFile();

    // Generate event on an explore
    public int eventOnExplore(int leashLength, int idealLeashLength) throws ExploringControlException {

        if (leashLength < 0 || leashLength > 15) {      // test for good leashlenght
            throw new ExploringControlException("Can not set Leash Lenght to " + leashLength
                    + " becasue the length is outside of the bounds of the leash.");
        }

        if (idealLeashLength < 4 || idealLeashLength > 15) {      // test for good idealLeashLength
            throw new ExploringControlException("Can not set Ideal Leash Lenght to " + idealLeashLength
                    + " becasue the length is outside of the bounds of the leash.");
        }

        double upperBase = 10;          //define an upperBase integer
        double lowerBase = 0.1;          //define an lowerBase integer	
        double idealLeashLengthD = idealLeashLength;      //change int to double

        idealLeashLengthD = leashLength * lowerBase * idealLeashLengthD / leashLength * upperBase;

        if (leashLength >= idealLeashLengthD) {
            return 1;                                 // return 1 for yes overlap
        }

        return 0;                                    // return 0 for no overlap

    }

    // Generate event on No Explore
    public int eventOnNoExplore(int noExploreCounter, int idealLeashLength, int randomNumber) throws ExploringControlException {

        double noExploreCounterD = (double) noExploreCounter;
        double minLeashLenght = 4;

        if (noExploreCounter < 0 || noExploreCounter > 10) {      // test for good leashlenght
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int eventOnNoExplore(int noExploreCounter, int idealLeashLength, int randomNumber)"
                    + "\n if (noExploreCounter < 0 || noExploreCounter > 10)");
        }

        if (idealLeashLength < 4 || idealLeashLength > 15) {
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int eventOnNoExplore(int noExploreCounter, int idealLeashLength, int randomNumber)"
                    + "\n if (idealLeashLength < 4 || idealLeashLength > 15)");
        }

        if (randomNumber < 4 || randomNumber > 19) {
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int eventOnNoExplore(int noExploreCounter, int idealLeashLength, int randomNumber)"
                    + "\n if (randomNumber < 4 || randomNumber > 19)");
        }

        if (noExploreCounter == 0) {                             // test noExploreCounter not zero if zero add 1
            noExploreCounterD = 1.0;
        }

        double randomNumberD = randomNumber;          // cast int to double

        double fidoLeashOverlap = minLeashLenght + .1 * noExploreCounterD * randomNumberD;

        if (fidoLeashOverlap < idealLeashLength) {      // test for overlap
            return 0;
        }

        return 1;                                    // return 1 for yes overlap

    }

    // Determin Fido Mood
    public int generateFidoMood(int numberOfTurns, int leashLength, int mood) throws ExploringControlException {

        if (leashLength < 0 || leashLength > 15) {
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int generateFidoMood(int numberOfTurns, int leashLength, int mood)"
                    + "\n if (leashLength < 0 || leashLength > 15)");
        }

        if (mood < 0 || mood > 9) {   // checks if mood is valid
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int generateFidoMood(int numberOfTurns, int leashLength, int mood)"
                    + "\n if (mood < 0 || mood > 9)");
        }

        if (numberOfTurns < 0) {
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int generateFidoMood(int numberOfTurns, int leashLength, int mood)"
                    + "\n if (numberOfTurns < 0)");
        }
        double low = 0.0;
        double high = 1.0;
        double numberOfTurnTotal;

        numberOfTurnTotal = ((((double) mood / (double) leashLength)) * low) + high;

        numberOfTurns = (int) (numberOfTurns * numberOfTurnTotal);

        if (leashLength <= 4 && numberOfTurns == 0) {
            return mood;
        }

        if (leashLength <= 4 && numberOfTurns > 0) { //testing leash length is less than four and more than one turn
            if (mood <= 2) {
                mood = 0;
                return mood;
            }

            return mood -= 2; // fido is mad                 less freedom for fido (he gets mad)  
        }

        if (mood < 9) {
            return mood += 1;
        }

        return mood; //fido is happy

    }

    //create Ideal LeashLenght for actor
    public int generateIdealLeashLength(int randomNumber) throws ExploringControlException {     //create Ideal LeashLenght for actor

        if (randomNumber < 0 || randomNumber > 15) {
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       public int generateIdealLeashLength(int randomNumber)"
                    + "\n if (leashLength < 0 || leashLength > 15)");
        }

        if (randomNumber == 0) {
            randomNumber = 1;
        }

        double newNumber = 0.0;
        double minimumLength = 4.0;
        double randomNumberD = (double) randomNumber;

        if (randomNumberD < minimumLength) {
            return (int) randomNumberD + (int) minimumLength;// + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        }

        return (int) randomNumberD; // + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;

    }

    //create Ideal LeashLenght for actor
    public int idealLeashLength(int randomNumber) throws ExploringControlException {     //create userLeashLenght for actor

        if (randomNumber < 0 || randomNumber > 15) {
            throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java ***"
                    + "\nin       visitSceanL() if (randomNumber < 0 || randomNumber > 15)");
        }

        if (randomNumber == 0) {
            randomNumber = 1;
        }
        double newNumber = 0.0;
        double minimumLength = 4.0;
        double randomNumberD = (double) randomNumber;

        if (randomNumberD < minimumLength) {
            return (int) randomNumberD + (int) minimumLength; // + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;
        }

        return (int) randomNumberD; // + (int) newNumber * (int) randomNumberD / (int) randomNumberD * (int) randomNumberD * (int) randomNumberD;

    }

    //Generate a random number
    public int randomNumberGenerator16_0to15() {
        Random rand = new Random();
        return (int) rand.nextInt(16);
    }

    //Generate a random number
    public int randomNumberGenerator(int num) {
        Random rand = new Random();
        return (int) rand.nextInt(num);
    }

    //Generate a random number
    public int randomIdealLeashGenerator() {
        Random rand = new Random();
        return (int) 4 + rand.nextInt(12);
    }

    public int shortLeash(Player player) throws ExploringControlException {

        if (player.playerLeashLenght < 4) {
            int getFidoMood = this.generateFidoMood(player.gameNumberOfTurns, player.playerLeashLenght, player.gameFidoMood);             // passes a random generated number to a variable
            if (getFidoMood == 0) {
                this.console.println("Fido does not like a short leash"
                        + "\nand has been a bad dog, you loose 3 points");
                player.playerCurrentScore -= 3;
                player.gameNumberOfTurns = 0;
                return 0;
            } else if (getFidoMood < player.gameFidoMood) {
                this.console.println("Fido does not like a short leash"
                        + "\nand is starting to get unhappy");
                player.gameFidoMood = getFidoMood;
                player.gameNumberOfTurns += 1;
            } else if (getFidoMood == player.gameFidoMood) {
                this.console.println(" Fido fido does not like a short leash "
                        + "\nlucily Fido is not that mad yet."
                        + "\nConsider keeping the leash longer than 3.");
                player.gameNumberOfTurns += 1;
            } else {
                throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                        + "\n*** ERROR in GameMenuView.java ***"
                        + "\nin       visitSceanL() if(playerLeashLength<4)");
// develop code that restarts the game from this spot
            }
        }
        return 1;
    }

    public int didUserExplore(Player player) throws ExploringControlException {

        if (player.gameDidUserExplore == 'n') {
            int eONE = this.eventOnNoExplore(player.gameUserExploreCounter, player.gameIdealLeashLength, this.randomIdealLeashGenerator());
            if (eONE < 0) {
                throw new ExploringControlException("*** Our appologies, something went wrong. ***"
                        + "\n*** ERROR in GameMenuView.java in ***"
                        + "\n   visitSceanL() if(gameUserExplore<0)***");
// develop code that restarts the game from this spot                
            } else if (eONE > 0) {
                player.gameDidUserExplore = 'r';                                       // change char gameDidUserExplore to random event posible
                player.gameUserExploreCounter = 0;                                     // Set gameUserExploreCounter to ZERO after ramdom event is generated 
                this.console.println("/nA random event occured when you did not Explore the area./n");
                player.playerLeashLenght = this.idealLeashLength(this.randomNumberGenerator16_0to15()); // passes a random generated playerLeashLenght to a variable
                GameMenuView checkExplore = new GameMenuView(player);
                checkExplore.userExplore();                                             // sends player to explore
            }
        }
        return 0;
    }

    public void userExploreControl(Player player) throws ExploringControlException {
//        this.console.println("*** GameMenuView.java     public void userExplore() function called ***");

//        player.playerLeashLenght = 15;                                          // for testing only
//        int eOE = 1;                                                            // for testing only
//        player.gameDidUserExplore='r';                                          // for testing only
        LeashLengthControl leash = new LeashLengthControl();
//        int ll = leash.displayLeashLengthInput();
//        player.setPlayerLeashLenght(ll);

        ExploringControl explore = new ExploringControl();                         // calls random number generator
        EventsType[][] eventTypes = WalkTheDog.getCurrentGame().getEvents().getEventTypes();
        Player variable = new Player();

        variable.setGameIdealLeashLength(explore.idealLeashLength(explore.randomIdealLeashGenerator())); // passes a random generated idealLeashLength to a variable

        //       player.setPlayerLeashLenght(leash.displayLeashLengthInput());
        if (explore.shortLeash(player) > 0 && player.gameDidUserExplore == 'n') {  

            player.setPlayerLeashLenght(leash.displayLeashLengthInput());
            
            
// check if user had leash too short for too long and Fido was bad - no points for bad fido
            if (explore.eventOnExplore(variable.getPlayerLeashLenght(), variable.getGameIdealLeashLength()) > 0 && variable.getGameDidUserExplore() == 'r') { 
                
                this.badFido (variable,eventTypes,explore);
/*
                variable.setGameDidUserExplore('y');
                this.console.println("*** Fido found something in this area");
                this.console.println("*** " + eventTypes[explore.randomNumberGenerator(8)][1].getEventScene().getEventsSymbol());
                variable.playerCurrentScore -= 1;

                if (variable.getGameFidoMood() < 9 && variable.getGameFidoMood() > 1) {
                    variable.gameFidoMood -= 1;
                }
                this.console.println("Fido Leash Length: " + variable.getPlayerLeashLenght()
                        + "\nClosest object: " + variable.getGameIdealLeashLength()
                        + "\n*** Players Current Score decreases by 1 to " + variable.getPlayerCurrentScore()
                        + "\nFido's Mood is now: " + variable.getGameFidoMood());
                
*/                
            } else if (explore.eventOnExplore(player.playerLeashLenght, player.gameIdealLeashLength) > 0) {
                player.gameDidUserExplore = 'y';
                this.console.println("*** Fido found a friend in this area");
                this.console.println("*** " + eventTypes[explore.randomNumberGenerator(8)][0].getEventScene().getEventsSymbol());
                player.playerCurrentScore += 1;
                if (player.gameFidoMood < 9) {
                    player.gameFidoMood += 1;
                }
                this.console.println("Fido Leash Length: " + player.playerLeashLenght
                        + "\nClosest object: " + player.gameIdealLeashLength
                        + "\n*** Players Current Score increases by 1 to " + player.playerCurrentScore
                        + "\nFido's Mood is now: " + player.gameFidoMood);
            } else {
//            else if (explore.eventOnExplore(player.playerLeashLenght, player.gameIdealLeashLength) == 0){
                player.playerCurrentScore += 1;
                player.gameDidUserExplore = 'y';
                if (player.gameFidoMood < 9) {
                    player.gameFidoMood += 1;
                }
                this.console.println("Fido Leash Length: " + player.playerLeashLenght
                        + "\nClosest object: " + player.gameIdealLeashLength
                        + "\n*** Players Current Score increases by 1 to " + player.playerCurrentScore
                        + "\nFido's Mood is now: " + player.gameFidoMood
                        + "\n*** Fido was not interested in "
                        + "anything in the area it could reach ");
            }
//            else {
//                player.gameDidUserExplore='y';
//                this.console.println("*** Our appologies, something went wrong. ***"
//                    + "\n*** ERROR in GameMenuView.java in ***"
//                    + "\n   userExplore() if(eOE>0)***");
// develop code that restarts the game from this spot
//                }
        } // END          if (badDog > 0){
        else {
            this.console.println("You have already explored this Area.\nPlease try another Area.");
        }

    }
    
    
    
    public void badFido (Player variable,EventsType[][] eventTypes,ExploringControl explore){ // check if user had leash too short for too long and Fido was bad - no points for bad fido

                variable.setGameDidUserExplore('y');
                this.console.println("*** Fido found something in this area");
                this.console.println("*** " + eventTypes[explore.randomNumberGenerator(8)][1].getEventScene().getEventsSymbol());
                variable.playerCurrentScore -= 1;

                if (variable.getGameFidoMood() < 9 && variable.getGameFidoMood() > 1) {
                    variable.gameFidoMood -= 1;
                }
                this.console.println("Fido Leash Length: " + variable.getPlayerLeashLenght()
                        + "\nClosest object: " + variable.getGameIdealLeashLength()
                        + "\n*** Players Current Score decreases by 1 to " + variable.getPlayerCurrentScore()
                        + "\nFido's Mood is now: " + variable.getGameFidoMood());
            }

}
