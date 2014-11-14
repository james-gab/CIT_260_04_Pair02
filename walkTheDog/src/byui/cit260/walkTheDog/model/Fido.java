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
public class Fido implements Serializable {
    
    // class instance variables
    private String name;        //player's name ****** not used ******
    private String templerment;
    private String mood;
    private int leashLength;
    private int numberOfTurns;

    public Fido() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTemplerment() {
        return templerment;
    }

    public void setTemplerment(String templerment) {
        this.templerment = templerment;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public double getLeashLength() {
        return leashLength;
    }

    public void setLeashLength(double leashLength) {
        this.leashLength = (int) leashLength;
    }

    public double getNumberOfTurns() {
        return numberOfTurns;
    }

    public void setNumberOfTurns(double numberOfTurns) {
        this.numberOfTurns = (int) numberOfTurns;
    }

    @Override
    public String toString() {
        return "Fido{" + "name=" + name + ", templerment=" + templerment + ", mood=" + mood + ", leashLength=" + leashLength + ", numberOfTurns=" + numberOfTurns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.templerment);
        hash = 61 * hash + Objects.hashCode(this.mood);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.leashLength) ^ (Double.doubleToLongBits(this.leashLength) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.numberOfTurns) ^ (Double.doubleToLongBits(this.numberOfTurns) >>> 32));
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.templerment, other.templerment)) {
            return false;
        }
        if (!Objects.equals(this.mood, other.mood)) {
            return false;
        }
        if (Double.doubleToLongBits(this.leashLength) != Double.doubleToLongBits(other.leashLength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfTurns) != Double.doubleToLongBits(other.numberOfTurns)) {
            return false;
        }
        return true;
    }
    
    
}
