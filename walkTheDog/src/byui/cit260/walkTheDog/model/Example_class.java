/*
 * Project author: gab James.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.walkTheDog.model;

import java.io.Serializable;


/**
 *
 * @author gab James and Idel Pagen
 */
public class Example_class implements Serializable {
    
    private double exampleOneVariable;
    private int exampleTwoVariable;

    public Example_class() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.exampleOneVariable) ^ (Double.doubleToLongBits(this.exampleOneVariable) >>> 32));
        hash = 29 * hash + this.exampleTwoVariable;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Example_class other = (Example_class) obj;
        if (Double.doubleToLongBits(this.exampleOneVariable) != Double.doubleToLongBits(other.exampleOneVariable)) {
            return false;
        }
        if (this.exampleTwoVariable != other.exampleTwoVariable) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "Example_class{" + "exampleOneVariable=" + exampleOneVariable + ", exampleTwoVariable=" + exampleTwoVariable + '}';
    }
    
    

    public double getExampleOneVariable() {
        return exampleOneVariable;
    }

    public void setExampleOneVariable(double exampleOneVariable) {
        this.exampleOneVariable = exampleOneVariable;
    }

    public int getExampleTwoVariable() {
        return exampleTwoVariable;
    }

    public void setExampleTwoVariable(int exampleTwoVariable) {
        this.exampleTwoVariable = exampleTwoVariable;
    }
    
    
    
}
