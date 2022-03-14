package com.mycompany.ch12.pp121;

import java.util.Scanner;

public class PalindromeTester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner testMe = new Scanner(System.in);
        String str, another = "y";
       
        while (another.equalsIgnoreCase("y")){
            System.out.println("Please enter a potential palindrome:");
            str = scan.nextLine();
            
            PalindromeChecker test = new PalindromeChecker(str);
            if (test.isPalindrome()){
                System.out.println("That string IS a Palindrome");
            }
                
            else if (!test.isPalindrome()){
                System.out.println("That string IS NOT a Palindrome");
            System.out.println();
            }
            
            System.out.println("Would you like to test another Palindrome? (y/N)");
            another = scan.nextLine();
        }
    }

}
