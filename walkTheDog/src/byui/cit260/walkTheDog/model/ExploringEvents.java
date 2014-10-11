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
public class ExploringEvents implements Serializable {
    private String eventName; 
    private String evenDescription;
    private String criteria;

    public ExploringEvents() {
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
    
    
}
