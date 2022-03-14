package com.mycompany.chapter7.pp73;

import java.text.DecimalFormat;
public class Student {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    private int test1, test2, test3;
    private final int NUM_TESTS = 3;

    // Constructor: sets up this student object with the specified initial values
    public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress, int test1, int test2, int test3) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }
    
    public Student(String first, String last, Address home, Address school)
    {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        test1 = test2 = test3 = 0;
        
    }
    
    public void setTestScore(int testNumber, int score){
        switch(testNumber){
            case 1:
                test1 = score;
                break;
            case 2:
                test2 = score;
                break;
            case 3:
                test3 = score;
               
        }
    }

    // returns the average of the three test scores.
public double average(){
    double average = (test1 + test2 + test3);
    return (double) average / NUM_TESTS;
}

// returns the score of the specified test.
// Returns 0 if the test number is invaled (not a 1, or 2, or 3)
public int getTestScore (int testNumber){
    switch (testNumber){
        case 1: return test1;
        case 2: return test2;
        case 3: return test3;
            default: return 0;
    }
}

    @Override
    public String toString() {
        String result;
        result = "------------------------------------------------------------- \n";
        result += firstName + " " + lastName + "\n";
        result += "------------------------------------------------------------- \n";
        result += "Home Address: \n" + homeAddress + "\n";
        result += "\nSchool Address: \n" + schoolAddress + "\n";
        result += "***************  Test Scores *****************";
        result += "\nTest 1 score = " + test1;
         result += "\nTest 2 score = " + test2;
          result += "\nTest 3 score = " + test3;
          
          DecimalFormat formatter = new DecimalFormat("0.0#");
          
          result += "\nAverage test score: " + formatter.format(average()) + "\n\n";
        return result;
    }




}
