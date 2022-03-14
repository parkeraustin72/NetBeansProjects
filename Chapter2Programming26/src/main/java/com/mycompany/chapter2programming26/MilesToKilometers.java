
package com.mycompany.chapter2programming26;

import java.util.Scanner; // to get user inpuit

public class MilesToKilometers {

   
    public static void main(String[] args) {
        // This program converts miles into kilometers
        
        final double MILES_PER_KILOMETER = 1.60935;
        
        double miles, kilometers;
        
        Scanner scanMe = new Scanner(System.in); // System.in means user input from keyboard
        
        System.out.println("Please enter the distance in Miles: " );
        miles = scanMe.nextDouble();
        
        kilometers = MILES_PER_KILOMETER * miles;
        
        System.out.println("That distance in Kilometers is: " + kilometers);
        
        
        
        
        
       
    }
    
}
