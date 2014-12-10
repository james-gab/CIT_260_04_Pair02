/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.view;

import byui.cit260.walkTheDog.control.ProgramControl;
import byui.cit260.walkTheDog.exceptions.EventsControlException;
import byui.cit260.walkTheDog.model.Player;

/**
 *
 * @author gab
 */
public class UserExperienceView extends View {

    public Player player;
    public String hMR = "uEV";

    public UserExperienceView(Player players) {
        super(
                "Before you leave, did you enjoy your"
                + "\nexperience in this location Y/N?");

        this.player = players;

    }

    @Override
    public void doAction(char choice) {

        this.console.println(choice + " was your choice.");
        int start = player.getPlayerSatisfaction();

        do {

            this.userExperienceInput(choice);
//                    break;
        } while (player.getPlayerSatisfaction() == start);

        this.console.println("\nPlayer Satisfaction is now: " + player.getPlayerSatisfaction());

        LocationView changeLocations = new LocationView(player);                // send user to Location view menu
        changeLocations.display(hMR);

    }

    /*      Lesson 09 Individual assignment
     *      fixed prevoius assignments inputs and moved all calculations 
     *      to control layer in the ProgramControl class.
     */
    public void userExperienceInput(char choice) {
        /* zInstructor: 
         * You are not checking for a valid choice. When the uers enters
         * an invalid choice your program gets in an infinite loop here.
         * I think the best way to handle this is to 
         * to display an error message and prompt the user to try again.
         *
         * ************************************************************
         *  *****  *****  USEING default as error check   *****  ***** 
         *   IF not equal to a defined CHAR then error statment
         *
         */
        ProgramControl check = new ProgramControl();                            // Control class is in ProgramControl.java
        player.setPlayerSatisfaction(check.userExperienceInputCheck(choice, player.getPlayerSatisfaction()));
    }

    /**
     * ************ This section was fixed per instructions and is no longer
     * part of the program ***********************
     */
}
