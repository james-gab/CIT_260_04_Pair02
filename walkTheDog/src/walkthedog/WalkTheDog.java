/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkthedog;

import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.StartProgramView;
import java.util.Random;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class WalkTheDog {
    private static Game CurrentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return CurrentGame;
    }

    public static void setCurrentGame(Game CurrentGame) {
        WalkTheDog.CurrentGame = CurrentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        WalkTheDog.player = player;
    }
    
    
  
    public static void main(String[] args) {
        // TODO code application logic here
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.startProgram();        
        
//        
//        int minNumber = 4;
//        Random rand = new Random();  
//        int randomMultiplyer = rand.nextInt(16);
//        System.out.println(randomMultiplyer);
//        if (randomMultiplyer < minNumber){
//            randomMultiplyer += minNumber;
//        }
//        System.out.println(randomMultiplyer);
//        
//        
//        
    }
    
}
