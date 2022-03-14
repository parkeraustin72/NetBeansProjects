package com.mycompany.ch12.recursionexamples;

import java.util.Scanner;

public class RecursionExamples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please input a number to convert to Binary:");
        int num = scan.nextInt();
        
        System.out.println(num + " Converted to Binary is: " + Integer.toBinaryString(num));
        System.out.println(num + " Converted to Binary using Recusrive Method is: " + Binary.toBinary(num));
        
        System.out.println("The factorial of " + num + " is: " + Factorial.factorial(num));
        
        
        
    }

}
