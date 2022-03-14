
package com.mycompany.chapter3ppp32;

import java.util.Scanner;


public class CubeSum {

    
    public static void main(String[] args) {
        
        
        
        // Calculates the sum of 2 cubed integers
        
        int num1, num2, val;
        
        System.out.println("Please enter two integers: " );
        Scanner scanIT = new Scanner (System.in);
        
        num1 = scanIT.nextInt();
        num2 = scanIT.nextInt();
        
        val = (int) (Math.pow(num1, 3) + Math.pow(num2, 3));
        
        System.out.println("Sum of these numbers cubed: " + val);
        
      
    }
    
}
