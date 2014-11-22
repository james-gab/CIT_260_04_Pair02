
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
public class Events implements Serializable {


// class instance variables
 public int eventTypeInPark;        //named wrong in UML corrected name
 public EventType[][] eventTypes;
 int noOfRows;
 int noOfColums;

// need to consider changeing from Double to INT

    public Events(){
        
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColums() {
        return noOfColums;
    }

    public void setNoOfColums(int noOfColums) {
        this.noOfColums = noOfColums;
    }


    public Events(int noOfRows, int noOfColums) {
        
        if (noOfRows<1 || noOfColums<1){
            System.out.println("The EventType Number must be greater than zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColums = noOfColums;
        
        this.eventTypes = new EventType [noOfRows][noOfColums];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColums; column++){
                // create and initilize the eventType objects instance
                EventType eventType = new EventType();
                eventType.setColumn(column);
                eventType.setRow(row);
                eventType.setVisited(false);
                
                //assign the EventType object to the current position in array
                        eventTypes[row][column] = eventType;
            }
        }
        
        
    }



    public int getEventTypeInPark() {
        return eventTypeInPark;
    }

    public void setEventTypeInPark(int eventTypeInPark) {
        this.eventTypeInPark = eventTypeInPark;
    }

    @Override
    public String toString() {
        return "Events{" + "lacationInPark=" + eventTypeInPark  + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.eventTypeInPark) ^ (Double.doubleToLongBits(this.eventTypeInPark) >>> 32));
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
        if (Double.doubleToLongBits(this.eventTypeInPark) != Double.doubleToLongBits(other.eventTypeInPark)) {
            return false;
        }
        return true;
    }

    public EventType[][] getEventTypes() {
        return eventTypes;
    }
    
    public void setEventTypes(EventType[][] eventTypes) {
        this.eventTypes = eventTypes;
  }
    
}
