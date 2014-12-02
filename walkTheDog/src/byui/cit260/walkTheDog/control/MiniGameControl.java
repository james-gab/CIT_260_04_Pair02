/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;
import byui.cit260.walkTheDog.exceptions.MiniGameControlException;
import byui.cit260.walkTheDog.model.Player;
//import byui.cit260.walkTheDog.model.MiniGame;
//import static java.time.Clock.system;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Idel
 */
public class MiniGameControl {
       
    public int createMiniGame(Player player) throws MiniGameControlException {
        int[] randomNumbers1 = new int[10];                                     //an array with 10 alocated spaces
        int[] randomNumbers2 = new int[10];                                     //another array with 10 alocated spaces
        int number = 3;
       
        if (player.getPlayedMiniGame() != 'n' || player.getPlayedMiniGame() != 'N' ||
                player.getPlayedMiniGame() != 'Y' || player.getPlayedMiniGame() != 'y')
            throw new MiniGameControlException("Sorry, something went wrong!");
        //if throws statement.. checks playedminigame is equal to y or n 
        
        if(player.playedMiniGame != 'Y'){
        System.out.println("Welcome to Spin the Wheel!"
                + "\nThink you are lucky? Spin the wheel to "
                + "recieve two numbers. The addition of the two "
                + "numbers must be greater than or equal to 10!"
                + "\nYou get 3 chances!"
                + "\nIf you win, you get an extra life!");
       
        do{
         
        
            System.out.println("Press any key to spin the first number!");
            Scanner keyboard = new Scanner(System.in);                          //user can enter any key to continue
            keyboard.nextLine();
            Random rand = new Random();

            for (int i = 0; i < randomNumbers1.length; i++) {                   //for loop adds random numbers to the first array
                int spin1 = rand.nextInt(10);
                randomNumbers1[i] = spin1;
               }

            int random1 = (randomNumbers1[new Random().nextInt(randomNumbers1.length)]);    //a random number is selected from the array
            System.out.println("\nYour first number is: " + random1 + "!");
       
            System.out.println("\n\nPress any key to spin the second number!");
            Scanner keyboard1 = new Scanner(System.in);                         //user can enter any key to continue
                keyboard1.nextLine();            
        
            for (int i = 0; i < randomNumbers2.length; i++) {                   //for loop adds random numbers to the first array
                int spin2 = rand.nextInt(10);
                randomNumbers2[i] = spin2;
                }
            int random2 = (randomNumbers1[new Random().nextInt(randomNumbers1.length)]); //a random number is selected from the array
            System.out.println("\nYour second number is: " + random2 + "!");
        
            int totalNum = (random1 + random2);                                 //the two random numbers selected from the array are added
            
            System.out.println(random1 + " + " + random2 + " = " + totalNum + "!");

            if (totalNum < 10){                                                 //checks if the added number is less than 10
                System.out.println("\nSorry! Your total number is less than 10!");
                number--;
                System.out.println("\nYou have " + number + " chance(s) left."
                              + "\nBetter luck next time!");
            }
            else {                                                              //if the two added numbers are greated than 10 then user recieves an extra life point
                System.out.println("\nCongratulations! You recieved an extra life point!");
                player.playerCurrentScore++;   //life point added
                number = 0;    //set so that the user can not play again
                System.out.println("\nPress any key to return to the Game Menu!");
                Scanner keyboard4 = new Scanner(System.in);                     //user can enter any key to continue
                keyboard.nextLine();
                player.playedMiniGame = 'Y';
//                return 0;
                return number;
            } 
            
            if (number > 0){
                System.out.println("\nWould you like to spin again? (Y/N)");
                String keyboard3 = MiniGameControl.getInput();
                             
                if (keyboard3.equals("Y")){
                    System.out.println("\nStarting new Mini Game");
                    
                }
                else 
                {
                    System.out.println("\nInvalid Entry. Taking you back to Game Menu!");
                    number = 0;
                }
            }  
            
        }while (number != 0);
        }
        else{
        System.out.println("\nSorry, you either already revieved an extra life" //this part is displayed if the user already recieved a life point
                          + "or already spun the wheel this round!"); // or user already tried more than 3 times to reciev life
        }
        player.playedMiniGame = 'Y';
        return 0;
}
        
        public static String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        
        //while a valid name has not been retrived
        while (!valid){
            
            //promt for players name
            System.out.println("\t\nEnter your selection below: ");
            
            // get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();
            selection = selection.toUpperCase();
            
            if(selection.length() < 1 ){ //blank value entered
                System.out.println("\n*** Invalid Selection *** Try again");
                continue;
                
            }
            break;
        }
        
        return selection;  // return the name
        
    }
}
  

