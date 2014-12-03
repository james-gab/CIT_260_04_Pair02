/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import byui.cit260.walkTheDog.control.EventsControl;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class Game implements Serializable {
 
    private String[] fixedLocation;               //this is the description of the location
    private Player player;                        //this is the player
    public Map map;                              //this is the map
    private Fido fido;                            //this is fido
    private int idealLeashLength;                 //this is the distance from player to actor
    private int currentScore;                     //the users current game score
    private char didUserExplore;                  //did the user explore? y/n
    private int userExploreCounter;               //number of times the user did not explore and passed locations                      
    private int shortLeashNumberOfTurns;          //number of turns the leash is below 4
    public Events event;

    
    public Game() {
    }

    
    
    public String[] getFixedLocation() {
        return fixedLocation;
    }

    public void setFixedLocation(String[] fixedLocation) {
        this.fixedLocation = fixedLocation;
    }
    
    public Events getEvents() {
        return event;
    }

    public Map getMap() {
//        this.console.println("\nGame.java   Map getMap()"
//                + "\n function called to create the MAP array\n"
//                + "\n" + map + "\n");
        return map;
    }

    public Fido getFido() {
        return fido;
    }
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getIdealLeashLength() {
        return idealLeashLength;
    }

    public void setIdealLeashLength(int idealLeashLength) {
        this.idealLeashLength = idealLeashLength;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public char getDidUserExplore() {
        return didUserExplore;
    }

    public void setDidUserExplore(char didUserExplore) {
        this.didUserExplore = didUserExplore;
    }

    public int getUserExploreCounter() {
        return userExploreCounter;
    }

    public void setUserExploreCounter(int userExploreCounter) {
        this.userExploreCounter = userExploreCounter;
    }

    public int getShortLeashNumberOfTurns() {
        return shortLeashNumberOfTurns;
    }

    public void setShortLeashNumberOfTurns(int shortLeashNumberOfTurns) {
        this.shortLeashNumberOfTurns = shortLeashNumberOfTurns;
    }

    @Override
    public String toString() {
        return "Game{" + "fixedLocation=" + fixedLocation + ", player=" + player + ", map=" + map + ", fido=" + fido + ", idealLeashLength=" + idealLeashLength + ", currentScore=" + currentScore + ", didUserExplore=" + didUserExplore + ", userExploreCounter=" + userExploreCounter + ", shortLeashNumberOfTurns=" + shortLeashNumberOfTurns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Arrays.deepHashCode(this.fixedLocation);
        hash = 23 * hash + Objects.hashCode(this.player);
        hash = 23 * hash + Objects.hashCode(this.map);
        hash = 23 * hash + Objects.hashCode(this.fido);
        hash = 23 * hash + this.idealLeashLength;
        hash = 23 * hash + this.currentScore;
        hash = 23 * hash + this.didUserExplore;
        hash = 23 * hash + this.userExploreCounter;
        hash = 23 * hash + this.shortLeashNumberOfTurns;
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
        final Game other = (Game) obj;
        if (!Arrays.deepEquals(this.fixedLocation, other.fixedLocation)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.fido, other.fido)) {
            return false;
        }
        if (this.idealLeashLength != other.idealLeashLength) {
            return false;
        }
        if (this.currentScore != other.currentScore) {
            return false;
        }
        if (this.didUserExplore != other.didUserExplore) {
            return false;
        }
        if (this.userExploreCounter != other.userExploreCounter) {
            return false;
        }
        if (this.shortLeashNumberOfTurns != other.shortLeashNumberOfTurns) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    // +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
    
    
    
    public void setMap(Map map) {
//          this.console.println("***This is a stub function ****"
//               + "\nin Game.java  setMap(Map map) around line 138"); 
          this.map = map;
       
    }

    public void setFido(Fido fido) {
//          this.console.println("***This is a stub function ****"
//               + "\nin Game.java  setFido(Fido fido) around line 144"); 
          this.fido = fido;
    }
    
    public void setEvents(Events event) {
//          this.console.println("***This is a stub function ****"
//               + "\nin Game.java  setEvent(Events event) around line 184"); 
          this.event = event;
       
    }
    
    
}

