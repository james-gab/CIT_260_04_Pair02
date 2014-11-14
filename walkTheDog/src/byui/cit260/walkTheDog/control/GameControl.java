/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Fido;
import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.model.Map;
import byui.cit260.walkTheDog.model.Player;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel
 */
public class GameControl {
    public static void createNewGame(Player player){
        System.out.println("\n*** createNewGame stub function called ***");
        
        Game game = new Game();                 //create new game
        WalkTheDog.setCurrentGame(game);        //save in WalkTheDog.java
        
        game.setPlayer(player);                 //save the player in the game
        
        Map map = MapControl.createMap();       //this creates and initializes a new map
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
        Fido fido = FidoControl.createFido();
        game.setFido(fido);
/*      
        //This Needs to be sorted out and fixed, ther eis not a setter for this function in GAME.java
        Location fixedLocation = GameControl.createFixedLocation();
        game.Location(fixedLocation);
*/        
  
        // Anythign in the Model Layer with a variable 
        // is called and initilized in this function
        
        
        
    }
            
}
// make game function statistic 
//create stud 
//have it look like his