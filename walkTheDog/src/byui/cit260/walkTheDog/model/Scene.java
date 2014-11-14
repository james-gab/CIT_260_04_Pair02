/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;

/**
 *
 * @author Idel
 */
public enum Scene implements Serializable {
    Fountain("You found the water fountain, don't jump in the water!"),
    Statue("You found the stature in the park, don't pee on it!"),
    Playground("You found the playground, watch out for the kids!"),
    Dogpark("You found the dog park, go play!"),
    Restrooms("You found the restrooms, take a break!"),
    DuckPond("You found the duck pond, watch out for bird poop!");
    
    private final int fixedScene;
    private final String description;
    private 

    Scene(String description) {
        this.description = description;
        fixedScene = 1;
    }
    
    public int getFixedScene() {
        return fixedScene;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Scene{" + "fixedScene=" + fixedScene + ", description=" + description + '}';
    }

}
