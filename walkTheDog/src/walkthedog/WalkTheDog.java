/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkthedog;

import byui.cit260.walkTheDog.model.Player;
import java.util.Random;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class WalkTheDog {
    
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintsone");
        playerOne.sethighScore(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        int minNumber = 4;
        Random rand = new Random();  
        int randomMultiplyer = rand.nextInt(16);
        System.out.println(randomMultiplyer);
        if (randomMultiplyer < minNumber){
            randomMultiplyer += minNumber;
        }
        System.out.println(randomMultiplyer);
        
        
        
    }
    
}
