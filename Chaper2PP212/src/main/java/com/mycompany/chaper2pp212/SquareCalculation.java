package com.mycompany.chaper2pp212;

import java.util.Scanner;


public class SquareCalculation { // Computes a squares perimeter and area given the length of one side

   
    public static void main(String[] args) {
        
        
        int side, perimeter, area;
        
        Scanner scanIt = new Scanner(System.in);
        System.out.println("Please enter the length of a square's side:" ) ;
        
        side = scanIt.nextInt(); // get the user input and assign  it to a side
        
        perimeter = side*6;
        area = side * side * side;
        
        System.out.println("Perimeter  = " + perimeter);
        System.out.println("Area = " + area);
        Math.pow(side, 3);
        
        // 3.1, 3.2, 3.3, 3.6, 3.8
        
        
        
        
        
    }
    
}
