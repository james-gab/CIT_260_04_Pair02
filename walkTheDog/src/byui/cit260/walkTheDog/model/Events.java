/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import byui.cit260.walkTheDog.control.ExploringEventsControl;
import byui.cit260.walkTheDog.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author gab
 */
public class Events implements Serializable {

    
    private boolean visited; 
    private String explore; 
    private Scene eventsScene;
    public String eventName;
    private int fixedEventScene;
    public Events[][] event;
    public static int rowCount = 8;
    public static int columCount = 2;
    private int row;
    private int column;



    public Events() {
    }

    public Events[][] getEvents() {
        return event;
    }

    public void setEvents(Events[][] event) {
        this.event = event;
    }

 
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getExplore() {
        return explore;
    }

    public void setExplore(String explore) {
        this.explore = explore;
    }

    public Scene getEventsScene() {
        return eventsScene;
    }

    public void setEventsScene(Scene eventsScene) {
        this.eventsScene = eventsScene;
    }

    public int getFixedEventScene() {
        return fixedEventScene;
    }

    public void setFixedEventScene(int fixedEventScene) {
        this.fixedEventScene = fixedEventScene;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (this.visited ? 1 : 0);
        hash = 41 * hash + Objects.hashCode(this.explore);
        hash = 41 * hash + Objects.hashCode(this.eventsScene);
        hash = 41 * hash + Objects.hashCode(this.eventName);
        hash = 41 * hash + this.fixedEventScene;
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
        final Events other = (Events) obj;
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.explore, other.explore)) {
            return false;
        }
        if (!Objects.equals(this.eventsScene, other.eventsScene)) {
            return false;
        }
        if (!Objects.equals(this.eventName, other.eventName)) {
            return false;
        }
        if (this.fixedEventScene != other.fixedEventScene) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Events{" + "visited=" + visited + ", explore=" + explore + ", eventsScene=" + eventsScene + ", eventName=" + eventName + ", fixedEventScene=" + fixedEventScene + '}';
    }


    
    
    public void setEventName(String st) {
        this.eventName = st;
    }
/*    
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
    Events(String description) {
        this.eventName = description;
        fixedEventScene = 1;
    
     }
*/  
        public void setEventScene(Scene scene) {
        this.eventsScene = scene;
    }

    
}
