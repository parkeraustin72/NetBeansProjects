package com.mycompany.chapter6.pp65;


public class PairOfDice {
    private Die die1, die2;

    public PairOfDice(Die die1, Die die2) {
        this.die1 = die1;
        this.die2 = die2;
    }

    PairOfDice() {
        this.die1 = new Die(1);
        this.die2 = new Die(2);
    }
    
    
    
    
    public int roll()
    { // Rolls both dice and returns combined result
        return die1.roll() + die2.roll();
    }
    
    public int getTOtalFaceValue() 
    { // returns the current sum dice total;
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public Die getDie1() {
        return die1;
    }

    public Die getDie2() {
        return die2;
    }

    public void setDie1(Die die1) {
        this.die1 = die1;
    }

    public void setDie2(Die die2) {
        this.die2 = die2;
    }

    @Override
    public String toString() {
        return "PairOfDice{" + "die1=" + die1.getFaceValue() + ", die2=" 
                + die2.getFaceValue() + '}';
    }
    
    
    
}
