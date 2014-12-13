package byui.cit260.walkTheDog.model;

import java.io.PrintWriter;
import java.io.Serializable;
import walkthedog.WalkTheDog;

/**
 *
 * @authors and gab James
 */
public class Events implements Serializable {

    public int eventTypeInPark;
    public EventsType[][] eventTypes;
    int noOfRows;
    int noOfColums;
    protected final PrintWriter console = WalkTheDog.getOutFile();

    public Events() {
    }

    public EventsType[][] getEventTypes() {
        return eventTypes;
    }

    public void setEventTypes(EventsType[][] eventTypes) {
        this.eventTypes = eventTypes;
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

        if (noOfRows < 1 || noOfColums < 1) {
            this.console.println("Enter a Number greater than zero");
            return;
        }

        this.eventTypes = new EventsType[noOfRows][noOfColums];
        this.noOfRows = noOfRows;
        this.noOfColums = noOfColums;

        for (int row = 0; row < noOfRows; row++) {
            for (int column = 0; column < noOfColums; column++) {
                EventsType eventType = new EventsType();                          // create and initilize the eventType objects instance
                eventType.setColumn(column);
                eventType.setRow(row);
                eventType.setVisited(false);
                eventTypes[row][column] = eventType;                            //assign the EventsType object to the current position in array
            }   // END for column loop
        }       // END for row loop

    }   // END     public Events(int noOfRows, int noOfColums) 

    public int getEventTypeInPark() {
        return eventTypeInPark;
    }

    public void setEventTypeInPark(int eventTypeInPark) {
        this.eventTypeInPark = eventTypeInPark;
    }

    @Override
    public String toString() {
        return "Events{" + "lacationInPark=" + eventTypeInPark + '}';
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

}   //End of public class Events implements Serializable
