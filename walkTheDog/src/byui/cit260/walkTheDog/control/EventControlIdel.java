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


// I fixed teh code and added it to the bottom
// try to see if you can fix yours but if you 
//really get to a stumbling place scroll down and see what I did.



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


// This code is fixed and i belive is correct 
// Only scroll down if you really need a help to find what is wrong





















//
//public class EventControlIdel {
//    there was a { here that closed the class
//
//
//    public int generateFidoMood(int numberOfTurns, int leashLength, int mood){
//
//    int mood must go in the called line to pass the current mood into the function 
//    otherwise the mood always starts out at 0
//    
//    if (leashLength <= 4 && numberOfTurns > 1){
//    mood =- 2; // fido is mad
//    }                                     // must open and close an if with { }
//    
//    if (mood <= 0){
//    return -1; //lose life point!
//    }
//    
//    else if (leashLength > 4){
//    mood =+ 1; //fido is happy
//    }
//    
//    return mood;
//
//    
//   
//    }       // this { was missing
//}
