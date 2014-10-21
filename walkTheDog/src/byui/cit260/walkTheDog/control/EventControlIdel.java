/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.control;

/**
 *
 * @author Idel
 */
public class EventControlIdel {
    public int generateFidoMood(int numberOfTurns, int leashLength);
    
    int mood;
    
    if (leashLength <= 4 && numberOfTurns > 1)
    mood =- 2; // fido is mad
    
    if (mood <= 0)
    return -1 //lose life point!
    
    else if (leashLength > 4)
    mood =+ 1; //fido is happy
    

    
   
}
