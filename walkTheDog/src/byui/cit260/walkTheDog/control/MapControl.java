package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Location;
import byui.cit260.walkTheDog.model.Map;
import byui.cit260.walkTheDog.enums.Scene;
import byui.cit260.walkTheDog.exceptions.MapControlException;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.GameMenuView;
import java.io.PrintWriter;
import walkthedog.WalkTheDog;


/**
 *
 * @author Gab and Idel
 
 */
public class MapControl {
    
    public static int rowCount = 3;
    public static int columCount = 3;
    protected final PrintWriter console = WalkTheDog.getOutFile();
    
    

    public static Map createMap() {
        
        // Create Map
        Map map = new Map(rowCount,columCount);
        
        // create sceans for the game
        Scene[] scenes = createScenes();
        
        // assign sceans to locations
        GameControl.assignScenesToLocations(map,scenes);

        return map;
    }
    
    
    private static Scene[] createScenes() {
//        BufferedImage image = null;
//        Game game = WalkTheDog.getCurrentGame();
        Scene[] scenes = new Scene[Scene.SceneType.values().length];
        
        // STARTING SCENE////
        Scene fountainScene = new Scene();
        fountainScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        fountainScene.setMapSymbol( " fountain " );
        fountainScene.setBlocked(false);
        scenes[Scene.SceneType.fountain.ordinal()] = fountainScene;

        Scene duckpondScene = new Scene();
        duckpondScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        duckpondScene.setMapSymbol( " duckpond " );
        duckpondScene.setBlocked(false);
        scenes[Scene.SceneType.duckpond.ordinal()] = duckpondScene;

        Scene statueScene = new Scene();
        statueScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        statueScene.setMapSymbol( "  statue  " );
        statueScene.setBlocked(false);
        scenes[Scene.SceneType.statue.ordinal()] = statueScene;

        Scene restroomsScene = new Scene();
        restroomsScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        restroomsScene.setMapSymbol( " restrooms" );
        restroomsScene.setBlocked(false);
        scenes[Scene.SceneType.restrooms.ordinal()] = restroomsScene;

        Scene dogparkScene = new Scene();
        dogparkScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        dogparkScene.setMapSymbol( " dogpark  " );
        dogparkScene.setBlocked(false);
        scenes[Scene.SceneType.dogpark.ordinal()] = dogparkScene;

        Scene playgroundScene = new Scene();
        playgroundScene.setDescription(
        "\nWalk your dog!!!!!!");                                               //add description
        playgroundScene.setMapSymbol( "playground" );
        playgroundScene.setBlocked(false);
        scenes[Scene.SceneType.playground.ordinal()] = playgroundScene;

        
//        
//        Scene finishScene = new Scene();
//        finishScene.setDescription(
//        "\nCongratulations! Your dog made it out alive!");                      //add description
//        finishScene.setMapSymbol( " FN " );
//        finishScene.setBlocked(false);
//         scenes[SceneType.duckpond.ordinal()] = finishScene;
        return scenes;
   
  }
    public static void moveActorsToStartingLocation(Map map) {
//        this.console.println("***This is a stub function****"
//                + "\n in MapControl.java   moveActorsToStartingLocation(Map map)");
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
    
    public void visitSceanLocations (int row, int column, Player player, String hMR) throws MapControlException{
//        this.console.println("*** visitScean function called ***");    // STUB statment will be replaced with a function
        
        if (row<0||column<0){
            throw new MapControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in ProgramControl.java ***"
                    + "\nin       public int fidoMood(Player player)"
                    + "\n if (points < 0)");            
            
        }
 
            Location[][] locations = WalkTheDog.getCurrentGame().getMap().getLocations();
            this.console.print("moving to " + locations[row][column].getScene().getMapSymbol());
            
        GameMenuView gameMenu = new GameMenuView(player);
        gameMenu.display(hMR);
        
    }

    
    
    
    
    
/*    
    public int visitSceanL1 (int fido, int scean1){
        this.console.println("*** visitSceanL1 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL2 (int fido, int scean2){
        this.console.println("*** visitSceanL2 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL3 (int fido, int scean3){
        this.console.println("*** visitSceanL3 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL4 (int fido, int scean4){
        this.console.println("*** visitSceanL4 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL5 (int fido, int scean5){
        this.console.println("*** visitSceanL5 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL6 (int fido, int scean6){
        this.console.println("*** visitSceanL6 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL7 (int fido, int scean7){
        this.console.println("*** visitSceanL7 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL8 (int fido, int scean8){
        this.console.println("*** visitSceanL8 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
    
    public int visitSceanL9 (int fido, int scean9){
        this.console.println("*** visitSceanL9 function called ***");    // STUB statment will be replaced with a function
        return 0;
    }
*/
    
        public void displayMap() {
        
            Location[][] locations = WalkTheDog.getCurrentGame().getMap().getLocations();
//            Location[][] locations = WalkTheDog.getCurrentGame().getMap().getLocations();
            
            this.console.println("     The Park\n");
            this.console.print("          ");
            
            for (int column = 0; column < columCount; column++){
                this.console.print("     "+column+"     | ");
                }
            
            for (int row = 0; row < rowCount; row++){
                this.console.print("\n      "+row);
                    for (int column = 0; column < columCount; column++){
                        this.console.print(" | ");
                        Location location = locations [row][column];
                        if(!location.equals("")){
                            this.console.print(locations[row][column].getScene().getMapSymbol());
                            }
                        else{
                            this.console.print("   x      ");                           // place map symbol here
                            }
                        }
                    
                    this.console.print(" |");
                    }
            }   // END of public void displayMap()
 
    

    
    
    
}
