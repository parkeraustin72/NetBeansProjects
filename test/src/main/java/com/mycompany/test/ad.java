/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author Austin
 */
public class ad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       String s = new String(""); 
       int i = scan.nextInt();
        
        double d = scan.nextDouble();
       
        String s = scan.nextLine();
        

        
        
        System.out.println("String: " + s);
         System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
}
