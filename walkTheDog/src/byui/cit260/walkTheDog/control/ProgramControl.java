/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.model.Player;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel
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
