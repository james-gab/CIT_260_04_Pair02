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
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class WalkTheDog {
    public static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    
    public static void main(String[] args){
        /* Instructor: 
         * You do no need to instantiate the Error View class. It only has
         * static class variables and methods so their is no need to
         * create an object instance for the ErrorView class. This is what is
         * your error when you try and print to the file. 
         */
//        ErrorView error = new ErrorView();
        
        try {
            //open character stream file for end user input and output
            WalkTheDog.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            WalkTheDog.outFile = new PrintWriter(System.out, true);
//            outFile =  PrintWriterClass(System.out, true);
            // open log file
            String filePath = "log.txt";
            WalkTheDog.logFile = new PrintWriter(filePath);
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();     
            
        } catch (Exception e){
            ErrorView.display("WalkTheDog","Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
        }
        finally{
            try{
                if(WalkTheDog.inFile !=null){
                    WalkTheDog.inFile.close();}
                if(WalkTheDog.outFile !=null){
                    WalkTheDog.outFile.close();}
                if(WalkTheDog.logFile !=null){
                    /* Instructor: 
                     * You should be closing the logFile and not the outFile
                     * here.
                     */
                    WalkTheDog.outFile.close();}
            } catch (IOException ex){
                ErrorView.display("WalkTheDog","Error closing files");
                return;
            }
        }
        
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
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        WalkTheDog.currentGame = currentGame;
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

//    private static String PrintWriterClass(PrintStream out, boolean b) {
//        return (String)"log.txt";
//        
//    }
//    
    
}
