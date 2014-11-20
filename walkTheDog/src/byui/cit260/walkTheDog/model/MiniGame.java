///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.walkTheDog.model;
//
//import java.util.Arrays;
//
///**
// *
// * @author Idel
// */
//public class MiniGame {
//    int numTries;
//    int[] spinArray = new int[10];
//    int max = spinArray[9];
//    int min = spinArray[0];
//
//    public MiniGame() {
//    }
//    
//
//    public int getnumTries() {
//        return numTries;
//    }
//
//    public void setnumTries(int numTries) {
//        this.numTries = numTries;
//    }
//
//    public int[] getSpinArray() {
//        return spinArray;
//    }
//
//    public void setSpinArray(int[] spinArray) {
//        this.spinArray = spinArray;
//    }
//
//    public int getMax() {
//        return max;
//    }
//
//    public void setMax(int max) {
//        this.max = max;
//    }
//
//    public int getMin() {
//        return min;
//    }
//
//    public void setMin(int min) {
//        this.min = min;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 89 * hash + this.numTries;
//        hash = 89 * hash + Arrays.hashCode(this.spinArray);
//        hash = 89 * hash + this.max;
//        hash = 89 * hash + this.min;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final MiniGame other = (MiniGame) obj;
//        if (this.numTries != other.numTries) {
//            return false;
//        }
//        if (!Arrays.equals(this.spinArray, other.spinArray)) {
//            return false;
//        }
//        if (this.max != other.max) {
//            return false;
//        }
//        if (this.min != other.min) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "MiniGame{" + "number=" + numTries + ", spinArray=" + spinArray + ", max=" + max + ", min=" + min + '}';
//    }
//    
//    
//    
//}
