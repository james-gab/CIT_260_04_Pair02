/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.EventsScene;
import byui.cit260.walkTheDog.model.EventsType;
import byui.cit260.walkTheDog.model.Fido;
import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.model.Events;
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
        ExporingControl numbernumber = new ExporingControl ();
        
//        System.out.println("\n*** createNewGame stub function called ***"
//                + "GameControl.java     createNewGame(Player player)");
        
        Game game = new Game();                 //create new game
        WalkTheDog.setCurrentGame(game);        //save in WalkTheDog.java
        
        game.setPlayer(player);                 //save the player in the game
        
        Map map = MapControl.createMap();       //this creates and initializes a new map
        game.setMap(map);
        
        Events events = EventsControl.createEvents();       //this creates and initializes a new events
        game.setEvents(events);

/*
        Events[][] event = Events.createEvents(Events.event);
        game.setEvent(event);
        
//        MapControl.moveActorsToStartingLocation(map);
        
  */      
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
   
    static void assignEventScenesToEventTypes(Events events, EventsScene[] scenes){
            EventsType[][] eventType = events.getEventTypes();
       
       //start point
            eventType[0][1].setEventScene(scenes[EventsScene.EventSceneType.getsChokedByLeash.ordinal()]);
            eventType[1][1].setEventScene(scenes[EventsScene.EventSceneType.stepInPoop.ordinal()]);
            eventType[2][1].setEventScene(scenes[EventsScene.EventSceneType.birdAttack.ordinal()]);
            eventType[3][1].setEventScene(scenes[EventsScene.EventSceneType.dogBitesSomeone.ordinal()]);
            eventType[4][1].setEventScene(scenes[EventsScene.EventSceneType.getsBitByOtherDog.ordinal()]);
            eventType[5][1].setEventScene(scenes[EventsScene.EventSceneType.sniffsOtherDogButt.ordinal()]);
            eventType[6][1].setEventScene(scenes[EventsScene.EventSceneType.licksSelf.ordinal()]);
            eventType[7][1].setEventScene(scenes[EventsScene.EventSceneType.chasesSquirrel.ordinal()]);
            eventType[0][0].setEventScene(scenes[EventsScene.EventSceneType.getsBellyRubbed.ordinal()]);
            eventType[1][0].setEventScene(scenes[EventsScene.EventSceneType.playsFetch.ordinal()]);
            eventType[2][0].setEventScene(scenes[EventsScene.EventSceneType.getsTreat.ordinal()]);
            eventType[3][0].setEventScene(scenes[EventsScene.EventSceneType.rollsOver.ordinal()]);
            eventType[4][0].setEventScene(scenes[EventsScene.EventSceneType.doesTrick.ordinal()]);
            eventType[5][0].setEventScene(scenes[EventsScene.EventSceneType.sniffsGround.ordinal()]);
            eventType[6][0].setEventScene(scenes[EventsScene.EventSceneType.licksPerson.ordinal()]);
            eventType[7][0].setEventScene(scenes[EventsScene.EventSceneType.getsScrachedBehindEars.ordinal()]);
            
    }

        
        
}
