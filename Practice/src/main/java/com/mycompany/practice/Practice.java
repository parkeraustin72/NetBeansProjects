/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practice;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class Practice {
      
  static boolean isPalindrome(String s){
                  int i = 0, j = s.length() -1 ;
                  while (i < j){
                      if (s.charAt(i) != s.charAt(j))
                          return false;
                      i++;
                      j--;
                  }
                  return true;
                }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanme = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        String scanstring = scanme.nextLine();
        String revString = "";
        
     
        
        for (int i = scanstring.length() - 1; i >= 0; i--)
        {
            revString = revString + scanstring.charAt(i);
        }
        
        System.out.println("The original string is: " + scanstring + "\n" + 
                "The reversed string is: " + revString);
                // TODO code application logic here
               System.out.println(isPalindrome(revString));
                
              
}
}
        
    

    
    

