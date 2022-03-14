
package com.mycompany.ctis310hw4;


public class ArrayMethods {

    public static void printArray(int [] input){
        for (int temp = 0; temp< input.length; temp++){
            System.out.print(input[temp] + " ");
        }
        System.out.println();
    }

    public static String arrayToString(int[] input) {
        String finalString = "";
        String tempString;

        for (int temp = 0; temp< input.length; temp++) {
            tempString = String.valueOf(input[temp]);
            finalString = finalString + tempString + " ";
        }

        return finalString;
    }
    
}
