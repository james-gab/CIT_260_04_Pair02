/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class Game implements Serializable {
    
    
    // class instance variables
    private double fidoPoints;
    private double playerPosition;
    private double currentLeashLength;
    private double fidoAction;

    public Game() {
    }
    
    

    public double getFidoPoints() {
        return fidoPoints;
    }

    public void setFidoPoints(double fidoPoints) {
        this.fidoPoints = fidoPoints;
    }

    public double getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(double playerPosition) {
        this.playerPosition = playerPosition;
    }

    public double getCurrentLeashLength() {
        return currentLeashLength;
    }

    public void setCurrentLeashLength(double currentLeashLength) {
        this.currentLeashLength = currentLeashLength;
    }

    public double getFidoAction() {
        return fidoAction;
    }

    public void setFidoAction(double fidoAction) {
        this.fidoAction = fidoAction;
    }

    @Override
    public String toString() {
        return "Game{" + "fidoPoints=" + fidoPoints + ", playerPosition=" + playerPosition + ", currentLeashLength=" + currentLeashLength + ", fidoAction=" + fidoAction + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.fidoPoints) ^ (Double.doubleToLongBits(this.fidoPoints) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.playerPosition) ^ (Double.doubleToLongBits(this.playerPosition) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.currentLeashLength) ^ (Double.doubleToLongBits(this.currentLeashLength) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.fidoAction) ^ (Double.doubleToLongBits(this.fidoAction) >>> 32));
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
        if (Double.doubleToLongBits(this.fidoPoints) != Double.doubleToLongBits(other.fidoPoints)) {
            return false;
        }
        if (Double.doubleToLongBits(this.playerPosition) != Double.doubleToLongBits(other.playerPosition)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentLeashLength) != Double.doubleToLongBits(other.currentLeashLength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fidoAction) != Double.doubleToLongBits(other.fidoAction)) {
            return false;
        }
        return true;
    }
    
    

    
}

