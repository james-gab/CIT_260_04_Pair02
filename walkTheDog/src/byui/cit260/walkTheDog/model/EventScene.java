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
 * @author gab
 */
public class EventScene implements Serializable {
    
      
    private int fixedScene;
    private String description;
    private boolean blocked;
    private double travelTime;
    public String MapSymbol;
    private String eventName;

    public EventScene() {
    }

    public int getFixedScene() {
        return fixedScene;
    }

    public void setFixedScene(int fixedScene) {
        this.fixedScene = fixedScene;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getMapSymbol() {
        return MapSymbol;
    }

    public void setMapSymbol(String MapSymbol) {
        this.MapSymbol = MapSymbol;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.fixedScene;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (this.blocked ? 1 : 0);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.MapSymbol);
        hash = 71 * hash + Objects.hashCode(this.eventName);
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
        if (this.fixedScene != other.fixedScene) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (!Objects.equals(this.MapSymbol, other.MapSymbol)) {
            return false;
        }
        if (!Objects.equals(this.eventName, other.eventName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EventScene{" + "fixedScene=" + fixedScene + ", description=" + description + ", blocked=" + blocked + ", travelTime=" + travelTime + ", MapSymbol=" + MapSymbol + ", eventName=" + eventName + '}';
    }

    
    
    

        
    public static enum EventType {
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
        this.eventName = description;
        int fixedEventScene = 1;
    
     }
 
    
    
    
    
    
    
    
    
}
