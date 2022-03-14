package com.mycompany.ctis310hw1wordcombo;

import java.util.Scanner;

public class WordCombo {
public static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String of Chars: ");
        String str = scan.nextLine();
        permute(str);
        System.out.println("The amount of strings is: " + count);
    }

    public static void permute(String full) {
        if (full == null || full.length() == 0) {

            System.out.println("You must provide a string of length > 0.");
            return;
        }

        permute("", full);
    }

    public static void permute(String prefix, String remaining) {
        
        if (remaining.length() == 0) {
            System.out.println(prefix);
            
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
            count++;
        }
      
    }
}
