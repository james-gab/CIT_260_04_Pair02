/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @authors Idel Pagan and gab James
 */
public enum Fido implements Serializable {
    private final int currentScore;                     //the users current game score
    private final char didUserExplore;                  //did the user explore? y/n
    private final int userExploreCounter;               //number of times the user did not explore and passed locations
    private final int fidoMood;                         //the current mood of fido
    private final int leashLength;                      //the current length of the leash
    private final int shortLeashNumberOfTurns;          //number of turns the leash is below 4
    private final int playerSatisfaction;               //the saatisfaction of the player
 
    
    Fido(
                int currentScore,                     //the users current game score
                char didUserExplore,                  //did the user explore? y/n
                int userExploreCounter,               //number of times the user did not explore and passed locations
                int fidoMood,                         //the current mood of fido
                int leashLength,                      //the current length of the leash
                int shortLeashNumberOfTurns,          //number of turns the leash is below 4
                int playerSatisfaction               //the saatisfaction of the player 
        ) {
    this.currentScore = currentScore;
    this.didUserExplore = didUserExplore;
    this.userExploreCounter = userExploreCounter;
    this.fidoMood = fidoMood;
    this.leashLength = leashLength;
    this.shortLeashNumberOfTurns = shortLeashNumberOfTurns;
    this.playerSatisfaction = playerSatisfaction;
    }

    public int getCurrentScore() {
        return currentScore;
    }

//    public void setCurrentScore(int currentScore) {
//        this.currentScore = currentScore;
//    }

    public char getDidUserExplore() {
        return didUserExplore;
    }

//    public void setDidUserExplore(char didUserExplore) {
//        this.didUserExplore = didUserExplore;
//    }

    public int getUserExploreCounter() {
        return userExploreCounter;
    }

//    public void setUserExploreCounter(int userExploreCounter) {
//        this.userExploreCounter = userExploreCounter;
//    }

    public int getFidoMood() {
        return fidoMood;
    }

//    public void setFidoMood(int fidoMood) {
//        this.fidoMood = fidoMood;
//    }

    public int getLeashLength() {
        return leashLength;
    }

//    public void setLeashLength(int leashLength) {
//        this.leashLength = leashLength;
//    }

    public int getShortLeashNumberOfTurns() {
        return shortLeashNumberOfTurns;
    }

//    public void setShortLeashNumberOfTurns(int shortLeashNumberOfTurns) {
//        this.shortLeashNumberOfTurns = shortLeashNumberOfTurns;
//    }

    public int getPlayerSatisfaction() {
        return playerSatisfaction;
    }

//    public void setPlayerSatisfaction(int playerSatisfaction) {
//        this.playerSatisfaction = playerSatisfaction;
//    }

    @Override
    public String toString() {
        return "Fido{" + "currentScore=" + currentScore + ", didUserExplore=" + didUserExplore + ", userExploreCounter=" + userExploreCounter + ", fidoMood=" + fidoMood + ", leashLength=" + leashLength + ", shortLeashNumberOfTurns=" + shortLeashNumberOfTurns + ", playerSatisfaction=" + playerSatisfaction + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.currentScore;
        hash = 23 * hash + this.didUserExplore;
        hash = 23 * hash + this.userExploreCounter;
        hash = 23 * hash + this.fidoMood;
        hash = 23 * hash + this.leashLength;
        hash = 23 * hash + this.shortLeashNumberOfTurns;
        hash = 23 * hash + this.playerSatisfaction;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fido other = (Fido) obj;
        if (this.currentScore != other.currentScore) {
            return false;
        }
        if (this.didUserExplore != other.didUserExplore) {
            return false;
        }
        if (this.userExploreCounter != other.userExploreCounter) {
            return false;
        }
        if (this.fidoMood != other.fidoMood) {
            return false;
        }
        if (this.leashLength != other.leashLength) {
            return false;
        }
        if (this.shortLeashNumberOfTurns != other.shortLeashNumberOfTurns) {
            return false;
        }
        if (this.playerSatisfaction != other.playerSatisfaction) {
            return false;
        }
        return true;
    }
    
}
