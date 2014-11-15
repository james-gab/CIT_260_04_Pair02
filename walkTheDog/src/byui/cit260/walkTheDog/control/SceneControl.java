/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.model.Map;
import byui.cit260.walkTheDog.model.Scene;
import byui.cit260.walkTheDog.model.Scene.SceneType;

/**
 *
 * @author Idel
 */
public class SceneControl {
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
       Location[][] locations = map.getLocations();
       
       //start point
       locations[0][0].setScene(scenes[SceneType.fountain.ordinal()]);
       locations[0][1].setScene(scenes[SceneType.duckpond.ordinal()]);
       locations[0][2].setScene(scenes[SceneType.statue.ordinal()]);
       locations[1][0].setScene(scenes[SceneType.restrooms.ordinal()]);
       locations[1][1].setScene(scenes[SceneType.dogpark.ordinal()]);
       locations[1][2].setScene(scenes[SceneType.playground.ordinal()]);
       locations[2][0].setScene(scenes[SceneType.restrooms.ordinal()]);
       locations[2][1].setScene(scenes[SceneType.statue.ordinal()]);
       locations[2][2].setScene(scenes[SceneType.fountain.ordinal()]);

                            

    }
    
}
