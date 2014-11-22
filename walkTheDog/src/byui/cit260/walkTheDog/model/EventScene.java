/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Idel
 */
public class EventScene implements Serializable {
    
    private int fixedEventScene;
    private String description;
    private boolean blocked;
    private double travelTime;
    public String EventsSymbol;
    
    
    
    
    
    
    

    public double getTravelTime() {
        return travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public String getEventsSymbol() {
        return EventsSymbol;
    }

    public void setEventsSymbol(String st) {
        this.EventsSymbol = st;
    }

    public void setBlocked(boolean b) {
        this.blocked = b;
    }

    public void setTravelTime(double POSITIVE_INFINITY) {
        this.travelTime = POSITIVE_INFINITY;
    }
    
 

    public static enum EventSceneType {
        getsBellyRubbed,
        playsFetch,
        getsTreat,
        rollsOver,
        doesTrick,
        sniffsGround,
        licksPerson,
        getsScrachedBehindEars,
        stepInPoop,
        birdAttack,
        dogBitesSomeone,
        getsBitByOtherDog,
        sniffsOtherDogButt,
        licksSelf,
        chasesSquirrel,
        getsChokedByLeash;
     }
    
    EventScene(String description) {
        this.EventsSymbol = description;
        fixedEventScene = 1;
    
     }

    public int getFixedEventScene() {
        return fixedEventScene;
    }

    public void setFixedEventScene(int fixedEventScene) {
        this.fixedEventScene = fixedEventScene;
    }

    public String getDescription() {
        return EventsSymbol;
    }

    public void setDescription(String description) {
        this.EventsSymbol = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.fixedEventScene;
        hash = 97 * hash + Objects.hashCode(this.EventsSymbol);
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
        final EventScene other = (EventScene) obj;
        if (this.fixedEventScene != other.fixedEventScene) {
            return false;
        }
        if (!Objects.equals(this.EventsSymbol, other.EventsSymbol)) {
            return false;
        }
        return true;
    }

    public EventScene() {
    }

    @Override
    public String toString() {
        return "EventScene{" + "fixedEventScene=" + fixedEventScene + ", description=" + EventsSymbol + '}';
    }
    
    
    
}
