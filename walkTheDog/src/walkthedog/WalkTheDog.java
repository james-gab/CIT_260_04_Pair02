/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkthedog;

import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.ErrorView;
import byui.cit260.walkTheDog.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class WalkTheDog {
    public static Game CurrentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    
    public static void main(String[] args){
        
        ErrorView error = new ErrorView();
        
        try {
            //open character stream file for end user input and output
            WalkTheDog.inFile = new BufferedReader(new InputStreamReader(System.in));
            
            WalkTheDog.outFile = new PrintWriter(System.out, true);
            
            // open log file
            String filePath = "log.txt";
            WalkTheDog.logFile = new PrintWriter(filePath);
//            WalkTheDog.logFile = new PrintWriter("log.txt");
            
        } catch (Exception e){
            ErrorView.display(error.getClass().getName(),"Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
        }
        finally{
            try{
            WalkTheDog.inFile.close();
            WalkTheDog.outFile.close();
            WalkTheDog.logFile.close();
            } catch (IOException ex){
                ErrorView.display(error.getClass().getName(),"Error closing files");
                return;
            }
        }
        
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.startProgram();     
    } 

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        WalkTheDog.logFile = logFile;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        WalkTheDog.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        WalkTheDog.inFile = inFile;
    }
    
    
    

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
    
    
//  
//    public static void main(String[] args) {
//        // TODO code application logic here
//       StartProgramView startProgramView = new StartProgramView();
//       startProgramView.startProgram();        
//        
//    }
    
}
