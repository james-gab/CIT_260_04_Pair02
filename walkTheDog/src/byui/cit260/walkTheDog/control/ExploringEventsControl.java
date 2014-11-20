/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.EventScene;
import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.ExploringEvents;
import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Scene;
import java.awt.image.BufferedImage;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab
 */
public class ExploringEventsControl {

    public Events[][] events;
    private int noOfRows;
    private int noOfColums;


    
    
    
    
    


    public ExploringEventsControl() {
    }

    public Events[][] getExploringEventsControl() {
        return events;
    }

    public void setEvents(Events[][] events) {
        this.events = events;
    }

/*
    public void setLocations(Events[][] locations) {
        this.events = locations;
    }
*/
    
    
    
   
    
    
    
    
    
    
    
    //+++++++++++++++++++++++++++++++Lesson 08 Individual assignment+++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++          Gabriel James        +++++++++++++++++++++++++++++++++
   
    
    public ExploringEventsControl(int noOfRows, int noOfColums) {
        
        if (noOfRows<1 || noOfColums<1){
            System.out.println("The Location Number must be greater than zero");
            return;
        }
        
        this.noOfRows = noOfRows;
      this.noOfColums = noOfColums;
        
        this.events = new Events [noOfRows][noOfColums];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColums; column++){
                // create and initilize the location objects instance
                Events explore = new Events();
                explore.setColumn(column);
                explore.setRow(row);
                explore.setVisited(false);
                
                //assign the Location object to the current position in array
                        events[row][column] = explore;
            }
        }
        
        
    }
       
    
        public void displayEventList() {
        
            Events explore = WalkTheDog.getCurrentGame().getEvents();
            
            System.out.println("     The Park\n");
            System.out.print("          ");
            
            for (int column = 0; column < noOfColums; column++){
                System.out.print("     "+column+"     | ");
                }
            
            for (int row = 0; row < noOfRows; row++){
                System.out.print("\n      "+row);
                    for (int column = 0; column < noOfColums; column++){
                        System.out.print(" | ");
                       explore = events [row][column];
                        if(!explore.equals("")){
//                            System.out.print(explore[row][column].getScene().getMapSymbol());
                            }
                        else{
                            System.out.print("   x      ");                           // place map symbol here
                            }
                        }
                    
                    System.out.print(" |");
                    }
            }   // END of public void displayMap()

    
    public static Events createEvents() {
    
        // Create Map
        ExploringEventsControl event = new ExploringEventsControl(Events.rowCount,Events.columCount);
        
        // create sceans for the game
        EventScene[] scenes = ExploringEventsControl.createScenes();
        
        // assign sceans to event
        GameControl.assignEventScenes(event,scenes);

//        return events;
        return null;
        
    }
        
        
        
    
    
    
    
    
    
    
    public static EventScene[] createScenes() {
        BufferedImage image = null;
        Game game = WalkTheDog.getCurrentGame();
        EventScene[] scenes = new EventScene[EventScene.EventType.values().length];
        
        // STARTING SCENE////
        Scene getsBellyRubbedScene = new Scene();
        getsBellyRubbedScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsBellyRubbedScene.setMapSymbol( " getsBellyRubbed " );
        getsBellyRubbedScene.setBlocked(false);
        EventScene[EventScene.EventType.getsBellyRubbed.ordinal()] = getsBellyRubbedScene;

        Scene playsFetchScene = new Scene();
        playsFetchScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        playsFetchScene.setMapSymbol( " playsFetch " );
        playsFetchScene.setBlocked(false);
        EventScene[EventScene.EventType.playsFetch.ordinal()] = playsFetchScene;

        Scene getsTreatScene = new Scene();
        getsTreatScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsTreatScene.setMapSymbol( " getsTreat " );
        getsTreatScene.setBlocked(false);
        scenes[EventScene.EventType.getsTreat.ordinal()] = getsTreatScene;

        Scene rollsOverScene = new Scene();
        rollsOverScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        rollsOverScene.setMapSymbol( " rollsOver" );
        rollsOverScene.setBlocked(false);
        EventScene[EventScene.EventType.rollsOver.ordinal()] = rollsOverScene;

        Scene doesTrickScene = new Scene();
        doesTrickScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        doesTrickScene.setMapSymbol( " doesTrick  " );
        doesTrickScene.setBlocked(false);
        EventScene[EventScene.EventType.doesTrick.ordinal()] = doesTrickScene;

        Scene sniffsGroundScene = new Scene();
        sniffsGroundScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        sniffsGroundScene.setMapSymbol( " sniffsGround " );
        sniffsGroundScene.setBlocked(false);
        EventScene[EventScene.EventType.sniffsGround.ordinal()] = sniffsGroundScene;

        Scene licksPersonScene = new Scene();
        licksPersonScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        licksPersonScene.setMapSymbol( " licksPerson " );
        licksPersonScene.setBlocked(false);
        EventScene[EventScene.EventType.licksPerson.ordinal()] = licksPersonScene;

        Scene getsScrachedBehindEarsScene = new Scene();
        getsScrachedBehindEarsScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsScrachedBehindEarsScene.setMapSymbol( " getsScrachedBehindEars " );
        getsScrachedBehindEarsScene.setBlocked(false);
        EventScene[EventScene.EventType.getsScrachedBehindEars.ordinal()] = getsScrachedBehindEarsScene;

        Scene stepInPoopScene = new Scene();
        stepInPoopScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        stepInPoopScene.setMapSymbol( " stepInPoop" );
        stepInPoopScene.setBlocked(false);
        EventScene[EventScene.EventType.stepInPoop.ordinal()] = stepInPoopScene;

        Scene birdAttackScene = new Scene();
        birdAttackScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        birdAttackScene.setMapSymbol( " birdAttack" );
        birdAttackScene.setBlocked(false);
        EventScene[EventScene.EventType.birdAttack.ordinal()] = birdAttackScene;

        Scene dogBitesSomeoneScene = new Scene();
        dogBitesSomeoneScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        dogBitesSomeoneScene.setMapSymbol( " dogBitesSomeone " );
        dogBitesSomeoneScene.setBlocked(false);
        EventScene[EventScene.EventType.dogBitesSomeone.ordinal()] = dogBitesSomeoneScene;

        Scene getsBitByOtherDogScene = new Scene();
        getsBitByOtherDogScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsBitByOtherDogScene.setMapSymbol( " getsBitByOtherDog " );
        getsBitByOtherDogScene.setBlocked(false);
        EventScene[EventScene.EventType.getsBitByOtherDog.ordinal()] = getsBitByOtherDogScene;

        Scene sniffsOtherDogButtScene = new Scene();
        sniffsOtherDogButtScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        sniffsOtherDogButtScene.setMapSymbol( " sniffsOtherDogButt  " );
        sniffsOtherDogButtScene.setBlocked(false);
        EventScene[EventScene.EventType.sniffsOtherDogButt.ordinal()] = sniffsOtherDogButtScene;

        Scene licksSelfScene = new Scene();
        licksSelfScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        licksSelfScene.setMapSymbol( " licksSelf  " );
        licksSelfScene.setBlocked(false);
        EventScene[EventScene.EventType.licksSelf.ordinal()] = licksSelfScene;

        Scene chasesSquirrelScene = new Scene();
        chasesSquirrelScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        chasesSquirrelScene.setMapSymbol( " chasesSquirrel " );
        chasesSquirrelScene.setBlocked(false);
        EventScene[EventScene.EventType.chasesSquirrel.ordinal()] = chasesSquirrelScene;

        Scene getsChokedByLeashScene = new Scene();
        getsChokedByLeashScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsChokedByLeashScene.setMapSymbol( " getsChokedByLeash " );
        getsChokedByLeashScene.setBlocked(false);
        EventScene[EventScene.EventType.getsChokedByLeash.ordinal()] = getsChokedByLeashScene;

        return scenes;
   
  }
        

       
}
