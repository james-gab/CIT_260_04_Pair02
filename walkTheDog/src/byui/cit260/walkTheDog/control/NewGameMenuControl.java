/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.view.GameMenuView;


/**
 *
 * @author Idel
 */
public class NewGameMenuControl {
           
public int playerSatisfaction = 0;
public int playerLeashLenght = 4;
public int gameIdealLeashLength = 0;
public int gameNumberOfTurns = 0;
public int gameFidoMood = 5;
public int gameUserExploreCounter = 0;
public char gameDidUserExplore = 'n';
public String hMR = "  ";

// starts player at a randomly generated starting score between 0 and 15
EventControl randNum = new EventControl();                                      // calls random number generator
public int playerCurrentScore =  randNum.randomNumberGenerator16_0to15() + 5;   // passes a random generated number to a variable


    public void displayNewGameMenu(String hMR){
//        System.out.println("\n*** displayMenu stub function called ***");
        GameMenuView aNewGame = new GameMenuView (playerSatisfaction, playerLeashLenght, gameIdealLeashLength, gameNumberOfTurns, gameFidoMood, gameUserExploreCounter, gameDidUserExplore, playerCurrentScore);
        aNewGame.display(hMR);
        
        
        
    }
    
}
