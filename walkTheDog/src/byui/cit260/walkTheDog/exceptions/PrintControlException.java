/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.exceptions;

/**
 *
 * @author gab
 */
public class PrintControlException extends Exception {

    public PrintControlException() {
    }

    public PrintControlException(String string) {
        super(string);
    }

    public PrintControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public PrintControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public PrintControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
