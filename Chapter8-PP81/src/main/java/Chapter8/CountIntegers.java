
package Chapter8;

import java.util.Scanner;


public class CountIntegers {

   
    public static void main(String[] args) {
        int [] occurrences = new int [51];
        Scanner scanNumber = new Scanner(System.in);
        
        System.out.println("Please enter Integers in the range 0-50:");
        System.out.println("Signal the end of your list with a number"
        + " outside the range.");
        
        int entered = scanNumber.nextInt();
        
        while (entered >= 0 && entered <= 50){
            occurrences[entered]++; // update the occurences of that number
            // ask for another number
            entered = scanNumber.nextInt();
        }
        
        // Report all integers that were entered one or more times
        System.out.println("Number\tTimes");
        for (int checkNum=0; checkNum <= 50; checkNum++){
            if(occurrences[checkNum] >= 1){
                System.out.println(checkNum +"\t"+occurrences[checkNum]);
                }
            }
         //-------------------------------------------------------------------
         // PP 8.2 
         
         Scanner scanNumber1 = new Scanner(System.in);
         int [] occurrences1 = new int [51];
         System.out.println("Please enter Integers in the range -25 to 25:");
        System.out.println("Signal the end of your list with a number"
        + " outside the range.");
        
        int entered1 = scanNumber1.nextInt();
        
        while (entered1 >= -25 && entered1 <= 25){
            occurrences1[entered1 + 25]++; // update the occurences of that number
            // ask for another number
            entered1 = scanNumber1.nextInt();
        }
        
        // Report all integers that were entered one or more times
        System.out.println("Number\tTimes");
        for (int checkNum1=-25; checkNum1 <= 25; checkNum1++){
            if(occurrences1[checkNum1+25] >= 1){
                System.out.println(checkNum1 +"\t"+occurrences1[checkNum1+25]);
            }
        }
        
        
    
    
        
    }
}
