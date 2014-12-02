/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkthedog;

import byui.cit260.walkTheDog.model.Game;
import byui.cit260.walkTheDog.model.Player;
import byui.cit260.walkTheDog.view.StartProgramView;
import java.io.PrintWriter;

/**
 *
 * @authors Idel Pagan and gab James
 */
public class WalkTheDog {
    public static Game CurrentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferReader inFile = null;
    
    public static void main(String[] args){
        
        try {
            //open character stream file for end user input and output
            WalkTheDog.inFile = new BufferReader(new InputStreamReader(System.in));
            
            WalkTheDog.outFile = new PrintWriter(System.out, true);
        } catch (Exception e){
            System.out.println(e);
        }
        finally{
            try{
            WalkTheDog.inFile.close();
            WalkTheDog.outFile.close();
            } catch (IOException ex){
                System.out.println("Error closing files");
                return;
            }
        }
    } 

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        WalkTheDog.outFile = outFile;
    }

    public static BufferReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferReader inFile) {
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
    
    
  
    public static void main(String[] args) {
        // TODO code application logic here
       StartProgramView startProgramView = new StartProgramView();
       startProgramView.startProgram();        
        
    }
    
}
