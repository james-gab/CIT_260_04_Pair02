/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.Fido;
import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.model.Map;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.model.Scene;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel
 */
public class GameControl {
    
    
    
    
    
    public static void createNewGame(Player player){
        EventControl numbernumber = new EventControl ();
        System.out.println("\n*** createNewGame stub function called ***"
                + "GameControl.java     createNewGame(Player player)");
        
        Game game = new Game();                 //create new game
        WalkTheDog.setCurrentGame(game);        //save in WalkTheDog.java
        
        game.setPlayer(player);                 //save the player in the game
        
        Map map = MapControl.createMap();       //this creates and initializes a new map
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
        
        Fido fido = FidoControl.createFido();
        game.setFido(fido);
        
        player.gameDidUserExplore = 'n';
        player.gameFidoMood = 5;
        player.playerCurrentScore = 1 + numbernumber.randomNumberGenerator16_0to15 ();
        player.gameUserExploreCounter = 0;
        player.playerLeashLenght = numbernumber.randomNumberGenerator16_0to15 ();
        player.gameNumberOfTurns = 0;
        player.gameIdealLeashLength = numbernumber.randomNumberGenerator16_0to15 ();

    
    }

    static void assignScenesToLocations(Map map, Scene[] scenes){
            Location[][] locations = map.getLocations();
       
       //start point
            locations[0][0].setScene(scenes[Scene.SceneType.fountain.ordinal()]);
            locations[0][1].setScene(scenes[Scene.SceneType.duckpond.ordinal()]);
            locations[0][2].setScene(scenes[Scene.SceneType.statue.ordinal()]);
            locations[1][0].setScene(scenes[Scene.SceneType.restrooms.ordinal()]);
            locations[1][1].setScene(scenes[Scene.SceneType.dogpark.ordinal()]);
            locations[1][2].setScene(scenes[Scene.SceneType.playground.ordinal()]);
            locations[2][0].setScene(scenes[Scene.SceneType.restrooms.ordinal()]);
            locations[2][1].setScene(scenes[Scene.SceneType.statue.ordinal()]);
            locations[2][2].setScene(scenes[Scene.SceneType.fountain.ordinal()]);
            
    }
    
//        static void assignEventScenes(Events event, Scene[] scenes){
//            Events[][] events = event.getEvents();
       
//            //start point
//            events[0][0].setEventScene(scenes[Events.EventType.getsChokedByLeash.ordinal()]);
//            events[0][1].setEventScene(scenes[Events.EventType.stepInPoop.ordinal()]);
//            events[0][2].setEventScene(scenes[Events.EventType.birdAttack.ordinal()]);
//            events[0][3].setEventScene(scenes[Events.EventType.dogBitesSomeone.ordinal()]);
//            events[0][4].setEventScene(scenes[Events.EventType.getsBitByOtherDog.ordinal()]);
//            events[0][5].setEventScene(scenes[Events.EventType.sniffsOtherDogButt.ordinal()]);
//            events[0][6].setEventScene(scenes[Events.EventType.licksSelf.ordinal()]);
//            events[0][7].setEventScene(scenes[Events.EventType.chasesSquirrel.ordinal()]);
//            events[1][0].setEventScene(scenes[Events.EventType.getsBellyRubbed.ordinal()]);
//            events[1][1].setEventScene(scenes[Events.EventType.playsFetch.ordinal()]);
//            events[1][2].setEventScene(scenes[Events.EventType.getsTreat.ordinal()]);
//            events[1][3].setEventScene(scenes[Events.EventType.rollsOver.ordinal()]);
//            events[1][4].setEventScene(scenes[Events.EventType.doesTrick.ordinal()]);
//            events[1][5].setEventScene(scenes[Events.EventType.sniffsGround.ordinal()]);
//            events[1][6].setEventScene(scenes[Events.EventType.licksPerson.ordinal()]);
//            events[1][7].setEventScene(scenes[Events.EventType.getsScrachedBehindEars.ordinal()]);
//            
//    }
//
}
