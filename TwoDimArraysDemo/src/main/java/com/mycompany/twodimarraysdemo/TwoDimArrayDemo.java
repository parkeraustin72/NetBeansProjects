
package com.mycompany.twodimarraysdemo;

import java.util.Scanner;


public class TwoDimArrayDemo {

   
    public static void main(String[] args) {
       Student [] studentArray = new Student [5];
       
       Student student1 = new Student("", 0);
       
       student1.setName("Brian");
       student1.setNumber(111);
       studentArray[0] = student1;
        
        System.out.println(studentArray[0]);
        System.out.println(studentArray[1]);
        
        Scanner scanName = new Scanner(System.in);
        Scanner scanNumber = new Scanner(System.in);
        
        for (int i = 1; i < studentArray.length; i++)
        {
           Student studenttemp = new Student("",0);
           //creates a new student object named studenttemp
           System.out.println("Please enter student " + i + " name: ");
           String temp = scanName.next();
           studenttemp.setName(temp);
           
           System.out.println("Please enter student " + i + " number: ");
           studenttemp.setNumber(scanNumber.nextInt());
           
           studentArray[i] = studenttemp;
        }
        
        System.out.println();
        for (int i = 0; i< studentArray.length; i++)
        System.out.println(studentArray[i]);
        {
            
        }
    }
    
}
