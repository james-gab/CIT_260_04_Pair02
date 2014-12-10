package byui.cit260.walkTheDog.control;

import byui.cit260.walkTheDog.exceptions.EventsControlException;
import byui.cit260.walkTheDog.exceptions.ProgramControlException;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.ErrorView;
import java.io.PrintWriter;
import walkthedog.WalkTheDog;

/**
 *
 * @author Idel and gab James
 */
public class ProgramControl {

    protected final PrintWriter console = WalkTheDog.getOutFile();

    public static Player createPlayer(String name) {
        Player player = new Player();
        player.setName(name);
        WalkTheDog.setPlayer(player);
        return player;
    }

    public int playerLifePoints(Player player) throws ProgramControlException {

        int points = player.getPlayerCurrentScore();

        if (points < 0) {
            throw new ProgramControlException("*** Our appologies, something went wrong. ***"
                    + "\n*** ERROR in ProgramControl.java ***"
                    + "\nin       public int playerLifePoints(Player player)"
                    + "\n if (points < 0)");
        }

        return points;          //returns life points
    }

    public int fidoMood(Player player) throws ProgramControlException {

        int points = player.getGameFidoMood();

        if (points < 0) {
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
     *  *****  *****  USEING default as error check   *****  ***** 
     *   IF not equal to a defined CHAR then error statment
     *    
     */
    public int userExperienceInputCheck(char choice, int playerSatisfaction) {

        char var = (char) choice;
        char YES = 'Y';
        char NO = 'N';
        char yes = 'y';
        char no = 'n';

        this.console.println("In userExperienceInputCheck\n"
                + choice + " was passed for choice.\n"
                + var + " was passed from choice.\n"
                + playerSatisfaction + " was passed for playerSatisfaction\n\n");

        if (var == YES) {
            playerSatisfaction += 1;
        } else if (var == NO) {
            playerSatisfaction -= 1;
        } else if (var == yes) {
            playerSatisfaction += 1;
        } else if (var == no) {
            playerSatisfaction -= 1;
        } else {
            ErrorView.display(this.getClass().getName(), "Invalid entry - please try again");
        }

        return playerSatisfaction;
    }

}
