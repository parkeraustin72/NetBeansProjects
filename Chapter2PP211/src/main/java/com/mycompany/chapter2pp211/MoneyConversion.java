package com.mycompany.chapter2pp211;

import java.util.Scanner;


public class MoneyConversion {

   
    public static void main(String[] args) {
        double total;
        int tens, fives, ones, quarters, dimes, nickels;
        int remainingCents;
        System.out.println("Please enter monetary amount: " );
        Scanner scanMe = new Scanner(System.in);
        
        
        total = scanMe.nextDouble();
        
        remainingCents = (int)(total*100);
        
        tens = remainingCents / 1000;
        remainingCents %=1000;
        
        fives = remainingCents / 500;
        remainingCents %=500;
        
        ones = remainingCents / 100;
        remainingCents %=100;
        
        quarters = remainingCents / 25;
        remainingCents %=25;
        
        dimes = remainingCents / 10;
        remainingCents %=10;
        
        nickels = remainingCents / 5;
        remainingCents %=5;
        
        
        
        System.out.println("That is equaivalent to: ");
        System.out.println(tens + " ten dollar bills ");
        System.out.println(fives + " five dollar bills ");
        System.out.println(ones + " one dollar bills ");
        System.out.println(quarters + " quarters ");
        System.out.println(dimes + " dimes ");
        System.out.println(nickels + " nickels ");
        System.out.println(remainingCents + " pennies ");
        
        
        
      
    }
    
}
