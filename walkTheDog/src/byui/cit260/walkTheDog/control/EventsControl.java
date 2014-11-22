package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.EventsType;
import byui.cit260.walkTheDog.model.Events;
import byui.cit260.walkTheDog.model.EventsScene;
import walkthedog.WalkTheDog;


/**
 *
 * @author gab
 
 */
public class EventsControl {
    
    public static int eVrowCount = 8;
    public static int eVcolumCount = 2;
    
    

    public static Events createEvents() {
        Events event = new Events(eVrowCount,eVcolumCount);                     // Create Events
        EventsScene[] scenes = createEventScenes();                              // create sceans for the game
        GameControl.assignEventScenesToEventTypes(event,scenes);                // assign sceans to eventTypes
        return event;
    }
    
    private static EventsScene[] createEventScenes() {
        EventsScene[] scenes = new EventsScene[EventsScene.EventSceneType.values().length];
        
        // STARTING SCENE////
        EventsScene getsBellyRubbedScene = new EventsScene();
        getsBellyRubbedScene.setDescription(
        "\nGood dog!!!!!!");                                                    //add description
        getsBellyRubbedScene.setEventsSymbol( " get Belly Rubbed                 " );
        getsBellyRubbedScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.getsBellyRubbed.ordinal()] = getsBellyRubbedScene;

        EventsScene playsFetchScene = new EventsScene();
        playsFetchScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        playsFetchScene.setEventsSymbol( " Plays Fetch                      " );
        playsFetchScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.playsFetch.ordinal()] = playsFetchScene;

        EventsScene getsTreatScene = new EventsScene();
        getsTreatScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsTreatScene.setEventsSymbol( " get a Treat                      " );
        getsTreatScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.getsTreat.ordinal()] = getsTreatScene;

        EventsScene rollsOverScene = new EventsScene();
        rollsOverScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        rollsOverScene.setEventsSymbol( " Plays roll Over                  " );
        rollsOverScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.rollsOver.ordinal()] = rollsOverScene;

        EventsScene doesTrickScene = new EventsScene();
        doesTrickScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        doesTrickScene.setEventsSymbol( " does Trick                       " );
        doesTrickScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.doesTrick.ordinal()] = doesTrickScene;

        EventsScene sniffsGroundScene = new EventsScene();
        sniffsGroundScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        sniffsGroundScene.setEventsSymbol( " sniffs Ground                    " );
        sniffsGroundScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.sniffsGround.ordinal()] = sniffsGroundScene;

        EventsScene licksPersonScene = new EventsScene();
        licksPersonScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        licksPersonScene.setEventsSymbol( " licks someones hand              " );
        licksPersonScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.licksPerson.ordinal()] = licksPersonScene;

        EventsScene getsScrachedBehindEarsScene = new EventsScene();
        getsScrachedBehindEarsScene.setDescription(
        "\nGood dog!!!!!!");                                               //add description
        getsScrachedBehindEarsScene.setEventsSymbol( " get Scrached Behind Ears         " );
        getsScrachedBehindEarsScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.getsScrachedBehindEars.ordinal()] = getsScrachedBehindEarsScene;

        EventsScene stepInPoopScene = new EventsScene();
        stepInPoopScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        stepInPoopScene.setEventsSymbol( " You step In Poop                 " );
        stepInPoopScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.stepInPoop.ordinal()] = stepInPoopScene;

        EventsScene birdAttackScene = new EventsScene();
        birdAttackScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        birdAttackScene.setEventsSymbol( " A bird attacks your dog          " );
        birdAttackScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.birdAttack.ordinal()] = birdAttackScene;

        EventsScene dogBitesSomeoneScene = new EventsScene();
        dogBitesSomeoneScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        dogBitesSomeoneScene.setEventsSymbol( " Your dog nips at someone         " );
        dogBitesSomeoneScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.dogBitesSomeone.ordinal()] = dogBitesSomeoneScene;

        EventsScene getsBitByOtherDogScene = new EventsScene();
        getsBitByOtherDogScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsBitByOtherDogScene.setEventsSymbol( " your dog gets Bit By another Dog " );
        getsBitByOtherDogScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.getsBitByOtherDog.ordinal()] = getsBitByOtherDogScene;

        EventsScene sniffsOtherDogButtScene = new EventsScene();
        sniffsOtherDogButtScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        sniffsOtherDogButtScene.setEventsSymbol( " Gross your dog sniffs a Dogs rear" );
        sniffsOtherDogButtScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.sniffsOtherDogButt.ordinal()] = sniffsOtherDogButtScene;

        EventsScene licksSelfScene = new EventsScene();
        licksSelfScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        licksSelfScene.setEventsSymbol( " your dog licks itself in public  " );
        licksSelfScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.licksSelf.ordinal()] = licksSelfScene;

        EventsScene chasesSquirrelScene = new EventsScene();
        chasesSquirrelScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        chasesSquirrelScene.setEventsSymbol( " chases a Squirrel                " );
        chasesSquirrelScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.chasesSquirrel.ordinal()] = chasesSquirrelScene;

        EventsScene getsChokedByLeashScene = new EventsScene();
        getsChokedByLeashScene.setDescription(
        "\nBad dog!!!!!!");                                               //add description
        getsChokedByLeashScene.setEventsSymbol( " gets Choked by leash             " );
        getsChokedByLeashScene.setBlocked(false);
        scenes[EventsScene.EventSceneType.getsChokedByLeash.ordinal()] = getsChokedByLeashScene;
        
        return scenes;
        
  } // END of private static EventsScene[] createEventScenes() 
    
    
        public void displayEvents() {
        
            EventsType[][] eventTypes = WalkTheDog.getCurrentGame().getEvents().getEventTypes();
            
            System.out.println("     Events in The Park\n");
            System.out.print("          ");
            System.out.println("     The Park is full of different Events\n"
                    + "They are:           Good (good dog!!!)      and             Bad (bad dog!!!)");
            
            for (int row = 0; row < eVrowCount; row++){
                int z = row +1;
                System.out.print("      "+z);
                    for (int column = 0; column < eVcolumCount; column++){
                        System.out.print(" | ");
                        EventsType eventType = eventTypes [row][column];
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
    
}   // END of public class EventsControl
