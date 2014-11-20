/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;
import byui.cit260.walkTheDog.model.Map;
//import byui.cit260.walkTheDog.model.MiniGame;
import static java.time.Clock.system;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Idel
 */
public class MiniGameControl {

    public int createMiniGame(int lifePoint) {
        int[] randomNumbers1 = new int[10];                                     //an array with 10 alocated spaces
        int[] randomNumbers2 = new int[10];                                     //another array with 10 alocated spaces
        int number = 3;
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
                lifePoint++;   //life point added
                number = 0;    //set so that the user can not play again
                System.out.println("\nPress any key to return to the Game Menu!");
                Scanner keyboard4 = new Scanner(System.in);                     //user can enter any key to continue
                keyboard.nextLine();
         
                return lifePoint;
            } 
            
                System.out.println("\nWould you like to spin again? (Y/N)");
                Scanner keyboard3 = new Scanner(System.in);
                keyboard.nextLine();
                
                
                
                if (keyboard3.equals("Y")){
              
            
        }while (number != 0);
        
        System.out.println("\nSorry, you either already revieved an extra life" //this part is displayed if the user already recieved a life point
                          + "or already spinned the wheel more than 3 times!"); // or user already tried more than 3 times to reciev life
        return lifePoint;

}
}
  

