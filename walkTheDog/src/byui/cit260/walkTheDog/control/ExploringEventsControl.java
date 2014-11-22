package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.EventType;
import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.EventScene;
import walkthedog.WalkTheDog;


/**
 *
 * @author gab and Idel
 
 */
public class ExploringEventsControl {
    
    public static int eVrowCount = 8;
    public static int eVcolumCount = 2;
    
    

    public static Events createEvents() {
        
        // Create Events
        Events event = new Events(eVrowCount,eVcolumCount);
        
        // create sceans for the game
        EventScene[] scenes = createEventScenes();
        
        // assign sceans to eventTypes
        GameControl.assignEventScenesToEventTypes(event,scenes);

        return event;
    }
    
    
    private static EventScene[] createEventScenes() {
        EventScene[] scenes = new EventScene[EventScene.EventSceneType.values().length];
        
        // STARTING SCENE////
        EventScene getsBellyRubbedScene = new EventScene();
        getsBellyRubbedScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsBellyRubbedScene.setEventsSymbol( " get Belly Rubbed                 " );
        getsBellyRubbedScene.setBlocked(false);
        scenes[EventScene.EventSceneType.getsBellyRubbed.ordinal()] = getsBellyRubbedScene;

        EventScene playsFetchScene = new EventScene();
        playsFetchScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        playsFetchScene.setEventsSymbol( " Plays Fetch                      " );
        playsFetchScene.setBlocked(false);
        scenes[EventScene.EventSceneType.playsFetch.ordinal()] = playsFetchScene;

        EventScene getsTreatScene = new EventScene();
        getsTreatScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsTreatScene.setEventsSymbol( " get a Treat                      " );
        getsTreatScene.setBlocked(false);
        scenes[EventScene.EventSceneType.getsTreat.ordinal()] = getsTreatScene;

        EventScene rollsOverScene = new EventScene();
        rollsOverScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        rollsOverScene.setEventsSymbol( " Plays roll Over                  " );
        rollsOverScene.setBlocked(false);
        scenes[EventScene.EventSceneType.rollsOver.ordinal()] = rollsOverScene;

        EventScene doesTrickScene = new EventScene();
        doesTrickScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        doesTrickScene.setEventsSymbol( " does Trick                       " );
        doesTrickScene.setBlocked(false);
        scenes[EventScene.EventSceneType.doesTrick.ordinal()] = doesTrickScene;

        EventScene sniffsGroundScene = new EventScene();
        sniffsGroundScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        sniffsGroundScene.setEventsSymbol( " sniffs Ground                    " );
        sniffsGroundScene.setBlocked(false);
        scenes[EventScene.EventSceneType.sniffsGround.ordinal()] = sniffsGroundScene;

        EventScene licksPersonScene = new EventScene();
        licksPersonScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        licksPersonScene.setEventsSymbol( " licks someones hand              " );
        licksPersonScene.setBlocked(false);
        scenes[EventScene.EventSceneType.licksPerson.ordinal()] = licksPersonScene;

        EventScene getsScrachedBehindEarsScene = new EventScene();
        getsScrachedBehindEarsScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsScrachedBehindEarsScene.setEventsSymbol( " get Scrached Behind Ears         " );
        getsScrachedBehindEarsScene.setBlocked(false);
        scenes[EventScene.EventSceneType.getsScrachedBehindEars.ordinal()] = getsScrachedBehindEarsScene;

        EventScene stepInPoopScene = new EventScene();
        stepInPoopScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        stepInPoopScene.setEventsSymbol( " You step In Poop                 " );
        stepInPoopScene.setBlocked(false);
        scenes[EventScene.EventSceneType.stepInPoop.ordinal()] = stepInPoopScene;

        EventScene birdAttackScene = new EventScene();
        birdAttackScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        birdAttackScene.setEventsSymbol( " A bird attacks your dog          " );
        birdAttackScene.setBlocked(false);
        scenes[EventScene.EventSceneType.birdAttack.ordinal()] = birdAttackScene;

        EventScene dogBitesSomeoneScene = new EventScene();
        dogBitesSomeoneScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        dogBitesSomeoneScene.setEventsSymbol( " Your dog nips at someone         " );
        dogBitesSomeoneScene.setBlocked(false);
        scenes[EventScene.EventSceneType.dogBitesSomeone.ordinal()] = dogBitesSomeoneScene;

        EventScene getsBitByOtherDogScene = new EventScene();
        getsBitByOtherDogScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsBitByOtherDogScene.setEventsSymbol( " your dog gets Bit By another Dog " );
        getsBitByOtherDogScene.setBlocked(false);
        scenes[EventScene.EventSceneType.getsBitByOtherDog.ordinal()] = getsBitByOtherDogScene;

        EventScene sniffsOtherDogButtScene = new EventScene();
        sniffsOtherDogButtScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        sniffsOtherDogButtScene.setEventsSymbol( " Gross your dog sniffs a Dogs rear" );
        sniffsOtherDogButtScene.setBlocked(false);
        scenes[EventScene.EventSceneType.sniffsOtherDogButt.ordinal()] = sniffsOtherDogButtScene;

        EventScene licksSelfScene = new EventScene();
        licksSelfScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        licksSelfScene.setEventsSymbol( " your dog licks itself in public  " );
        licksSelfScene.setBlocked(false);
        scenes[EventScene.EventSceneType.licksSelf.ordinal()] = licksSelfScene;

        EventScene chasesSquirrelScene = new EventScene();
        chasesSquirrelScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        chasesSquirrelScene.setEventsSymbol( " chases a Squirrel                " );
        chasesSquirrelScene.setBlocked(false);
        scenes[EventScene.EventSceneType.chasesSquirrel.ordinal()] = chasesSquirrelScene;

        EventScene getsChokedByLeashScene = new EventScene();
        getsChokedByLeashScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsChokedByLeashScene.setEventsSymbol( " gets Choked by leash             " );
        getsChokedByLeashScene.setBlocked(false);
        scenes[EventScene.EventSceneType.getsChokedByLeash.ordinal()] = getsChokedByLeashScene;
        
        return scenes;
  }
    
        public void displayEvents() {
        
            EventType[][] eventTypes = WalkTheDog.getCurrentGame().getEvents().getEventTypes();
//            EventType[][] eventTypes = WalkTheDog.getCurrentGame().getEvents().getEventTypes();
            
            System.out.println("     Events in The Park\n");
            System.out.print("          ");
            
            System.out.println("     The Park is full of different Events\n"
//                    + "They are:\n\n"
                    + "They are:           Good (good dog!!!)      and             Bad (bad dog!!!)");
//            System.out.print("          ");
            
            for (int row = 0; row < eVrowCount; row++){
                int z = row +1;
                System.out.print("      "+z);
                
                    for (int column = 0; column < eVcolumCount; column++){
                        System.out.print(" | ");
                        EventType eventType = eventTypes [row][column];
                        if(!eventType.equals("")){
                            System.out.print(eventTypes[row][column].getEventScene().getEventsSymbol());
                            }
                        else{
                            System.out.print("   x      ");                           // place event symbol here
                            }
                        }
                    
                    System.out.print(" |\n");
                    }
            }   // END of public void displayEvents()
    
}
