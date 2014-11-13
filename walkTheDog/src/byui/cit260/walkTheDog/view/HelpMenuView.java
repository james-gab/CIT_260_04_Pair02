
package byui.cit260.walkTheDog.view;



import java.util.Scanner;

public class HelpMenuView {
    public String hMR = " ";
    public int playerSatisfaction;
    public int playerLeashLenght;
    public int gameIdealLeashLength;
    public int gameNumberOfTurns;
    public int gameFidoMood;
    public int gameUserExploreCounter;
    public char gameDidUserExplore;
    public int playerCurrentScore;   


    private final String HELPMENU = "\n"
            + "\n___________________________"
            + "\nHelp Menu"
            + "\n___________________________"
            + "\n"
            + "\nGetting Help\n"
            + "\nUse the following menu for Help\n"
            + "\nG - What is the Goal of the game?"
            + "\nM - How to move"
            + "\nL - Leash Lenght control"
            + "\nF - Fido's attitude"
            + "\nS - Save or Resume saved game"
            + "\nQ - Quit Help Menu"
            + "\n\n___________________________";
    
    public void displayHelpMenu(
                                String returnTO,
                                int playerSatisfaction,
                                int playerLeashLenght,
                                int gameIdealLeashLength,
                                int gameNumberOfTurns,
                                int gameFidoMood,
                                int gameUserExploreCounter,
                                char gameDidUserExplore,
                                int playerCurrentScore
                                                        ) {

        this.playerCurrentScore = playerCurrentScore;
        this.gameDidUserExplore = gameDidUserExplore;
        this.gameUserExploreCounter = gameUserExploreCounter;
        this.gameFidoMood = gameFidoMood;
        this.gameNumberOfTurns = gameNumberOfTurns;
        this.gameIdealLeashLength = gameIdealLeashLength;
        this.playerLeashLenght = playerLeashLenght;
        this.playerSatisfaction = playerSatisfaction;
        hMR = returnTO;
 	System.out.println(hMR + " hMR from returnTO\n"
                + returnTO + " ReturnTO"); // hMR and returnTO
        
        char selection = ' ';
        do{

 	System.out.println(HELPMENU); // display the main menu
 	 
 	String input = this.getInput(); // get first charecter of string
        selection = input.charAt(0);
 	this.doAction(selection);

        } while (selection != 'Q' || selection != 'q'); // a selection is not "Exit"
//        this.helpQuitAndReturn(returnTO);
    }

    public String getInput() {
       boolean valid = false;
       String playersInput = null;
       Scanner keyboard = new Scanner(System.in);

        while(!valid){
            

            System.out.println("Enter a Help Menu choice below:");

            playersInput = keyboard.nextLine();
            playersInput = playersInput.trim();


            if (playersInput.length() < 1){    
                System.out.println("Invalid entry - space is not an option");
                continue;
            }
            break;
        }
        return playersInput;
    }


    
    
    
    
    
    
//            G - What is the Goal of the game?
//            M - How to move
//            L - Leash Lenght control
//            F - Fido's attitude
//            S - Save or Resume saved game
//            Q - Quit


