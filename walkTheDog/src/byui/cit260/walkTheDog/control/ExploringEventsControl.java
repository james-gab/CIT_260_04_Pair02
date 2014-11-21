/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.EventScene;
import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.Game;
import java.awt.image.BufferedImage;
import walkthedog.WalkTheDog;

/**
 *
 * @author gab
 */
public class ExploringEventsControl {

    private Events[][] events;
//    private int noOfRows;
//    private int noOfColums;
    public static int rowCount = 2;
    public static int columCount = 8;


    
    
    
    
    


    public ExploringEventsControl() {
    }

    public Events[][] getExploringEventsControl() {
        return events;
    }

    public void setExploringEventsControl(Events[][] events) {
        this.events = events;
    }

/*
    public void setLocations(Events[][] locations) {
        this.events = locations;
    }
*/
    
    
    
   
    
    
    
    
    
    
    
    //+++++++++++++++++++++++++++++++Lesson 08 Individual assignment+++++++++++++++++++++++++++++++++
    //+++++++++++++++++++++++++++++++          Gabriel James        +++++++++++++++++++++++++++++++++
   
    /**
     *
     * @param noOfRows
     * @param noOfColums
     */
       
    
    public ExploringEventsControl(int noOfRows, int noOfColums) {
        
        if (noOfRows<1 || noOfColums<1){
            System.out.println("The Location Number must be greater than zero");
            return;
        }
        
//        this.noOfRows = noOfRows;
//      this.noOfColums = noOfColums;
        
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
        
            Events[][] exploreing = WalkTheDog.getCurrentGame().getEvents();
            
            System.out.println("     The Park\n"
                    + "is full of different people\n"
                    + "They are:\n"
                    + "Good     and    Bad\n");
            System.out.print("          ");
            
            for (int column = 0; column < rowCount; column++){
                System.out.print("     "+column+"     | ");
                }
            
            for (int row = 0; row < columCount; row++){
                System.out.print("\n      "+row);
                    for (int column = 0; column < rowCount; column++){
                        System.out.print(" | ");
           //            exploreing = events[row][column];
//                        if(!exploreing.equals("")){
                        if(events[row][column].equals("")){
                            System.out.print("   x      ");
                        }
                        else{
                            System.out.print("this is a test");
                            
                            System.out.print(events[row][column].getEventsScene().getMapSymbol());
                        }
                    }
                    
                    System.out.print(" |");
                    }
            }   // END of public void displayEventList()

    
    public static Events[][] createEvents() {
    
        // Create array
        ExploringEventsControl event = new ExploringEventsControl(rowCount,columCount);
        
        // create actors for the game
        EventScene[] scenes = ExploringEventsControl.createScenes();
        
        // assign actors to event
        GameControl.assignEventScenes(event,scenes);

//        return event;
        return null;
        
    }
        
        
        
    
    
    
    
    
    
    
    public static EventScene[] createScenes() {
        BufferedImage image = null;
        Game game = WalkTheDog.getCurrentGame();
        EventScene[] scenes = new EventScene[EventScene.EventType.values().length];
        
        // STARTING SCENE////
        EventScene getsBellyRubbedScene = new EventScene();
        getsBellyRubbedScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsBellyRubbedScene.setMapSymbol( " getsBellyRubbed " );
        getsBellyRubbedScene.setBlocked(false);
        scenes[EventScene.EventType.getsBellyRubbed.ordinal()] = getsBellyRubbedScene;

        EventScene playsFetchScene = new EventScene();
        playsFetchScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        playsFetchScene.setMapSymbol( " playsFetch " );
        playsFetchScene.setBlocked(false);
        scenes[EventScene.EventType.playsFetch.ordinal()] = playsFetchScene;

        EventScene getsTreatScene = new EventScene();
        getsTreatScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsTreatScene.setMapSymbol( " getsTreat " );
        getsTreatScene.setBlocked(false);
        scenes[EventScene.EventType.getsTreat.ordinal()] = getsTreatScene;

        EventScene rollsOverScene = new EventScene();
        rollsOverScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        rollsOverScene.setMapSymbol( " rollsOver" );
        rollsOverScene.setBlocked(false);
        scenes[EventScene.EventType.rollsOver.ordinal()] = rollsOverScene;

        EventScene doesTrickScene = new EventScene();
        doesTrickScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        doesTrickScene.setMapSymbol( " doesTrick  " );
        doesTrickScene.setBlocked(false);
        scenes[EventScene.EventType.doesTrick.ordinal()] = doesTrickScene;

        EventScene sniffsGroundScene = new EventScene();
        sniffsGroundScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        sniffsGroundScene.setMapSymbol( " sniffsGround " );
        sniffsGroundScene.setBlocked(false);
        scenes[EventScene.EventType.sniffsGround.ordinal()] = sniffsGroundScene;

        EventScene licksPersonScene = new EventScene();
        licksPersonScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        licksPersonScene.setMapSymbol( " licksPerson " );
        licksPersonScene.setBlocked(false);
        scenes[EventScene.EventType.licksPerson.ordinal()] = licksPersonScene;

        EventScene getsScrachedBehindEarsScene = new EventScene();
        getsScrachedBehindEarsScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsScrachedBehindEarsScene.setMapSymbol( " getsScrachedBehindEars " );
        getsScrachedBehindEarsScene.setBlocked(false);
        scenes[EventScene.EventType.getsScrachedBehindEars.ordinal()] = getsScrachedBehindEarsScene;

        EventScene stepInPoopScene = new EventScene();
        stepInPoopScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        stepInPoopScene.setMapSymbol( " stepInPoop" );
        stepInPoopScene.setBlocked(false);
        scenes[EventScene.EventType.stepInPoop.ordinal()] = stepInPoopScene;

        EventScene birdAttackScene = new EventScene();
        birdAttackScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        birdAttackScene.setMapSymbol( " birdAttack" );
        birdAttackScene.setBlocked(false);
        scenes[EventScene.EventType.birdAttack.ordinal()] = birdAttackScene;

        EventScene dogBitesSomeoneScene = new EventScene();
        dogBitesSomeoneScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        dogBitesSomeoneScene.setMapSymbol( " dogBitesSomeone " );
        dogBitesSomeoneScene.setBlocked(false);
        scenes[EventScene.EventType.dogBitesSomeone.ordinal()] = dogBitesSomeoneScene;

        EventScene getsBitByOtherDogScene = new EventScene();
        getsBitByOtherDogScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsBitByOtherDogScene.setMapSymbol( " getsBitByOtherDog " );
        getsBitByOtherDogScene.setBlocked(false);
        scenes[EventScene.EventType.getsBitByOtherDog.ordinal()] = getsBitByOtherDogScene;

        EventScene sniffsOtherDogButtScene = new EventScene();
        sniffsOtherDogButtScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        sniffsOtherDogButtScene.setMapSymbol( " sniffsOtherDogButt  " );
        sniffsOtherDogButtScene.setBlocked(false);
        scenes[EventScene.EventType.sniffsOtherDogButt.ordinal()] = sniffsOtherDogButtScene;

        EventScene licksSelfScene = new EventScene();
        licksSelfScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        licksSelfScene.setMapSymbol( " licksSelf  " );
        licksSelfScene.setBlocked(false);
        scenes[EventScene.EventType.licksSelf.ordinal()] = licksSelfScene;

        EventScene chasesSquirrelScene = new EventScene();
        chasesSquirrelScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        chasesSquirrelScene.setMapSymbol( " chasesSquirrel " );
        chasesSquirrelScene.setBlocked(false);
        scenes[EventScene.EventType.chasesSquirrel.ordinal()] = chasesSquirrelScene;

        EventScene getsChokedByLeashScene = new EventScene();
        getsChokedByLeashScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsChokedByLeashScene.setMapSymbol( " getsChokedByLeash " );
        getsChokedByLeashScene.setBlocked(false);
        scenes[EventScene.EventType.getsChokedByLeash.ordinal()] = getsChokedByLeashScene;

        return scenes;
   
  }
        

       
}
