/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Idel
 */
public enum Actor implements Serializable{
    
    OldMan("You found an old man, don't let him hit you with his cane!"),
    PunkKid("You found a punk kid, dodge the his skateboard!"),
    Pingeon("You found a pingeon, watch out for its poop!"),
    Dog("You found another dog in the park, go play!"),
    Clown("You found a clown!"),
    Squirrel("You found a squirrel, hold your dog back!");
    
    //class instance variables 
    private final String actorName;
    private final int idealLeashLength;   //THIS IS NOT A FINAL NEED TO CHANGE?????
    private final Point cordinates;
    public Actor[][] actorS;


    Actor(String actorName) {
        this.actorName = actorName;
        idealLeashLength = 15;
        cordinates = new Point(1,1);
    }
    
    public String getActorName() {
        return actorName;
    }

   

    public int getIdealLeashLength() {
        return idealLeashLength;
    }

    public Point getCordinates() {
        return cordinates;
    }


    @Override
    public String toString() {
        return "Actor{" + "actorName=" + actorName + ", idealLeashLength=" + idealLeashLength + '}';
    }

    
    
    
}
