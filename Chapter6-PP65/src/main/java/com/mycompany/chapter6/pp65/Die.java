package com.mycompany.chapter6.pp65;


public class Die {
    
    private final int MAX = 6; // Max face value for dice
    
    private int faceValue; // Current value showing on the dice
    
    public Die(int faceValue) {
        
        this.faceValue = 1;
    }
    
    public int roll() {
        faceValue = (int)(Math.random()*MAX) +1;
        return faceValue;
    }

    public void setFaceValue(int faceValue) { // faceValue mutator
        this.faceValue = faceValue;
    }

    public int getFaceValue() { // faceValue accessor
        return faceValue;
    }

    @Override
    public String toString() {
        return "Die{" + "MAX=" + MAX + ", faceValue=" + faceValue + '}';
    }
    
    
    
    
    
}
