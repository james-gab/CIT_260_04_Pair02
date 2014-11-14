package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Map;
import byui.cit260.walkTheDog.model.Scene;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;

/**
 *
 * @author gab and Idel
 
 */
public class MapControl {

    public static Map createMap() {
        
        // Create Map
        Map map = new map (3,3);
        
        // create sceans for the game
        Scene[] scenes = createScenes();
        
        // assign sceans to locations
        GameControl.assignScenesToLocations(map,scenes);

        System.out.println("***This is a stub function****"
                + "\n in MapControl.java    Map createMap()"); 
        
        return map;
    }

    public static void moveActorsToStartingLocation(Map map) {
        System.out.println("***This is a stub function****"
                + "\n in MapControl.java   moveActorsToStartingLocation(Map map)");
    }

    private static Scene[] createScenes() {
        System.out.println("***This is a stub function****"
                + "\n in MapControl.java   createScenes()");
        return null;
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
    

    
    
    
}
