/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Objects;

/**
 *
 * @author Idel
 */
public class ExploringEvents implements Serializable {
    private int row; 
    private int column;
    private boolean visited; 
    private String eventName; 
    private String evenDescription;
    private String criteria;
    public String [][] exploringEvent = new String [row][column] ;
    private int noOfRows;
    private int noOfColums;
//    public Object exploringEvent;

    public ExploringEvents() {
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

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    
    
    
    
    
    
    
    
    
    

    
    
    
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEvenDescription() {
        return evenDescription;
    }

    public void setEvenDescription(String evenDescription) {
        this.evenDescription = evenDescription;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    @Override
    public String toString() {
        return "ExploringEvents{" + "eventName=" + eventName + ", evenDescription=" + evenDescription + ", criteria=" + criteria + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.eventName);
        hash = 67 * hash + Objects.hashCode(this.evenDescription);
        hash = 67 * hash + Objects.hashCode(this.criteria);
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
        final ExploringEvents other = (ExploringEvents) obj;
        if (!Objects.equals(this.eventName, other.eventName)) {
            return false;
        }
        if (!Objects.equals(this.evenDescription, other.evenDescription)) {
            return false;
        }
        if (!Objects.equals(this.criteria, other.criteria)) {
            return false;
        }
        return true;
    }
    
    
    
    
    public ExploringEvents(int noOfRows, int noOfColums) {
        
        if (noOfRows<1 || noOfColums<1){
            System.out.println("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in GameMenuView.java in ***"
                    + "\n   ExploringEvents() if (noOfRows<1 || noOfColums<1)***");
            return;
        }
        String [][] exploringEvent = new String [noOfRows][noOfColums] ;
        this.noOfRows = noOfRows;
        this.noOfColums = noOfColums;
        
        for (int row1 = 0; row1 < noOfRows; row1++){
            for (int column1 = 0; column1 < noOfColums; column1++){
                String [][] eEvent = new ;
                eEvent = this.setColumn(column1);
                String [][] exploringEvent.this.setRow(row1);
                String [][] exploringEvent.this.setVisited(false);
                
                //assign the Location object to the current position in array
                        exploringEvents[row1][column1] = exploringEvent;
            }
        }
        
        
    }

    
    
    
    
    
}
