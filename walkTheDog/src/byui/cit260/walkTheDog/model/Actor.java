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
public class Actor implements Serializable{
    
    //class instance variables 
    private String actorName;
    private int idealLeashLength;

    public Actor() {
    }
    
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getIdealLeashLength() {
        return idealLeashLength;
    }

    public void setIdealLeashLength(int idealLeashLength) {
        this.idealLeashLength = idealLeashLength;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorName=" + actorName + ", idealLeashLength=" + idealLeashLength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.actorName);
        hash = 79 * hash + this.idealLeashLength;
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
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.actorName, other.actorName)) {
            return false;
        }
        if (this.idealLeashLength != other.idealLeashLength) {
            return false;
        }
        return true;
    }
    
    
    
}
