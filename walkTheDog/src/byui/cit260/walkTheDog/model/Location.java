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
public enum Location implements Serializable {
    
    Fountain("You found the water fountain, don't jump in the water!"),
    Statue("You found the stature in the park, don't pee on it!"),
    Playground("You found the playground, watch out for the kids!"),
    Dogpark("You found the dog park, go play!"),
    Restrooms("You found the restrooms, take a break!"),
    DuckPond("You found the duck pond, watch out for bird poop!");
    
    private final int fixedLocation;
    private final String description;

    Location(String description) {
        this.description = description;
        fixedLocation = 1;
    }
    
    public int getFixedLocation() {
        return fixedLocation;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Location{" + "fixedLocation=" + fixedLocation + ", description=" + description + '}';
    }

    
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 73 * hash + this.fixedLocation;
//        hash = 73 * hash + Objects.hashCode(this.description);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Location other = (Location) obj;
//        if (this.fixedLocation != other.fixedLocation) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }
    
    
    
}
