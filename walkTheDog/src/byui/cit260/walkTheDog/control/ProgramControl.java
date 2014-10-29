
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Player;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel and gab James
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
    //System.out.println("\n**** createPlayer Function called ****");
    Player player = new Player();
    player.setName(name);
    WalkTheDog.setPlayer(player);
    return player;
    }
    
   
    
    
}
