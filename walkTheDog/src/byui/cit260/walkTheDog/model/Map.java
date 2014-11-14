
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
private int locationInPark;        //named wrong in UML corrected name
private Location[][] locations;
 int noOfRows;
 int noOfColums;

// need to consider changeing from Double to INT

    public Map(){
        
    }


    public Map(int noOfRows, int noOfColums) {
        
        if (noOfRows<1 || noOfColums<1){
            System.out.println("The Location Number must be greater than zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColums = noOfColums;
        
        this.locations = new Location [noOfRows][noOfColums];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColums; column++){
                // create and initilize the location objects instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                //assign the Location object to the current position in array
                        locations[row][column] = location;
            }
        }
        
        
    }



    public int getLocationInPark() {
        return locationInPark;
    }

    public void setLocationInPark(int locationInPark) {
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
