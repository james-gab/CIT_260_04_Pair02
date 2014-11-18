package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.model.Map;
import byui.cit260.walkTheDog.model.Scene;
import byui.cit260.walkTheDog.model.Scene.SceneType;
import java.awt.image.BufferedImage;
import walkthedog.WalkTheDog;


/**
 *
 * @author gab and Idel
 
 */
public class MapControl {
    
    public static int rowCount = 3;
    public static int columCount = 3;
 //   public Map map = Game.map;                              //this is the map
    
    

    public static Map createMap() {
        
        // Create Map
        Map map = new Map(rowCount,columCount);
        
        // create sceans for the game
        Scene[] scenes = createScenes();
        
        // assign sceans to locations
        GameControl.assignScenesToLocations(map,scenes);

//        System.out.println("***This is a stub function****"
//                + " in MapControl.java    Map createMap()"); 
        
        return map;
    }
    
    
    private static Scene[] createScenes() {
        BufferedImage image = null;
        Game game = WalkTheDog.getCurrentGame();
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        // STARTING SCENE////
        Scene startingScene = new Scene();
        startingScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        startingScene.setMapSymbol( "ST" );
        startingScene.setBlocked(false);
        // startingScene.setTravelTime(240);
        // ImageIcon startingSceneImage = MapControl.getImage(startingScene,
        // "PATH_TO_IMAGE")
        // ;
        // startingScene.setIcon(startingSceneImage);
        scenes[Scene.SceneType.fountain.ordinal()] = startingScene;
   
        Scene finishScene = new Scene();
        finishScene.setDescription(
        "\nCongratulations! Your dog made it out alive!");                      //add description
        finishScene.setMapSymbol( "FN" );
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        // ImageIcon finishSceneImage = MapControl.getImage(finishScene,
        // "PATH_TO_IMAGE");
        // finishScene.setIcon(finishSceneImage);
         scenes[SceneType.duckpond.ordinal()] = finishScene;
        return scenes;
   
  }
    public static void moveActorsToStartingLocation(Map map) {
        System.out.println("***This is a stub function****"
                + "\n in MapControl.java   moveActorsToStartingLocation(Map map)");
    }
   
    public int move (int fido, int location){
        // not sure what goes here yet
        return 0;
    }
    
    public boolean validLocation (int fido, int location){
        // not sure what goes here yet and noe of this is right
        boolean valid = false;
        if (fido < location){
            valid = true;
        }
               
        return valid;
    }
    
    public int visitSceanL1 (int fido, int scean1){
        System.out.println("*** visitSceanL1 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL2 (int fido, int scean2){
        System.out.println("*** visitSceanL2 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL3 (int fido, int scean3){
        System.out.println("*** visitSceanL3 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL4 (int fido, int scean4){
        System.out.println("*** visitSceanL4 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL5 (int fido, int scean5){
        System.out.println("*** visitSceanL5 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL6 (int fido, int scean6){
        System.out.println("*** visitSceanL6 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL7 (int fido, int scean7){
        System.out.println("*** visitSceanL7 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL8 (int fido, int scean8){
        System.out.println("*** visitSceanL8 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL9 (int fido, int scean9){
        System.out.println("*** visitSceanL9 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }

    public void displayMap() {
        
        
       Location[][] locations = WalkTheDog.getCurrentGame().getMap().getLocations();
       
       
       System.out.println("     The Park");
            System.out.print("   |");
        for (int column = 0; column < columCount; column++){
                System.out.print(column+"  |");
        }
        for (int row = 0; row < rowCount; row++){
            System.out.print("\n|     "+row);
            for (int column = 0; column < columCount; column++){
                System.out.print("  |");
                Location location = locations [row][column];
                
                if(!location.equals("")){
                    System.out.print("   ?");
                }
                else{
                    System.out.print("   x");                           // place map symbol here
                }
            
            }
                    System.out.print("   |");
            
        }
       
       
       
       
       
    }

    

    
    
    
}