    public void doAction(char choice) {
        
        switch (choice){
            case 'G': // goal of Game
                this.goalGameHelp();
                break;
            case 'g': // goal of Game
                this.goalGameHelp();
                break;
            case 'M': // How to move
                this.moveGameHelp();
                break;
            case 'm': // How to move
                this.moveGameHelp();
                break;
            case 'L': // eash Lenght control
                this.leashControlHelp();
                break;
            case 'l': // eash Lenght control
                this.leashControlHelp();
                break;
            case 'F': // Fido's attitude
                this.fidoAttitudeHelp();
                break;
            case 'f': // Fido's attitude
                this.fidoAttitudeHelp();
                break;
            case 'S': // Save or Resume saved game
                this.saveResumeGameHelp();
                break;
            case 's': // Save or Resume saved game
                this.saveResumeGameHelp();
                break;
            case 'Q': // Exit the program
                this.helpQuitAndReturn(hMR);
            case 'q': // Exit the program
                this.helpQuitAndReturn(hMR);
            default:
                System.out.println("\n*** Invalid Selection *** Try Again ***");
                break;
                }
    }
    
   

    
    private void goalGameHelp(){
        System.out.println("*** goalGameHelp function called ***");
        System.out.println(
                                      "\nIt seems your dog is too excited, he needs to be controlled! "
                                    + "\nThe goal of the game is to get out of the park, without your "
                                    + "\ndog turning into a bad dog. Keep the leash too short for too "
                                    + "\nlong and your dog will become increasingly annoyed. The more "
                                    + "\naggravated your dog becomes the more likely it will bite an "
                                    + "\nadult, a child, or another dog, ending your game immediately! "
                                    + "\nWatch out for “landmines” too, because there are irresponsible "
                                    + "\ndog owners in the park as well. ");

        }   
    
    
    private void moveGameHelp(){
        System.out.println("*** moveGameHelp function called ***");
        System.out.println("\nThis section is still under development"
                         + "\nThank you for your patience");
    }
    
    
    private void leashControlHelp(){
        System.out.println("*** leashControlHelp function called ***");
        System.out.println(
                                      "\nRetract or extend your Dog’s leash in order to avoid these "
                                    + "\nincidents! If incidents happen, say bye-bye to some of your "
                                    + "\nlife-points! Explore the park to find the exit quickly but "
                                    + "\ndon’t leave too hastily; your dog needs it’s exercise. Have a "
                                    + "\ngreat time but be careful so you and your dog don’t get "
                                    + "\nkicked out of the park! ");
    }
    
    
    private void fidoAttitudeHelp(){
        System.out.println("*** fidoAttitudeHelp function called ***");
        System.out.println(
                                      "\nFido has a great attitude as long as it can run and play. The "
                                    + "\nplayer keeps the leash too short (less than 4 feet) for too "
                                    + "\nmany moves in a row. The computer calculates a negative random "
                                    + "\nevent (bark, bite, mark owner, pull against leash). If a random "
                                    + "\nevent is triggered the players pet generates a negative random "
                                    + "\nevent the counter is decreased to minimum (10%), if a negative "
                                    + "\nevent in not triggered the computer increases the chance by 10% "
                                    + "\nfor each move the leash is too short.");
    }

    
    private void saveResumeGameHelp(){
        System.out.println("*** saveResumeGameHelp function called ***");
        System.out.println("\nThis section is still under development"
                         + "\nThank you for your patience");
    }
    
    public void helpQuitAndReturn(String returnTO){

                MainMenuView mmvGame = new MainMenuView();
                GameMenuView gmvGame = new GameMenuView();
                StatisticsMenuView smvGame = new StatisticsMenuView(playerSatisfaction, playerLeashLenght, gameIdealLeashLength, gameNumberOfTurns, gameFidoMood, gameUserExploreCounter, gameDidUserExplore, playerCurrentScore);
                LocationView lvGame = new LocationView(playerSatisfaction, playerLeashLenght, gameIdealLeashLength, gameNumberOfTurns, gameFidoMood, gameUserExploreCounter, gameDidUserExplore, playerCurrentScore);
        
        switch (returnTO){
            case "gMV":
                System.out.println("You chose Quit\nSending Player back to Game Menu");
                hMR = " ";
                gmvGame.display(hMR);
                break;
            case "mMV":
                System.out.println("You chose Quit\nSending Player back to Main Menu");
                hMR = " ";
                mmvGame.display(hMR);
                break;
            case "sMV":
                System.out.println("You chose Quit\nSending Player back to Statistics Menu");
                hMR = " ";
                smvGame.display(hMR);
                break;
            case "LV":
                System.out.println("You chose Quit\nSending Player back to Location Menu");
                hMR = " ";
                lvGame.display(hMR);
                break;
            default:
                System.out.println("Our apologies, there was an error in\n"
                        + "helpQuitAndReturn(String returnTO)\n"
                    + "\nSending Player back to Main Menu\n"
                    + returnTO + " returnTO");
                hMR = " ";
                mmvGame.display(hMR);
                break;
        }
        
    }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
