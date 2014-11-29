
package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.exceptions.EventsControlException;
import byui.cit260.walkTheDog.exceptions.ProgramControlException;
import byui.cit260.walkTheDog.model.Player;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel and gab James
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
    Player player = new Player();
    player.setName(name);
    WalkTheDog.setPlayer(player);
    return player;
    }
    
    public int playerLifePoints(Player player) throws ProgramControlException{
        
        int points = player.getPlayerCurrentScore();
        
        if (points < 0){
            throw new ProgramControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in ProgramControl.java ***"
                    + "\nin       public int playerLifePoints(Player player)"
                    + "\n if (points < 0)");            
        }
        
        return points;          //returns life points
    }
    
    public int fidoMood(Player player) throws ProgramControlException{
        
        int points = player.getGameFidoMood();
        
        if (points < 0){
            throw new ProgramControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in ProgramControl.java ***"
                    + "\nin       public int fidoMood(Player player)"
                    + "\n if (points < 0)");            
        }
        
        return points;          //returns life points
    }

    

    
/*
 *    gab - Lesson 09 individual assignment
 *    Added to satisfy the Individual assignment for Lesson 09
 *    
*/    
    public int userExperienceInputCheck(char choice, int playerSatisfaction) throws EventsControlException{
        
        System.out.println("In userExperienceInputCheck\n"
                +choice+ " was passed for choice.\n"
                +playerSatisfaction+ " was passed for playerSatisfaction\n\n");
        
        if (choice != 'Y' || choice != 'y' || choice != 'N' || choice != 'n'){
            throw new EventsControlException("\"Invalid entry - please try again");            
        }
        
            if (choice == 'Y' || choice == 'y'){
                playerSatisfaction += 1;
                return playerSatisfaction;
                }
            else if (choice == 'N' || choice == 'n'){
                playerSatisfaction -= 1;
                return playerSatisfaction;
                }
            else {
            throw new EventsControlException("Invalid entry - please try again");
            }
            
    }

        
        
        
}
   
    
    

