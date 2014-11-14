
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
public class Map implements Serializable {


// class instance variables
private double locationInPark;        //named wrong in UML corrected name
private Location[] locations;
// need to consider changeing from Double to INT

    public Map() {
    }



    public double getLocationInPark() {
        return locationInPark;
    }

    public void setLocationInPark(double locationInPark) {
        this.locationInPark = locationInPark;
    }

    @Override
    public String toString() {
        return "Map{" + "lacationInPark=" + locationInPark  + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.locationInPark) ^ (Double.doubleToLongBits(this.locationInPark) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.locationInPark) != Double.doubleToLongBits(other.locationInPark)) {
            return false;
        }
        return true;
    }


    
}
